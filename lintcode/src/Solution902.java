/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-07 11:07
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

public class Solution902 {
    /**
     * @param root: the given BST
     * @param k:    the given k
     * @return: the kth smallest element in BST
     */
    public int kthSmallest(TreeNode root, int k) {
        // write your code here


        if (root == null) {
            return 0;
        }
        searchK(root, k);
        return n;

    }

    private int n = 0;
    private int now =0;

    private void searchK(TreeNode treeNode, int k) {

        if (treeNode.left != null) {
            searchK(treeNode.left, k);
        }

        ++now;
        if (k == now) {
            n = treeNode.val;
            return;
        }

        if (treeNode.right != null && k > now) {
            searchK(treeNode.right, k);
        }
    }
}
