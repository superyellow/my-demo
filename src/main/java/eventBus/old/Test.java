package eventBus.old;

public class Test {
    public static void main(String[] args) {
        Subject subject = new MyTopic();

        Observer observer1 = new MyTopicSubscriber("o1");
        Observer observer2 = new MyTopicSubscriber("o2");
        Observer observer3 = new MyTopicSubscriber("o3");

        subject.register(observer1);
        subject.register(observer2);
        subject.register(observer3);

        ((MyTopic) subject).postMessage("new msg get");
    }
}
