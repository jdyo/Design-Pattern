package MultiThreading;

/**
 * @description:
 * @Author: jdyo
 * @date: 2018/5/6-16:04
 */
public class synchronize {

    public static void main(String[] args) throws InterruptedException {
        int i=0;
        ObjA o=new ObjA(i);
        TheThread2 theThread1=new TheThread2(o);
        TheThread2 theThread2=new TheThread2(o);
        theThread1.start();
        theThread2.start();
    }
}
class TheThread2 extends Thread{
    private ObjA objA;
    public TheThread2(ObjA objA){
        this.objA=objA;
    }
    public void run(){
        objA.method();
    }
}

class ObjA{
    int i;
    public ObjA(int i){
        this.i=i;
    }
    synchronized public void method(){
        for(int j=0;j<50;j++){
            i++;
            System.out.println(i);
        }
    }
}