/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-25 19:18
 **/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution110 {
    public boolean isBalanced(TreeNode root) {
        int a = isBalancedTree(root);
        return a != -1;
    }

    private int isBalancedTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = isBalancedTree(root.left);
        if (l == -1) {
            return -1;
        }
        int r = isBalancedTree(root.right);
        if (r == -1) {
            return -1;
        }
        if (Math.abs(l - r) <= 1) {
            return Math.max(l, r) + 1;
        }
        return -1;
    }
}