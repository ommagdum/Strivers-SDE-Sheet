
public class StartingNodeOfLoop {
	public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(slow != null && fast != null){
            slow = slow.next;
            if(fast.next == null){
                return null;
            }
            fast = fast.next.next;

            if(slow == fast){
                slow = head;
                while(slow != fast){
                     slow = slow.next;
                     fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
