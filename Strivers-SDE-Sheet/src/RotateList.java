
public class RotateList {
	public ListNode rotateRight(ListNode head, int k) {

        // If the list is empty return the same list.
        if(head == null){
            return head;
        }

        // Getting the length of linked list
        int length = 1;
        ListNode tail = head;
        while(tail.next != null){
            tail = tail.next;
            length += 1;
        }


        // getting the final amount of rotaions to do. for eg. if k = 5 and length = 5 no need of
        // rotation.
        k = k % length;
        if(k == 0){
            return head;
        }

        
        // move to the pivot node and rotate
        ListNode cur = head;
        for(int i = 0; i < (length - k - 1); i++){
            cur = cur.next;
        }

        ListNode newHead = cur.next;
        cur.next = null;
        tail.next = head;

        return newHead;
    }
}
