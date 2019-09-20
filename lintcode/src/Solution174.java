/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-09 22:22
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

public class Solution174 {
    /**
     * @param head: The first node of linked list.
     * @param n: An integer
     * @return: The head of linked list.
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // write your code here
        ListNode newHead = new ListNode(0);
        newHead.next=head;
        if(head==null){
            return null;
        }
        ListNode p = newHead;
        while (n-->0){
            p=p.next;
        }
        ListNode q = newHead;
        while (p.next!=null){
            p=p.next;
            q=q.next;
        }
        q.next=q.next.next;
        return newHead.next;
    }
}