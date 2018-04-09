/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2018-04-09 21:06
 **/
public class Solution167 {
    /**
     * @param l1: the first list
     * @param l2: the second list
     * @return: the sum list of l1 and l2
     */
    public ListNode addLists(ListNode l1, ListNode l2) {
        // write your code here
        int up=0;
        ListNode l=new ListNode(0);
        ListNode head=null;
        head=l;
        while (l1!=null&&l2!=null)
        {
            ListNode p=new ListNode(0);
            l.next=p;
            int sum=l1.val+l2.val+up;
            up=sum/10;
            p.val=sum%10;
            l=l.next;
            l1=l1.next;
            l2=l2.next;
        }
        while (l1!=null){
            ListNode p=new ListNode(0);
            l.next=p;
            int sum=l1.val+up;
            up=sum/10;
            p.val=sum%10;
            l=l.next;
            l1=l1.next;
        }
        while (l2!=null)
        {
            ListNode p=new ListNode(0);
            l.next=p;
            int sum=+l2.val+up;
            up=sum/10;
            p.val=sum%10;
            l=l.next;
            l2=l2.next;
        }
        if(up==1){
            ListNode p=new ListNode(1);
            l.next=p;
            p.next=null;
        }
        return head.next;
    }
}
