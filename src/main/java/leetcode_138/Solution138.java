package leetcode_138;

import java.time.chrono.MinguoDate;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/21
 * @Description: 复制带随机指针的链表 时间68%
 */
public class Solution138 {
    private int[] randomIndex = new int[1000];
    public Node copyRandomList(Node head) {
        if(head == null) return null;
        Node[] arrayNew = new Node[1000];
        Node[] arrayOld = new Node[1000];
        Node copyHead = new Node(head.val);
        arrayNew[0] = copyHead;
        arrayOld[0] = head;
        int index = 1;
        Node p = head;
        Node copy = copyHead;
        while(p.next != null){
            p = p.next;
            arrayOld[index] = p;
            copy.next = new Node(p.val);
            copy = copy.next;
            arrayNew[index++] = copy;
        }
        p = head;
        copy = copyHead;
        for(int i = 0; i < index; i++){
            if(p.random != null)
                copy.random = arrayNew[findNode(p.random, arrayOld)];
            p = p.next;
            copy = copy.next;
        }
        return copyHead;
    }
    private int findNode(Node node, Node[] array){
        for(int i = 0; i < array.length; i++){
            if(node == array[i])
                return i;
        }
        return -1;
    }
}
