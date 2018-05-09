package Strategy;

/**
 * @description:具体算法,除法
 * @Author: jdyo
 * @date: 2018/5/5-23:11
 */
public class OperationDivide implements Strategy{

    @Override
    public int calculate(int num1, int num2) {
        int res=0;
        try {
            res=num1/num2;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }
}
