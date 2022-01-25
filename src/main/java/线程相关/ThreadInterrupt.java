package 线程相关;

import java.util.concurrent.TimeUnit;

/**
 * @Author: Hikari
 * @Date: 2022/1/25 0:18
 */

public class ThreadInterrupt {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(
                () -> {
                    try{
                        TimeUnit.MINUTES.sleep(1);
                    } catch (InterruptedException e) {
                        System.out.println("iam be interrupted. ");
                    }
                }
        );
        thread.start();
        TimeUnit.MILLISECONDS.sleep(2);
        thread.interrupt();
    }
}
