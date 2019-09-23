/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-20 18:19
 **/
public class Solution234 {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        int count = 0;
        ListNode p = head;
        while (p != null) {
            p = p.next;
            ++count;
        }

        int mid = count / 2;
        p = head;
        while (mid-- > 0) {
            p = p.next;
        }

        if ((count & 1) == 1) {
            p = revert(p.next);
        } else {
            p = revert(p);
        }

        while (p != null) {
            if (p.val != head.val) {
                return false;
            }
            p = p.next;
            head = head.next;
        }
        return true;
    }

    private ListNode revert(ListNode head) {
        ListNode l = new ListNode(1);
        while (head != null) {
            ListNode p = head;
            head = head.next;
            p.next = l.next;
            l.next = p;
        }
        return l.next;
    }
}
