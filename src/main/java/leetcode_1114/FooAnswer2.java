package leetcode_1114;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Auther: Chen Hao
 * @Date: 2020/3/11
 * @Description:
 */
public class FooAnswer2 {

        private AtomicInteger firstJobDone = new AtomicInteger(0);
        private AtomicInteger secondJobDone = new AtomicInteger(0);

        public FooAnswer2() {}

        public void first(Runnable printFirst) throws InterruptedException {
            printFirst.run();
            firstJobDone.incrementAndGet();
        }

        public void second(Runnable printSecond) throws InterruptedException {
            while (firstJobDone.get() != 1) {
            }
            printSecond.run();
            secondJobDone.incrementAndGet();
        }

        public void third(Runnable printThird) throws InterruptedException {
            while (secondJobDone.get() != 1) {
            }
            printThird.run();
        }
}
