/**
 * Created by simple_huang@foxmail.com on 2017/7/26.
 */
public class TestBeanTarget {
    private long id;
    private String name;
    private int testNo;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTestNo() {
        return testNo;
    }

    public void setTestNo(int testNo) {
        this.testNo = testNo;
    }

    @Override
    public String toString() {
        return "TestBeanTarget{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", testNo=" + testNo +
                '}';
    }
}
