package leetcode_189;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/28
 * @Description:
 */
public class Answer {
    public void rotate(int[] nums, int k) {
        if(k % nums.length == 0) return;
        k = k % nums.length;
        int count = 0;
        for (int start = 0; count < nums.length; start++) {
            int current = start;
            int prev = nums[start];
            do {
                int next = (current + k) % nums.length;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            } while (start != current);
        }
    }
}
