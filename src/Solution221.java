/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2018-04-05 22:48
 **/

import java.util.ArrayList;
import java.util.List;

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

public class Solution221 {
    /**
     * @param l1: The first list.
     * @param l2: The second list.
     * @return: the sum list of l1 and l2.
     */
    public ListNode addLists2(ListNode l1, ListNode l2) {
        // write your code here
        ListNode p = l1;
        List<Integer> list1 = new ArrayList<>();
        while (p != null) {
            list1.add(p.val);
            p = p.next;
        }
        List<Integer> list2 = new ArrayList<>();
        p = l2;
        while (p != null) {
            list2.add(p.val);
            p = p.next;
        }
        int i = list1.size() - 1;
        int j = list2.size() - 1;
        int up = 0;
        ListNode head = new ListNode(0);
        for (; i >= 0 && j >= 0; --i, --j) {
            int sum = list1.get(i) + list2.get(j) + up;
            ListNode temp = new ListNode(sum % 10);
            temp.next = head.next;
            head.next = temp;
            up = sum / 10;
        }
        //int k=i==0?j:i;
        for (; j >= 0; --j) {
            int sum = list2.get(j) + up;
            ListNode temp = new ListNode(sum % 10);
            temp.next = head.next;
            head.next = temp;
            up = sum / 10;
        }

        for (; i >= 0; --i) {
            int sum = list1.get(i) + up;
            ListNode temp = new ListNode(sum % 10);
            temp.next = head.next;
            head.next = temp;
            up = sum / 10;
        }
        if (up > 0) {
            ListNode temp = new ListNode(up);
            temp.next = head.next;
            head.next = temp;
        }
        return head.next;
    }
}
