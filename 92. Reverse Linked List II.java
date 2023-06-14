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
    public ListNode reverseBetween(ListNode head, int left, int right) {
     ListNode current = head;
     ListNode prev = null;
     ListNode next = null;
    
     for(int i = 0; i < left - 1 && current != null; i++){
         prev = current;
         current = current.next;
     }   

     ListNode lastNodeOfFirstPart = prev;
     ListNode lastNodeOfSubList = current;

     for(int i = 0; i < right - left + 1 && current != null; i++){
         next = current.next;
         current.next = prev;
         prev = current;
         current = next;
     }

        if(lastNodeOfFirstPart != null)
        lastNodeOfFirstPart.next = prev;
        else head = prev;

        lastNodeOfSubList.next = current;

        return head;
    }
}