package leetcode_210;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Auther: Chen Hao
 * @Date: 2020/3/5
 * @Description: 课程表 II
 */
public class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] res = new int[numCourses];
        int index = 0;
        int[] inDegree = new int[numCourses];
        for (int[] prerequisite : prerequisites) {
            inDegree[prerequisite[0]]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) queue.add(i);
        }
        while(!queue.isEmpty()){
            int cur = queue.poll();
            res[index++] = cur;
            numCourses--;
            for (int[] prerequisite : prerequisites) {
                if (prerequisite[1] == cur) {
                    if (--inDegree[prerequisite[0]] == 0)
                        queue.add(prerequisite[0]);
                }
            }
        }
        return numCourses == 0? res: new int[]{};
    }
}
