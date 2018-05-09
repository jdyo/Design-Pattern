package Strategy;

/**
 * @description:
 * @Author: jdyo
 * @date: 2018/5/5-23:17
 */
public class test {
    public static void main(String[] args) {
        //计算 1 + 1
        Context context = new Context(new OperationAdd());
        System.out.println("1 + 1 = " + context.calculate(1,1));
        //计算 1 - 1
        context = new Context(new OperationSubstract());
        System.out.println("1 - 1 = " +context.calculate(1,1));
    }
}
