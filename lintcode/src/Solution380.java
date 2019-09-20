/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-09 00:40
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

public class Solution380 {
    /**
     * @param headA: the first list
     * @param headB: the second list
     * @return: a ListNode
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // write your code here
        int a =count(headA);
        int b =count(headB);
        // a是最长的
        if(a<b){
            ListNode c = headA;
            headA = headB;
            headB = c;
        }
        int d = Math.abs(a-b);
        while (d-->0){
            headA=headA.next;
        }
        for(int i=0;i<Math.min(a,b);++i){
            if(headA == headB){
                return headA;
            }
            headA= headA.next;
            headB=headB.next;
        }
        return null;

    }

    private int count(ListNode head){
        int count=0;
        while (head!=null){
            ++count;
            head=head.next;
        }
        return count;
    }
}