package eventBus;

import com.google.common.eventbus.EventBus;

public class EventBusCenter {
    private static EventBus eventBus = new EventBus();

    public static EventBus getInstance() {
        return eventBus;
    }

    public static void register(Object obj) {
        eventBus.register(obj);
    }

    public static void unregister(Object obj) {
        eventBus.unregister(obj);
    }

    public static void post(Object obj) {
        eventBus.post(obj);
    }

    public static void main(String[] args) {
        MyObserver1 o1 = new MyObserver1();
        MyObserver2 o2 = new MyObserver2();

        register(o1);
        register(o2);

        post(1);
        System.out.println("============");
        post("hello");
        System.out.println("============");
        unregister(o2);
        post("!!!");
        System.out.println("============");

    }
}
