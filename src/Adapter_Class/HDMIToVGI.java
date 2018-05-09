package Adapter_Class;

/**
 * @description:将HDMI接口转换为VGI,这就是适配器
 * @Author: jdyo
 * @date: 2018/5/5-16:58
 */
public class HDMIToVGI implements VGIPort{
    HDMIPort hdmiPort;
    public HDMIToVGI(HDMIPort hdmiPort) {
        this.hdmiPort = hdmiPort;
    }
    @Override
    public void workByVGI() {
        hdmiPort.workByHDMI();
    }
}
