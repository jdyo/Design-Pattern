package Abstract_Factory.example;

/**
 * @description:
 * @Author: jdyo
 * @date: 2018/5/5-14:48
 */
public class BenzFactory implements Provider {
    @Override
    public CarFactory createFactory() {
        return new Benz();
    }
}
