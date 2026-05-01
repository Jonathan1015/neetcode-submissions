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
    public ListNode reverseList(ListNode head) {
        ListNode new_head = null;
        ListNode new_tail = null;

        while (head != null) {
            ListNode temp = head;
            head = head.next;
            temp.next = null;

            if (new_tail == null) {
                new_tail = temp;
                new_head = temp;
            } else {
                temp.next = new_head;
                new_head = temp;
            }
        }

        return new_head;
    }
}
