package leetcode_6;

import com.sun.deploy.security.SelectableSecurityManager;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/4
 * @Description: Z 字形变换
 */
// 先用char操作然后转为String（String.copyValueOf)时间可大幅降低
public class Solution {
    public String convert(String s, int numRows){
        String result = "";
        int len = s.length();
        int gap = 2 * numRows - 2 == 0? 1: 2 * numRows - 2;
        for(int i = 0; i < numRows; i++){
            if(i == 0 || i == numRows - 1)
                for(int j = i; j < len; j += gap)
                    result = result + s.charAt(j);
            else
                for(int j = i, k = 2 * numRows - i - 2; j < len || k< len; j += gap, k +=gap){
                    result = result + s.charAt(j);
                    if(k != j && k < len)
                        result = result + s.charAt(k);
                }
        }
        return result;
    }
}
