package Observer;

/**
 * @description:
 * @Author: jdyo
 * @date: 2018/5/5-22:41
 */
public class test {
    public static void main(String[] args) {
        Subject cs = new ConcreteSubject();
        //添加观察者
        cs.attach(new ConcreteObserver());
        //subject发生了某事，通知观察者
        cs.doSomeThings();
    }
}
