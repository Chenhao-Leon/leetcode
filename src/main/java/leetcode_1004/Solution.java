package leetcode_1004;

/**
 * @Auther: Chen Hao
 * @Date: 2020/9/5
 * @Description: 45%
 */
public class Solution {
    public int longestOnes(int[] A, int K) {
        if (A.length == 0) return 0;
        int left = 0;
        int right = 0;
        int nowChange = 0;
        int maxLen = 0;
        while (right < A.length) {
            if (A[right] == 0) {
                if (nowChange < K) {
                    nowChange++;
                } else {
                    maxLen = Math.max(maxLen, right - left);
                    while (A[left] == 1) {
                        left++;
                    }
                    left++;
                }
            }
            right++;
            maxLen = Math.max(maxLen, right - left);
        }
        return maxLen;
    }
}
