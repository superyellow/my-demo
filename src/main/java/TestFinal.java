import java.util.ArrayList;
import java.util.List;

/**
 * @author simple_huang@foxmail.com on 2017/8/17.
 */
public class TestFinal {
    static final Integer i = 1;
    static List<String> strings = new ArrayList<String>();
    public static void main(String[] args) {
        strings.add("aa");
        for (String str : strings) {
            str = "bb";
            //strings.add(str);
        }
        System.out.println(strings);
    }
}
