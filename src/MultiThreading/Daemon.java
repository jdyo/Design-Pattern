package MultiThreading;

/**
 * @description:
 * @Author: jdyo
 * @date: 2018/5/6-15:40
 */
public class Daemon {
    public static void main(String[] args) throws InterruptedException {
        TheThread theThread=new TheThread();
        theThread.setDaemon(true);//设置守护线程
        theThread.start();
        Thread.sleep(5000);
        System.out.println("全都退出啦");
    }
    public static class TheThread extends Thread{
        public void run(){
            int i = 0;
            while (true){
                i++;
                System.out.println(Thread.currentThread().getId()+":"+i);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println("interrupt");
                    e.printStackTrace();
                }
            }
        }
    }
}
