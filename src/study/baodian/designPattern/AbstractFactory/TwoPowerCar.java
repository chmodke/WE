package study.baodian.designPattern.AbstractFactory;

/**
 * Created by kehao on 2016/9/29 20:28.
 * Description：产品1
 */
public class TwoPowerCar implements PowerCar {
    @Override
    public void power() {
        System.out.println("this is Two Power Car!");
    }
}
