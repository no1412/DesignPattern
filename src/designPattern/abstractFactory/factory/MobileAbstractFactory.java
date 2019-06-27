package designPattern.abstractFactory.factory;

import designPattern.abstractFactory.model.EarPhone;
import designPattern.abstractFactory.model.Mobile;

public interface MobileAbstractFactory {

    /**
     * 生产手机
     * @return
     */
    Mobile createMobile();

    /**
     * 生产耳机
     * @return
     */
    EarPhone createEarPhone();
}
