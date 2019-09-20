/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-16 17:16
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

public class Solution99B {
    /**
     * @param head: The head of linked list.
     * @return: nothing
     *
     * 这个题目我理解错了，感觉我做的比题目要求的更复杂
     * 1->2->3->4->5->null
     *
     * 1-4-3-2-5
     *
     */
    public void reorderList(ListNode head) {
        // write your code here
        ListNode head1 = head;
        ListNode head2 = new ListNode(0);
        while (head1 != null) {
            ListNode p = head1.next;
            if (p != null) {
                head1.next = p.next;
                head1 = head1.next;
                p.next = head2.next;
                head2.next = p;
            } else {
                break;
            }
        }
        head2 = head2.next;
        ListNode temp = head;
        while (temp != null&&head2!=null) {
            ListNode p= head2;
            head2 = head2.next;
            p.next = temp.next;
            temp.next= p;
            temp=temp.next.next;
        }
    }
}
