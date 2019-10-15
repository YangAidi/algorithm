/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-10-14 14:59
 **/
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution141 {
    public boolean hasCycle(ListNode head) {
        ListNode p = head;
        if(head==null||head.next==null){
            return false;
        }
        ListNode q = head;
        while(q!=null){
            p = p.next;
            if(q.next!=null){
                q = q.next.next;
            }else{
                return false;
            }
            if(p==q){
                return true;
            }
        }
        return false;
    }
}
