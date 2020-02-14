package leetcode_102;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/14
 * @Description: 二叉树的层次遍历（时间98%）
 */
public class Solution102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null)
            return new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        List<Integer> level = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        TreeNode last = root, p;
        queue.add(root);
        while(!queue.isEmpty()){
            p = queue.pollFirst();
            level.add(p.val);
            if(p.left != null)
                queue.add(p.left);
            if(p.right != null)
                queue.add(p.right);
            if(p == last){
                ans.add(level);
                level = new ArrayList<>();
                if(!queue.isEmpty())
                    last = queue.getLast();
            }
        }
        return ans;
    }
}
