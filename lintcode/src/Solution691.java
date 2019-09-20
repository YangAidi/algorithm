/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-02-25 10:34
 *
 * 首先一个槽点就是，java对树的操作真是太繁琐了，还需要考虑传参传值的问题，总是害怕一个变量传进去然后什么都没有发生改变
 * 这个问题我最开始的想法也大体正确，就是交换过后的数字肯定是比后面的大的，然后找到两个这样的数字，让他俩进行交换就可以
 * 了，但是有一种情况，就是相邻的两个数字进行交换，这样就只有一个逆序的了。我刚开始的解决办法是如果只找到了一个点，那就
 * 再遍历一遍，去寻找这个错误点的后继（虽然知道两个是相邻的，但是在树的存储结构中没法直接找到这个点）。后来看了一个答案，
 * 就是先默认第一个点后面的点就是错误的，然后再去看后面还有没有错误的点了。
 * 一个需要注意的是，如果没有发生交换，可能会出现空指针异常，所以要进行相应处理。
 **/

import leetcode.TreeNode;

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

public class Solution691 {
    /**
     * @param root: the given tree
     * @return: the tree after swapping
     */

    private TreeNode pre;
    private TreeNode node1;
    private TreeNode node2;
    private Boolean isSwap;

    public TreeNode bstSwappedNode(TreeNode root) {
        findWrongNode(root);
        if (isSwap != null) {
            int p = node2.val;
            node2.val = node1.val;
            node1.val = p;
        }
        return root;
    }

    private void findWrongNode(TreeNode root) {
        if (root == null) return;
        findWrongNode(root.left);
        if (node1 == null && pre != null && pre.val > root.val) {
            node1 = pre;
        }
        if (node1 != null && pre != null && pre.val > root.val) {
            node2 = root;
            isSwap = true;
        }
        pre = root;
        findWrongNode(root.right);
    }
}
