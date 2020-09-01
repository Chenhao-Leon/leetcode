package leetcode_200;

import java.util.LinkedList;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/29
 * @Description: 岛屿数量 BFS 时间38%
 * 改进：
 * 1、访问过将grid设为'0'，即为visited，无需另外空间
 * 2、队列的类型可以用Integer，将i * column + j作为键值
 */
public class Solution {
    class Node{
        int i,j;
        Node(int i, int j){
            this.i = i;
            this.j = j;
        }
    }
    private int count = 0;
    private boolean[][] visited;
    private char[][] grid;
    public int numIslands(char[][] grid) {
        if(grid.length == 0) return 0;
        visited = new boolean[grid.length][grid[0].length];
        this.grid = grid;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(visited[i][j] || grid[i][j] == '0')
                    continue;
                BFS(new Node(i, j));
            }
        }
        return count;
    }
    private void BFS(Node node){
        LinkedList<Node> queue = new LinkedList<>();
        visited[node.i][node.j] = true;
        queue.add(node);
        int[] X = {0,0,1,-1};
        int[] Y = {1,-1,0,0};
        while(!queue.isEmpty()){
            Node tmp = queue.poll();
            for(int i = 0; i < 4; i++){
                int x = tmp.i + X[i];
                int y = tmp.j + Y[i];
                if(check(x, y)) {
                    visited[x][y] = true;
                    queue.add(new Node(x, y));
                }
            }
        }
        count++;
    }
    private boolean check(int x, int y){
        if(x < 0 || x >= grid.length || y < 0 || y >= grid[0].length)
            return false;
        if(visited[x][y] || grid[x][y] == '0')
            return false;
        return true;
    }
}
