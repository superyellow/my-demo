import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by simple_huang@foxmail.com on 2017/7/26.
 */
public class Test {
    public static void main(String[] args) {
        TestBeanSource tbs = new TestBeanSource();
        tbs.setName("黄超");
        tbs.setId(1l);
        TestBeanTarget tbt = new TestBeanTarget();
        BeanUtils.copyProperties(tbs, tbt);
        System.out.println(tbt.getName());
        System.out.println(tbt.getId());


//        List<TestBeanSource> testBeanSourceList = new ArrayList<TestBeanSource>();
//        testBeanSourceList.add(new TestBeanSource(1l, "xiao", 222));
//        testBeanSourceList.add(new TestBeanSource(2l, "lips", 333));
//        testBeanSourceList.add(new TestBeanSource(3l, "coffee", 444));
//        List<TestBeanTarget> testBeanTargetList = new ArrayList<TestBeanTarget>();
//        BeanUtils.copyProperties(testBeanSourceList, testBeanTargetList);
//        for (TestBeanTarget tbt : testBeanTargetList) {
//            System.out.println(tbt);
//        }
    }
}
