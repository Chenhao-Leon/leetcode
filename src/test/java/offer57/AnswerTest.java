package offer57;

import org.junit.Test;

public class AnswerTest {

    @Test
    public void findContinuousSequence() {
        int[][] test1 = new Answer().findContinuousSequence(9);
        for(int[] arrayTmp : test1){
            for(int tmp : arrayTmp)
                System.out.print(tmp + " ");
            System.out.println();
        }
        int[][] test2 = new Answer().findContinuousSequence(15);
        for(int[] arrayTmp : test2){
            for(int tmp : arrayTmp)
                System.out.print(tmp + " ");
            System.out.println();
        }
    }
}