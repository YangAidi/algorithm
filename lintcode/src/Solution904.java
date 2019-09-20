/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-07 19:01
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

public class Solution904 {
    /**
     * @param head: the first Node
     * @return: the answer after plus one
     */
    public ListNode plusOne(ListNode head) {
        // Write your code here
        if (head == null) {
            return head;
        }
        head = revert(head);
        ListNode p = head;
        boolean b=true;
        while (p != null) {
            if (p.val == 9) {
                p.val = 0;
                p=p.next;
            }else {
                p.val=p.val+1;
                b=false;
                break;
            }
        }

        if(b){
            head = revert(head);
            ListNode newHead = new ListNode(1);
            newHead.next=head;
            return newHead;
        }

        return revert(head);
    }

    private ListNode revert(ListNode head) {
        ListNode newHead = new ListNode(-1);
//        newHead.next = head;
        while (head != null) {
            ListNode p = head;
            head = head.next;
            p.next = newHead.next;
            newHead.next = p;
        }
        return newHead.next;
    }
}
