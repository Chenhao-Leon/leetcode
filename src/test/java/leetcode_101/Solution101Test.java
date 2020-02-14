package leetcode_101;

import leetcode_44.Solution;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution101Test {

    @Test
    public void isSymmetric() {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(2);
        root1.left.left = new TreeNode(3);
        root1.left.right = new TreeNode(4);
        root1.right.left = new TreeNode(4);
        root1.right.right = new TreeNode(3);
        assertTrue(new Solution101().isSymmetric(root1));
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(2);
        root2.left.right = new TreeNode(3);
        root2.right.right = new TreeNode(3);
        assertFalse(new Solution101().isSymmetric(root2));
        TreeNode root3 = new TreeNode(1);
        root3.left = new TreeNode(2);
        root3.right = new TreeNode(2);
        root3.left.left = new TreeNode(2);
        root3.right.left = new TreeNode(2);
        assertFalse(new Solution101().isSymmetric(root3));
    }
}