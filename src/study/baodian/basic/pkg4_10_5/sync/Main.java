package study.baodian.basic.pkg4_10_5.sync;

/**
 * Created by kehao on 2016/10/8 15:46.
 * Description：
 */
public class Main {
    public static void main(String[] args) {
        Thread t1=new Thread(){
            public void run(){
                SyncObject sync=new SyncObject();
                System.out.print("t1 ");sync.method1();
                System.out.print("t1 ");sync.method3();
            }
        };
        Thread t2=new Thread(){
            public void run(){
                SyncObject sync=new SyncObject();
                System.out.print("t2 ");sync.method3();
            }
        };
        Thread t3=new Thread(){
            public void run(){

            }
        };
        Thread t4=new Thread(){
            public void run(){

            }
        };
        t1.start();
        t2.start();
    }
}
