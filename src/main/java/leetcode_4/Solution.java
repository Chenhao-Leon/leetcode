package leetcode_4;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/2
 * @Description: 寻找两个有序数组的中位数
 */

// 错误解法，两个可能是中位数的值可能都在一个数组中，不是一定各数组有一个
public class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length == 0 || nums2.length == 0) {
            if(nums1.length == 0)
                nums1 = nums2;
            if (nums1.length != 0) {
                if (nums1.length % 2 == 1)
                    return nums1[nums1.length / 2];
                else
                    return (nums1[nums1.length / 2 - 1] + nums1[nums1.length / 2]) / 2.0;
            }
        }
        int l1 =nums1.length, l2 = nums2.length;
        int s1 = 0, e1 = l1 - 1;
        int s2 = 0, e2 = l2 - 1;
        int mid1 = (s1 + e1) / 2;
        int mid2 = (s2 + e2) / 2;
        while(true) {
            if(mid1 + 1 < l1 && mid2 + 1 < l2 && l1 / 2 + l2 / 2 - mid1 - mid2 <= 1
                    & nums1[mid1] <= nums2[mid2 + 1] && nums2[mid2] <= nums1[mid1 +1])
                break;
            if(mid1 + 1 >= l1 && mid2 + 1 >= l2 && l1 / 2 + l2 / 2 - mid1 - mid2 <= 1)
                break;
            if(mid1 + 1 < l1 && mid2 + 1 >= l2 && l1 / 2 + l2 / 2 - mid1 - mid2 <= 1
                    && nums2[mid2] <= nums1[mid1 +1])
                break;
            if(mid1 + 1 >= l1 && mid2 + 1 < l2 && l1 / 2 + l2 / 2 - mid1 - mid2 <= 1
                    && nums1[mid1] <= nums2[mid2 + 1])
                break;
            if(nums1[mid1] < nums2[mid2]) {
                if(mid1 + 1 < l1)
                    s1 = mid1 + 1;
                if(mid2 - 1 >= 0)
                    e2 = mid2 - 1;
            }
            else {
                if(mid1 - 1 >= 0)
                    e1 = mid1 - 1;
                if(mid2 + 1 < l2)
                    s2 = mid2 + 1;
            }
            mid1 = (s1 + e1) / 2;
            mid2 = (s2 + e2) / 2;
        }
        // 待计算值为1、max(nums1[mid1-1],nums2[mid2-1])、nums1[mid1]、nums2[mid2]三个数中间那个，
        // 2、min(nums1[mid1+1],nums2[mid2+1])、nums1[mid1]、nums2[mid2]三个数中间那个
        if((l1 + l2) % 2 == 0)
            return (nums1[mid1] + nums2[mid2]) / 2.0;
        else {
            if (l1 / 2 + l2 / 2 - mid1 - mid2 == 0)
                return 1.0 * Math.min(nums1[mid1], nums2[mid2]);
            else
                return 1.0 * Math.max(nums1[mid1], nums2[mid2]);
        }
    }
}
