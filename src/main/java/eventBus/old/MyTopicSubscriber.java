package eventBus.old;

public class MyTopicSubscriber implements Observer {
    private Subject myTopic;
    private String name;

    public MyTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String msg = (String) myTopic.getUpdate(this);
        System.out.println(msg);
    }

    @Override
    public void setSubject(Subject subject) {
        myTopic = subject;
    }
}
