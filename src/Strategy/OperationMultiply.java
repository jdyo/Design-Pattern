package Strategy;

/**
 * @description:具体算法,乘法
 * @Author: jdyo
 * @date: 2018/5/5-23:10
 */
public class OperationMultiply implements Strategy {
    @Override
    public int calculate(int num1, int num2) {
        return num1*num2;
    }
}
