package leetcode_138;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution138Test {

    @Test
    public void copyRandomList() {
        Node head = new Node(7);
        head.next = new Node(13);
        head.next.random = head;
        head.next.next = new Node(11);
        Node between = head.next.next;
        between.next = new Node(10);
        between.next.random = between;
        between.next.next = new Node(1);
        between.next.next.random = head;
        between.random = between.next.next;
        Node copyHead = new Solution138().copyRandomList(head);
        System.out.println(copyHead);
    }
}