package study.baodian.basic;

/**
 * Created by kehao on 2016/9/30 16:57.
 * Description：finally中的引用类型
 */
public class Test4_6_1_3 {
    public static int testFinally1() {
        int result = 1;
        try {
            result = 2;
            return result;
        } catch (Exception e) {
            return 0;
        } finally {
            result = 3;
            System.out.println("execute finally1");
        }
    }

    public static StringBuffer testFinally2() {
        StringBuffer sb = new StringBuffer("Hello");
        try {
            return sb;
        } catch (Exception e) {
            return null;
        } finally {
            sb.append(" World");
            System.out.println("execute finally2");
        }
    }

    public static void main(String[] args) {
        int result = testFinally1();
        System.out.println(result);
        StringBuffer sb = testFinally2();
        System.out.println(sb.toString());
    }
}
