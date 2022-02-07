package 线程相关.synchronizedDef;

import java.util.concurrent.TimeUnit;

/**
 * @Author: Hikari
 * @Date: 2022/2/1 14:46
 */

public class SynchronizedDefect {
    public synchronized void syncMethod(){
        try {
            TimeUnit.HOURS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizedDefect defect = new SynchronizedDefect();

        Thread t1 = new Thread(defect::syncMethod);
        t1.start();
        TimeUnit.MILLISECONDS.sleep(10);
        Thread t2 = new Thread(defect::syncMethod);
        t2.start();
        System.out.println("Sleep 2 millseconds");
        TimeUnit.MILLISECONDS.sleep(2);
        System.out.println(t2.isInterrupted());
        t2.interrupt();
        System.out.println(t1.isInterrupted());
        System.out.println(t2.getState());
    }


}
