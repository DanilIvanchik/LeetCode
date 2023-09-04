import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;
public class ReverseLinkedListTest extends ProductOfArrayExceptSelf {
    @Test
    public void testOddEvenListWithEmptyList() {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        ReverseLinkedList.ListNode head = null;
        assertNull(reverseLinkedList.oddEvenList(head));
    }

    @Test
    public void testOddEvenListWithSingleElement() {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        ReverseLinkedList.ListNode head = new ReverseLinkedList.ListNode(1);
        ReverseLinkedList.ListNode result = reverseLinkedList.oddEvenList(head);
        assertEquals(1, result.val);
        assertNull(result.next);
    }

    @Test
    public void testOddEvenListWithMultipleElements() {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        ReverseLinkedList.ListNode head = new ReverseLinkedList.ListNode(1,
                new ReverseLinkedList.ListNode(2,
                        new ReverseLinkedList.ListNode(3,
                                new ReverseLinkedList.ListNode(4,
                                        new ReverseLinkedList.ListNode(5)))));
        ReverseLinkedList.ListNode result = reverseLinkedList.oddEvenList(head);
        assertEquals(5, result.val);
        assertEquals(4, result.next.val);
        assertEquals(3, result.next.next.val);
        assertEquals(2, result.next.next.next.val);
        assertEquals(1, result.next.next.next.next.val);
        assertNull(result.next.next.next.next.next);
    }
}