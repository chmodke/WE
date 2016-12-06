package study.baodian.basic.pkg4_10_5.sync;

/**
 * Created by kehao on 2016/10/8 15:12.
 * Description：同步锁对象
 */
public class SyncObject {
    public void method1(){
        synchronized (this){
            System.out.println("block 1 is synchronized");
        }
    }
    public void method2(){
        System.out.println("block 2 is`n synchronized");
    }
    public void method3(){
        synchronized (this){
            System.out.println("block 3 is synchronized pre");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("block 3 is synchronized post");
        }
    }
    public synchronized void method4(){
        System.out.println("method 4 is synchronized");
    }
}
