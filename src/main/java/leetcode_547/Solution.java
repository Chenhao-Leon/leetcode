package leetcode_547;
import java.util.LinkedList;

/**
 * @Auther: Chen Hao
 * @Date: 2020/3/14
 * @Description: 朋友圈 时间27%
 */
public class Solution {
    private int len;
    private boolean[] visited;
    public int findCircleNum(int[][] M) {
        len = M.length;
        visited = new boolean[len];
        int count = 0;
        for(int i = 0; i < len; i++){
            if(!visited[i]){
                BFS(M, i);
                count++;
            }
        }
        return count;
    }
    private void BFS(int[][] M, int start){
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(start);
        while(!queue.isEmpty()){
            int stu = queue.poll();
            visited[stu] = true;
            for(int i = 0; i < len; i++){
                if(!visited[i] && M[stu][i] == 1)
                    queue.add(i);
            }
        }
    }
}
