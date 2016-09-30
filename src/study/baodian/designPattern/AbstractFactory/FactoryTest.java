package study.baodian.designPattern.AbstractFactory;

/**
 * Created by kehao on 2016/9/29 21:17.
 * Description：
 */
public class FactoryTest {
    public static void main(String[] args) {
        Car car1=new Car();
        Provider BDFourPowerProvider = new BDFourPowerCarFactory();
        car1.power=BDFourPowerProvider.produceCar();
        car1.navigator=BDFourPowerProvider.produceNavigator();
        car1.power.power();
        car1.navigator.navMode();

        Car car2=new Car();
        Provider GpsTwoPowerProvider = new GpsTwoPowerCarFactory();
        car2.power=GpsTwoPowerProvider.produceCar();
        car2.navigator=GpsTwoPowerProvider.produceNavigator();
        car2.power.power();
        car2.navigator.navMode();
    }
}
