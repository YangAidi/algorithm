package leetcode;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2018-04-08 10:01
 **/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 * @author Administrator
 */


public class Solution814 {
    public TreeNode pruneTree(TreeNode root) {
        //TreeNode head = root;
        TreeNode p = new TreeNode(1);
        p.left = root;
        sum(p);
        return p.left;
    }

    private int sum(TreeNode root) {
        //if (root.left == null && root.right == null) {return 0;}
        if (root == null) {
            return 0;
        }
        if (sum(root.left) + sum(root.right) == 0 && root.val == 0) {
            root=null;
            return 0;
        }
        return 1;
    }

}

