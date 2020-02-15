package leetcode_103;

import java.util.*;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/15
 * @Description: 二叉树的锯齿形层次遍历
 */
public class Answer103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null)
            return result;
        Queue<TreeNode> queue = new LinkedList<>();
        boolean isReverse = true;

        queue.add(root);
        while (!queue.isEmpty()) {
            LinkedList<Integer> linkedlist = new LinkedList<>();
            int queuecount = queue.size();
            for (int i = 0; i < queuecount; i++) {
                TreeNode node = queue.poll();
                if (isReverse) {
                    linkedlist.add(node.val);
                } else {
                    linkedlist.addFirst(node.val);
                }
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }
            isReverse = !isReverse;
            result.add(linkedlist);
        }
        return result;
    }
}
