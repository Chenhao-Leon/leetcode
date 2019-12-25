package leetcode_41;

import java.util.HashMap;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/25
 * @Description: 缺失的第一个正数
 * 关键：1、首先我们可以不考虑负数和零，因为不需要考虑。同样可以不考虑大于 n 的数字，
 * 因为首次缺失的正数一定小于或等于 n + 1 。所以将这些元素用1替换，则1<=num[i]<=n
 * 2、用num的0~n-1元素的正负来表示数字n是否存在：正数不存在，负数存在。
 */
public class Answer {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // 数组中是否有1
        int contains = 0;
        for (int i = 0; i < n; i++)
            if (nums[i] == 1) {
                contains++;
                break;
            }

        if (contains == 0)
            return 1;
        if (n == 1)
            return 2;

        // 用 1 替换负数，0和大于 n 的数
        for (int i = 0; i < n; i++)
            if ((nums[i] <= 0) || (nums[i] > n))
                nums[i] = 1;

        // 用num的0~n-1元素的正负来表示数字n是否存在
        for (int i = 0; i < n; i++) {
            int a = Math.abs(nums[i]);
            if (a == n)
                nums[0] = - Math.abs(nums[0]);
            else
                nums[a] = - Math.abs(nums[a]);
        }

        // 第一个正数的下标，就是第一个缺失的数
        for (int i = 1; i < n; i++) {
            if (nums[i] > 0)
                return i;
        }

        if (nums[0] > 0)
            return n;

        return n + 1;
    }
}
