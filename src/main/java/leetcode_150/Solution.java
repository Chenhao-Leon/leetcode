package leetcode_150;

import java.util.Stack;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/25
 * @Description: 逆波兰表达式求值 时间5%
 */
public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String str : tokens){
            try {
                stack.push(Integer.parseInt(str));
            } catch (NumberFormatException e) {
                int b = stack.pop();
                int a = stack.pop();
                switch (str){
                    case "+" : {
                        stack.push(a + b);
                        continue;
                    }
                    case "-" : {
                        stack.push(a - b);
                        continue;
                    }
                    case "*" : {
                        stack.push(a * b);
                        continue;
                    }
                    case "/" : {
                        stack.push(a / b);
                        continue;
                    }
                }
            }
        }
        return stack.pop();
    }
}
