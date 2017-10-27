package stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author simple_huang@foxmail.com on 2017/10/10.
 */
public class MapValue {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        List<KeyClass> list = new ArrayList<>();
        List<String> strList = list.stream().map(keyClass ->{
            String value = map.get(keyClass.i);
            return value;
        }).collect(Collectors.toList());
    }
}

class KeyClass{
    Integer i;
}
