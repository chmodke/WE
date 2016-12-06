package study.baodian.basic.pkg4_10_5.sync;

/**
 * Created by kehao on 2016/10/8 16:40.
 * Description：synchronized同步块
 */
public class SyncTest03 {
    public static void main(String[] args) {
        final Table1 table = new Table1();
        Thread t1 = new Thread() {
            public void run() {
                while (true) {
                    System.out.println(getName() + ":" + table.getBean());
                    Thread.yield();
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                while (true) {
                    System.out.println(getName() + ":" + table.getBean());
                    Thread.yield();
                }
            }
        };

        t1.start();
        t2.start();
    }
}

class Table1 {
    /*
     * 桌上有20个豆子
     */
    private int beans = 20;

    /*
     * 从桌上取豆子
     */
    public int getBean() {
        /*
         * synchronized
		 * 线程锁，解决线程安全问题
		 * 锁的是table对象
		 */
        synchronized (this) {
            if (beans == 0) {
                throw new RuntimeException("没有豆子了!");
            }
            Thread.yield();
            return beans--;
        }
    }
}

