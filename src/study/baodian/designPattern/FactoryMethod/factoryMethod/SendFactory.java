package study.baodian.designPattern.FactoryMethod.factoryMethod;

import study.baodian.designPattern.FactoryMethod.simpleFactory.MailSender;
import study.baodian.designPattern.FactoryMethod.simpleFactory.Sender;
import study.baodian.designPattern.FactoryMethod.simpleFactory.SmsSender;

/**
 * Created by kehao on 2016/9/29 20:36.
 * Description：工厂方法模式
 */
public class SendFactory {
    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }
}
