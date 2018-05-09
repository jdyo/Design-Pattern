package Abstract_Factory.example;

/**
 * @description:
 * @Author: jdyo
 * @date: 2018/5/5-14:58
 */
public class Porsche implements CarFactory {
    @Override
    public void createCar() {
        System.out.println("生产保时捷汽车");
    }
}
