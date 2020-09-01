package leetcode_113;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author chenhao96
 * @description
 * @date 2020/7/30
 */
public class Solution113Test {

    @Test
    public void pathSum() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        System.out.println(new Solution113().pathSum(root, 20));
    }
}