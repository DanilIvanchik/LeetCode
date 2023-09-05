public class OddEvenLinkedList {

    //Lvl: Medium

    //Runtime: 0ms
    //Beats 100.00% of users with Java

    //Memory: 43.26MB
    //Beats 52.70% of users with Java

    //TODO: Given the head of a singly linked list, group all the nodes with
    // odd indices together followed by the nodes with even indices, and return
    // the reordered list.
    // The first node is considered odd, and the second node is even, and so on.
    // Note that the relative order inside both the even and odd groups should
    // remain as it was in the input.
    // You must solve the problem in O(1) extra space complexity and O(n) time
    // complexity.

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;
        while (even != null && even.next != null){

            odd.next = odd.next.next;
            odd = odd.next;
            even.next = even.next.next;
            even = even.next;

        }
        odd.next = evenHead;
        return head;
    }
}
