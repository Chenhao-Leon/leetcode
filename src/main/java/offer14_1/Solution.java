package offer14_1;

public class Solution {
    public int cuttingRope(int n) {
        int res = 1;
        for(int m = 2; m <= n; m++){
            int downNum = n / m;
            int numOfBigger = n % m;
            int sum = (int)Math.pow(downNum, m - numOfBigger) * (int)Math.pow(downNum + 1, numOfBigger);
            if(sum >= res) res = sum;
            else break;
        }
        return res;
    }
}
