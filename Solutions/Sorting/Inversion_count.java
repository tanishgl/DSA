class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long inversionCount(long[] arr, long N)
    {
        long ans = mergeSort(arr,0,(int)N-1);
        return ans;
    }
    
    public static long mergeSort(long[] arr, int low, int high){
        if(low>=high){
            return 0;
        }
        
        int mid = low + (high-low)/2;
        
       long l =  mergeSort(arr,low,mid);   //left sorted
        long r = mergeSort(arr,mid+1,high);    //right sorted
        
       long lr =  merge(arr,low,mid,mid+1,high);
        return l+r+lr;
    }
    
    public static long merge(long[] arr, int a1l, int a1r, int a2l, int a2r){
        long inv = 0;
        long[] res = new long[a1r-a1l+a2r-a2l+2];
        int i = a1l, j = a2l, k = 0;
        while(i<=a1r && j<=a2r){
            if(arr[i]>arr[j]){
                res[k] = arr[j];
                k++;
                j++;
                inv+=a1r-i+1;
            } else {
                res[k] = arr[i];
                i++;
                k++;
            }
        }
        
        while(i<=a1r){
            res[k] = arr[i];
            i++;
            k++;
        }
        
        while(j<=a2r){
            res[k] = arr[j];
            k++;
            j++;
        }
        
        for(int x=a1l;x<=a2r;x++){
            arr[x] = res[x-a1l];
        }
        
        return inv;
    }
    
    public long[] sortArray(long[] nums){
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
}
