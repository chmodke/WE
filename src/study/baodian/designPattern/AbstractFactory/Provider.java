package study.baodian.designPattern.AbstractFactory;

/**
 * Created by kehao on 2016/9/29 21:13.
 * Description：抽象工厂接口
 */
public interface Provider {
    public PowerCar produceCar();
    public Navigator produceNavigator();
}
