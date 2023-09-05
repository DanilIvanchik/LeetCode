import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

public class OddEvenLinkedListTest {

    @Test
    public void testOddEvenList_NullList() {
        OddEvenLinkedList oddEvenLinkedList = new OddEvenLinkedList();
        assertNull(oddEvenLinkedList.oddEvenList(null));
    }

    @Test
    public void testOddEvenList_OnlyOneNode() {
        OddEvenLinkedList oddEvenLinkedList = new OddEvenLinkedList();
        OddEvenLinkedList.ListNode head = new OddEvenLinkedList.ListNode(1);
        assertSame(head, oddEvenLinkedList.oddEvenList(head));
    }

    @Test
    public void testOddEvenList_EvenLengthList() {
        OddEvenLinkedList oddEvenLinkedList = new OddEvenLinkedList();
        OddEvenLinkedList.ListNode head = new OddEvenLinkedList.ListNode(1);
        head.next = new OddEvenLinkedList.ListNode(2);
        head.next.next = new OddEvenLinkedList.ListNode(3);
        head.next.next.next = new OddEvenLinkedList.ListNode(4);

        OddEvenLinkedList.ListNode result = oddEvenLinkedList.oddEvenList(head);

        assertEquals(1, result.val);
        assertEquals(3, result.next.val);
        assertEquals(2, result.next.next.val);
        assertEquals(4, result.next.next.next.val);
        assertNull(result.next.next.next.next);
    }

    @Test
    public void testOddEvenList_OddLengthList() {
        OddEvenLinkedList oddEvenLinkedList = new OddEvenLinkedList();
        OddEvenLinkedList.ListNode head = new OddEvenLinkedList.ListNode(1);
        head.next = new OddEvenLinkedList.ListNode(2);
        head.next.next = new OddEvenLinkedList.ListNode(3);

        OddEvenLinkedList.ListNode result = oddEvenLinkedList.oddEvenList(head);

        assertEquals(1, result.val);
        assertEquals(3, result.next.val);
        assertEquals(2, result.next.next.val);
        assertNull(result.next.next.next);
    }
}
