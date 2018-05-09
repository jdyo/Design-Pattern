package MultiThreading;

/**
 * @description:
 * @Author: jdyo
 * @date: 2018/5/6-16:38
 */
public class unsafe {
    static int  n=0;
    static volatile int  m=0;

    public static void main(String[] args) throws InterruptedException {
        TheThread theThread1=new TheThread();
        TheThread theThread2=new TheThread();
        theThread1.start();
        theThread2.start();
    }
   //volatile static int  i=0,n= 0;
    public static class TheThread extends Thread{
        public void run(){
            for(int i=0;i<100;i++){
                n++;
                m++;
                System.out.println(Thread.currentThread().getId()+"->i:"+i+"-n:"+n+"->m："+m);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
