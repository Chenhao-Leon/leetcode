package exercise16_11;

public class Solution {
    public int[] divingBoard(int shorter, int longer, int k) {
        if(k == 0) return new int[]{};
        if(shorter < longer){
            int[] res = new int[k + 1];
            res[0] = shorter * k;
            for(int i = 1; i <= k ; i++)
                res[i] = res[i - 1] + longer - shorter;
            return res;
        } else {
            return new int[]{shorter * k};
        }
    }
}
