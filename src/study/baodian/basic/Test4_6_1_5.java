package study.baodian.basic;

/**
 * Created by kehao on 2016/9/30 17:15.
 * Description：
 */
public class Test4_6_1_5 {
    public static void main(String[] args) {
        try {
            System.out.println("try block");
            System.exit(0);
        }catch (Exception e){
            System.out.println("catch block");
        }finally {
            System.out.println("finally block");
        }
    }
}
