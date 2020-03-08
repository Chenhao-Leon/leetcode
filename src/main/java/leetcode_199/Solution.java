package leetcode_199;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Auther: Chen Hao
 * @Date: 2020/3/8
 * @Description:
 */
public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null) return new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        List<Integer> res = new ArrayList<>();
        queue.add(root);
        TreeNode last = root;
        while(!queue.isEmpty()){
            TreeNode p = queue.poll();
            if(p.left != null)
                queue.add(p.left);
            if(p.right != null)
                queue.add(p.right);
            if(p == last){
                res.add(p.val);
                last = queue.isEmpty()? null: queue.getLast();
            }
        }
        return res;
    }
}
