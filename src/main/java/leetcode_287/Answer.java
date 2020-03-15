package leetcode_287;

/**
 * @Auther: Chen Hao
 * @Date: 2020/3/15
 * @Description: 寻找重复数 二分查找
 */
public class Answer {
    public int findDuplicate(int[] nums) {
        int len = nums.length;
        int left = 1;
        int right = len - 1;
        while (left < right) {
            int mid = (left + right) >>> 1;

            int cnt = 0;
            for (int num : nums) {
                if (num <= mid) {
                    cnt += 1;
                }
            }
            if (cnt > mid) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
