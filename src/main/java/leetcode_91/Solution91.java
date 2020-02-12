package leetcode_91;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/12
 * @Description: 解码方法（回溯，超时）
 */
public class Solution91 {
    private int num = 0;
    public int numDecodings(String s) {
        backTrack(s, 0);
        return num;
    }
    private void backTrack(String str, int index){
        if(index == str.length()){
            num++;
            return;
        }
        int oneDigit = Integer.parseInt(str.substring(index, index + 1));
        if(oneDigit >= 1 && oneDigit <= 26)
            backTrack(str, index + 1);
        else
            return;
        if(index + 2 <= str.length()) {
            int twoDigit = Integer.parseInt(str.substring(index, index + 2));
            if (twoDigit >= 1 && twoDigit <= 26)
                backTrack(str, index + 2);
        }
    }
}
