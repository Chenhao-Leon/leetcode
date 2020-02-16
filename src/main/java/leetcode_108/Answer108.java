package leetcode_108;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/16
 * @Description: 将有序数组转换为二叉搜索树
 * 当数组个数为偶数时，选择中间数字就有偏左和偏右两种选择，因此有两种答案
 * 以下是选择中间偏左的解法
 */
class Answer108 {
    int[] nums;

    public TreeNode helper(int left, int right) {
        if (left > right) return null;
        int p = (left + right) / 2;
        TreeNode root = new TreeNode(nums[p]);
        root.left = helper(left, p - 1);
        root.right = helper(p + 1, right);
        return root;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        this.nums = nums;
        return helper(0, nums.length - 1);
    }
}
