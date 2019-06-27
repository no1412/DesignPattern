package designPattern.factoryMethod;

import designPattern.factoryMethod.factory.Mi8MobileFactory;
import designPattern.factoryMethod.factory.MiMobileFactory;
import designPattern.factoryMethod.model.MiMobile;

/**
 * 工厂方式测试
 */
public class Test {

    public static void main(String[] args) {
        MiMobileFactory miMobileFactory = new Mi8MobileFactory();
        MiMobile miMobile = miMobileFactory.create();
        miMobile.call();
    }
}
