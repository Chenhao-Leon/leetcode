package leetcode_22;

import java.util.LinkedList;
import java.util.List;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/11
 * @Description: 括号生成
 */
public class Solution {
    public List<String> generateParenthesis(int n){
        LinkedList<String> r = new LinkedList<>();
        r.add("(");
        for(int i = 0; i < 2 * n - 1; i++){
            while(r.getFirst().length() == i + 1){
                String temp = r.remove();
                int num1 = 0;// 还能添加“）”的个数
                int num2 = n;// 还能添加"("的个数
                for(char c : temp.toCharArray()){
                    if(c == '(') {
                        num1++;
                        num2--;
                    }
                    else num1--;
                }
                if(num1 > 0) r.add(temp + ')');
                if(num2 > 0) r.add(temp + '(');
            }
        }
        return r;
    }
}
