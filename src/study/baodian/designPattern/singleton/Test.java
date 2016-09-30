package study.baodian.designPattern.singleton;

/**
 * Created by kehao on 2016/9/29 19:37.
 * Description:单例模式测试
 */
public class Test {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        System.out.println(s1.getN());

        Singleton s2 = Singleton.getInstance();
        System.out.println(s2.getN());

        Singleton s3 = Singleton.getInstance();
        System.out.println(s3.getN());

        Singleton s4 = Singleton.getInstance();
        System.out.println(s4.getN());
    }
}
