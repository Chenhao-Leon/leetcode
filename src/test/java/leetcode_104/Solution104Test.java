package leetcode_104;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class Solution104Test {

    @Test
    public void maxDepth() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        assertEquals(3, new Solution104().maxDepth(root));
    }
}