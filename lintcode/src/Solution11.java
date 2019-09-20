
import java.util.ArrayList;
import java.util.List;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-08-26 14:26
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

public class Solution11 {
    /**
     * @param root: param root: The root of the binary search tree
     * @param k1:   An integer
     * @param k2:   An integer
     * @return: return: Return all keys that k1<=key<=k2 in ascending order
     */
    public List<Integer> searchRange(TreeNode root, int k1, int k2) {
        // write your code here

        this.k1 = k1;
        this.k2 = k2;
        search(root);
        return list;
    }

    List<Integer> list = new ArrayList<>();
    private int k1, k2;


    private void search(TreeNode root) {
        if (root == null) {
            return;
        }
        int value = root.val;
        if (value > k2) {
            search(root.left);
        }
        if (value < k1) {
            search(root.right);
        }
        if (value >= k1 && value <= k2) {
            list.add(value);
            search(root.left);
            search(root.right);
        }
    }
}
