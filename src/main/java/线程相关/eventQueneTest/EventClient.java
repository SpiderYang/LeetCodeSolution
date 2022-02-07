package 线程相关.eventQueneTest;

import java.util.concurrent.TimeUnit;

/**
 * @Author: Hikari
 * @Date: 2022/1/31 13:57
 */

public class EventClient {
    public static void main(String[] args) {
        final EventQueue eventQ = new EventQueue();
        new Thread(
                () -> {
                    for(;;){
                        eventQ.offer(new EventQueue.Event());
                    }
                }
        , "Producer").start();

        new Thread(
                () -> {
                    for(;;){
                        try {
                            TimeUnit.MILLISECONDS.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        eventQ.take();

                    }
                }
        , "consumer").start();
    }


}
