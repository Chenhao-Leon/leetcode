package leetcode_36;

import java.util.HashMap;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/22
 * @Description: 有效的数独
 */
public class Solution {
    public boolean isValidSudoku(char[][] board){
        HashMap<Character, Boolean> row = new HashMap<>();
        HashMap<Character, Boolean> fangge1 = new HashMap<>();
        HashMap<Character, Boolean> fangge2 = new HashMap<>();
        HashMap<Character, Boolean> fangge3 = new HashMap<>();
        for(int i = 0; i < board.length; i++){
            row.clear();
            if(i % 3 == 0){
                fangge1.clear();
                fangge2.clear();
                fangge3.clear();
            }
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] != '.'){
                    if(row.containsKey(board[i][j]))
                        return false;
                    row.put(board[i][j], true);
                    if(j < 3){
                        if(fangge1.containsKey(board[i][j]))
                            return false;
                        fangge1.put(board[i][j], true);
                    }
                    else if(j < 6){
                        if(fangge2.containsKey(board[i][j]))
                            return false;
                        fangge2.put(board[i][j], true);
                    }
                    else{
                        if(fangge3.containsKey(board[i][j]))
                            return false;
                        fangge3.put(board[i][j], true);
                    }
                }
            }
        }
        row.clear();
        for(int j = 0; j < board[0].length; j++){
            row.clear();
            for(int i = 0; i < board.length; i++){
                if(board[i][j] != '.'){
                    if(row.containsKey(board[i][j]))
                        return false;
                    row.put(board[i][j], true);
                }
            }
        }
        return true;
    }
}
