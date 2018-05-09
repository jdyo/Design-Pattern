package Observer;

import java.util.ArrayList;

/**
 * @description:
 * @Author: jdyo
 * @date: 2018/5/5-22:37
 */
public class ConcreteSubject implements Subject {
    ArrayList<Observer> observers = new ArrayList<>();
    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update();
        }
    }

    public void doSomeThings(){
        //doSomeThings
        notifyObservers();//通知观察者
    }
}
