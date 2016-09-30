package study.baodian.designPattern.FactoryMethod.staticFactory;


import study.baodian.designPattern.FactoryMethod.simpleFactory.MailSender;
import study.baodian.designPattern.FactoryMethod.simpleFactory.Sender;
import study.baodian.designPattern.FactoryMethod.simpleFactory.SmsSender;

/**
 * Created by kehao on 2016/9/29 20:36.
 * Description：静态工厂模式
 */
public class SendFactory {
    public static Sender produceMail() {
        return new MailSender();
    }

    public static Sender produceSms() {
        return new SmsSender();
    }
}
