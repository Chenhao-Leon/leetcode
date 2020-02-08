package leetcode_75;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/8
 * @Description:
 */
class Solution {
    public void sortColors(int[] nums) {
        //curr为当前考虑元素，p0、p2分别为0、2的边界
        int p0 = 0, curr = 0;
        int p2 = nums.length - 1;

        int tmp;
        while (curr <= p2) {
            if (nums[curr] == 0) {
                tmp = nums[p0];
                nums[p0++] = nums[curr];
                //curr需要+1
                nums[curr++] = tmp;
            }
            else if (nums[curr] == 2) {
                tmp = nums[curr];
                //这里curr不需要+1
                nums[curr] = nums[p2];
                nums[p2--] = tmp;
            }
            //1处于p0和curr之间
            else curr++;
        }
    }
}