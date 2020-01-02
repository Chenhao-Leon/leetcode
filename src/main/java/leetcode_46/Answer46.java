package leetcode_46;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/28
 * @Description: 全排列
 * 坐看花落 的评论：两个问题 1. 为什么上面的递归会包含所有的解?
 * 2. 为什么上面的递归交换的结果不会重复? 其实设计的其他算法也是要解决这两个问题
 *
 * 这里换个角度去理解上面的回溯法就可以了, 首先想到的是数学的排列组合, N个元素有多少种排列方式呢,
 * N*(N-1)*(N-2)..*(1), 这个式子我这样理解的, 第一个位置有N种选择, 第二个位置还有N-1种元素可选,
 * 第三个位置还有N-2种元素可选,
 *
 * 说到这里, 仔细看一下上面的回溯法, 只不过是将第n个位置的选择使用交换表示出来罢了,
 * 比如说第一层计算,第一个位置可选1,2,3, 上面的算法就是通过交换,将1,2,3分别放在了第一个位置上,
 * 第二个位置可选的元素是除了第一个位置的元素以外的其他所有元素,
 * 则第二层做的事是将每个第一层计算来的结果第一个位置不变, 第二个位置通过交换获取到所有的N-1可选元素,
 * 一直到第n层,就获取到了每个位置的所有可能性了, 本质上还是排列组合。
 */
public class Answer46 {
            public void backtrack(int n,
                                  ArrayList<Integer> nums,
                                  List<List<Integer>> output,
                                  int first) {
                if (first == n)
                    output.add(new ArrayList<Integer>(nums));
                for (int i = first; i < n; i++) {
                    // 用于交换Collection的元素
                    Collections.swap(nums, first, i);
                    backtrack(n, nums, output, first + 1);
                    Collections.swap(nums, first, i);
                }
            }

            public List<List<Integer>> permute(int[] nums) {
                List<List<Integer>> output = new LinkedList();

                ArrayList<Integer> nums_lst = new ArrayList<Integer>();
                for (int num : nums)
                    nums_lst.add(num);

                int n = nums.length;
                backtrack(n, nums_lst, output, 0);
                return output;
            }
}
