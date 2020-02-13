package leetcode_98;

import java.util.Stack;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/13
 * @Description: 验证二叉搜索树（中序遍历的结果是一个递增序列）
 */
public class Answer98_2 {
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack();
        double inorder = - Double.MAX_VALUE;

        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (root.val <= inorder) return false;
            inorder = root.val;
            root = root.right;
        }
        return true;
    }
}
