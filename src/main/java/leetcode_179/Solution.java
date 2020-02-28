package leetcode_179;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/28
 * @Description: 最大数 通过用例217/222
 */
public class Solution {
    public String largestNumber(int[] nums) {
        Integer[] integers = new Integer[nums.length];
        for(int i = 0; i < nums.length; i++)
            integers[i] = nums[i];
        Arrays.sort(integers, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                char[] chars1 = Integer.toString(o1).toCharArray();
                int len1 = chars1.length;
                char[] chars2 = Integer.toString(o2).toCharArray();
                int len2 = chars2.length;
                for(int i = 0; i < Math.max(len1, len2); i++){
                    if(i < len1 && i < len2){
                        if(chars1[i] > chars2[i]) return -1;
                        else if(chars1[i] < chars2[i]) return 1;
                    }
                    else if(i < len1){
                        if(chars1[i] > chars1[0]) return -1;
                        else if(chars1[i] < chars1[0]) return 1;
                    }
                    else {
                        if(chars2[i] > chars2[0]) return 1;
                        else if(chars2[i] < chars2[0]) return -1;
                    }
                }
                return 0;
            }
        });
        StringBuilder res = new StringBuilder();
        for(Integer tmp : integers)
            res.append(Integer.toString(tmp));
        return res.toString();
    }
}

