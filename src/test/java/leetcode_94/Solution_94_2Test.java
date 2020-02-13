package leetcode_94;

import org.junit.Test;

import java.util.List;

public class Solution_94_2Test {

    @Test
    public void inorderTraversal() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        List<Integer> ans = new Solution94_2().inorderTraversal(root);
        for(int a : ans)
            System.out.println(a);
    }
}