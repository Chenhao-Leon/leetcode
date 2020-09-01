package leetcode_958;

import leetcode_101.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author chenhao96
 * @description 判断是否是完全二叉树，时间超过95%
 * @date 2020/8/20
 */
public class Solution {
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        boolean isLast = false;
        queue.add(root);
        TreeNode node = null;
        while (!queue.isEmpty()) {
            node = queue.poll();
            if (node.left != null) {
                queue.add(node.left);
                if (isLast) return false;
            } else {
                isLast = true;
            }
            if (node.right != null) {
                queue.add(node.right);
                if (isLast) return false;
            } else {
                isLast = true;
            }
        }
        return true;
    }
}
