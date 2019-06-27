package designPattern.abstractFactory.factory;

import designPattern.abstractFactory.model.EarPhone;
import designPattern.abstractFactory.model.MiEarPhone;
import designPattern.abstractFactory.model.MiMobile;
import designPattern.abstractFactory.model.Mobile;

/**
 * 小米手机工厂
 */
public class MiMobileFactory implements MobileAbstractFactory {

    @Override
    public Mobile createMobile() {
        return new MiMobile();
    }

    @Override
    public EarPhone createEarPhone() {
        return new MiEarPhone();
    }
}
