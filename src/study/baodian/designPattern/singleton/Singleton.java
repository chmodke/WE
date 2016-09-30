package study.baodian.designPattern.singleton;

/**
 * Created by kehao on 2016/9/29 19:33.
 * Description:单例对象
 */
public class Singleton {
    private int n = (int) (Math.random() * 10);

    private Singleton() {
    }

    private static Singleton uniqueInstance = new Singleton();

    public static Singleton getInstance() {
        return uniqueInstance;
    }

    public int getN() {
        return n;
    }
}
