package leetcode_179;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/28
 * @Description: 最大数
 */
class Answer {
    public String largestNumber(int[] nums) {
        String[] asStrs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            asStrs[i] = String.valueOf(nums[i]);
        }

        //Comparator的算法太秒了
        Arrays.sort(asStrs, new Comparator<String>(){
            @Override
            public int compare(String a, String b) {
                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1);
            }
        });

        // If, after being sorted, the largest number is `0`, the entire number is zero.
        if (asStrs[0].equals("0")) {
            return "0";
        }

        // Build largest number from sorted array.
        String largestNumberStr = "";
        for (String numAsStr : asStrs) {
            largestNumberStr += numAsStr;
        }

        return largestNumberStr;
    }
}