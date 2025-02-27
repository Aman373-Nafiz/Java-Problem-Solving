package LinkedList;
import java.util.*;
public class Add_two_Numbers {
    public static void main(String[] args) {

    }
    public class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode alt = new ListNode(0);
        ListNode curr = alt;
        int carry =0;
        while(l1!=null || l2!=null){
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = x+y+carry;
            carry = sum/10;
            curr.next = new ListNode(sum%10);
            if(l1!=null) l1 = l1.next;
            if(l2!=null) l2 = l2.next;
            curr = curr.next;

        }
        if(carry>0){
            curr.next = new ListNode(carry);

        }
        return alt.next;
    }
}
