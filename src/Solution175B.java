import java.util.Stack;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-09 14:14
 **/
public class Solution175B {
    public void invertBinaryTreee(TreeNode root) {
        // write your code here
        if(root ==null){
            return;
        }
        invertBinaryTreee(root.left);
        invertBinaryTreee(root.right);
        TreeNode t = root.left;
        root.left=root.right;
        root.right=t;
    }
    public void invertBinaryTree(TreeNode root) {
        // write your code here
        if(root ==null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode t = stack.pop();
            TreeNode tt = t.left;
            t.left=t.right;
            t.right=tt;
            if(t.left!=null){
                stack.push(t.left);
            }
            if(t.right!=null){
                stack.push(t.right);
            }
        }

    }
}
