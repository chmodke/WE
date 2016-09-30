package study.baodian.basic;

/**
 * Created by kehao on 2016/9/29 12:37.
 * Description:assert
 */
public class Test4_3_4 {
    public static void main(String[] args) {
        assert 1 + 1 == 2;
        System.out.println("assert1 ok");
        assert 1 + 1 == 3 : "assert fail,exit";
        System.out.println("assert2 ok");
    }
}
