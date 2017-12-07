import org.springframework.util.CollectionUtils;

import java.util.*;

/**
 * Created by simple_huang@foxmail.com on 2017/8/3.
 */
public class TestCollection {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add(null);
        System.out.println(CollectionUtils.isEmpty(list));

        List<Integer> list1 = Arrays.asList(1, 2, 3);
        Integer num;
        Iterator iterator = list1.iterator();
        while (iterator.hasNext()) {
            System.out.println(num = (Integer)iterator.next());
        }

        Map<Integer, String> map  = new HashMap<>();
        map.put(1, "h");
        map.put(1, "j");
        System.out.println(map.get(1));

        System.out.println("SELECT t.deviceId, SUM( CASE WHEN t.`status` <> 0 THEN t.num END ) AS total, \n" +
                "SUM( CASE WHEN t.`status` < 0 THEN t.num END ) AS `refunded`, \n" +
                "SUM( CASE WHEN t.`status` = 2 THEN t.num END ) AS `paid`, SUM( CASE WHEN t.`status` = 3 THEN t.num END ) AS `fetched`, \n" +
                "SUM( CASE WHEN t.`status` = 4 THEN t.num END ) AS `completed` FROM \n" +
                "( SELECT count(1) AS num, deviceId, `status` FROM ProductOrder WHERE createDateTime >= ? \n" +
                "AND createDateTime <= ? AND partnerNodeId = ? GROUP BY deviceId, `status` ) t GROUP BY t.deviceId ORDER BY `" +" sssss "+
                "` DESC LIMIT ?, ?");

        System.out.println("Select count(1) from ( SELECT\n" +
                "	1 \n" +
                "FROM\n" +
                "	material_cost_record\n" +
                "WHERE partner_node_id = ?\n");
    }

    private int iDcard;

    public int getiDcard() {
        return iDcard;
    }

    public void setiDcard(int iDcard) {
        this.iDcard = iDcard;
    }

    public void testMethod(String str1, String str2) {}
//    public void testMethod(String str2, String str1) {}

}
