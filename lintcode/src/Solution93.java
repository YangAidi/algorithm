/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-09 22:01
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

public class Solution93 {
    /**
     * @param root: The root of binary tree.
     * @return: True if this Binary tree is Balanced, or false.
     */
    public boolean isBalanced(TreeNode root) {
        // write your code here

        getDeep(root);
        return res;
    }

    private boolean res =true;

    public int getDeep(TreeNode root) {
        // write your code here
        if(!res){
            return 0;
        }

        if(root == null){
            return 0;
        }
        int l = getDeep(root.left);
        int r = getDeep(root.right);
        if(Math.abs(l-r)>1){
            res =false;
        }
        return Math.max(l,r)+1;
    }
}