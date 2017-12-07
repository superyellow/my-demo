package stream;

import java.util.ArrayList;
import java.util.List;

/**
 * @author simple_huang@foxmail.com on 2017/11/3.
 */
public class MapToInt {
    public static void main(String[] args) {
        TestClass test1 = new TestClass(1, 2);
        TestClass test2 = new TestClass(5, 6);
        TestClass test3 = new TestClass(8, 9);
        List<TestClass> testList = new ArrayList<>();
        testList.add(test1);
        testList.add(test2);
        testList.add(test3);
        int[] testArray = testList.stream().mapToInt(TestClass::getValue1).distinct().toArray();
        for (int i: testArray) {
            System.out.println(i);
        }
    }
}
