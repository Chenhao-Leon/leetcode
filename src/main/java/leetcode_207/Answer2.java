package leetcode_207;

/**
 * @Auther: Chen Hao
 * @Date: 2020/3/3
 * @Description: 课程表
 * 算法：通过邻接表进行DFS，设置标志数组，0为未访问，1，为本轮DFS访问，-1为前几轮DFS访问过，
 * 当本轮DFS访问到1的节点，说明存在环
 */
class Answer2 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[][] adjacency = new int[numCourses][numCourses];
        int[] flags = new int[numCourses];
        for(int[] cp : prerequisites)
            adjacency[cp[1]][cp[0]] = 1;
        for(int i = 0; i < numCourses; i++){
            if(!dfs(adjacency, flags, i)) return false;
        }
        return true;
    }
    private boolean dfs(int[][] adjacency, int[] flags, int i) {
        if(flags[i] == 1) return false;
        if(flags[i] == -1) return true;
        flags[i] = 1;
        for(int j = 0; j < adjacency.length; j++) {
            if(adjacency[i][j] == 1 && !dfs(adjacency, flags, j)) return false;
        }
        flags[i] = -1;
        return true;
    }
}
