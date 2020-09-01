package leetcode_110;

import leetcode_101.TreeNode;

/**
 * @author chenhao96
 * @description 平衡二叉树
 * @date 2020/8/4
 */
public class Answer110 {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        //return Math.abs(depth(root.left) - depth(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);也可以
        return isBalanced(root.left) && isBalanced(root.right) && Math.abs(depth(root.left) - depth(root.right)) <= 1;
    }

    private int depth(TreeNode node) {
        if(node == null) return 0;
        return Math.max(depth(node.left), depth(node.right)) + 1;
    }
}
