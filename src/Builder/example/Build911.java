package Builder.example;

/**
 * @description:
 * @Author: jdyo
 * @date: 2018/5/5-15:46
 */
public class Build911 implements Builder{
    Car car=new Car();
    @Override
    public void buildFrame() {
        System.out.println("生产911的车骨架");
        car.frame="911";
    }

    @Override
    public void buildEngine() {
        System.out.println("生产911的车引擎");
        car.engine="911";
    }

    @Override
    public void buildWheel() {
        System.out.println("生产911的车轮子");
        car.wheel="911";
    }

    @Override
    public void buildSteeringWheels() {
        System.out.println("生产911的车方向盘");
        car.steeringWheels="911";
    }

    @Override
    public Car buildCar() {
        return car;
    }
}
