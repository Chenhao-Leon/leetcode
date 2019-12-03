package leetcode_5;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/3
 * @Description: 最长回文子串(动态规划解法)
 */
// 时间：log(n2)  空间：log(n2)
public class SolutionAnswer1 {
    public String longestPalindrome(String s){
        if(s == null || s.length() == 0)
            return "";
        int len = s.length();
        String sub = "";
        boolean[][] arr = new boolean[len][len];
        //得到arr数组技巧：从最后一行开始，每行顺序遍历，这样对于arr[i][j]就可以得到arr[i+1][j-1]
        for(int i = len - 1; i >= 0; i--)
            for(int j = i; j < len; j++){
                arr[i][j] = s.charAt(i) == s.charAt(j) && (j - i < 2 || arr[i + 1][j - 1]);
                if(j - i + 1 > sub.length() && arr[i][j])
                    sub = s.substring(i, j + 1);
            }
        return sub;
    }
}
