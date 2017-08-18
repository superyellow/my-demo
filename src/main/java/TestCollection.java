import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by simple_huang@foxmail.com on 2017/8/3.
 */
public class TestCollection {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add(null);
        System.out.println(CollectionUtils.isEmpty(list));

        List<Integer> list1 = Arrays.asList(1, 2, 3);
        Integer num;
        Iterator iterator = list1.iterator();
        while (iterator.hasNext()) {
            System.out.println(num = (Integer)iterator.next());
        }
    }
}
