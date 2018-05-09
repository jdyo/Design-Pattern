package Factory_Method.example;

/**
 * @description:汽车工厂
 * @Author: jdyo
 * @date: 2018/5/5-14:07
 */
interface CarFactory {
    void productCar();
}
//保时捷工厂
class PorscheFactory implements CarFactory {
    @Override
    public void productCar() {
        System.out.println("生产保时捷汽车");
    }
}
//拖拉机工厂
class TractorFactory implements CarFactory {
    @Override
    public void productCar() {
        System.out.println("生产拖拉机");
    }
}
// 奔驰汽车工厂
class BenzFactory implements CarFactory {
    @Override
    public void productCar() {
        System.out.println("生产奔驰汽车");
    }
}
public class Main {

    public static void main(String[] args) {
        //保时捷工厂生产保时捷
        CarFactory pf = new PorscheFactory();
        pf.productCar();
        //拖拉机工厂生产拖拉机
        CarFactory tf = new TractorFactory();
        tf.productCar();
        // 奔驰工厂生产奔驰
        CarFactory bf = new BenzFactory();
        bf.productCar();
    }

}
