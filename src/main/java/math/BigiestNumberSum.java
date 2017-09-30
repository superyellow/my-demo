package math;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author simple_huang@foxmail.com on 2017/9/30.
 */
public class BigiestNumberSum {
    //private ImmutableSet<Integer> num = ImmutableSet.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
    //private ImmutableSet<String> letter = ImmutableSet.of("A", "B", "C", "D", "E", "F", "G", "H", "I", "J");
    //private static Map<String, Long> letterWeightMap = new HashMap<>();

    /**
     有 n 个字符串，每个字符串都是由 A-J 的大写字符构成。现在你将每个字符映射为一个 0-9 的数字，不同字符映射为不同的数字。
     这样每个字符串就可以看做一个整数，唯一的要求是这些整数必须是正整数且它们的字符串不能有前导零。
     现在问你怎样映射字符才能使得这些字符串表示的整数之和最大？
     输入描述:
     每组测试用例仅包含一组数据，每组数据第一行为一个正整数 n ， 接下来有 n 行，每行一个长度不超过 12 且仅包含大写字母 A-J 的字符串。
     n 不大于 50，且至少存在一个字符不是任何字符串的首字母。
     输出描述:
     输出一个数，表示最大和是多少。
     输入例子:
     2
     ABC
     BCA
     输出例子:
     1875
     */
    public static Long caculateMaxNum(String[] strs) {
        Map<String, Long> letterWeightMap = new HashMap<>();
        for (String s: strs) {
            String[] splitLetters = s.split("");
            Integer length = splitLetters.length;
            for (int i=0; i<length; i++) {
                String splitLetter = splitLetters[i];
                if (letterWeightMap.containsKey(splitLetter)) {
                    letterWeightMap.replace(splitLetter, letterWeightMap.get(splitLetter),
                            letterWeightMap.get(splitLetter) + (long)Math.pow(10, length-1-i));
                } else {
                    letterWeightMap.put(splitLetter, (long)Math.pow(10, length-1-i));
                }
            }
        }
        List<Long> weights = new ArrayList<>();
        weights.addAll(letterWeightMap.values());
        Collections.sort(weights, new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                return (int)((long)o2-(long)o1);
            }
        });
        System.out.println(weights);
        Long sum = 0l;
        Integer multiply = 9;
        for (Long l: weights) {
            sum = sum + l * multiply;
            multiply-- ;
        }
        return sum;
    }
    public static void main(String[] args) {
        String[] strs = {"DIAED", "ECJAD"};
        System.out.println(caculateMaxNum(strs));

        String[] ss = {"ABC", "BCA"};
        System.out.println(caculateMaxNum(ss));
    }

}
