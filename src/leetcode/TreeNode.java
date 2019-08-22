package leetcode;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2018-04-08 10:25
 **/
public class TreeNode {
    public int val;
    public TreeNode left = null;
    public TreeNode right = null;

    public TreeNode(int x, TreeNode left, TreeNode right) {
        val = x;
        this.left = left;
        this.right = right;
    }
    public TreeNode(int x) {
        val = x;
    }
}
