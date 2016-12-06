package study.baodian.basic.pkg4_10_5.sync;

/**
 * Created by kehao on 2016/10/8 16:12.
 * Description：在多线程中，同一个对象的不同方法也不能同时被调用
 * synchronized也有互斥效果
 */
public class SyncTest02 {
    public static void main(String[] args) {
        final Demo demo = new Demo();
        Thread t1 = new Thread() {
            public void run() {
                demo.methodA();
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                demo.methodB();
            }
        };
        t1.start();
        t2.start();
    }
}
class Demo {
    public synchronized void methodA() {
        String name = Thread.currentThread().getName();
        System.out.println(name + "调用了methordA方法");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + "调用methordA方法完毕");
    }

    public synchronized void methodB() {
        String name = Thread.currentThread().getName();
        System.out.println(name + "调用了methordB方法");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + "调用methordB方法完毕");
    }
}

