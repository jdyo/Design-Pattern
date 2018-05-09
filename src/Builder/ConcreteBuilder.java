package Builder;

/**
 * @description:具体生产者
 * @Author: jdyo
 * @date: 2018/5/5-15:22
 */
public class ConcreteBuilder implements Builder {
    Product product;
    @Override
    public void buildPartA() {

    }
    @Override
    public void buildPartB() {

    }
    @Override
    public void buildPartC() {

    }
    @Override
    public Product buildProduct() {
        return product;
    }
}
