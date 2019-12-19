package leetcode_32;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/19
 * @Description: 最长有效括号
 */
public class Solution {
    public int longestValidParentheses(String s) {
        int len = s.length();
        int ans = 0;
        for(int i = 0; i < len - 1; i++){
            if(s.charAt(i) == '('){
                int leftNum = 1;
                int max = 0;//记录最长有效括号
                int num = 0;//记录匹配括号数，比一定连续
                for(int j = i + 1; j < len; j++){
                    if(s.charAt(j) == ')'){
                        if(leftNum == 0){
                            i = j;
                            break;
                        }
                        num += 2;
                        leftNum--;
                        //只有当左括号被完全匹配才更新max
                        if(leftNum == 0) {
                            max = Math.max(max, num);
                        }
                    }
                    else leftNum++;
                }
                ans = Math.max(ans, max);
            }
        }
        return ans;
    }
}
