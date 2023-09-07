import java.util.ArrayList;
import java.util.List;

public class LeafSimilar {

    //Lvl: Easy

    //Runtime: 0ms
    //Beats 100.00% of users with Java

    //Memory: 40.24MB
    //Beats 60.63% of users with Java

    //TODO:Consider all the leaves of a binary tree, from left to right order,
    // the values of those leaves form a leaf value sequence.
    // For example, in the given tree above, the leaf value sequence is (6, 7, 4, 9, 8).
    // Two binary trees are considered leaf-similar if their leaf value sequence
    // is the same.
    // Return true if and only if the two given trees with head nodes root1 and root2
    // are leaf-similar.

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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> rootOneList = new ArrayList<>();
        List<Integer> rootTwoList = new ArrayList<>();

        check(root1, rootOneList);
        check(root2, rootTwoList);

        return rootTwoList.equals(rootOneList);

    }

    private void check(TreeNode root, List<Integer> list) {
         if (root == null){
             return;
         }

         if (root.right == null && root.left == null){
             list.add(root.val);
         }

         check(root.left, list);
         check(root.right, list);

    }
}
