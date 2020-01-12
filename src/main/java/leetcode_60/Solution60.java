package leetcode_60;

import java.util.LinkedList;

/**
 * @Auther: Chen Hao
 * @Date: 2020/1/10
 * @Description: 第k个排列 defeat 80%
 */
public class Solution60 {
    private LinkedList<Integer> notChosen = new LinkedList<>();
    private int num = 1;
    public String getPermutation(int n, int k){
        for(int i = 1; i <= n; i++){
            num *= i;
            notChosen.add(i);
        }
        StringBuilder ans = new StringBuilder();
        for(int i = n; i > 0; i--){
            num /= i;
            int shang = k / num;
            int yushu = k % num;
            int index = yushu == 0? shang: shang + 1;
            ans.append(notChosen.get(index - 1));
            notChosen.remove(index - 1);
            if(yushu == 0)
                k -= (shang - 1) * num;
            else
                k -= shang * num;
        }
        return ans.toString();
    }
}
