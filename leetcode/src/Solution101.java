/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-20 17:39
 **/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution101 {
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return isSymmetric(root.left,root.right);
    }

    public boolean isSymmetric(TreeNode l,TreeNode r) {
        if(l==null&&r==null){
            return true;
        }
        if(l==null||r==null){
            return false;
        }
        if(l.val==r.val){
            return isSymmetric(l.left,r.right)&&isSymmetric(l.right,r.left);
        }
        return false;
    }
}
