package 线程相关;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @Author: Hikari
 * @Date: 2022/1/24 18:03
 */

public class concurrentNum {

    static final int MAX=50;

    private static final Object MUTEX = new Object();

    static class Counter{
        public static int counter = 1;
    }

    public static void main(String[] args) {
        Runnable run = () -> {
            synchronized (MUTEX) {
                while (Counter.counter < MAX) {
                    try {
                        System.out.println(Counter.counter++);
                        //Counter.counter++;
                        TimeUnit.MILLISECONDS.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        List<Thread> list = IntStream.range(1,3).mapToObj(f -> new Thread(run, "Thread-" + String.valueOf(f)))
                .collect(Collectors.toList());
        list.forEach(Thread::start);

    }
    }

