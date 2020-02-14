package leetcode_101;

import java.util.LinkedList;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/14
 * @Description: 对称二叉树(迭代 45%）
 */
public class Solution101_2 {
    public boolean isSymmetric(TreeNode root) {
        LinkedList<TreeNode> leftToRight = new LinkedList<>();
        LinkedList<TreeNode> rightToLeft = new LinkedList<>();
        if(root != null) {
            leftToRight.add(root);
            rightToLeft.add(root);
        }
        TreeNode p1 = null;
        TreeNode p2 = null;
        while(!leftToRight.isEmpty() && !rightToLeft.isEmpty()){
            p1 = leftToRight.pollFirst();
            p2 = rightToLeft.pollFirst();
            if(p1.val != p2.val)
                return false;
            if((p1.left == null && p2.right != null) || (p1.left != null && p2.right == null))
                return false;
            if((p1.right == null && p2.left != null) || (p1.right != null && p2.left == null))
                return false;
            if(p1.left != null)
                leftToRight.add(p1.left);
            if(p1.right != null)
                leftToRight.add(p1.right);
            if(p2.right != null)
                rightToLeft.add(p2.right);
            if(p2.left != null)
                rightToLeft.add(p2.left);
        }
        return true;
    }
}
