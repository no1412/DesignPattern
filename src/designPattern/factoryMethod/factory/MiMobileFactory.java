package designPattern.factoryMethod.factory;

import designPattern.factoryMethod.model.MiMobile;

/**
 * 小米手机工厂接口
 */
public interface MiMobileFactory {
    /**
     * 生产小米手机
     * @return 生产的小米手机
     */
    MiMobile create();
}
