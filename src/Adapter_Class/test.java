package Adapter_Class;

/**
 * @description:
 * @Author: jdyo
 * @date: 2018/5/5-17:05
 */
public class test {
    public static void main(String[] args) {
        //定义一个HDMI接口
        HDMIPort hdmiPort = new HDMIPort() {
            @Override
            public void workByHDMI() {
                //hdmi接口工作方式
            }
        };
        //将HDMI接口转换为VGI接口
        VGIPort vgiPort = new HDMIToVGI(hdmiPort);
        //经过转换HDMI接口变成了VGI接口
        vgiPort.workByVGI();
    }
}
