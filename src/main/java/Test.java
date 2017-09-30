import org.springframework.beans.BeanUtils;
import org.springframework.core.convert.converter.Converter;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by simple_huang@foxmail.com on 2017/7/26.
 */
public class Test {
    public static void main(String[] args) {
//        TestBeanSource tbs = new TestBeanSource();
//        tbs.setName("黄超");
//        tbs.setId(1l);
//        TestBeanTarget tbt = new TestBeanTarget();
//        BeanUtils.copyProperties(tbs, tbt);
//        System.out.println(tbt.getName());
//        System.out.println(tbt.getId());
//
////        List<TestBeanSource> testBeanSourceList = new ArrayList<TestBeanSource>();
////        testBeanSourceList.add(new TestBeanSource(1l, "xiao", 222));
////        testBeanSourceList.add(new TestBeanSource(2l, "lips", 333));
////        testBeanSourceList.add(new TestBeanSource(3l, "coffee", 444));
////        List<TestBeanTarget> testBeanTargetList = new ArrayList<TestBeanTarget>();
////        BeanUtils.copyProperties(testBeanSourceList, testBeanTargetList);
////        for (TestBeanTarget tbt : testBeanTargetList) {
////            System.out.println(tbt);
////        }
//        String[] strs = {"tom", "jim", "har"};
//        List<String> wordList = Arrays.asList(strs);
//        List<String> output = wordList.stream().map(String::toUpperCase).collect(Collectors.toList());
//        System.out.println(output);
//
//        StringBuilder sb = new StringBuilder();
////        wordList.stream().map( -> );
//        System.out.println(sb.toString());
//
//        Map<String, String> map = new HashMap();
//        map.put("1", "huang");
//        map.values().stream().map(s -> {
//            System.out.println(s);
//            return s;
//        });

        String[] strs = {"java8", "is", "easy", "to", "use", "use"};
        List<String> distinctStrs1 = Arrays.stream(strs).distinct().collect(Collectors.toList());
        System.out.println(distinctStrs1);

        List<String> distinctStrs2 = Arrays.stream(strs)
                .map(str -> str.split(""))  // 映射成为Stream<String[]>
                .flatMap(Arrays::stream)  // 扁平化为Stream<String>
                .distinct()
                .collect(Collectors.toList());
        System.out.println(distinctStrs2);


        Converter<String, Integer> converter = Integer::valueOf;
        Integer converted = converter.convert("12" + "3");
        System.out.println(converted);
    }


}
