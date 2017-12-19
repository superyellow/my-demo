package data.algorithms;


import java.util.Arrays;
/**
 * @author simple_huang@foxmail.com on 2017/10/27.
 */
public class MyArrayList<E> {
    private Object[] elementData;
    private static final int DEFAULT_CAPACITY = 10;
    private int capacity = DEFAULT_CAPACITY;
    private int size;

    public MyArrayList() {
        elementData = new Object[10];
    }

    public void add(E e) {
        autoIncreaseCapacity();
        elementData[size] = e;
        size++;
    }

    public E get(int i) {
        return (E) elementData[i];
    }

    public E remove(int i) {
        autoCutCapacity();
        E oldValue = (E) elementData[i];
        System.arraycopy(elementData, i+1, elementData, i, size-i-1);
        size--;
        return oldValue;
    }

    public void autoIncreaseCapacity() {
        if ((float)(capacity - size)/capacity < 0.25) {
            capacity = (int) (capacity * 1.5);
            elementData = Arrays.copyOf(elementData, capacity);
        }
    }

    public void autoCutCapacity() {
        if ((float)(capacity - size)/capacity > 0.5) {
            capacity = (int) (capacity / 1.25);
            System.arraycopy(elementData, 0, elementData, 0, capacity);
        }
    }

    private int size() {
        return size;
    }

    public void print() {
        for (int i=0; i<size; i++) {
            E e = (E)elementData[i];
            System.out.print(e.toString() + " ");
        }
    }

    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        for (int i=0; i<100; i++) {
            list.add(i);
            System.out.println(list.get(i));
        }

        for (int i=0; i<80; i++) {
            list.remove(1);
            System.out.println(list.capacity);
        }

        int z = 0;
        System.out.println(z++);
        System.out.println(++z);
    }

}
