/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-21 00:57
 **/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l = l1;

        ListNode p = l1;
        int inc = 0;
        while (l1 != null && l2 != null) {
            int v = l1.val + l2.val + inc;
            if (v > 9) {
                v = v % 10;
                inc = 1;
            } else {
                inc = 0;
            }
            p = l1;
            l1.val = v;
            l1 = l1.next;
            l2 = l2.next;

        }
        while (l1 != null) {
            int v = l1.val + inc;
            if (v > 9) {
                v = v % 10;
                inc = 1;
            } else {
                inc = 0;
            }
            p = l1;
            l1.val = v;
            l1 = l1.next;
        }
        if (l2 != null) {
            p.next = l2;
        }

        while (l2 != null) {
            int v = l2.val + inc;
            if (v > 9) {
                v = v % 10;
                inc = 1;
            } else {
                inc = 0;
            }
            p = l2;
            l2.val = v;
            l2 = l2.next;
        }


        if (inc == 1) {
            p.next = new ListNode(1);
        }

        return l;
    }

    public int getL(ListNode l) {
        int c = 0;
        while (l != null) {
            ++c;
            l = l.next;
        }
        return c;
    }
}
