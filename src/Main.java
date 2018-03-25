import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Solution35 solution=new Solution35();
        ListNode l=new ListNode(0);
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(2);
        ListNode l3=new ListNode(3);
        l.next=l1;
        l1.next=l2;
        l2.next=l3;
        System.out.println(l);
        System.out.println(solution.reverse(l));
    }
}
