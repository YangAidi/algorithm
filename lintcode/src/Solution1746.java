/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-18 11:57
 **/

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

public class Solution1746 {
    /**
     * @param root:  a Binary Search Tree (BST) with the root node
     * @return: the minimum difference
     */
    int pre = Integer.MAX_VALUE;
    int min = Integer.MAX_VALUE;

    public int minDiffInBST(TreeNode root) {
        // Write your code here.

        if (root.left != null) {
            minDiffInBST(root.left);
        }

        min = Math.min(Math.abs(pre - root.val), min);

        pre = root.val;

        if(root.right!=null){
            minDiffInBST(root.right);
        }

        return min;
    }
}
