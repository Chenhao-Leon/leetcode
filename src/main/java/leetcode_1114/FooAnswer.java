package leetcode_1114;

import java.util.concurrent.CountDownLatch;

/**
 * @Auther: Chen Hao
 * @Date: 2020/3/11
 * @Description:
 */
public class FooAnswer {
    CountDownLatch latch1 = new CountDownLatch(1);
    CountDownLatch latch2 = new CountDownLatch(1);
    public FooAnswer() {
    }

    public void first(Runnable printFirst) throws InterruptedException {
        printFirst.run();
        latch1.countDown();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        latch1.await();
        printSecond.run();
        latch2.countDown();
    }

    public void third(Runnable printThird) throws InterruptedException {
        latch2.await();
        printThird.run();
    }
}
