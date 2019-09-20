//import lib.ListNode;
//
///**
// * @program: LintCode
// * @author: YangAidi
// * @create: 2018-04-03 18:32
// **/
//
////public class Solution450 {
////    /**
////     * @param head: a lib.ListNode
////     * @param k:    An integer
////     * @return: a lib.ListNode
////     */
////    public lib.ListNode reverseKGroup(lib.ListNode head, int k) {
////        // write your code here
////        if (head == null || head.next == null || k == 0 || k == 1) return head;
////        lib.ListNode nextHead = head;
////        lib.ListNode p = null;
////        lib.ListNode newHead = head;
////        while (nextHead != null) {
////            head=nextHead;
////            //nextHead移动到下一轮的开头
////            int i = 1;
////            //前进k步
////            while (nextHead != null&&i % (k+1) != 0 ) {
////                nextHead = nextHead.next;
////                ++i;
////            }
////            lib.ListNode l = new lib.ListNode(-1);
////            while (head != null) {
////                p = head;
////                head = head.next;
////                p.next = l.next;
////                l.next = p;
////            }
////            if (i == k) {
////                newHead = l.next;
////            }
////        }
////
////        return newHead.next;
////    }
////}
//public class Solution450 {
//    /**
//     * @param head a lib.ListNode
//     * @param k an integer
//     * @return a lib.ListNode
//     */
//    public ListNode reverseKGroup(ListNode head, int k) {
//        ListNode dummy = new ListNode(0);
//        dummy.next = head;
//
//        head = dummy;
//        while (true) {
//            head = reverseK(head, k);
//            if (head == null) {
//                break;
//            }
//        }
//
//        return dummy.next;
//    }
//
//    // head -> n1 -> n2 ... nk -> nk+1
//    // =>
//    // head -> nk -> nk-1 .. n1 -> nk+1
//    // return n1
//    public ListNode reverseK(ListNode head, int k) {
//        ListNode nk = head;
//        for (int i = 0; i < k; i++) {
//            if (nk == null) {
//                return null;
//            }
//            nk = nk.next;
//        }
//
//        if (nk == null) {
//            return null;
//        }
//
//        // reverse
//        ListNode n1 = head.next;
//        ListNode nkplus = nk.next;
//
//        ListNode prev = null;
//        ListNode curt = n1;
//        while (curt != nkplus) {
//            ListNode temp = curt.next;
//            curt.next = prev;
//            prev = curt;
//            curt = temp;
//        }
//
//        // connect
//        head.next = nk;
//        n1.next = nkplus;
//        return n1;
//    }
//}