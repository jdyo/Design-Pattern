package Strategy;

/**
 * @description:上下文
 * @Author: jdyo
 * @date: 2018/5/5-23:13
 */
public class Context {
    //持有一个具体策略对象
    private Strategy strategy;

    //传入一个具体策略对象
    public Context(Strategy strategy) {
        this.strategy =strategy;
    }

    public int calculate(int num1,int num2){
        //调用具体策略对象进行算法运算
        return strategy.calculate(num1,num2);
    }

}
