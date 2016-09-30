package study.baodian.basic;

/**
 * Created by kehao on 2016/9/30 16:53.
 * Description：finally块执行时机
 */
public class Test4_6_1 {
    public static int testFinally() {
        try {
            return 1;
        } catch (Exception e) {
            return 0;
        } finally {
            System.out.println("execute finally");
        }
    }

    public static void main(String[] args) {
        int result = testFinally();
        System.out.println(result);
    }
}
