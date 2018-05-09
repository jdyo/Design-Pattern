package Abstract_Factory;

/**
 * @description:AMDCPU工厂
 * @Author: jdyo
 * @date: 2018/5/5-14:20
 */
public class AMDCPU implements CPUFactory{
    @Override
    public void createCPU() {
        System.out.println("AMD CPU");
    }
}
