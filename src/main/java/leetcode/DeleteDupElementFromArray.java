package leetcode;

import jdk.nashorn.internal.ir.SetSplitState;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.*;
import java.util.stream.Collectors;


class TaskGet implements Callable<String>{
    @Override
    public String call() throws Exception {
        return "test";
    }
}

class Task implements Runnable{
    private final String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End task " + name);
    }
}

public class DeleteDupElementFromArray {



    static void printNums(int[] nums){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(Integer i : nums){
            sb.append(String.valueOf(i) + ",");
        }
        System.out.println(sb.toString());
    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        ExecutorService es = Executors.newFixedThreadPool(4);
//        for (int i = 0; i < 6; i++) {
//            ((ExecutorService) es).submit(new Task("" + i));
//        }
//        es.shutdown();
//        TaskGet t = new TaskGet();
//        ExecutorService es = Executors.newFixedThreadPool(4);
//        Future<String> future = es.submit(t);
//        String s = future.get();
//        System.out.println(s);
//        Random random = new Random(0);
//        System.out.println(random.nextInt(10000));

    }
}
