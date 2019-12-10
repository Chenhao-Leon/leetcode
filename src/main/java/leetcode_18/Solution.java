package leetcode_18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/10
 * @Description: 四数之和
 */
public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> r = new ArrayList<>();
        for(int i = 0; i < nums.length - 3; i++){
            if(i != 0 && nums[i] == nums[i -1]) continue;
            for(int j = i + 1; j < nums.length - 2; j++){
                if(j - 1!= i && nums[j] == nums[j - 1]) continue;
                int L = j + 1;
                int R = nums.length - 1;
                while(L < R){
                    int sum = nums[i] + nums[j] + nums[L] + nums[R];
                    if(sum < target) L++;
                    else if(sum > target) R--;
                    else {
                        r.add(Arrays.asList(nums[i], nums[j], nums[L], nums[R]));
                        while(L + 1 < nums.length && nums[L] == nums[L + 1])
                            L++;
                        while(R + 1 < nums.length && nums[R] == nums[R - 1])
                            R--;
                        L++;
                        R--;
                    }
                }
            }
        }
        return r;
    }
}
