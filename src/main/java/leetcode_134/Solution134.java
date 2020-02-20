package leetcode_134;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/20
 * @Description: 加油站 时间5%
 */
public class Solution134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        for(int i = 0; i < gas.length; i++){
            if(gas[i] < cost[i]) continue;
            if(circle(gas, cost, i) >= 0)
                return i;
        }
        return -1;
    }
    private int circle(int[] gas, int[] cost, int start){
        int len = gas.length;
        int gasSum = gas[start] - cost[start];
        int now = (start + 1) % len;
        while(now != start){
            gasSum = gasSum + gas[now] - cost[now];
            if(gasSum < 0)
                return -1;
            now = (now + 1) % len;
        }
        return start;
    }
}
