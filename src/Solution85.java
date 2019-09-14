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


public class Solution85 {
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
        insert(root, node);

        return root;
    }

    public void insert(TreeNode root, TreeNode node) {
        if (root.val > node.val) {
            if (root.left != null) {
                insert(root.left, node);
            } else {
                root.left = node;
            }
        }else if (root.val < node.val) {
            if (root.right != null) {
                insert(root.right, node);
            } else {
                root.right = node;
            }
        }
    }
}
