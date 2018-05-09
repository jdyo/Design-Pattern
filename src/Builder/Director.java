package Builder;

/**
 * @description:指导者,产品生产流程规范
 * @Author: jdyo
 * @date: 2018/5/5-15:25
 */
public class Director {
    Builder builder;
    //由具体的生产者来生产产品
    public Director(Builder builder) {
        this.builder = builder;
    }
    //生产流程
    public void buildProduct(){
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
    }
}
