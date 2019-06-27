package designPattern.simpleFactory.factory;

import designPattern.simpleFactory.model.Mi5Mobile;
import designPattern.simpleFactory.model.Mi8Mobile;
import designPattern.simpleFactory.model.MiMobile;

/**
 * 小米手机工厂
 */
public class MiMobileFactory {

    /**
     * 根据小米手机名称获取小米手机
     * @param name
     * @return
     */
    public static MiMobile getMobile(String name) {
        if ("Mi5".equals(name)) {
            return new Mi5Mobile();
        } else if ("Mi8".equals(name)) {
            return new Mi8Mobile();
        }
        return null;
    }
}
