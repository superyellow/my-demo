import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author simple_huang@foxmail.com on 2017/9/4.
 */
public class TestEmptyList {
    public static void main(String[] args) {
        List<String> list = null;
        for (String str: list) {
            System.out.println(str);
        }
    }
}
