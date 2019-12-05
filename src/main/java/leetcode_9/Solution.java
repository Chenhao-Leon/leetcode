package leetcode_9;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/5
 * @Description: 回文数
 */
public class Solution {
    public boolean isPalindrome(int x){
        char[] num = new char[11];
        int p = 0;
        if(x < 0)
            return false;
        if(x == 0)
            return true;
        while(x != 0){
            //int转为char需要强制类型转换
            num[p++] = (char) ((x % 10) + '0');
            x /= 10;
        }
        for(int i = 0;i < p; i++)
            if(num[i] != num[p - i - 1])
                return false;
        return true;
    }
}
