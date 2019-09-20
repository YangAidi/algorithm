
/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2018-04-29 09:33
 **/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        ListNode l = new ListNode(0);
        l.next = head;
        ListNode p = head;
        while (n-- >= 0) {
            if (p == null) {
                return head.next;
            }
            p = p.next;
        }

        while (p != null) {
            p = p.next;
            head = head.next;
        }
        head.next = head.next.next;
        return l.next;
    }
}
