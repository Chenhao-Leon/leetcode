package leetcode_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/9
 * @Description: 三数之和(双指针)
 */
public class SolutionAnswer {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> re = new ArrayList<>();
        // 数组排序
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(i != 0 && nums[i] == nums[i - 1])
                continue;
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k){
                if(nums[i] > 0) break;
                int sum = nums[i] + nums[j] + nums[k];
                if(sum > 0) k--;
                else if(sum < 0) j++;
                else{
                    // 一行代码创建ArrayList
                    re.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while(j < k && nums[j] == nums[j + 1]) j++;
                    while(j < k && nums[k] == nums[k - 1]) k--;
                    j++;
                    k--;
                }
            }
        }
        return re;
    }
}
