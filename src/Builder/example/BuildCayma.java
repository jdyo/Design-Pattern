package Builder.example;

/**
 * @description:
 * @Author: jdyo
 * @date: 2018/5/5-15:46
 */
public class BuildCayma implements Builder{
    Car car=new Car();
    @Override
    public void buildFrame() {
        System.out.println("生产Cayma的车骨架");
        car.frame="Cayma";
    }

    @Override
    public void buildEngine() {
        System.out.println("生产Cayma的车引擎");
        car.engine="Cayma";
    }

    @Override
    public void buildWheel() {
        System.out.println("生产Cayma的车轮子");
        car.wheel="Cayma";
    }

    @Override
    public void buildSteeringWheels() {
        System.out.println("生产Cayma的车方向盘");
        car.steeringWheels="Cayma";
    }

    @Override
    public Car buildCar() {
        return car;
    }
}
