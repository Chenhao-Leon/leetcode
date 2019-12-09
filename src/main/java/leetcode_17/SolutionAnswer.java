package leetcode_17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/9
 * @Description: 电话号码的字母组合
 */
public class SolutionAnswer {
    public List<String> letterCombinations(String digits) {
        // LinkedList本质是一个队列，remove出队，add入队
        LinkedList<String> ans = new LinkedList<>();
        if(digits.isEmpty()) return ans;
        String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ans.add("");
        for(int i =0; i<digits.length();i++){
            // Character.getNumericValue可以把整数字符转为整数
            int x = Character.getNumericValue(digits.charAt(i));
            // peek方法获得对头元素
            while(ans.peek().length()==i){
                String t = ans.remove();
                // toCharArray方法将String转成char数组
                for(char s : mapping[x].toCharArray())
                    ans.add(t+s);
            }
        }
        return ans;
    }
}
