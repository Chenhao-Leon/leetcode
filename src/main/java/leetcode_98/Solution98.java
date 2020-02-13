package leetcode_98;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/13
 * @Description: 验证二叉搜索树 (时间6%)
 * 总结：将stack设为long类型且将MAX_VALUE压入栈底这个方法，可以用空栈代替，就不涉及Long的问题了
 */
public class Solution98 {
    public boolean isValidBST(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        //0是左，1是右
        int direction = 0;
        //需要设置成Long型，否则[2147483647]例子返回false
        Stack<Long> min = new Stack<>();
        min.push(Long.MIN_VALUE);
        Stack<Long> max = new Stack<>();
        max.push(Long.MAX_VALUE);
        while(p != null || !stack.isEmpty()){
            if(p != null) {
                max.push((long)p.val);
                stack.push(p);
                direction = 0;
                p = p.left;
            }
            else{
                p = stack.pop();
                max.pop();
                //通过上一次的方向判断是否需要将min出栈
                if(direction == 1)
                    min.pop();
                //这里必须是小于等于和大于等于
                if(p.val <= min.peek() || p.val >= max.peek())
                    return false;
                min.push((long)p.val);
                direction = 1;
                p = p.right;
            }
        }
        return true;
    }
}
