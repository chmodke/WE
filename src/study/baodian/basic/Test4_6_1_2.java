package study.baodian.basic;

/**
 * Created by kehao on 2016/9/30 16:55.
 * Description：finally中的基本类型
 */
public class Test4_6_1_2 {
    public static int testFinally() {
        try {
            return 1;
        } catch (Exception e) {
            return 0;
        } finally {
            System.out.println("execute finally");
            return 3;
        }
    }

    public static void main(String[] args) {
        int result = testFinally();
        System.out.println(result);
    }
}
