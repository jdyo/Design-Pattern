package Abstract_Factory.example;

/**
 * @description:
 * @Author: jdyo
 * @date: 2018/5/5-14:49
 */
public class Benz implements CarFactory{

    @Override
    public void createCar() {
        System.out.println("生产奔驰汽车");
    }
}
