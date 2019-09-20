/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-09 14:12
 **/
/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */

public class Solution175 {
    /**
     * @param root: a TreeNode, the root of the binary tree
     * @return: nothing
     */
    public void invertBinaryTree(TreeNode root) {
        // write your code here
        if(root ==null){
            return;
        }
        invertBinaryTree(root.left);
        invertBinaryTree(root.right);
        TreeNode t = root.left;
        root.left=root.right;
        root.right=t;
    }
}
