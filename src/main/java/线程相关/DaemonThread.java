package 线程相关;

/**
 * @Author: Hikari
 * @Date: 2022/1/24 23:22
 */

public class DaemonThread {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(
                () -> {
                    while(true) {
                        try {
                            Thread.sleep(1);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
        );
//        thread.setDaemon(true);
        thread.start();
        Thread.sleep(2000);
        System.out.println("Main Thread finished lifecycle");
    }
}
