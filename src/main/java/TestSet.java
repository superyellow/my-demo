import java.util.HashSet;
import java.util.Set;

/**
 * @author simple_huang@foxmail.com on 2017/8/16.
 */
public class TestSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("aaa");
        set.add("aaa");
        set.add("aaa");
        set.add("aaa");
        set.add("aaa");
        System.out.println(set);
    }
}
