/**
 * Created by simple_huang@foxmail.com on 2017/8/3.
 */
public class TestString {
    public static void main(String[] args) {
//        String str1 = new String("abc");
        String str2 = new String("a") + new String("bc");

        str2.intern();
        String str3 = "abc";

        System.out.println(str2 == str3);

        Thread t = new Thread();
        System.out.println(t.getState());
        t.start();
        System.out.println(t.getState());
    }
}
