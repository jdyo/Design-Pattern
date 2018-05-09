package Builder.example;

/**
 * @description:
 * @Author: jdyo
 * @date: 2018/5/5-15:38
 */
public interface Builder {
    void buildFrame();

    void buildEngine();

    void buildWheel();

    void buildSteeringWheels();
    Car buildCar();
}
