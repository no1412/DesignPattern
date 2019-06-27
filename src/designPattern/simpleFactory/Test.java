package designPattern.simpleFactory;

import designPattern.simpleFactory.factory.MiMobileFactory;
import designPattern.simpleFactory.model.MiMobile;

/**
 * 简单工厂方式测试
 */
public class Test {
    public static void main(String[] args) {
        MiMobile mi8 = MiMobileFactory.getMobile("Mi8");
        mi8.call();
    }
}
