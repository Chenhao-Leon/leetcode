package leetcode_82;

import java.util.HashMap;

/**
 * @Auther: Chen Hao
 * @Date: 2020/3/13
 * @Description: 删除排序链表中的重复元素 II 时间6%
 * 原因：没有利用到有序的条件，这是一种处理无序的方法
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode p = newHead;
        HashMap<Integer, ListNode> map = new HashMap<>();
        while(p.next != null){
            if(map.containsKey(p.next.val)){
                if(map.get(p.next.val) != null){
                    map.put(p.next.val, null);
                    ListNode tmp = map.get(p.next.val);
                    if(tmp.next == p) {
                        tmp.next = p.next.next;
                        p = tmp;
                    }
                    else {
                        tmp.next = tmp.next.next;
                        p.next = p.next.next;
                    }
                } else{
                    p.next = p.next.next;
                }
            } else {
                map.put(p.next.val, p);
                p = p.next;
            }
        }
        return newHead.next;
    }
}
