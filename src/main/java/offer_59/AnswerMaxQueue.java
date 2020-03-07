package offer_59;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Auther: Chen Hao
 * @Date: 2020/3/7
 * @Description: 队列的最大值
 * push_back的时间复杂度为O(1)，因为他要维护一个递减序列，将比待加入值小的都删掉，
 * 因此他最多进行N次删除操作，平均下来每次的push_back时间复杂度为O(1)
 */
public class AnswerMaxQueue {
    Queue<Integer> queue;
    Deque<Integer> maxQueue;
    public AnswerMaxQueue() {
        queue=new LinkedList<>();
        //双向队列
        maxQueue=new ArrayDeque<>();
    }
    public int max_value() {
        if(maxQueue.isEmpty())
            return -1;
        return maxQueue.peek();
    }
    public void push_back(int value) {
        queue.add(value);
        while(!maxQueue.isEmpty() && value>maxQueue.getLast())
            maxQueue.pollLast();
        maxQueue.add(value);
    }
    public int pop_front() {
        if(queue.isEmpty())
            return -1;
        int ans=queue.poll();
        if(ans==maxQueue.peek())
            maxQueue.poll();
        return ans;
    }
}
