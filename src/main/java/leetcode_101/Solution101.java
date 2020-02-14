package leetcode_101;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/13
 * @Description: 对称二叉树（递归 时间100%）
 */
public class Solution101 {
    public boolean isSymmetric(TreeNode root) {
        return LDRandRDL(root, root);
    }
    private boolean LDRandRDL(TreeNode node1, TreeNode node2){
        if(node1 == null && node2 == null)
            return true;
        else if(node1 == null || node2 == null)
            return false;
        if(!LDRandRDL(node1.left, node2.right))
            return false;
        if(node1.val != node2.val)
            return false;
        if(!LDRandRDL(node1.right, node2.left))
            return false;
        return true;
    }
}
