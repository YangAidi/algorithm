/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-19 22:22
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

public class Solution170 {
    /**
     * @param head: the List
     * @param k:    rotate to the right k places
     * @return: the list after rotation
     */
    public ListNode rotateRight(ListNode head, int k) {
        // write your code here
        if (head == null || head.next == null) {
            return head;
        }
        int sum = 0;
        ListNode c = head;
        while (c != null) {
            c = c.next;
            ++sum;
        }
        if (k > sum) {
            k = k % sum;
        }
        if(k<=0){
            return head;
        }

        ListNode l = new ListNode(0);
        l.next = head;
        int count = 0;
        ListNode p = head;

        while (++count <= k) {
            head = head.next;
            if (head == null) {
                return p;
            }
        }

        while (head.next != null) {
            head = head.next;
            p = p.next;
        }
        ListNode temp = p.next;
        p.next = null;

        head.next = l.next;

        return temp;

    }
}
