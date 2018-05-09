package Abstract_Factory;

/**
 * @description:
 * @Author: jdyo
 * @date: 2018/5/5-14:27
 */
public class AMDCPUFactory implements Provider {
    @Override
    public CPUFactory createCPUFactory() {
        return new AMDCPU();
    }
}
