package leetcode_37;

import javax.swing.*;
import java.util.HashMap;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/23
 * @Description: 解数独
 * 笔记：0-9int整数转char的语句是(char)(num + '0')，这样得到的是数字的ASCII码
 * 而直接强制类型转换得到的是Unicode编码的数字
 */
public class Solution {
    private HashMap<Character, Boolean>[] rows = new HashMap[9];
    private HashMap<Character, Boolean>[] columns = new HashMap[9];
    private HashMap<Character, Boolean>[] fangges = new HashMap[9];

    public void solveSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashMap<Character, Boolean>();
            columns[i] = new HashMap<Character, Boolean>();
            fangges[i] = new HashMap<Character, Boolean>();
        }
        solve(board);
    }

    private boolean solve(char[][] board) {
        int row = -1;
        int column = -1;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == '.' && row == -1){
                    row = i;
                    column = j;
                }
                rows[i].put(board[i][j], true);
                columns[j].put(board[i][j], true);
                fangges[(i / 3) * 3 + (j / 3)].put(board[i][j], true);
            }
        }
        if(row == -1 && column == -1)
            return true;
        for(int i = 1; i < 10; i++){
            if(!rows[row].getOrDefault((char)('0' + i), false) &&
                    !columns[column].getOrDefault((char)('0' + i), false) &&
                    !fangges[(row / 3) * 3 + (column / 3)].getOrDefault((char)('0' + i), false)){
                //0-9int转char
                board[row][column] = (char)('0' + i);
                rows[row].put((char)('0' + i), true);
                columns[column].put((char)('0' + i), true);
                fangges[(row / 3) * 3 + (column / 3)].put((char)('0' + i), true);
                if(solve(board))
                    return true;
                else{
                    rows[row].put((char)('0' + i), false);
                    columns[column].put((char)('0' + i), false);
                    fangges[(row / 3) * 3 + (column / 3)].put((char)('0' + i), false);
                }
            }
        }
        board[row][column] = '.';
        return false;
    }
}
