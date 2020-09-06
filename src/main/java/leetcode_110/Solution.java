package leetcode_110;

import leetcode_101.TreeNode;

/**
 * @Auther: Chen Hao
 * @Date: 2020/9/6
 * @Description:
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {
        return dfs(root).isBalanced;
    }
    private Result dfs(TreeNode node) {
        if (node == null) return new Result(0, true);
        Result left = dfs(node.left);
        Result right = dfs(node.right);
        return new Result(Math.max(left.depth, right.depth) + 1,
                Math.abs(left.depth - right.depth) <= 1 && left.isBalanced && right.isBalanced);
    }
}
class Result {
    int depth;
    boolean isBalanced;
    Result(int depth, boolean isBalanced) {
        this.depth = depth;
        this.isBalanced = isBalanced;
    }
}
