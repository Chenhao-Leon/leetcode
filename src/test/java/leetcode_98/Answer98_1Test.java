package leetcode_98;

import org.junit.Test;

import static org.junit.Assert.*;

public class Answer98_1Test {

    @Test
    public void isValidBST() {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(20);
        assertFalse(new Answer98_1().isValidBST(root));
    }
}