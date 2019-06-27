package designPattern.abstractFactory.model;

/**
 * 魅族耳机
 */
public class MZEarPhone implements EarPhone {

    @Override
    public void listening() {
        System.out.println("Listening music by MZEarPhone...");
    }
}
