package eventBus.old;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject {
    private List<Observer> observers;
    private boolean changed;
    private String msg;

    public MyTopic() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        if (observer == null) {
            throw new NullPointerException("null");
        }
        if (!observers.contains(observer)) {
            observers.add(observer);
            observer.setSubject(this);
        }
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        if (!changed) {
            return;
        }
        changed = false;
        for (Observer observer: observers) {
            observer.update();
        }
    }

    @Override
    public Object getUpdate(Observer observer) {
        return "hi, " + observer.toString() + ": " + msg;
    }

    public void postMessage(String msg) {
        this.msg = msg;
        changed = true;
        notifyObservers();
    }
}
