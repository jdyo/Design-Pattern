package Strategy;

/**
 * @description:具体算法,加法
 * @Author: jdyo
 * @date: 2018/5/5-23:09
 */
public class OperationAdd implements Strategy {
    @Override
    public int calculate(int num1, int num2) {
        return num1+num2;
    }
}
