package Abstract_Factory;

/**
 * @description:IntelCPU工厂
 * @Author: jdyo
 * @date: 2018/5/5-14:18
 */
public class IntelCPU implements CPUFactory {
    @Override
    public void createCPU() {
        System.out.println("Intel CPU");
    }
}
