package eventBus;

import com.google.common.eventbus.Subscribe;

public class MyObserver1 {
    @Subscribe
    public void func1 (String msg) {
        System.out.println("MyObserver1 func1: " + msg);
    }

    @Subscribe
    public void func2 (Integer i) {
        System.out.println("MyObserver1 func2: " + i);
    }

//    @Subscribe
    public void func3 () {
        System.out.println("MyObserver1 func3: wake up");
    }

    public void func4 () {
        System.out.println("MyObserver1 func4: wake up");
    }
}
