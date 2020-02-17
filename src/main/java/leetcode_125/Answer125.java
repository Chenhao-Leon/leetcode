package leetcode_125;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/17
 * @Description: 验证回文串
 */
public class Answer125 {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()) return true;
        char[] c1 = s.toLowerCase().toCharArray();
        int i = 0;
        int j = c1.length-1;
        while(i<j){
            if((c1[i]<'a'||c1[i]>'z')&&(c1[i]<'0'||c1[i]>'9')){
                i++;continue;
            }
            if((c1[j]<'a'||c1[j]>'z')&&(c1[j]<'0'||c1[j]>'9')){
                j--;continue;
            }
            if(c1[i]==c1[j]) {
                //System.out.println(c1[i]+"   "+c1[j]);
                i++;j--;
            }else {
                return false;
            }
        }
        return true;
    }
}
