package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author simple_huang@foxmail.com on 2017/9/20.
 */
public class Convert {
    public static void main(String[] args) {
        String[] strArray = new String[]{"a", "b", "c"};
        List<String> preList = Arrays.asList(strArray);
        Stream stream = preList.stream();
        List<String> list = (List<String>) stream.collect(Collectors.toList());
        System.out.println(list);
    }
}
