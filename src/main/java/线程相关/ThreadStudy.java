package 线程相关;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Hikari
 * @Date: 2022/1/21 12:05
 */

public class ThreadStudy extends Thread {
    int val;
    public ThreadStudy(int val){
        this.val = val;
    }

    @Override
    public void run() {
        val++;
    }

    public static void main(String[] args) {
        List<ThreadStudy> list = new ArrayList<>();
        int sum = 0;
        for(int i=0; i<100; i++){
            list.add(new ThreadStudy(sum));
        }
        for(Thread t: list){
            t.start();
        }
        System.out.println(sum);
    }
}
