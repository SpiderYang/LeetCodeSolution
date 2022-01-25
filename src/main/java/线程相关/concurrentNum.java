package 线程相关;

/**
 * @Author: Hikari
 * @Date: 2022/1/24 18:03
 */

public class concurrentNum extends Thread{
    /**
     * If this thread was constructed using a separate
     * <code>Runnable</code> run object, then that
     * <code>Runnable</code> object's <code>run</code> method is called;
     * otherwise, this method does nothing and returns.
     * <p>
     * Subclasses of <code>Thread</code> should override this method.
     *
     * @see #start()
     * @see #stop()
     * @see #Thread(ThreadGroup, Runnable, String)
     */

    private static int index = 1;
    private final int MAX=500;
    @Override
    public void run() {
        while(index < MAX){
            System.out.println(Thread.currentThread().getName() + "  当前数字：" + index++);
        }
    }

    public static void main(String[] args) {
        Thread t1 = new concurrentNum();
        Thread t2 = new concurrentNum();
        Thread t3 = new concurrentNum();
        Thread t4 = new concurrentNum();
        Thread t5 = new concurrentNum();
        Thread t6 = new concurrentNum();
        Thread t7 = new concurrentNum();
        Thread t8 = new concurrentNum();
        Thread t9 = new concurrentNum();
        Thread t10 = new concurrentNum();
        Thread t11 = new concurrentNum();
        Thread t12 = new concurrentNum();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
        t11.start();
        t12.start();
    }
}
