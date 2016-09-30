package study.baodian.designPattern.FactoryMethod.simpleFactory;

/**
 * Created by kehao on 2016/9/29 20:30.
 * Description：
 */
public class SmsSender implements Sender {

    @Override
    public void Send() {
        System.out.println("this is sms sender!");
    }
}

