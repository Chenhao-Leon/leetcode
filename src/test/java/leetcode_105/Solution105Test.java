package leetcode_105;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution105Test {

    @Test
    public void buildTree() {
        TreeNode root = new Solution105().buildTree(new int[]{}, new int[]{});
        System.out.println(root.val);
    }
}