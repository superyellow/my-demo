/**
 * @author simple_huang@foxmail.com on 2017/9/20.
 */
public class ExtendsAndSuper {
    public static void main(String[] args) {
        Plate<? extends Fruit> fruitPlate = new Plate<>(new Apple());
        //fruitPlate.setT(new Orange());
        fruitPlate.getT().say();

        Plate<? super Fruit> fruitPlate1 = new Plate<>(new Apple());
        Apple apple = (Apple) fruitPlate1.getT();
        apple.say();

    }
}

class Food {
    void say() {
        System.out.println("i'm food");
    }
}

class Fruit extends Food{
    @Override
    void say() {
        System.out.println("i'm fruit");
    }
}

class Apple extends Fruit {
    @Override
    void say() {
        System.out.println("i'm apple");
    }
}

class Orange extends Fruit {
    @Override
    void say() {
        System.out.println("i'm orange");
    }
}

class Plate<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public Plate(T t) {
        this.t = t;
    }
}