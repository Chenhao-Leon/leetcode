package leetcode_1013;

/**
 * @Auther: Chen Hao
 * @Date: 2020/3/11
 * @Description:
 */
public class Answer {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        for(int i : A){
            sum += i;
        }
        if(sum%3 != 0){
            return false;
        }
        int left = 0;
        int leftSum = A[left];
        int right = A.length - 1;
        int rightSum = A[right];
        while(left + 1 < right){
            if(leftSum == sum/3 && rightSum == sum/3){
                return true;
            }
            if(leftSum != sum/3){
                leftSum += A[++left];
            }
            if(rightSum != sum/3){
                rightSum += A[--right];
            }
        }
        return false;
    }
}
