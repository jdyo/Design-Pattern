package Abstract_Factory;

/**
 * @description:
 * @Author: jdyo
 * @date: 2018/5/5-14:23
 */
public class InterCPUFactory implements Provider {
    @Override
    public CPUFactory createCPUFactory() {
        return new IntelCPU();
    }
}
