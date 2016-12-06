package study.baodian.basic.pkg4_10_5.sync;

/**
 * Created by kehao on 2016/10/8 16:41.
 * Description：
 * 静态方法锁
 * public synchronized static void fun(){}
 * 静态方法上锁以后同步是跨对象的，静态方法，全局唯一，
 */
public class SyncTest04 {
    public static void main(String[] args) {
        final staticDemo sd1=new staticDemo();
        final staticDemo sd2=new staticDemo();
        Thread t1=new Thread(){
            public void run(){
                sd1.methodB();
            }
        };
        Thread t2=new Thread (){
            public void run(){
                sd2.methodB();
            }
        };
        t1.start();
        t2.start();
    }
}

class staticDemo{
    public void methodA() {
        String name=Thread.currentThread().getName();
        System.out.println(name+"调用了methodA方法");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        System.out.println(name+"调用methodA方法完毕！");
    }
    public synchronized static void methodB(){
        String name=Thread.currentThread().getName();
        System.out.println(name+"调用了methodB静态方法");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        System.out.println(name+"调用methodB静态方法完毕！");
    }
}

