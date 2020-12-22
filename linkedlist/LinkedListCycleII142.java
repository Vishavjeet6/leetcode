package leetcode.linkedlist;

public class LinkedListCycleII142 {
	
	public class Solution {
	    public ListNode detectCycle(ListNode head) {
	        if(head == null || head.next == null) return null;
	        ListNode slow = head;
	        ListNode fast = head;
	        ListNode start = head;
	        while(fast != null && fast.next != null){
	            slow = slow.next;
	            fast = fast.next.next;
	            if(fast == slow) {
	                while(slow != start){
	                    slow = slow.next;
	                    start = start.next;
	                }
	                return start;
	            }
	        }
	        return null;   
	    }
	}


}
