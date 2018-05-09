package MultiThreading;

/**
 * @description:
 * @Author: jdyo
 * @date: 2018/5/6-16:36
 */
public class volatiled {
    static volatile int i=0,n=0;
    public static void main(String[] args){
        Thread t1=new Thread(new TheThread());
        Thread t2=new Thread(new TheThread());
        t1.start();
        t2.start();
    }
    static class TheThread implements Runnable{
        public void run() {
            for(int i=0;i<100;i++){
                n++;
                System.out.println(Thread.currentThread().getName()+"->i:"+i+"->n:"+n);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
