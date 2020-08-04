package leetcode_110;

import leetcode_101.TreeNode;
import org.junit.Test;

/**
 * @author chenhao96
 * @description
 * @date 2020/8/4
 */
public class Answer110Test {

    @Test
    public void isBalanced() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(new Answer110().isBalanced(root));
    }
}