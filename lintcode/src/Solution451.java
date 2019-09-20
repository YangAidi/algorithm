/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-15 10:21
 **/
/**
 * Definition for ListNode
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution451 {
    /**
     * @param head: a ListNode
     * @return: a ListNode
     */
    public ListNode swapPairs(ListNode head) {
        // write your code here
        ListNode l = new ListNode(0);
        l.next = head;
        head = l;
        while(head.next!=null&&head.next.next!=null){
            ListNode temp = head.next;
            head.next = temp.next;
            temp.next = temp.next.next;
            head.next.next = temp;
            head = temp;
        }
        return l.next;
    }
}
