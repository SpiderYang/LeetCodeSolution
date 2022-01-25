package 线程相关;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

/**
 * @Author: Hikari
 * @Date: 2022/1/25 12:22
 */

public class ThreadJoin {
    public static void main(String[] args) throws InterruptedException {
        List<Thread> threads = IntStream.range(1,3).mapToObj(ThreadJoin::create).collect(toList());
        threads.forEach(Thread::start);
        for(Thread t: threads){
            t.join();
        }
        threads.get(0).join();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "+" + i);
            shortSleep();
        }
    }

    private static Thread create(int i) {
        return new Thread(
                () -> {
                    for(int j = 0; j < 10; j++){
                        System.out.println(Thread.currentThread().getName() + "#" + j);
                        shortSleep();
                    }
                }
        , "Thread-"+String.valueOf(i));
    }

    private static void shortSleep() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
