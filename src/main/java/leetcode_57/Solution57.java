package leetcode_57;

import java.util.LinkedList;
import java.util.List;

/**
 * @Auther: Chen Hao
 * @Date: 2020/1/8
 * @Description: 插入区间 defeat 80%
 */
public class Solution57 {
    private LinkedList<int[]> ans = new LinkedList<>();

    public int[][] insert(int[][] intervals, int[] newInterval) {
        if(intervals.length == 0) return new int[][]{newInterval};
        boolean hasInserted = false;
        for(int i = 0; i < intervals.length; i++){
            if(ans.size() == 0){
                if(newInterval[0] > intervals[0][0])
                    ans.add(intervals[0]);
                else{
                    ans.add(newInterval);
                    merge(intervals[0]);
                    hasInserted = true;
                }
            } else {
                if(hasInserted){
                    merge(intervals[i]);
                } else {
                    if(newInterval[0] < intervals[i][0]){
                        merge(newInterval);
                        merge(intervals[i]);
                        hasInserted = true;
                    } else {
                        ans.add(intervals[i]);
                    }
                }
            }
        }
        if(!hasInserted) merge(newInterval);
        //List转数组，将转换后数组赋给形参并返回这个引用
        return ans.toArray(new int[ans.size()][2]);
    }

    private void merge(int[] interval){
        if(ans.getLast()[1] >= interval[0])
            ans.getLast()[1] = Math.max(ans.getLast()[1], interval[1]);
        else
            ans.add(interval);
    }
}
