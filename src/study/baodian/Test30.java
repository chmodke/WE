package study.baodian;

/**
 * Created by kehao on 2016/9/27 22:53.
 */
public class Test30 {
    String str=new String("good");
    char [] ch={'a','b','c'};

    public static void main(String[] args) {
        Test30 ex=new Test30();
        ex.change(ex.str,ex.ch);
        System.out.println(ex.str+" and");
        System.out.println(ex.ch);
    }
    public void change(String str,char ch[]){
        str="test ok";
        ch[0]='g';
    }
}
