package Factory_Method;

/**
 * @description:
 * 1.很多工厂都有一些相同的行为，比如汽车工厂。
 * 我们需要抽象这些相同的行为成接口，每个工厂都实现这个接口。
 * @Author: jdyo
 * @date: 2018/5/5-14:01
 */
public interface IFactory {
    public void createProduct();
}
