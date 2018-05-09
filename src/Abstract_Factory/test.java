package Abstract_Factory;

/**
 * @description:
 * @Author: jdyo
 * @date: 2018/5/5-14:27
 */
public class test {
    public static void main(String[] args) {
        //创建一个生产CPU工厂的工厂
        Provider cpufactory = new InterCPUFactory();
        //通过CPU工厂的工厂创建一个IntelCPU工厂
        CPUFactory intelcpu = cpufactory.createCPUFactory();
        //IntelCPU工厂生产intelCPU
        intelcpu.createCPU();
    }
}
