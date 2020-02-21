package leetcode_136;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/21
 * @Description: 只出现一次的数字
 */
public class Solution136 {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int count = map.getOrDefault(nums[i], 0);
            if(count == 1)
                map.remove(nums[i]);
            else
                map.put(nums[i], 1);
        }
        for(int tmp : map.keySet())
            return tmp;
        return 0;
    }
}
