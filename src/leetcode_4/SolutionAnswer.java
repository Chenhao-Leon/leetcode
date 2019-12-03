package leetcode_4;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/3
 * @Description: 寻找两个有序数组的中位数
 */
// 该算法为得到两个有序数组中第K小的值，时间复杂度log(m+n)
public class SolutionAnswer {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int left = (l1 + l2 + 1) / 2;
        int right = (l1 + l2 + 2) / 2;
        // 将奇数和偶数的情况合并，如果是奇数，则求做两次k相同的getKth
        return (getKth(nums1, 0, l1 - 1, nums2, 0, l2 - 1, left) +
                getKth(nums1, 0, l1 - 1, nums2, 0, l2 - 1, right)) / 2;
    }
    private double getKth(int[] nums1, int s1, int e1, int[] nums2, int s2, int e2, int k){
        int len1 = e1 - s1 + 1;
        int len2 = e2 - s2 + 1;
        //让 len1 的长度小于 len2，这样就能保证如果有数组空了，一定是 len1
        if (len1 > len2) return getKth(nums2, s2, e2, nums1, s1, e1, k);
        if (len1 == 0) return nums2[s2 + k - 1];

        if (k == 1) return Math.min(nums1[s1], nums2[s2]);

        // 注意理解Math.min的操作，关键在于理解len的含义
        int i = s1 + Math.min(len1, k / 2) - 1;
        int j = s2 + Math.min(len2, k / 2) - 1;
        // 与以下代码等价
        //        int i = start1 + k / 2 - 1 <= end1? start1 + k / 2 - 1: end1;
        //        int j = start2 + k / 2 - 1 <= end2? start2 + k / 2 - 1: end2;

        if (nums1[i] > nums2[j]) {
            return getKth(nums1, s1, e1, nums2, j + 1, e2, k - (j - s2 + 1));
        }
        else {
            return getKth(nums1, i + 1, e1, nums2, s2, e2, k - (i - s1 + 1));
        }
    }
}
