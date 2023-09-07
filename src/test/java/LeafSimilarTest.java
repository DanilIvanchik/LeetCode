import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;
public class LeafSimilarTest extends LeafSimilar {

    private final LeafSimilar leafs = new LeafSimilar();

    @Test
    public void testLeafSimilar_SameTrees() {
        LeafSimilar.TreeNode root1 = new LeafSimilar.TreeNode(1);
        LeafSimilar.TreeNode root2 = new TreeNode(1);

        assertTrue(leafSimilar(root1, root2));
    }

    @Test
    public void testLeafSimilar_DifferentLeafValues() {
        TreeNode root1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode root2 = new TreeNode(1, new TreeNode(4), new TreeNode(5));

        assertFalse(leafSimilar(root1, root2));
    }

    @Test
    public void testLeafSimilar_OneEmptyTree() {
        TreeNode root1 = new TreeNode(1);
        TreeNode root2 = null;

        assertFalse(leafSimilar(root1, root2));
    }

    @Test
    public void testLeafSimilar_SingleLeafNodes() {
        TreeNode root1 = new TreeNode(1);
        TreeNode root2 = new TreeNode(2);

        assertFalse(leafSimilar(root1, root2));
    }

    @Test
    public void testLeafSimilar_ComplexTrees() {
        TreeNode root1 = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3, new TreeNode(6), new TreeNode(7)));

        TreeNode root2 = new TreeNode(1,
                new TreeNode(3, new TreeNode(7), new TreeNode(6)),
                new TreeNode(2, new TreeNode(5), new TreeNode(4)));

        assertFalse(leafSimilar(root1, root2));
    }

}