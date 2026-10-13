/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null) return head;
        
        ListNode fast = head;

        int i = 1;
        while (fast != null && fast.next != null) {

            fast = fast.next.next;
            i += 2;
        }

        if (fast == null) i--;

        int pos = i - n;
        if (pos == 0) return head.next;

        ListNode temp = head;
        while (pos > 1) {
            temp = temp.next;
            pos--;
        }

        temp.next = temp.next.next;
        return head;

    }
}