package 线程相关;

import javax.swing.plaf.TableHeaderUI;

/**
 * @Author: Hikari
 * @Date: 2022/1/24 23:59
 */

public class ThreadPriority {
    static int a = 1;
    public static void main(String[] args) {

        Thread t1 = new Thread(
                () -> {
                    while (a < 100){
                        System.out.println("t1" + "----" + Thread.currentThread().getId());
                        a++;
                    }
                }
        );
        t1.setPriority(10);

        Thread t2 = new Thread(
                () -> {
                    while (a < 100){
                        System.out.println("t2" + "---" + Thread.currentThread().getId());
                        a++;
                    }
                }
        );
        t2.setPriority(3);

        t1.start();
        t2.start();
    }
}
