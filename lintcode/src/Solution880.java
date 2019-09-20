import leetcode.TreeNode;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-08-22 14:41
 **/
public class Solution880 {
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

    /**
     * @param s: a string
     * @return: a root of this tree
     */
    private int idx = 0;

    public TreeNode str2tree(String s) {
        // write your code here
        int len = s.length();
        if (len == 0 || idx >= len) {
            return null;
        }
        int sig = 1, k = 0;
        if (s.charAt(idx) == '-') {
            sig = -1;
            ++idx;
        }
        while (idx < len && s.charAt(idx) >= '0' && s.charAt(idx) <= '9') {
            k = k * 10 + s.charAt(idx) - '0';
            ++idx;
        }
        TreeNode root = new TreeNode(sig * k);
        if (idx >= len || s.charAt(idx) == ')') {
            ++idx;
            return root;
        }
        ++idx;
        root.left = str2tree(s);
        if (idx >= len || s.charAt(idx) == ')') {
            ++idx;
            return root;
        }
        ++idx;
        root.right = str2tree(s);
        if (idx >= len || s.charAt(idx) == ')') {
            ++idx;
            return root;
        }
        return root;
    }
    /*
    public TreeNode str2tree(String s) {
        // write your code here
        if (s == null || s.isEmpty()) {
            return null;
        }
        chars = s.toCharArray();


        TreeNode treeNode = buildTree();
        return treeNode;
    }

    int i = 0;
    char[] chars;

    public TreeNode buildTree() {
        if (i < chars.length) {
            char current = chars[i];
            if (current == '(') {
                ++i;
                return buildTree();
            } else if (current == ')') {
                ++i;
                return null;
            } else if (current == '-') {
                ++i;
                int value = -getIntValue();

                return getTreeNode(value);
            } else {
                int value = getIntValue();
                return getTreeNode(value);
            }
        }
        return null;
    }

    private int getIntValue() {
        int k = i;
        int[] a = new int[32];
        int j = 0;
        while (k < chars.length && chars[k] - '0' >= 0 && chars[k] - '0' <= 9) {
            a[j++] = chars[k++] - '0';
            ++i;
        }
        int base = 1;
        int value = 0;
        for (int jj = j - 1; jj >= 0; --jj) {
            value += base * a[jj];
            base *= 10;
        }
        return value;
    }

    private TreeNode getTreeNode(int value) {
        TreeNode left = buildTree();
        TreeNode right;
        if (left == null) {
            right = null;
        } else {
            ++i;
            right = buildTree();
        }
        TreeNode treeNode = new TreeNode(value);
        treeNode.right = right;
        treeNode.left = left;
        return treeNode;
    }
    */
}
