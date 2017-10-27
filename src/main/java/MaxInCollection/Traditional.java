package MaxInCollection;

import java.util.*;

/**
 * @author simple_huang@foxmail.com on 2017/10/18.
 */
public class Traditional {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.addAll(Arrays.asList(1, 5, 3, 4));
        if (integers.size()==0) {
            throw new NoSuchElementException();
        }
        int max = integers.get(0);
        for (int i=1;i<integers.size();i++) {
            if (max < integers.get(i)) {
                max = integers.get(i);
            }
        }
        System.out.println(max);

        System.out.println(max(integers));
    }

    /**
     * 提供一个适用所有的
     * @param c
     * @param <T>
     * @return
     */
    public static <T extends Comparable> T max(Collection<T> c) {
        if (c.isEmpty()) throw new NoSuchElementException();
        Iterator<T> iterator = c.iterator();
        T largest = iterator.next();
        while (iterator.hasNext()) {
            T next = iterator.next();
            if (largest.compareTo(next) < 0)
                largest = next;
        }
        return largest;
    }

}
