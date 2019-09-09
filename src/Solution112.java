/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-09 22:15
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

public class Solution112 {
    /**
     * @param head: head is the head of the linked list
     * @return: head of linked list
     */
    public ListNode deleteDuplicates(ListNode head) {
        // write your code here
        // 这个有点蠢了，直接next.val就可以了
        ListNode res = head;
        while (head != null) {
            ListNode pre = head;
            head = head.next;
            while (head != null && pre.val == head.val) {
                head = head.next;
                pre.next = head;
            }
        }

        return res;
    }
}
