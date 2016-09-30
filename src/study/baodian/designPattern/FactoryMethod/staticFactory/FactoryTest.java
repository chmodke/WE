package study.baodian.designPattern.FactoryMethod.staticFactory;


import study.baodian.designPattern.FactoryMethod.simpleFactory.Sender;

/**
 * Created by kehao on 2016/9/29 20:38.
 * Description：
 */
public class FactoryTest {
    public static void main(String[] args) {
        Sender sender1 = SendFactory.produceSms();
        sender1.Send();

        Sender sender2 = SendFactory.produceMail();
        sender2.Send();
    }
}
