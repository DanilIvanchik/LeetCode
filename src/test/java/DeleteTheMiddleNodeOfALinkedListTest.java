import org.junit.Test;
import static org.junit.Assert.*;

public class DeleteTheMiddleNodeOfALinkedListTest {

    @Test
    public void testDeleteMiddleWithSingleNode() {
        DeleteTheMiddleNodeOfALinkedList solution = new DeleteTheMiddleNodeOfALinkedList();
        DeleteTheMiddleNodeOfALinkedList.ListNode head = new DeleteTheMiddleNodeOfALinkedList.ListNode(1);
        assertNull(solution.deleteMiddle(head));
    }

    @Test
    public void testDeleteMiddleWithTwoNodes() {
        DeleteTheMiddleNodeOfALinkedList solution = new DeleteTheMiddleNodeOfALinkedList();
        DeleteTheMiddleNodeOfALinkedList.ListNode head = new DeleteTheMiddleNodeOfALinkedList.ListNode(1);
        head.next = new DeleteTheMiddleNodeOfALinkedList.ListNode(2);
        assertEquals(1, solution.deleteMiddle(head).val);
        assertNull(head.next);
    }

    @Test
    public void testDeleteMiddleWithOddLength() {
        DeleteTheMiddleNodeOfALinkedList solution = new DeleteTheMiddleNodeOfALinkedList();
        DeleteTheMiddleNodeOfALinkedList.ListNode head = new DeleteTheMiddleNodeOfALinkedList.ListNode(1);
        head.next = new DeleteTheMiddleNodeOfALinkedList.ListNode(2);
        head.next.next = new DeleteTheMiddleNodeOfALinkedList.ListNode(3);
        head.next.next.next = new DeleteTheMiddleNodeOfALinkedList.ListNode(4);
        head.next.next.next.next = new DeleteTheMiddleNodeOfALinkedList.ListNode(5);

        DeleteTheMiddleNodeOfALinkedList.ListNode newHead = solution.deleteMiddle(head);
        assertEquals(1, newHead.val);
        assertEquals(2, newHead.next.val);
        assertEquals(4, newHead.next.next.val);
        assertEquals(5, newHead.next.next.next.val);
        assertNull(newHead.next.next.next.next);
    }

    @Test
    public void testDeleteMiddleWithEvenLength() {
        DeleteTheMiddleNodeOfALinkedList solution = new DeleteTheMiddleNodeOfALinkedList();
        DeleteTheMiddleNodeOfALinkedList.ListNode head = new DeleteTheMiddleNodeOfALinkedList.ListNode(1);
        head.next = new DeleteTheMiddleNodeOfALinkedList.ListNode(2);
        head.next.next = new DeleteTheMiddleNodeOfALinkedList.ListNode(3);
        head.next.next.next = new DeleteTheMiddleNodeOfALinkedList.ListNode(4);

        DeleteTheMiddleNodeOfALinkedList.ListNode newHead = solution.deleteMiddle(head);
        assertEquals(1, newHead.val);
        assertEquals(2, newHead.next.val);
        assertEquals(4, newHead.next.next.val);
        assertNull(newHead.next.next.next);
    }
}
