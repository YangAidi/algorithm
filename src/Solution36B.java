/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-10 00:41
 **/
public class Solution36B {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (m >= n || head == null) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;

        for (int i = 1; i < m; i++) {
            if (head == null) {
                return null;
            }
            head = head.next;
        }

        ListNode pre = head;
        ListNode end = head.next;
        ListNode tempHead = end, next = end.next;
        for (int i = m; i < n; i++) {
            if (next == null) {
                return null;
            }
            ListNode temp = next.next;
            next.next = tempHead;
            tempHead = next;
            next = temp;
        }
        end.next = next;
        pre.next = tempHead;

        return dummy.next;
    }
}
