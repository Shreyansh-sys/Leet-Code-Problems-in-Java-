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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int res = 0, carry = 0;
        int sum = 0;
        ListNode head = null;
        ListNode temp = null;

        while(l1 != null || l2 != null || carry > 0){
            sum = ((l1 != null) ? l1.val : 0) + ((l2 != null) ? l2.val : 0) + carry;
            res = sum % 10;
            carry = sum / 10;

            ListNode newNode = new ListNode(res);

            if(head == null){
                head = newNode;
            }
            else{
                temp = head;
                while(temp.next != null){
                    temp = temp.next;
                }
                temp.next = newNode;
                newNode.next = null;
            }
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l1 = l2.next;
        }
        return head;
    }
}