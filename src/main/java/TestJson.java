import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by simple_huang@foxmail.com on 2017/8/1.
 */
public class TestJson {
    public static void main(String[] args) {
        ActivityAddForm aaf = new ActivityAddForm();
        aaf.setParams("{1,2,3}");
        aaf.setActivityName("充值优惠");
        aaf.setActivityArticleId(1l);
        aaf.setActivityRange(1000);
        aaf.setActivityType(2);
        aaf.setCodeBatchId(111);
        aaf.setDisplay(0);
        aaf.setEndTime(new Date(0l));
        aaf.setStartTime(new Date(new Date().getTime()+11111111111111l));
        aaf.setPartnerNodeId(1);
        aaf.setState(1);

        List<CodePackageAddForm> cps = new ArrayList<CodePackageAddForm>();
        cps.add(new CodePackageAddForm("", 1, 100, 1000, new Date(), new Date(), 1, 2, new Date(), new Date(), 1));
        cps.add(new CodePackageAddForm("", 2, 100, 1000, new Date(), new Date(), 1, 2, new Date(), new Date(), 1));
        cps.add(new CodePackageAddForm("", 3, 100, 1000, new Date(), new Date(), 1, 2, new Date(), new Date(), 1));
        aaf.setCodePackageList(cps);
        String jsonString = JSON.toJSONString(aaf);
        System.out.println(jsonString);


        JSONArray jsonArray = JSONArray.parseArray("[{\"rangeTypeId\":2,\"rangeIdSeq\":[100004,100005]}]");
        for (Object o : jsonArray) {
            JSONObject jo = (JSONObject)o;
            Integer rangeTypeId = jo.getInteger("rangeTypeId");
            System.out.println(rangeTypeId);

            JSONArray rangeIdSeq = jo.getJSONArray("rangeIdSeq");
            for (Object ii : rangeIdSeq) {
                System.out.println((Integer)ii);
            }
        }

        JSONArray jsonArray2 = JSONArray.parseArray("[{\"rangeTypeId\":2,\"rangeIdSeq\":[]}]");
        for (Object o : jsonArray2) {
            JSONObject jo = (JSONObject)o;
            Integer rangeTypeId = jo.getInteger("rangeTypeId");
            JSONArray rangeIdSeq = jo.getJSONArray("rangeIdSeq");
            System.out.println(rangeTypeId);
            System.out.println(CollectionUtils.isEmpty(rangeIdSeq));
            System.out.println(rangeIdSeq == null);
        }

//        JSONObject jsonObject = JSONObject.parseObject("[{\"rangeTypeId\":2,\"rangeIdSeq\":[100004,100005]}]");
//        Integer rangeTypeId = jsonObject.getInteger("rangeTypeId");
//        System.out.println("rangeTypeId is " + rangeTypeId);
    }
}
