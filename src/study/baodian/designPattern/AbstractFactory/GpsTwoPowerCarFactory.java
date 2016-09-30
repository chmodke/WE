package study.baodian.designPattern.AbstractFactory;

/**
 * Created by kehao on 2016/9/29 21:15.
 * Description：产品1工厂
 */
public class GpsTwoPowerCarFactory implements Provider {

    @Override
    public PowerCar produceCar() {
        return new TwoPowerCar();
    }

    @Override
    public Navigator produceNavigator() {
        return new GPSNavigator();
    }
}
