package leetcode_190;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/29
 * @Description:
 */
public class Answer {
    public int reverseBits(int n) {
        int count=0,res=0;
        while(count < 32){
            res <<= 1;
            res |= (n&1);
            n >>= 1;
            count++;
        }
        return res;
    }
}
