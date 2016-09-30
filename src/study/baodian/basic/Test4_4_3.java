package study.baodian.basic;

/**
 * Created by kehao on 2016/9/26 13:38.
 * Description: 引用传递陷阱
 */
public class Test4_4_3 {
    public static void changeStringBuffer(StringBuffer ss1,StringBuffer ss2){
        ss1.append(" World");
        ss2=ss1;
    }

    public static void main(String[] args) {
        Integer a=1;
        Integer b=a;
        b++;
        System.out.println(a);
        System.out.println(b);

        StringBuffer s1=new StringBuffer("Hello");
        StringBuffer s2=new StringBuffer("Hello");
        changeStringBuffer(s1,s2);
        System.out.println(s1);
        System.out.println(s2);
    }
}
