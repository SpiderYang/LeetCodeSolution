package 线程相关;

import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

/**
 * @Author: Hikari
 * @Date: 2022/1/24 23:49
 */

public class ThreadYield {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            IntStream.range(0, 2).mapToObj(ThreadYield::create).
                    forEach(Thread::start);
            TimeUnit.SECONDS.sleep(1);
        }
    }
    private static Thread create(int i) {
        return new Thread(
                () -> {
                    if (i == 0)
                        Thread.yield();
                    System.out.println(i);
                }
        );
    }
}
