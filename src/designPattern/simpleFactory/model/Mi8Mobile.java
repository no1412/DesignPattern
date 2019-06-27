package designPattern.simpleFactory.model;

/**
 * 小米8手机
 */
public class Mi8Mobile implements MiMobile {
    @Override
    public void call() {
        System.out.println("Mi8 calling...");
    }
}
