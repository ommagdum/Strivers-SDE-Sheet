
public class IntersectionOfTwoLinkedLists {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l1 = headA;
        ListNode l2 = headB;

        while(l1 != l2){

            if(l1 != null){
                l1 = l1.next;
            }else{
                l1 = headB;
            }

            if(l2 != null){
                l2 = l2.next;
            }else{
                l2 = headA;
            }

        }

        return l1;
    }
}
