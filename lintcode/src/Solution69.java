/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-13 17:19
 **/

import java.util.*;

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

public class Solution69 {
    /**
     * @param root: A Tree
     * @return: Level order a list of lists of integer
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        // write your code here
        if (root == null) {
            return new ArrayList<>();
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<List<Integer>> res = new ArrayList<>();
        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; ++i) {
                TreeNode t = queue.poll();
                list.add(t.val);
                if (t.left != null) {
                    queue.add(t.left);
                }
                if (t.right != null) {
                    queue.add(t.right);
                }
            }
            res.add(list);
        }
        return res;
    }
}
