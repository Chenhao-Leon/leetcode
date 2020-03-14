package leetcode_347;

import java.util.*;

/**
 * @Auther: Chen Hao
 * @Date: 2020/3/14
 * @Description: 前 K 个高频元素 时间5%
 */
public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int tmp : nums){
            int count = map.getOrDefault(tmp, 0);
            map.put(tmp, count + 1);
        }
        Integer[] integers = new Integer[nums.length];
        for(int i = 0; i < nums.length; i++)
            integers[i] = nums[i];
        Arrays.sort(integers, new Comparator<Integer>() {
            //返回整数把o1放后面，返回负数把o2放后面
            @Override
            public int compare(Integer o1, Integer o2) {
                if(!map.get(o2).equals(map.get(o1)))
                    return map.get(o2) - map.get(o1);
                else return o1 - o2;
            }
        });
        ArrayList<Integer> res = new ArrayList<>(k);
        int count = 0;
        for(int i = 0; count < k; i++){
            if(count > 0 && integers[i].equals(res.get(count - 1)))
                continue;
            res.add(integers[i]);
            count++;
        }
        return res;
    }
}
