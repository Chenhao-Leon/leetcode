package leetcode_114;

/**
 * @Auther: Chen Hao
 * @Date: 2020/3/13
 * @Description: 二叉树展开为列表
 * 虽然时间100%，但不满足原地算法
 */
public class Solution {
    TreeNode cur = new TreeNode(0);
    public void flatten(TreeNode root) {
        DFS(root);
    }
    private void DFS(TreeNode node){
        if(node == null)
            return;
        TreeNode left = node.left;
        TreeNode right = node.right;
        node.left = null;
        node.right = null;
        cur.right = node;
        cur = cur.right;
        DFS(left);
        DFS(right);
    }
}
