import java.util.ArrayList;
import java.util.List;

public class MaximumTwinSumOfALinkedList {

    //Lvl: Medium

    //Runtime: 10ms
    //Beats 38.57% of users with Java

    //Memory: 57.08MB
    //Beats 94.71% of users with Java

    //TODO: In a linked list of size n, where n is even, the ith node
    // (0-indexed) of the linked list is known as the twin of the (n-1-i)th
    // node, if 0 <= i <= (n / 2) - 1.
    // For example, if n = 4, then node 0 is the twin of node 3, and node 1
    // is the twin of node 2. These are the only nodes with twins for n = 4.
    // The twin sum is defined as the sum of a node and its twin.
    // Given the head of a linked list with even length, return the maximum
    // twin sum of the linked list.

     public class ListNode {
         int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
    public int pairSum(ListNode head) {
        List<Integer> list =new ArrayList<>();
        while (head.next != null){
            list.add(head.val);
            head = head.next;
        }
        list.add(head.val);
        int max = 0;
        int n = list.size();
        for (int i = 0; i < n/2; i++){
            int temp = list.get(i)+list.get(n-i-1);
            if (temp > max){
                max = temp;
            }
        }
        return max;
    }
}
