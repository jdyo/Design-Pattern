package Abstract_Factory.example;

/**
 * @description:
 * @Author: jdyo
 * @date: 2018/5/5-14:56
 */
public class TractorFactory implements Provider {
    @Override
    public CarFactory createFactory() {
        return new Tractor();
    }
}
