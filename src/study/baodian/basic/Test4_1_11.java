package study.baodian.basic;

/**
 * Created by kehao on 2016/9/29 11:43.
 * Description: 反射机制
  */
class Base{
    public void f(){
        System.out.println("Base");
    }
}
class Sub extends Base{
    public void f(){
        System.out.println("Sub");
    }
}
public class Test4_1_11 {
    public static void main(String[] args) {
        try {
            Class c=Class.forName("Sub");
            Base b= (Base) c.newInstance();
            b.f();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
