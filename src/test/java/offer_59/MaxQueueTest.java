package offer_59;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxQueueTest {
    @Test
    public void testMaxQueue(){
        MaxQueue queue = new MaxQueue();
        queue.push_back(1);
        queue.push_back(2);
        System.out.println(queue.max_value());
        System.out.println(queue.pop_front());
        System.out.println(queue.max_value());
    }
}