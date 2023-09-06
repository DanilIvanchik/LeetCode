import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

public class MaximumDepthOfBinaryTreeTest extends ProductOfArrayExceptSelf {

    @Test
    public void testMaxDepthWithEmptyTree() {
        MaximumDepthOfBinaryTree tree = new MaximumDepthOfBinaryTree();
        int depth = tree.maxDepth(null);
        assertEquals(0, depth);
    }

    @Test
    public void testMaxDepthWithSingleNode() {
        MaximumDepthOfBinaryTree tree = new MaximumDepthOfBinaryTree();
        MaximumDepthOfBinaryTree.TreeNode root = new MaximumDepthOfBinaryTree.TreeNode(1);
        int depth = tree.maxDepth(root);
        assertEquals(1, depth);
    }

    @Test
    public void testMaxDepthWithBalancedTree() {
        MaximumDepthOfBinaryTree tree = new MaximumDepthOfBinaryTree();
        MaximumDepthOfBinaryTree.TreeNode root = new MaximumDepthOfBinaryTree.TreeNode(1);
        root.left = new MaximumDepthOfBinaryTree.TreeNode(2);
        root.right = new MaximumDepthOfBinaryTree.TreeNode(3);
        int depth = tree.maxDepth(root);
        assertEquals(2, depth);
    }

    @Test
    public void testMaxDepthWithUnbalancedTree() {
        MaximumDepthOfBinaryTree tree = new MaximumDepthOfBinaryTree();
        MaximumDepthOfBinaryTree.TreeNode root = new MaximumDepthOfBinaryTree.TreeNode(1);
        root.left = new MaximumDepthOfBinaryTree.TreeNode(2);
        root.left.left = new MaximumDepthOfBinaryTree.TreeNode(3);
        int depth = tree.maxDepth(root);
        assertEquals(3, depth);
    }

    @Test
    public void testMaxDepthWithLargeTree() {
        MaximumDepthOfBinaryTree tree = new MaximumDepthOfBinaryTree();
        MaximumDepthOfBinaryTree.TreeNode root = new MaximumDepthOfBinaryTree.TreeNode(1);
        root.left = new MaximumDepthOfBinaryTree.TreeNode(2);
        root.right = new MaximumDepthOfBinaryTree.TreeNode(3);
        root.left.left = new MaximumDepthOfBinaryTree.TreeNode(4);
        root.left.right = new MaximumDepthOfBinaryTree.TreeNode(5);
        root.right.right = new MaximumDepthOfBinaryTree.TreeNode(6);
        int depth = tree.maxDepth(root);
        assertEquals(3, depth);
    }

}