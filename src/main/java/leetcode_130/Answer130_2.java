package leetcode_130;

import java.util.Stack;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/19
 * @Description: 被围绕的区域 DFS非递归
 */
public class Answer130_2 {
    public class Pos{
        int i;
        int j;
        Pos(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }
    public void solve(char[][] board) {
        if (board == null || board.length == 0) return;
        int m = board.length;
        int n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // 从边缘第一个是o的开始搜索
                boolean isEdge = i == 0 || j == 0 || i == m - 1 || j == n - 1;
                if (isEdge && board[i][j] == 'O') {
                    dfs(board, i, j);
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
                if (board[i][j] == '#') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    public void dfs(char[][] board, int i, int j) {
        Stack<Pos> stack = new Stack<>();
        stack.push(new Pos(i, j));
        while (!stack.isEmpty()) {
            // 取出当前stack 顶, 不弹出.
            Pos current = stack.pop();
            board[current.i][current.j] = '#';
            // 上
            if (current.i - 1 >= 0
                    && board[current.i - 1][current.j] == 'O') {
                stack.push(new Pos(current.i - 1, current.j));
            }
            // 下
            if (current.i + 1 <= board.length - 1
                    && board[current.i + 1][current.j] == 'O') {
                stack.push(new Pos(current.i + 1, current.j));
            }
            // 左
            if (current.j - 1 >= 0
                    && board[current.i][current.j - 1] == 'O') {
                stack.push(new Pos(current.i, current.j - 1));
            }
            // 右
            if (current.j + 1 <= board[0].length - 1
                    && board[current.i][current.j + 1] == 'O') {
                stack.push(new Pos(current.i, current.j + 1));
            }
        }
    }
}
