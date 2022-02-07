package 线程相关;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

/**
 * @Author: Hikari
 * @Date: 2022/1/26 14:02
 */

public class ThisMonitor {
    public synchronized int method1(){
        System.out.println(Thread.currentThread().getName() + " enter to method1");
        try {
            TimeUnit.MINUTES.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 1;
    }

    public synchronized void method2(){
        System.out.println(Thread.currentThread().getName() + " enter to method2");
        try {
            TimeUnit.MINUTES.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ThisMonitor thisMonitor = new ThisMonitor();
        new Thread(thisMonitor::method1).start();
        new Thread(thisMonitor::method2).start();
        Thread t = new Thread(
                () -> {
            System.out.println(1);
        });


    }

}
