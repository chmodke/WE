package study.baodian.basic;

/**
 * Created by kehao on 2016/9/29 12:31.
 * Description:break新用法
 */
public class Test4_3_2 {
    public static void main(String[] args) {
        out:
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                if (j>=2){
                    break out;
                }
                System.out.println(j);
            }
        }
        System.out.println("Break");
    }
}
