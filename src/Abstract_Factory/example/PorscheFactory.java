package Abstract_Factory.example;

/**
 * @description:
 * @Author: jdyo
 * @date: 2018/5/5-14:57
 */
public class PorscheFactory implements Provider{

    @Override
    public CarFactory createFactory() {
        return new Porsche();
    }
}
