/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        int cycleLength = 0;
        ListNode slow = head, fast = head;
        if (head == null || head.next == null) 
        return null;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                cycleLength = calculateCycleLength(slow);
                break;
            }
            if (fast == null || fast.next == null) return null;
        }
        return findStart(head, cycleLength);
        // return null;
    }

    private static int calculateCycleLength(ListNode slow){
        ListNode current = slow;
        int cycleLength = 0;
        do{
            current = current.next;
            cycleLength++;
        } while(current != slow);
        return cycleLength;
    }

    private static ListNode findStart(ListNode head, int cycleLength){
        ListNode pointer1 = head, pointer2 = head;
        while(cycleLength > 0){
            pointer2 = pointer2.next;
            cycleLength--;
        }
        while(pointer1 != pointer2){
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }
        return pointer1;
    }
}
