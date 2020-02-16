package leetcode_116;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution116Test {

    @Test
    public void connect() {
        Node root = new Node(1, new Node(2, new Node(4), new Node(5), null),
                new Node(3, new Node(6), new Node(7), null), null);
        root = new Solution116().connect(root);
        System.out.println(root);
    }
}