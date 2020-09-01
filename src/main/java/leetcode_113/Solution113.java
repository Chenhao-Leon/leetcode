package leetcode_113;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenhao96
 * @description
 * @date 2020/7/30
 */
public class Solution113 {
    private List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        findPath(root, sum, 0, new ArrayList<>());
        return result;
    }

    private void findPath(TreeNode node, int sum, int currentSum, List<Integer> pathList) {
        if(node == null) return;
        currentSum += node.val;
        pathList.add(node.val);
        findPath(node.left, sum, currentSum, pathList);
        findPath(node.right, sum, currentSum, pathList);
        if(node.left == null && node.right == null && currentSum == sum) {
            result.add(new ArrayList<>(pathList));
        }
        pathList.remove(pathList.size() - 1);
    }
}
