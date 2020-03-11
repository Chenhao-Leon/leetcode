package leetcode_1114;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Auther: Chen Hao
 * @Date: 2020/3/11
 * @Description: 按序打印 这个方法为什么会死锁？？？
 */
public class Foo {
    ReentrantLock lock1 = new ReentrantLock();
    Condition condition1 = lock1.newCondition();
    ReentrantLock lock2 = new ReentrantLock();
    Condition condition2 = lock2.newCondition();
    public Foo() {

    }
    public void first(Runnable printFirst) throws InterruptedException {
        lock1.lock();
        printFirst.run();
        condition1.signal();
        lock1.unlock();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        lock1.lock();
        condition1.await();
        lock2.lock();
        printSecond.run();
        condition2.signal();
        lock2.unlock();
    }

    public void third(Runnable printThird) throws InterruptedException {
        lock1.lock();
        condition1.await();
        lock2.lock();
        condition2.await();
        printThird.run();
        lock2.unlock();
        lock1.unlock();
    }
}
