package leetcode_69;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/7
 * @Description: x 的平方根
 */
public class Solution69 {
    public int mySqrt(int x) {
        //1）left、right、mid需要设成long，因为计算mid时left+right可能越界
        long left = 0;
        long right = x;
        long mid;
        while(left < right){
            //3）如果mid*mid<=x，则left=mid。如果mid为左中值则会出现死循环，因此这里必须设为右中值
            mid = (left + right + 1) / 2;
            if(mid * mid > x)
                //2）这种情况下可以排除mid，故right为mid左边的值
                right = mid - 1;
            else
                left = mid;
        }
        return (int)left;
    }
}
