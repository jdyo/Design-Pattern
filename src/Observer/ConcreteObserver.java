package Observer;

/**
 * @description:
 * @Author: jdyo
 * @date: 2018/5/5-22:41
 */
public class ConcreteObserver implements Observer {
    @Override
    public void update() {
        System.out.println("我观察到subject发生了某事");
    }
}
