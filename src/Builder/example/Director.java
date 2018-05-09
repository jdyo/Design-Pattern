package Builder.example;

/**
 * @description:
 * @Author: jdyo
 * @date: 2018/5/5-15:43
 */
public class Director {
    Builder builder;
    //由具体的生产者来生产产品
    public Director(Builder builder) {
        this.builder = builder;
    }
    //生产流程
    public void buildProduct(){
        builder.buildEngine();
        builder.buildFrame();
        builder.buildSteeringWheels();
        builder.buildWheel();
    }
}
