package designPattern.simpleFactory.model;

/**
 * 小米5手机
 */
public class Mi5Mobile implements MiMobile {
    @Override
    public void call() {
        System.out.println("Mi5 calling...");
    }
}
