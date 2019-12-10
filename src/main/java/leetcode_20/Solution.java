package leetcode_20;

import java.util.Stack;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/10
 * @Description: 有效的括号
 */
public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '[' || c == '{')
                stack.push(c);
            else{
                if(c == ')'){
                    // 调用peek、pop方法要先判断栈是否空，下同
                    if(!stack.isEmpty() && stack.peek() == '(')
                        stack.pop();
                    else
                        return false;
                }
                else if(c == ']'){
                    if(!stack.isEmpty() && stack.peek() == '[')
                        stack.pop();
                    else
                        return false;
                }
                else{
                    if(!stack.isEmpty() && stack.peek() == '{')
                        stack.pop();
                    else
                        return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
