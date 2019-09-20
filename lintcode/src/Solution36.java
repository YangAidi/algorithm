/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-09 23:49
 **/

/**
 * Definition for ListNode
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */

public class Solution36 {
    /**
     * @param head: ListNode head is the head of the linked list
     * @param m:    An integer
     * @param n:    An integer
     * @return: The head of the reversed ListNode
     */
    public ListNode reverseBetween(ListNode head, int m, int n) {
        // write your code here
        int count = n - m +1;
        if (count == 1) {
            return head;
        }

        ListNode newHead = new ListNode(0);
        newHead.next = head;
        int i = 1;
        ListNode pre = newHead;
        while (i < m) {
            pre = pre.next;
            ++i;
        }

        int j = 0;

        ListNode temp = new ListNode(-1);
        ListNode l =null;
        ListNode end =pre.next;
        head=end;
        while (head != null && j++ < count) {
            ListNode q = head;
            head = head.next;
            if(j==count){
                l = q.next;
            }
            q.next = temp.next;
            temp.next = q;
        }

        pre.next = temp.next;
        end.next=l;


        return newHead.next;
    }
}
