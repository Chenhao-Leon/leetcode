package leetcode_112;

/**
 * @Auther: Chen Hao
 * @Date: 2020/3/10
 * @Description: 路径总和 时间100%
 */
public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        return DFS(root, sum);
    }
    private boolean DFS(TreeNode node, int sum){
        if(node == null) return false;
        if(node.right == null && node.left == null && node.val == sum)
            return true;
        if(DFS(node.left, sum - node.val))
            return true;
        if(DFS(node.right, sum - node.val))
            return true;
        return false;
    }
}
