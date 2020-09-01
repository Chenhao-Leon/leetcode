package offer61;

import java.util.Arrays;

/**
 * @author chenhao96
 * @description
 * @date 2020/8/14
 */
public class Solution {
    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        Integer lastNum = null;
        int sum = 0;
        int zeroNum = 0;
        for(int i = 0; i < 5; i ++) {
            if(i != 0 && nums[i - 1] != 0) lastNum = nums[i - 1];
            if(nums[i] == 0) zeroNum++;
            else if(lastNum != null && lastNum == nums[i]) return false;
            else if(lastNum != null && lastNum < nums[i] - 1) {
                sum += nums[i] - 1 - lastNum;
            }
        }
        if(zeroNum >= sum) return true;
        else return false;
    }
}
