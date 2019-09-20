/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-14 01:46
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
public class Solution632 {
    /*
     * @param root: the root of tree
     * @return: the max node
     */
    public TreeNode maxNode(TreeNode root) {
        // write your code here
        if(root == null){
            return null;
        }
        if(root.left== null&&root.right==null){
            return root;
        }
        TreeNode res = root;
        if(root.left!=null){
            TreeNode left = maxNode(root.left);
            if(left.val>root.val){
                res = left;
            }
        }

        if(root.right!=null){
            TreeNode right = maxNode(root.right);
            if(right.val>res.val){
                res = right;
            }
        }
        return res;
    }
}
