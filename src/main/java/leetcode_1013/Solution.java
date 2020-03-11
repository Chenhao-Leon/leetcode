package leetcode_1013;

/**
 * @Auther: Chen Hao
 * @Date: 2020/3/11
 * @Description: 将数组分成和相等的三个部分
 */
public class Solution {
    public boolean canThreePartsEqualSum(int[] A) {
        int len = A.length;
        for(int i = 1; i < len; i++){
            A[i] = A[i - 1] + A[i];
        }
        boolean flag = false;
        int firstBound = 0;
        for(int i = 0; i < len - 2; i++){
            if(A[i] * 3 == A[len - 1]){
                firstBound = i;
                flag = true;
                break;
            }
        }
        if(!flag) return false;
        int secBound = firstBound + 1;
        flag = false;
        for(int i = firstBound + 1; i < len - 1; i++){
            if((A[i] - A[firstBound]) * 2 == A[len - 1] - A[firstBound]){
                secBound = i;
                flag = true;
                break;
            }
        }
        if(!flag) return false;
        return true;
    }
}
