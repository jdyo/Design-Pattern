package Abstract_Factory.example;

/**
 * @description:
 * @Author: jdyo
 * @date: 2018/5/5-14:59
 */
public class Main {
    public static void main(String[] args){
        //创建一个生产奔驰工厂的工厂
        Provider benzFactoryProvider=new BenzFactory();
        //创建一个生产拖拉机工厂的工厂
        Provider tractorFactoryProvider=new TractorFactory();
        //创建一个生产保时捷工厂的工厂
        Provider porscheFactoryProvider=new PorscheFactory();
        //创建一个奔驰工厂
        CarFactory benzFactory=benzFactoryProvider.createFactory();
        //创建一个拖拉机工厂
        CarFactory tractoryFactory=tractorFactoryProvider.createFactory();
        //创建一个保时捷工厂
        CarFactory porchsFactory=porscheFactoryProvider.createFactory();
        //用奔驰工厂生产奔驰
        benzFactory.createCar();
        //用拖拉机工厂生产拖拉机
        tractoryFactory.createCar();
        //用保时捷工厂生产保时捷
        porchsFactory.createCar();

    }
}
