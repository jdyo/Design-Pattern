package MultiThreading;

/**
 * @description:
 * @Author: jdyo
 * @date: 2018/5/6-14:58
 */
public class wait_notify {
    final static Object object=new Object();
    public static class T1 extends Thread{
        public void run(){
            synchronized (object){
                System.out.println(System.currentTimeMillis()+"：T1 start");
                try {
                    System.out.println(System.currentTimeMillis()+"：T1 waite");
                    object.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(System.currentTimeMillis()+"：T1 end");
            }
        }
    }
    public static class T2 extends Thread{
        public void run(){
            synchronized (object){
                System.out.println(System.currentTimeMillis()+"：T2 start");
                object.notify();
                System.out.println(System.currentTimeMillis()+"：T2 end");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void main(String[] args){
        Thread thread1=new T1();
        Thread thread2=new T2();
        thread1.start();
        thread2.start();
    }
}
