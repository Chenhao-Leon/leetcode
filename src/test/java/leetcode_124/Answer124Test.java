package leetcode_124;

import org.junit.Test;

import static org.junit.Assert.*;

public class Answer124Test {

    @Test
    public void maxPathSum() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(-2);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        assertEquals(43, new Answer124().maxPathSum(root));
    }
}