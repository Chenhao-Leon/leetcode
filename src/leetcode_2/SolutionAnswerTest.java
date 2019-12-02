package leetcode_2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionAnswerTest {

    @Test
    public void addTwoNumbers() {
        int[] a1 = {2, 4, 3};
        int[] a2 = {5, 6, 4};
        ListNode h1 = ListNode.array2Node(a1);
        ListNode h2 = ListNode.array2Node(a2);
        SolutionAnswer s = new SolutionAnswer();
        ListNode r = s.addTwoNumbers(h1, h2);
        r.printList();
        //注意数组作为参数传入时创建的写法
        Assert.assertEquals(r, ListNode.array2Node(new int[]{7, 0, 8}));

    }
}