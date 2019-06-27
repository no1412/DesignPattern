package designPattern.abstractFactory.model;

/**
 * 魅族手机
 */
public class MZMobile implements Mobile {

    @Override
    public void call() {
        System.out.println("Calling by MZMobile...");
    }
}
