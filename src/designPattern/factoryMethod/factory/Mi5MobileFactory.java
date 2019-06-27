package designPattern.factoryMethod.factory;

import designPattern.factoryMethod.model.Mi5Mobile;
import designPattern.factoryMethod.model.MiMobile;

/**
 * 小米5手机工厂
 */
public class Mi5MobileFactory implements MiMobileFactory {

    @Override
    public MiMobile create() {
        return new Mi5Mobile();
    }
}
