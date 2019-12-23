package leetcode_37;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solveSudoku() {
        char[][] input = {
                {'5','3','.', '.','7','.', '.','.','.'},
                {'6','.','.', '1','9','5', '.','.','.'},
                {'.','9','8', '.','.','.', '.','6','.'},

                {'8','.','.', '.','6','.', '.','.','3'},
                {'4','.','.', '8','.','3', '.','.','1'},
                {'7','.','.', '.','2','.', '.','.','6'},

                {'.','6','.', '.','.','.', '2','8','.'},
                {'.','.','.', '4','1','9', '.','.','5'},
                {'.','.','.', '.','8','.', '.','7','9'},
        };
        new Solution().solveSudoku(input);
        for(int i = 0; i < input.length; i++){
            for(char c : input[i]){
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}