package eventBus;

import com.google.common.eventbus.Subscribe;

public class MyObserver2 {
    @Subscribe
    public void func1 (String msg) {
        System.out.println("MyObserver2 func1: " + msg);
    }
}
