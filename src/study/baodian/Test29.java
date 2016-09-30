package study.baodian;

/**
 * Created by kehao on 2016/9/27 22:49.
 */
public class Test29 {
    public static void main(String[] args) {
        new Child("mike");
    }
}
class People{
    String name;
    People(){
        System.out.println(1);
    }
    People(String name){
        System.out.println(2);
        this.name=name;
    }
}
class Child extends People{
    People father;
    Child(String name){
        System.out.println(3);
        this.name=name;
        father=new People(name+ "F");
    }
    Child(){
        System.out.println(4);
    }
}