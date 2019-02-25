/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-02-25 10:34
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

public class Solution691 {
    /**
     * @param root: the given tree
     * @return: the tree after swapping
     */
    public TreeNode bstSwappedNode(TreeNode root) {
        findWrongNode(root);
        if (node1 != null && !isSwap) {
            findNext(root, node1.val);
        }
        return root;
    }

    private void findNext(TreeNode root, int pre) {
        if (root == null) {
            return;
        }
        findNext(root.left, pre);
        if (pre == node1.val) {
            int p = root.val;
            root.val = pre;
            node1.val = p;
        }

        findNext(root.right, root.val);
    }

    private void findWrongNode(TreeNode root) {
        if (root == null) return;
        findWrongNode(root.left);
        if (pre != null && pre.val > root.val) {
            if (node1 == null) {
                node1 = pre;
            } else {
                int p = root.val;
                root.val = node1.val;
                node1.val = p;
                isSwap = true;
                return;
            }
        }
        pre = root;
        findWrongNode(root.right);
    }

    public boolean isSwap = false;
    public TreeNode pre;
    public TreeNode node1;
}
