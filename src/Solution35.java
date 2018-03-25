/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2018-03-25 12:16
 * 黄油当时问的算法题，头插法，可是自己真的去写的时候还是有问题。
 * 这一次上来加入了判断null的条件
 * 但是具体怎么操作的时候还是出了点问题，造成了断链
 **/

/**
 * Definition for ListNode
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }

    @Override
    public String toString() {
        if (next == null) return String.valueOf(val);
        return String.valueOf(val) + "-" + next.toString();
    }
}

public class Solution35 {
    /**
     * @param head: n
     * @return: The new head of reversed linked list.
     */
    public ListNode reverse(ListNode head) {
        // write your code here
        if (head == null || head.next == null) return head;
        ListNode l = new ListNode(-1);
        l.next=null;
        ListNode p = l;
        //p.next=null;
        while (head != null) {
            p = head;
            head = head.next;
            p.next=l.next;
            l.next = p;
        }
        return l.next;
    }
}
