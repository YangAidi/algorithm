

public class Main {


    public static void main(String[] args) {
        ListNode l = new ListNode(10);
        ListNode l2 = new ListNode(60);
        ListNode l3 = new ListNode(20);
        l.next=l2;
        l3.next=l2;
        System.out.println(new Solution380().getIntersectionNode(l, l2));
    }
}
