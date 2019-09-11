/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-10 01:07
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

public class Solution452 {
    /**
     * @param head: a ListNode
     * @param val:  An integer
     * @return: a ListNode
     */
    public ListNode removeElements(ListNode head, int val) {
        // write your code here
        ListNode l = new ListNode(0);
        l.next = head;
        ListNode pre = l;
        while (head != null) {
            if (head.val == val) {
                pre.next = head.next;
            }else {
                pre = pre.next;
            }
            head = head.next;
        }
        return l.next;
    }
}
