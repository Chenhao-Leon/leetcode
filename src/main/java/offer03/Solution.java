package offer03;

public class Solution {
    public int findRepeatNumber(int[] nums) {
        int[] isExist = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(isExist[nums[i]] == 1)
                return nums[i];
            else
                isExist[nums[i]] = 1;
        }
        return -1;
    }
}
