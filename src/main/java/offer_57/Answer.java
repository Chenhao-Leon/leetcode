package offer_57;

import java.util.ArrayList;

/**
 * @Auther: Chen Hao
 * @Date: 2020/3/6
 * @Description: 和为s的连续正数序列
 */
public class Answer {
    public int[][] findContinuousSequence(int target) {
        ArrayList<int[]> res = new ArrayList<>();
        int j = 1;
        int i = 1;
        int sum = 0;
        while(i < target && j < target){
            if(sum < target){
                sum += j;
                j++;
            } else if(sum > target){
                sum -= i;
                i++;
            } else {
                int[] array = new int[j - i];
                int tmp = i;
                int index = 0;
                while(tmp < j)
                    array[index++] = tmp++;
                res.add(array);
                sum -= i;
                i++;
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
