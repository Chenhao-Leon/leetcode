package leetcode_88;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/12
 * @Description: 合并两个有序数组
 */
public class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = 0;
        int p2 = 0;
        int index = 0;
        int[] tmp = new int[m];
        System.arraycopy(nums1, 0, tmp, 0, m);
        while(p1 < m && p2 < n){
            if(tmp[p1] < nums2[p2]){
                nums1[index++] = tmp[p1++];
            }
            else{
                nums1[index++] = nums2[p2++];
            }
        }
        while(p1 < m){
            nums1[index++] = tmp[p1++];
        }
        while(p2 < n){
            nums1[index++] = nums2[p2++];
        }
    }
}
