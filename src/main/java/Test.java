import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.core.convert.converter.Converter;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by simple_huang@foxmail.com on 2017/7/26.
 */
public class Test {
    public String getStr() {
        return "abc";
    }
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

//        String[] strs = {"java8", "is", "easy", "to", "use", "use"};
//        List<String> distinctStrs1 = Arrays.stream(strs).distinct().collect(Collectors.toList());
//        System.out.println(distinctStrs1);
//
//        List<String> distinctStrs2 = Arrays.stream(strs)
//                .map(str -> str.split(""))  // 映射成为Stream<String[]>
//                .flatMap(Arrays::stream)  // 扁平化为Stream<String>
//                .distinct()
//                .collect(Collectors.toList());
//        System.out.println(distinctStrs2);
//
//
//        Converter<String, Integer> converter = Integer::valueOf;
//        Integer converted = converter.convert("12" + "3");
//        System.out.println(converted);
//
//        List list = new ArrayList();
//        System.out.println(list!=null);
//
//        List<String> strList = Arrays.asList(strs);
//        Map<String, Long> result = strList.stream().collect(
//                Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        System.out.println(result);


//        System.out.println(new Random().nextInt());


//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        List<String> strList = list.stream().map(i -> {
//            if (i.equals(1)) {
//                return i + "";
//            } else {
//                return null;
//            }
//        }).filter(s -> s != null).collect(Collectors.toList());
//
//        System.out.println(strList.size());
//
//        Map<Integer, Integer> map = new HashMap<>();
//        map.put(1, 2);
//        map.put(1, 3);
//        System.out.println(map.get(1));
//
//        System.out.println("abc" == new Test().getStr());

//        System.out.println(5l << 1);
//        System.out.println(9l >> 1);

        int length = "😁".length();
        System.out.println("length " + length);
        System.out.println("abc".indexOf("a"));
        System.out.println("abc".indexOf("b"));
        System.out.println("abc".indexOf("c"));
        char[] chars = "😁".toCharArray();
        int at1 = "😁".codePointAt(0);
        System.out.println("at1 " + at1);
        int at2 = "😁".codePointAt(1);
        System.out.println("at2 " + at2);
        int before1 = "😁".codePointBefore(1);
        System.out.println("before1 " + before1);//55357
        int before2 = "😁".codePointBefore(2);
        System.out.println("before2 " + before2);//128513
        int count = "😁".codePointCount(0, "😁".length()-1);
        System.out.println("count " + count);
        "😁".codePoints().boxed().forEach(
                integer -> System.out.println(integer));
        int offset = "😁😁".offsetByCodePoints(1, 2);
        System.out.println("offset " + offset);
    }


}
