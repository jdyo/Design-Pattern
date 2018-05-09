package Facade;


/**
 * @description:模拟电脑启动，
 * 假设电脑启动顺序：启动CPU，启动内存，启动硬盘，加载数据等。
 * @Author: jdyo
 * @date: 2018/5/5-17:38
 */
public class Computer {
    CPU cpu;
    Memory memory;
    Disk disk;

    public Computer(){
        cpu = new CPU();
        memory = new Memory();
        disk = new Disk();
    }

    public void start(){
        cpu.startup();
        memory.startup();
        disk.startup();
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        //启动computer是个很复杂的过程,我们并不需要知道其启动各个子系统的加载过程
        //只需要调用computer为各个子系统提供统一的一个接口start()就可以启动computer了
        computer.start();
    }
}
class CPU {

    public void startup(){
        System.out.println("启动CPU");
    }
}
class Memory {

    public void startup(){
        System.out.println("启动内存");
    }
}
class Disk {

    public void startup(){
        System.out.println("启动硬盘");
    }
}