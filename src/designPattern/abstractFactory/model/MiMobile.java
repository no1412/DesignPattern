package designPattern.abstractFactory.model;

/**
 * 小米耳机
 */
public class MiMobile implements Mobile {

    @Override
    public void call() {
        System.out.println("Calling by MiMobile...");
    }
}
