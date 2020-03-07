package offer_59;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @Auther: Chen Hao
 * @Date: 2020/3/7
 * @Description: 队列的最大值
 * push_back的时间复杂度为O(N)
 */
public class MaxQueue {
    private LinkedList<Integer> queue = new LinkedList<>();
    private ArrayList<Integer> maxArray = new ArrayList<>();
    private int max = 0;
    public MaxQueue() { }

    public int max_value() {
        if(queue.isEmpty())
            return -1;
        return max;
    }

    public void push_back(int value) {
        max = Math.max(max, value);
        for(int i = maxArray.size() - 1; i >= 0 && maxArray.get(i) < value; i--){
            maxArray.set(i, value);
        }
        maxArray.add(value);
        queue.add(value);
    }

    public int pop_front() {
        if(queue.isEmpty()) return -1;
        maxArray.remove(0);
        if(!maxArray.isEmpty())
            max = maxArray.get(0);
        else max = -1;
        return queue.poll();
    }
}
