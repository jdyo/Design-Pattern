package Builder;

/**
 * @description:
 * @Author: jdyo
 * @date: 2018/5/5-15:26
 */
public class test {
    public static void main(String[] args) {
        //只需要关心具体建造者,无需关心产品内部构建流程。
        //如果需要其他的复杂产品对象，只需要选择其他的建造者.
        Builder builder = new ConcreteBuilder();
        //把建造者注入指导者
        Director director = new Director(builder);
        //指导者负责流程把控
        director.buildProduct();
        // 建造者返回一个组合好的复杂产品对象
        Product product = builder.buildProduct();
    }
}
