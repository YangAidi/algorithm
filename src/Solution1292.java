/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-17 22:01
 **/
/**
 * Definition for ListNode
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution1292 {
    /**
     * @param head: a singly linked list
     * @return: Modified linked list
     */
    public ListNode oddEvenList(ListNode head) {
        // write your code here
        ListNode p = head;
        ListNode h2= new ListNode(0);
        ListNode h1= new ListNode(0);
        ListNode p1 = h1;
        ListNode p2 = h2;
        while(p!=null){
            p1.next=p;
            p1=p1.next;
            p=p.next;

            if(p!=null){
                p2.next=p;
                p2=p2.next;
                p=p.next;
            }
        }
        p1.next = h2.next;
        p2.next = null;

        return h1.next;

    }
}
