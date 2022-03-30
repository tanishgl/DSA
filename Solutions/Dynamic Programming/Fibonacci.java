import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(fibRec(n));
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(fibMem(n, dp));
        System.out.println(fibTab(n));
    }

    //Method 1 : - Recursion
    public static int fibRec(int n){
        if(n==0 || n==1) return n;
        return fibRec(n-1) + fibRec(n-2);
    }

    //Method 2 : - Memoization
    public static int fibMem(int n, int[] dp){
        if(n==0 || n==1) return n;
        
        //Point 1 :- Is fib(n) already calculated (Overlapping subproblem)?
        if(dp[n] != -1){
            return dp[n];
        }

        int fibn = fibMem(n-1, dp) + fibMem(n-2, dp);

        //Point 2 :- Save the answer into storage before return.
        dp[n] = fibn;
        return fibn;
    }

    //Method 3 : - Tabulation
    public static int fibTab(int n){
        //Storage and Meaning.
        int[] dp = new int[n+1];

        //Initial fixation
        dp[0] = 0;
        dp[1] = 1;

        //Direction :- Left to right

        //Travel and solve
        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }
}
