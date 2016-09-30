package study.baodian.designPattern.FactoryMethod.simpleFactory;

/**
 * Created by kehao on 2016/9/29 20:28.
 * Description：
 */
public class MailSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is mail sender!");
    }
}
