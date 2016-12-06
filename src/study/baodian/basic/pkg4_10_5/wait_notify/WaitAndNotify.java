package study.baodian.basic.pkg4_10_5.wait_notify;

/**
 * Created by kehao on 2016/10/8 14:52.
 * Description：多线程同步
 */
public class WaitAndNotify {
    public static boolean isFinsh = false;
    public static int sleep = 50;

    public static void main(String[] args) {
        final Object obj = new Object();
        final Thread download = new Thread() {
            public void run() {
                System.out.println("开始下载...");
                for (int i = 0; i <= 100; i++) {
                    System.out.println("下载了" + i + "%.");
                    try {
                        Thread.sleep(sleep);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("下载完成.");
                isFinsh = true;
                synchronized (obj) {
                    obj.notify();
                }
            }
        };
        Thread show = new Thread() {
            public void run() {
                synchronized (obj) {
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (isFinsh) {
                    System.out.println("显示成功!");
                } else {
                    System.out.println("下载失败!");
                }
            }
        };
        download.start();
        show.start();
    }
}
