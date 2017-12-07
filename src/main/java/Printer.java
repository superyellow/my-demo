import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author simple_huang@foxmail.com on 2017/11/7.
 */
public class Printer {

    public static void main(String[] args) {
        System.out.println(
                "SELECT\n" +
                        "\tPartnerNode.id, PartnerNode.`name`, PartnerNode.baseName, PartnerNode.partnerId, PartnerNode.isOpen\n" +
                        "FROM\n" +
                        "\tPartnerNode\n" +
                        "INNER JOIN PartnerNodeDevice ON PartnerNode.id=PartnerNodeDevice.partnerNodeId\n");


        Map<Integer, String> map = new HashMap<>();
        map.put(1, "s");
        System.out.println(map.get(2));

        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        System.out.println(list.subList(0, 2));
    }

}
