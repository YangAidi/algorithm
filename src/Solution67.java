import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-13 14:51
 **/
public class Solution67 {
    /**
     * @param root: The root of binary tree.
     * @return: Inorder in ArrayList which contains node values.
     */
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        ArrayList<Integer> result = new ArrayList<>();

        while (root != null) {
            stack.push(root);
            root = root.left;
        }

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            result.add(node.val);

            TreeNode right = root.right;

            while (right != null) {
                stack.push(right);
                right = right.left;
            }
        }
        return result;
    }
}