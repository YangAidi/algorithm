//package huawei;
//
//import java.util.Scanner;
//
///**
// * @program: LintCode
// * @author: YangAidi
// * @create: 2019-08-07 19:58
// **/
//public class Problem3 {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        in.hasNext();
//
//        String s = in.next();
//        chars = s.toCharArray();
//        Main.LogicBinarySearchTree bst = new Main.LogicBinarySearchTree();
//        bst.root = expression();
//        System.out.println(postOrder(bst.root)?1:0);
//    }
//    public static final char AND = '&';
//    public static final char OR = '|';
//    public static final char NOT = '!';
//    public static final char LPAR = '(';
//    public static final char RPAR = ')';
//
//    public static char[] chars;
//    public static int index=0;
//
//    public static boolean postOrder( n) {
//        boolean l = false;
//        boolean r = false;
//        if (n.left != null) {
//            l = postOrder(n.left);
//            // 短路优化
//            if (!l && n.data == '&') {
//                return false;
//            }
//            if (l && n.data == '|') {
//                return true;
//            }
//        }
//        if (n.right != null) {
//            r = postOrder(n.right);
//        }
//        switch (n.data) {
//            case '&':
//                return l && r;
//            case '|':
//                return l || r;
//            case '!':
//                // not的实现方法需要特别注意
//                return !r;
//            default:
//                // 获取每一个字母代表的值
//                return n.data == '1';
//        }
//    }
//
//    public static LogicNode expression() {
//        LogicNode left = factor();
//        while (chars.length > index && (chars[index] == AND || chars[index] == OR)) {
//            if (match(OR)) {
//                Main.LogicNode root = new Main.LogicNode(OR);
//                root.left = left;
//                root.right = factor();
//                left = root;
//            } else if (match(AND)) {
//                Main.LogicNode root = new Main.LogicNode(AND);
//                root.left = left;
//                root.right = factor();
//                left = root;
//            }
//        }
//        return left;
//    }
//
//    private static Main.LogicNode factor() {
//        char c;
//        try {
//            c = chars[index];
//
//            if (match(LPAR)) {
//                Main.LogicNode v = expression();
//                if (!match(RPAR)) {
//                    throw new Exception("Illegal Expression!");
//                }
//                return v;
//            } else if (c == '0' || c == '1') {
//                ++index;
//                return new Main.LogicNode(c);
//            } else if (match(NOT)) {
//                // 非的生成逻辑
//                Main.LogicNode v = new Main.LogicNode(c);
//                Main.LogicNode root = new Main.LogicNode(NOT);
//                root.left = v;
//                root.right = factor();
//                return root;
//            } else {
//                throw new Exception("Illegal Expression!");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        // should not reach here
//        return null;
//    }
//
//    private static boolean match(char c) {
//        if (chars[index] == (c)) {
//            ++index;
//            return true;
//        }
//        return false;
//    }
//
//    static class LogicNode {
//        public Main.LogicNode left;
//        public Main.LogicNode right;
//        public char data;
//
//
//        public LogicNode(char data) {
//            this.data = data;
//        }
//    }

//    static class LogicBinarySearchTree {
//        public Main.LogicNode root;
//    }
//}
