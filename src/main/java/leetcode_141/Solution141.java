package leetcode_141;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/23
 * @Description: 环形链表
 */
public class Solution141 {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        Set<ListNode> set = new HashSet<>();
        ListNode p = head;
        while(p != null){
            //set和map增加元素实际上增加了对象的引用副本
            if(!set.contains(p))
                set.add(p);
            else return true;
            p = p.next;
        }
        return false;
    }
}
