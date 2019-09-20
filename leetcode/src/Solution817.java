//package leetcode;//package leetcode;
//
///**
// * @program: LintCode
// * @author: YangAidi
// * @create: 2018-04-15 10:05
// **/
//public class Solution817 {
//    public int numComponents(ListNode head, int[] G) {
//        if (head == null) {
//            return 0;
//        }
//        if (G.length == 1) {
//            return 1;
//        }
//        int[] hash = new int[10001];
//        for (int g : G) {
//            hash[g]++;
//        }
//        int num = 0;
//        boolean up = false;
//        boolean upup = false;
//        ListNode fa=null;
//        while (head != null) {
//            if (hash[head.val] == 1) {
//                if (up && !upup) {
//                    num++;
//                    upup=true;
//                    hash[head.val] = 0;
//                    //父节点置0
//                    hash[fa.val]=0;
//                }
//                if (up) {
//                    hash[head.val] = 0;
//                    //父节点置0
//                    hash[fa.val]=0;
//                }
//                up = true;
//            }else {
//                up=false;
//                upup=false;
//            }
//            fa=head;
//            head = head.next;
//        }
//        //貌似肯定是最后一个？是的！
//        for (int h : hash) {
//            if (h == 1) {
//                num++;
//            }
//        }
//
//        return num;
//    }
//}
