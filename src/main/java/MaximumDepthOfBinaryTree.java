public class MaximumDepthOfBinaryTree {

    //Lvl: Easy

    //Runtime: 0ms
    //Beats 100.00% of users with Java

    //Memory: 41.43MB
    //Beats 59.20% of users with Java

    //TODO: Given the root of a binary tree, return its maximum depth.
    // A binary tree's maximum depth is the number of nodes along the
    // longest path from the root node down to the farthest leaf node.

     public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
       }
    }
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));

    }
}
