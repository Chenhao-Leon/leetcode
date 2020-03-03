package leetcode_207;

import java.util.LinkedList;

/**
 * @Auther: Chen Hao
 * @Date: 2020/3/3
 * @Description: 课程表
 * 算法：拓步排序。找到入度为0的节点入队，然后把以此节点为出发点的边删除（即将终点的入度减1），
 * 然后从队列中出队一个元素，继续上述操作
 */
class Answer {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegrees = new int[numCourses];
        for(int[] cp : prerequisites) indegrees[cp[0]]++;
        LinkedList<Integer> queue = new LinkedList<>();
        for(int i = 0; i < numCourses; i++){
            if(indegrees[i] == 0) queue.addLast(i);
        }
        while(!queue.isEmpty()) {
            Integer pre = queue.removeFirst();
            numCourses--;
            for(int[] req : prerequisites) {
                if(req[1] != pre) continue;
                if(--indegrees[req[0]] == 0) queue.add(req[0]);
            }
        }
        return numCourses == 0;
    }
}
