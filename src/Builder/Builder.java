package Builder;

/**
 * @description:抽象生产者
 * @Author: jdyo
 * @date: 2018/5/5-15:20
 */
public interface Builder {
    void buildPartA();
    void buildPartB();
    void buildPartC();

    Product buildProduct();
}
