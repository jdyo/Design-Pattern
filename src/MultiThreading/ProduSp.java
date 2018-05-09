package MultiThreading;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @description:
 * @Author: jdyo
 * @date: 2018/5/6-17:37
 */
public class ProduSp {
    public static void main(String[] args){
        ProduSp ps=new ProduSp();
        midPro midpro=ps.new midPro();
        ExecutorService threadPool = Executors.newCachedThreadPool();
        Productor p1=ps.new Productor(midpro);
        Productor p2=ps.new Productor(midpro);
        Productor p3=ps.new Productor(midpro);
        Consumers c1=ps.new Consumers(midpro);
        threadPool.submit(p1);
        threadPool.submit(p2);
        threadPool.submit(p3);
        threadPool.submit(c1);
    }
    volatile int count=0;
    class midPro{
        BlockingQueue<Product> blockingQueue=new LinkedBlockingQueue<Product>(4);
        public void put(Product product){
            try {
                count+=1;
                blockingQueue.put(product);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        public Product get() throws InterruptedException {
            count-=1;
            return blockingQueue.take();
        }
    }
    class Productor implements Runnable{
        private midPro midpro=null;
        public Productor(midPro midpro){
            this.midpro=midpro;
        }
        public void run() {
            while (true){
                Product product=new Product();
                midpro.put(product);
                System.out.println(Thread.currentThread().getId()+":生产者生产"+count);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    class Consumers implements Runnable{
        private midPro midpro=null;
        public Consumers(midPro midpro){
            this.midpro=midpro;
        }
        public void run() {
            while(true){
                try {
                    midpro.get();
                    System.out.println(Thread.currentThread().getId()+":消费者消费"+count);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    class Product{
    }
}
