package leetcode_94;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/13
 * @Description: 二叉树的中序遍历（迭代）
 */
public class Solution94_2 {
    public List<Integer> inorderTraversal(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> ans = new ArrayList<>();
        TreeNode p = root;
        while(p != null || !stack.isEmpty()){
            if(p != null) {
                stack.push(p);
                p = p.left;
            }
            else{
                p = stack.pop();
                ans.add(p.val);
                p = p.right;
            }
        }
        return ans;
    }
}
