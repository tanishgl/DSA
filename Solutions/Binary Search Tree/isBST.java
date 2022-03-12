class Solution {
    class Pair{
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        boolean isBST = true;
    }
    
    public Pair isBst(TreeNode node){
        if(node == null) return new Pair();
        
        Pair curr = new Pair();
        Pair left = isBst(node.left);
        Pair right = isBst(node.right);
        curr.min = Math.min(node.val, Math.min(left.min, right.min));
        curr.max = Math.max(node.val, Math.max(left.max, right.max));
        curr.isBST = left.isBST && right.isBST && node.val > left.max && node.val < right.min;
        
        return curr;
    }
    
    public boolean isValidBST(TreeNode root) {
        Pair ans = isBst(root);
        return ans.isBST;
    }
}
