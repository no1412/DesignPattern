package designPattern.abstractFactory.factory;

import designPattern.abstractFactory.model.EarPhone;
import designPattern.abstractFactory.model.MZEarPhone;
import designPattern.abstractFactory.model.MZMobile;
import designPattern.abstractFactory.model.Mobile;

/**
 * 魅族手机工厂
 */
public class MZMobileFactory implements MobileAbstractFactory {

    @Override
    public Mobile createMobile() {
        return new MZMobile();
    }

    @Override
    public EarPhone createEarPhone() {
        return new MZEarPhone();
    }
}
