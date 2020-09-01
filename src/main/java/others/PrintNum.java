package others;

/**
 * @author chenhao96
 * @description 多线程打印奇偶数字
 * @date 2020/8/20
 */
public class PrintNum {
    public static void main(String[] args) throws InterruptedException {
        Integer lock = 0;
        int n = 100;
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 2; i <= n; i += 2){
                    synchronized (lock) {
                        try {
                            lock.wait();
                        } catch (Exception e){
                            e.printStackTrace();
                        }
                        System.out.println(i);
                        lock.notify();
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 1; i <= n; i += 2){
                    synchronized (lock) {
                        try{
                            if(i != 1) lock.wait();
                        } catch (Exception e){
                            e.printStackTrace();
                        }
                        System.out.println(i);
                        lock.notify();
                    }
                }
            }
        }).start();

    }
}
