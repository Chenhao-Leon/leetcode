package leetcode_98;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/13
 * @Description: 验证二叉搜索树（递归）
 */
public class Answer98_1 {
    private boolean helper(TreeNode node, Integer lower, Integer upper) {
        if (node == null) return true;

        int val = node.val;
        if (! helper(node.left, lower, val))
            return false;

        if (lower != null && val <= lower)
            return false;
        if (upper != null && val >= upper)
            return false;

        if (! helper(node.right, val, upper))
            return false;
        return true;
    }

    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }
}
