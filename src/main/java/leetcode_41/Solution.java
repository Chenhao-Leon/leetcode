package leetcode_41;

/**
 * @author chenhao96
 * @description
 * @date 2020/8/17
 */
public class Solution {
    public int firstMissingPositive(int[] nums) {
        boolean[] hasNum = new boolean[nums.length];
        for (int num : nums) {
            if (num <= nums.length && num > 0)
                hasNum[num - 1] = true;
        }
        for (int i = 0; i < hasNum.length; i++) {
            if (!hasNum[i])
                return i + 1;
        }
        return nums.length + 1;
    }
}
