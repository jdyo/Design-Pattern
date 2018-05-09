package Singleton;

/**
 * @description:懒汉式单例
 * 是指在方法调用获取实例时才创建实例，因为相对饿汉式显得“不急迫”，所以被叫做“懒汉模式”。
 * @Author: jdyo
 * @date: 2018/5/4-23:33
 */
 class Singleton {
    //定义一个属性,用来保存Singleton类对象的实例
    //使用volatile关键字保其可见性
    volatile private static Singleton instance=null;
    //私有构造器,该类不能被外部类使用new方式实例化
    private Singleton(){
    }
    //外部通过该方法获取Singleton类的唯一实例，单线程实现方式
    public static Singleton getInstance(){
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    //多线程实现方式
    public static Singleton getInstance2() {
        //synchronized加锁同步会降低效率,这里先判断是否为空
        //不为空则不需要加锁,提高程序效率
        if (instance == null) {
            synchronized (Singleton.class) {
                if(instance == null) {//二次检查
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
//饿汉式单例是指在方法调用前，实例就已经创建好了。
class hungrySingleton {
    private static hungrySingleton instance = new hungrySingleton();
    private hungrySingleton(){}

    public static hungrySingleton getInstance() {
        return instance;
    }
}

public class Main extends Thread{
    @Override
    public void run() {
        System.out.println(Singleton.getInstance().hashCode());
    }
    public static void multiThreading(){
        Main[] multiInstance=new Main[10];
        for(int i=0;i<10;i++){
            multiInstance[i]=new Main();
        }
        for(int i=0;i<10;i++){
            multiInstance[i].start();
        }
    }
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        //判断两个实例s1 s2是否为同一个实例
        System.out.println(s1 == s2);

        multiThreading();
    }

}
