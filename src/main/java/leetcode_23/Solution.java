package leetcode_23;

import java.util.LinkedList;
import java.util.List;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/11
 * @Description: 合并K个排序链表
 */
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode ans = new ListNode(0);
        ListNode p = ans;
        int min;
        int index = 0;
        boolean flag = true;
        while(flag){
            flag = false;
            min = Integer.MAX_VALUE;
            for(int i = 0; i < lists.length; i++){
                if(lists[i] != null){
                    if(lists[i].val < min){
                        min = lists[i].val;
                        index = i;
                    }
                    flag = true;
                }
            }
            if(!flag) break;
            p.next = new ListNode(lists[index].val);
            p = p.next;
            lists[index] = lists[index].next;
        }
        return ans.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}