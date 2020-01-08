package leetcode_58;

/**
 * @Auther: Chen Hao
 * @Date: 2020/1/8
 * @Description: 最后一个单词的长度 defeat 21%
 */
public class Solution58 {
    public int lengthOfLastWord(String s){
        if(s.length() == 0) return 0;
        String[] strArray = s.split(" ");
        if(strArray.length != 0)
            return strArray[strArray.length - 1].length();
        else return 0;
    }
}
