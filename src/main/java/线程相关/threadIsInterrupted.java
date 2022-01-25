package 线程相关;

import java.util.concurrent.TimeUnit;

/**
 * @Author: Hikari
 * @Date: 2022/1/25 9:51
 */

public class threadIsInterrupted {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(
                () -> {
                    while (true){
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            System.out.println("  +++  ++  ++ ");
                        }
                    }
                }
        );
        thread.start();
        TimeUnit.MILLISECONDS.sleep(100);
        thread.interrupt();
        System.out.println("is Interrupt " + thread.isInterrupted());
    }
}
