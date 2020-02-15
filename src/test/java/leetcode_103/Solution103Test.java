package leetcode_103;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class Solution103Test {

    @Test
    public void zigzagLevelOrder() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<List<Integer>> ans = new Solution103().zigzagLevelOrder(root);
        for (List<Integer> list : ans) {
            for (int tmp : list)
                System.out.print(tmp + " ");
            System.out.println();
        }
    }
}