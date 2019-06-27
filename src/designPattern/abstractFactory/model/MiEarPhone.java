package designPattern.abstractFactory.model;

/**
 * 小米耳机
 */
public class MiEarPhone implements EarPhone {

    @Override
    public void listening() {
        System.out.println("Listening music by MiEarPhone...");
    }
}
