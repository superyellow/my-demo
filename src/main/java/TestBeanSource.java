/**
 * Created by simple_huang@foxmail.com on 2017/7/26.
 */
public class TestBeanSource {
    private Long id;
    private String name;
    private int testNo;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TestBeanSource() {
        this.id = id;
        this.name = name;
        this.testNo = testNo;
    }
}
