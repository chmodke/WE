package study.baodian.designPattern.AbstractFactory;

/**
 * Created by kehao on 2016/9/29 21:16.
 * Description：产品2工厂
 */
public class BDFourPowerCarFactory implements Provider {

    @Override
    public PowerCar produceCar() {
        return new FourPowerCar();
    }

    @Override
    public Navigator produceNavigator() {
        return new BDNavigator();
    }
}
