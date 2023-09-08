public class CountGoodNodesInBinaryTree {

    //Lvl: Medium

    //Runtime: 1ms
    //Beats 100.00% of users with Java

    //Memory: 50.24MB
    //Beats 41.09% of users with Java

    //TODO: Given a binary tree root, a node X in the tree
    // is named good if in the path from root to X there
    // are no nodes with a value greater than X. Return the
    // number of good nodes in the binary tree.

     public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }}
    int count = 0;
    public int goodNodes(TreeNode root) {
        countGood(root, Integer.MIN_VALUE);
        return count;
    }

    public void countGood(TreeNode root, int max){
        if (root == null) return;
        if(root.val >= max) count++;
        max = Math.max(max, root.val);
        countGood(root.left, max);
        countGood(root.right, max);
    }
}
