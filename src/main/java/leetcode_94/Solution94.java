package leetcode_94;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/13
 * @Description: 二叉树的中序遍历（递归）
 */
public class Solution94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        LDR(root, ans);
        return ans;
    }

    private void LDR(TreeNode node, List<Integer> ans){
        if(node == null) return;
        LDR(node.left, ans);
        ans.add(node.val);
        LDR(node.right, ans);
    }
}
