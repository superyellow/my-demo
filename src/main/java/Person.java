import java.util.List;

/**
 * Created by simple_huang@foxmail.com on 2017/7/31.
 */

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        PersonFactory<Person> personFactory = Person::new;
        Person person = personFactory.create("tom", 21);
        System.out.println(person.name + " " + person.age + "岁");
    }
}

interface PersonFactory<P extends Person> {
    P create(String name, int age);
}
