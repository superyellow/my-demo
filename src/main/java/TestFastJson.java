import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author simple_huang@foxmail.com on 2017/9/11.
 */
public class TestFastJson {
    public static void main(String[] args) {
        Bounty bounty = new Bounty(1, 2, false);
        System.out.println(JSON.toJSONString(bounty));
    }

}
class Bounty{
    int maxPrice;
    int minPrice;
    @JSONField(name = "isOpen")
    boolean isOpen;

    public Bounty(int maxPrice, int minPrice, boolean isOpen) {
        this.maxPrice = maxPrice;
        this.minPrice = minPrice;
        this.isOpen = isOpen;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(int maxPrice) {
        this.maxPrice = maxPrice;
    }

    public int getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(int minPrice) {
        this.minPrice = minPrice;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setIsOpen(boolean isOpen) {
        isOpen = isOpen;
    }
}
