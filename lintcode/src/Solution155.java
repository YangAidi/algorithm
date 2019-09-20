/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-06 12:21
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

public class Solution155 {
    /**
     * @param root: The root of binary tree
     * @return: An integer
     */

    public int minDepth(TreeNode root) {
        // write your code here
        if (root == null) {
            return 0;
        }
        depth(root, 1);
        return min;
    }

    public void depth(TreeNode root, int i) {
        // write your code here
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            if (i < min) {
                min = i;
            }
        }
        depth(root.right, i + 1);
        depth(root.left, i + 1);
    }


    private int min = Integer.MAX_VALUE;
}
