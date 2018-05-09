package Observer;

/**
 * @description:
 * @Author: jdyo
 * @date: 2018/5/5-22:35
 */
public interface Subject {
    //添加观察者
    void attach(Observer o);
    //删除观察者
    void detach(Observer o);
    //通知观察者
    void notifyObservers();
    //发生某事
    void doSomeThings();
}
