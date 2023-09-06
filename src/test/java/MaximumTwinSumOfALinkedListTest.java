import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;


public class MaximumTwinSumOfALinkedListTest extends MaximumTwinSumOfALinkedList{
    @Test
    public void testEmptyListNodeConstructor() {
        ListNode node = new ListNode();
        assertNull(node.next);
        assertEquals(0, node.val);
    }

    @Test
    public void testListNodeConstructorWithValue() {
        ListNode node = new ListNode(5);
        assertNull(node.next);
        assertEquals(5, node.val);
    }

    @Test
    public void testListNodeConstructorWithValueAndNext() {
        ListNode nextNode = new ListNode(10);
        ListNode node = new ListNode(5, nextNode);
        assertEquals(nextNode, node.next);
        assertEquals(5, node.val);
    }

    @Test
    public void testPairSumSingleNode() {
        ListNode head = new ListNode(5);
        int result = pairSum(head);
        assertEquals(0, result);
    }

    @Test
    public void testPairSumEvenNumberOfNodes() {
        ListNode head = new ListNode(2, new ListNode(4, new ListNode(6, new ListNode(8))));
        int result = pairSum(head);
        assertEquals(10, result);
    }

    @Test
    public void testPairSumOddNumberOfNodes() {
        ListNode head = new ListNode(1, new ListNode(3, new ListNode(5, new ListNode(7, new ListNode(9)))));
        int result = pairSum(head);
        assertEquals(10, result);
    }

    @Test
    public void testPairSumNegativeNumbers() {
        ListNode head = new ListNode(-2, new ListNode(-4, new ListNode(6, new ListNode(8))));
        int result = pairSum(head);
        assertEquals(6, result);
    }
}