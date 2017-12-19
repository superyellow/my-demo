package data.algorithms;

import java.util.*;
import java.util.function.UnaryOperator;

/**
 * @author simple_huang@foxmail.com on 2017/12/19.
 */
public class MyArrayListV2<E> extends AbstractList<E>{
    private static final Object[] EMPTY_ELEMENTDATA = {};
    transient Object[] elementData;
    private int size;

    public MyArrayListV2() {
        this.elementData = EMPTY_ELEMENTDATA;
    }

    public MyArrayListV2(int initialCapacity) {
        if (initialCapacity > 0) {
            this.elementData = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            this.elementData = EMPTY_ELEMENTDATA;
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
        }
    }

    public MyArrayListV2(Collection<? extends E> c) {
        elementData = c.toArray();
        if ((size = elementData.length) != 0) {
            if (elementData.getClass() != Object[].class) {
                elementData = Arrays.copyOf(elementData, size, Object[].class);
            }
        } else {
            this.elementData = EMPTY_ELEMENTDATA;
        }
    }

    private void ensureCapacityInternal(int minCapacity) {
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E get(int index) {
        return null;
    }

    public static void main(String[] args) {
        Collection cc = new ArrayList();
        cc.add(1);
        List<String> strs = new MyArrayListV2<>(cc);
        System.out.println(strs.size());
    }

}
