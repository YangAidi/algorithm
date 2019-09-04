/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-03 19:52
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

public class Solution98 {
    /**
     * @param head: The head of linked list.
     * @return: You should return the head of the sorted linked list, using constant space complexity.
     */
    public ListNode sortList(ListNode head) {
        // write your code here
        if (head == null || head.next == null) {
            return head;
        }
        return sort(head, null);
    }


    public ListNode sort(ListNode left, ListNode right) {
        if (left.next == right) {
            return left;
        }
        ListNode l = new ListNode(888);
        l.next = left;
        ListNode mid = partition(l, right);
        if (l.next != mid) {
            l.next = sort(l.next, mid);
        }
        if (mid.next != right) {
            mid.next = sort(mid.next, null);
        }
        return l.next;
    }

    // head是空头结点，tail是尾节点的next
    public ListNode partition(ListNode head, ListNode tail) {
        ListNode mid = head;
        if (mid.next.next == tail) {
            return mid.next;
        }

        // write your code here
        ListNode newNode = mid;
        mid = mid.next;
        ListNode left = null, right = null, leftEnd = null, rightEnd = null, p = mid.next;
        while (p != tail) {
            ListNode q = p;
            p = p.next;
            q.next = null;
            if (q.val < mid.val) {
                if (left == null) {
                    left = q;
                    leftEnd = left;
                } else {
                    leftEnd.next = q;
                    leftEnd = q;
                }
            } else {
                if (right == null) {
                    right = q;
                    rightEnd = right;
                } else {
                    rightEnd.next = q;
                    rightEnd = q;
                }
            }
        }
        if (right == null) {
            mid.next = tail;
        }else {
            mid.next = right;
            rightEnd.next=tail;
        }
        if (left == null) {
            newNode.next = mid;
        } else {
            leftEnd.next=mid;
            newNode.next = left;
        }
        return mid;
    }
}
