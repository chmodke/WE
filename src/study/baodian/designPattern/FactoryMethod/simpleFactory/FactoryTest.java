package study.baodian.designPattern.FactoryMethod.simpleFactory;

/**
 * Created by kehao on 2016/9/29 20:38.
 * Description：
 */
public class FactoryTest {
    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender1 = factory.produce("sms");
        sender1.Send();

        Sender sender2 = factory.produce("mail");
        sender2.Send();
    }
}
