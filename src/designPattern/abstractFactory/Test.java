package designPattern.abstractFactory;

import designPattern.abstractFactory.factory.MZMobileFactory;
import designPattern.abstractFactory.factory.MiMobileFactory;
import designPattern.abstractFactory.factory.MobileAbstractFactory;

/**
 * 抽象工厂方式测试
 */
public class Test {

    public static void main(String[] args) {
        MobileAbstractFactory miAbstractFactory = new MiMobileFactory();
        miAbstractFactory.createEarPhone().listening();
        miAbstractFactory.createMobile().call();

        MobileAbstractFactory mzAbstractFactory = new MZMobileFactory();
        mzAbstractFactory.createEarPhone().listening();
        mzAbstractFactory.createMobile().call();

    }
}
