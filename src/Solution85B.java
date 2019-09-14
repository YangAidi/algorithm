/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-13 17:10
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-13 17:02
 **/
/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-13 17:02
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


public class Solution85B {
    /*
     * @param root: The root of the binary search tree.
     * @param node: insert this node into the binary search tree
     * @return: The root of the new binary search tree.
     */
    public TreeNode insertNode(TreeNode root, TreeNode node) {
        // write your code here
        if (root == null) {
            root = node;
            return root;
        }
        TreeNode p = root;
        TreeNode pre = null;
        while (p != null) {
            pre = p;
            if (p.val > node.val) {
                p = p.left;
                if (p == null) {
                    pre.left = node;
                    return root;
                }
            } else if (p.val < node.val) {
                p = p.right;
                if (p == null) {
                    pre.right = node;
                    return root;
                }
            }
        }

        return root;
    }
}

