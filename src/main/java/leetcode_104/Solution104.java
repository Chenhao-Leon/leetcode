package leetcode_104;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/15
 * @Description: 二叉树的最大深度 时间100%（本次使用递归，还可以使用层序遍历）
 */
public class Solution104 {
    private int maxDepth = 0;
    public int maxDepth(TreeNode root) {
        LDR(root, 1);
        return maxDepth;
    }
    private void LDR(TreeNode node, int depth){
        if(node == null)
            return;
        LDR(node.left, depth + 1);
        if(depth > maxDepth)
            maxDepth = depth;
        LDR(node.right, depth + 1);
    }
}
