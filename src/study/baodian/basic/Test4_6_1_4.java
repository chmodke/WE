package study.baodian.basic;

/**
 * Created by kehao on 2016/9/30 17:13.
 * Description：finally不执行情况1
 */
public class Test4_6_1_4 {
    public static void main(String[] args) {
        int i=5/0;
        try {
            System.out.println("try block");
        }catch (Exception e){
            System.out.println("catch block");
        }finally {
            System.out.println("finally block");
        }
    }
}
