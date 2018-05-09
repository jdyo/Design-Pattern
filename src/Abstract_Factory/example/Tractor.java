package Abstract_Factory.example;

/**
 * @description:
 * @Author: jdyo
 * @date: 2018/5/5-14:54
 */
public class Tractor implements CarFactory {
    @Override
    public void createCar() {
            System.out.println("生产拖拉机");
    }
}
