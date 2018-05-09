package Template_Method.example;

//抽象检测类(抽象模板方法)
abstract class AbstractCheck {
    abstract void startup();
    abstract void speeup();
    abstract void brake();
    abstract void stop();
    //防止子类覆盖使用final修饰
    public final void check(){
        startup();
        speeup();
        brake();
        stop();
    }

}
//检测911
class Porsche911 extends AbstractCheck {
    @Override
    void startup() {
        System.out.println("检测911启动");
    }
    @Override
    void speeup() {
        System.out.println("检测911加速");
    }
    @Override
    void brake() {
        System.out.println("检测911刹车");
        //检测方法标准
        System.out.println("911刹车合格");
    }
    @Override
    void stop() {
        System.out.println("检测911熄火");
    }
}
//检测Cayma类
//检测911
class Cayma extends AbstractCheck {
    @Override
    void startup() {
        System.out.println("检测Cayma启动");
    }
    @Override
    void speeup() {
        System.out.println("检测Cayma加速");
    }
    @Override
    void brake() {
        System.out.println("检测Cayma刹车");
        //检测方法标准
        System.out.println("Cayma刹车合格");
    }
    @Override
    void stop() {
        System.out.println("检测Cayma熄火");
    }
}

public class Main {

    public static void main(String[] args) {
        AbstractCheck ac = new Porsche911();
        //开始检测911
        ac.check();
        //检测Cayma
        AbstractCheck cayma = new Cayma();
        cayma.check();
    }

}
