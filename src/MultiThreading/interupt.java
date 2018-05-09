package MultiThreading;

/**
 * @description:
 * @Author: jdyo
 * @date: 2018/5/6-14:43
 */
public class interupt {
    public static void interupt1() throws InterruptedException {
        Thread thread1=new Thread(new TheThread(),"thread1");
        thread1.start();
        Thread.sleep(2);
        thread1.interrupt();
    }
    public static void interupt2(){
        try{
            Thread thread1=new Thread(new TheThread(),"thread1");
            thread1.start();
            Thread.sleep(2);
            thread1.interrupt();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws InterruptedException {
        interupt1();
        interupt2();
    }
}
class TheThread extends Thread{
    public void run() {
        super.run();
        for (int i = 0; i < 100; i++) {
            if(this.interrupted()){
                break;
            }
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}