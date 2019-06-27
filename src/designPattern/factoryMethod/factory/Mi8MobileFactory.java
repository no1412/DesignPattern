package designPattern.factoryMethod.factory;

import designPattern.factoryMethod.model.Mi8Mobile;
import designPattern.factoryMethod.model.MiMobile;

/**
 * 小米8手机工厂
 */
public class Mi8MobileFactory implements MiMobileFactory {

    @Override
    public MiMobile create() {
        return new Mi8Mobile();
    }
}
