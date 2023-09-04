public class DeleteTheMiddleNodeOfALinkedList {

    //Lvl: Medium

    //Runtime: 3ms
    //Beats 97.65% of users with Java

    //Memory: 64.06MB
    //Beats 17.35% of users with Java

    //TODO: You are given the head of a linked list. Delete the middle node, and return
    // the head of the modified linked list.
    // The middle node of a linked list of size n is the ⌊n / 2⌋th node from the start
    // using 0-based indexing, where ⌊x⌋ denotes the largest integer less than or equal
    // to x.
    // For n = 1, 2, 3, 4, and 5, the middle nodes are 0, 1, 1, 2, and 2, respectively.

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null)
            return null;

        int count = 0;
        ListNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        temp = head;
        count = count / 2;
        while (--count != 0) {
            temp = temp.next;
        }
        temp.next = temp.next.next;

        return head;
    }
}
