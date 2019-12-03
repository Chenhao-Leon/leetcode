package leetcode_4;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/2
 * @Description: 测试用例
 */
public class Test {
    public static void main(String[] args) {
        int[] n1 = {1, 3};
        int[] n2 = {2};
//        System.out.println(Solution.findMedianSortedArrays(n1, n2));
        int[] n3 = {};
        int[] n4 = {1, 2};
//        System.out.println(Solution.findMedianSortedArrays(n3, n4));
        int[] n5 = {1, 2};
        int[] n6 = {3};
//        System.out.println(Solution.findMedianSortedArrays(n5, n6));
        int[] n7 = {0, 0};
        int[] n8 = {0, 0};
//        System.out.println(Solution.findMedianSortedArrays(n7, n8));
        int[] n9 = {1, 2};
        int[] n10 = {-1, 3};
        System.out.println(Solution.findMedianSortedArrays(n9, n10));

    }
}
