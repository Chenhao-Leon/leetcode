package leetcode_79;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/11
 * @Description: 单词搜索
 */
public class Solution79 {
    private int row;
    private int column;
    private char[][] board;
    public boolean exist(char[][] board, String word) {
        row = board.length;
        column = board[0].length;
        this.board = board;
        boolean[][] path = new boolean[row][column];
        for(int[] start : findStarts(word.charAt(0))){
            path[start[0]][start[1]] = true;
            if(existWord(start, word, 1, path))
                return true;
            path[start[0]][start[1]] = false;
        }
        return false;
    }

    private boolean existWord(int[] now, String word, int index, boolean[][] path){
        if(index == word.length())
            return true;
        List<int[]> nextPos = findNext(now, word.charAt(index), path);
        for(int[] next : nextPos){
            path[now[0]][now[1]] = true;
            if(existWord(next, word, index + 1, path))
                return true;
            path[now[0]][now[1]] = false;
        }
        return false;
    }

    private List<int[]> findStarts(char c){
        List<int[]> starts = new ArrayList<>();
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                if(board[i][j] == c)
                    starts.add(new int[]{i, j});
            }
        }
        return starts;
    }

    private List<int[]> findNext(int[] now, char c, boolean[][] path){
        int[] x = {1, -1, 0, 0};
        int[] y = {0, 0, 1, -1};
        List<int[]> nexts = new ArrayList<>();
        for(int i = 0; i < 4; i++){
            int X = x[i] + now[0];
            int Y = y[i] + now[1];
            if(X >= 0 && X < row && Y >= 0 && Y < column && board[X][Y] == c && !path[X][Y])
                nexts.add(new int[]{X, Y});
        }
        return nexts;
    }
}
