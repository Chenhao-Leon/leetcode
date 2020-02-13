package leetcode_98;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution98Test {

    @Test
    public void isValidBST() {
//        TreeNode root = new TreeNode(10);
//        root.left = new TreeNode(5);
//        root.right = new TreeNode(15);
//        root.right.left = new TreeNode(6);
//        root.right.right = new TreeNode(20);
//        assertFalse(new Solution98().isValidBST(root));
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(1);
        assertFalse(new Solution98().isValidBST(root1));
    }
}