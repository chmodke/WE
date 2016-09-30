package study.baodian.designPattern.AbstractFactory;

/**
 * Created by kehao on 2016/9/29 22:15.
 * Description：
 */
public class GPSNavigator implements Navigator{
    @Override
    public void navMode() {
        System.out.println("GPSNavigator");
    }
}
