package leetcode_103;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/14
 * @Description: 二叉树的锯齿形层次遍历（时间18%）
 */
public class Solution103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null)
            return new ArrayList<>();
        Stack<TreeNode> nowStack = new Stack<>();
        Stack<TreeNode> nextStack = new Stack<>();
        List<Integer> level = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        int direction = 0;
        TreeNode last = root, p;
        nowStack.push(root);
        while(!nowStack.isEmpty()){
            p = nowStack.pop();
            level.add(p.val);
            if(direction == 0) {
                if (p.left != null)
                    nextStack.push(p.left);
                if (p.right != null)
                    nextStack.push(p.right);
            }
            else{
                if (p.right != null)
                    nextStack.push(p.right);
                if (p.left!= null)
                    nextStack.push(p.left);
            }
            if(p == last){
                ans.add(level);
                level = new ArrayList<>();
                Stack<TreeNode> tmp = nowStack;
                nowStack = nextStack;
                nextStack = tmp;
                direction = (direction + 1) % 2;
                if(!nowStack.isEmpty())
                    last = nowStack.get(0);
            }
        }
        return ans;
    }
}
