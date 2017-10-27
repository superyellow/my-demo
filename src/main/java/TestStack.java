import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

/**
 * @author simple_huang@foxmail.com on 2017/10/24.
 */
public class TestStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack();
        stack.add(2);
        System.out.println(stack.search(2));
        System.out.println(stack.get(0));
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(Thread.currentThread().getState());

        Object[] os = {"一", "二", "三"};
        List<String> strList = Arrays.stream(os).map(o -> (String) o).collect(Collectors.toList());
        System.out.println(strList);
    }
}
