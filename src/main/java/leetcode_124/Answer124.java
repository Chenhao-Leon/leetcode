package leetcode_124;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/18
 * @Description: 二叉树中的最大路径和 时间35%
 * 题意：一笔画且不能重复的最大路径
 */
public class Answer124 {
    private int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxGain(root);
        return max;
    }
    private int maxGain(TreeNode node){
        if(node == null)
            return 0;
        int left = maxGain(node.left);
        int right = maxGain(node.right);
        int leftAndRight = node.val + Math.max(0, left) + Math.max(0, right);
        int leftOrRight = node.val + Math.max(0, Math.max(left, right));
        max = Math.max(max, Math.max(leftAndRight, leftOrRight));
        return leftOrRight;
    }
}
