package 线程相关;

import java.util.concurrent.TimeUnit;

/**
 * @Author: Hikari
 * @Date: 2022/1/24 15:11
 */

public class stateTest {
    public static void main(String[] args) throws InterruptedException {
//        Thread t = new Thread(() -> {
//            try {
//                TimeUnit.SECONDS.sleep(1);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//        t.start();
//        t.start();

        Thread t1 = new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t1.start();
        TimeUnit.SECONDS.sleep(2);
        t1.start();
    }
}
