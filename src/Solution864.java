/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-08-26 13:06
 **/

import leetcode.TreeNode;

/**
 * Definition of TreeNode:
 * public class TreeNode {
 * public int val;
 * public TreeNode left, right;
 * public TreeNode(int val) {
 * this.val = val;
 * this.left = this.right = null;
 * }
 * }
 */

public class Solution864 {
    /**
     * @param root: a TreeNode
     * @return: return a boolean
     */
    public boolean checkEqualTree(TreeNode root) {
        // write your code here
        int target = visit(root);
        if (target % 2 == 0) {
            return  visit2(root, target / 2);
        } else {
            return false;
        }
    }


    public int visit(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = visit(root.left);
        int right = visit(root.right);
        return root.val + left + right;
    }

    public boolean visit2(TreeNode root, int target) {
        if (root == null) {
            return false;
        }
        if(target == root.val){
            return true;
        }
        boolean left = visit2(root.left, target - root.val);
        boolean right = visit2(root.right, target - root.val);
        return left || right;
    }
}
