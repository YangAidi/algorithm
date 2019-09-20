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

public class Solution97 {
    /**
     * @param root: The root of binary tree.
     * @return: An integer
     */
    public int maxDepth(TreeNode root) {
        // write your code here
        if(root ==null){
            return 0;
        }
        return Math.max(maxDepth(root.right),maxDepth(root.left))+1;
    }
}
