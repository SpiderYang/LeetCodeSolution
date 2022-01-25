package 线程相关;

/**
 * @Author: Hikari
 * @Date: 2022/1/24 19:24
 */

public class ticketWindowRunnable implements Runnable {
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */

    private int index = 1;
    private final int MAX = 50;
    @Override
    public void run() {
        while (index < MAX) {
            System.out.println(Thread.currentThread().getName() + "叫号： " + index++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Runnable run = new ticketWindowRunnable();
        Thread t1 = new Thread(run, "叫号机1");
        Thread t2 = new Thread(run, "叫号机2");
        Thread t3 = new Thread(run);
        Thread t4 = new Thread(run);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
