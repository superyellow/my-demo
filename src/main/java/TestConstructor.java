import constructor.Animal;

import java.util.ArrayList;
import java.util.List;

/**
 * @author simple_huang@foxmail.com on 2017/9/15.
 */
public class TestConstructor {
    public static void main(String[] args) {
        List<String> encodedNames = new ArrayList<String>();
        List<String> encodedValues = new ArrayList<String>();
        //Animal animal = new Animal(encodedNames, encodedValues); //Animal构造函数是默认修饰符, 只能在同包内构造 //此处报错
    }
}
