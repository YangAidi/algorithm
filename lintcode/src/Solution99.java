/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-17 21:28
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-16 17:16
 **/
/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-16 17:16
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

public class Solution99 {
    /**
     * @param head: The head of linked list.
     * @return: nothing
     *
     * 这个题目我理解错了，感觉我做的比题目要求的更复杂
     * 1->2->3->4->5->null
     *
     * 1-4-3-2-5
     *
     */
    public void reorderList(ListNode head) {
        // write your code here
        if(head==null||head.next==null||head.next.next==null){
            return;
        }

        int count = 0;
        ListNode p = head;
        while (p != null) {
            p = p.next;
            ++count;
        }
        int time = count / 2;
        p = head;
        while (time-- > 0) {
            p = p.next;
            ++count;
        }
        ListNode h2=p.next;
        p.next=null;
        h2=revert(h2);
        p=head;
        while (p!=null&&h2!=null){
            ListNode l = h2;
            h2=h2.next;
            l.next=p.next;
            p.next=l;
            p=l.next;
        }
    }

    private ListNode revert(ListNode head){
        ListNode h = new ListNode(0);
        while (head!=null){
            ListNode p = head;
            head=head.next;
            p.next=h.next;
            h.next=p;
        }
        return h.next;
    }
}

