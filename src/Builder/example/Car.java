package Builder.example;

/**
 * @description:
 * @Author: jdyo
 * @date: 2018/5/5-15:40
 */
public class Car {
    //frame
    String frame;
    //engine
    String engine;
    //wheel
    String wheel;
    //steering wheels,方向盘
    String steeringWheels;

    @Override
    public String toString() {
        return "frame:"+frame+"\t\n"+
                "engine:"+engine+"\t\n"+
                "wheel:"+wheel+"\t\n"+
                "steeringWheels:"+steeringWheels;
    }
}
