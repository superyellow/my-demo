import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.Date;
import java.util.List;

/**
 * Created by simple_huang@foxmail.com on 2017/8/1.
 */
public class ActivityAddForm {
    private Integer partnerNodeId;
    private String activityName;
    private Integer activityType;
    private Integer activityRange;
    private Integer codeBatchId;
    private Date startTime;
    private Date endTime;
    private Integer state;
    private Long activityArticleId;
    private Integer display;
    private String params;
    private List<CodePackageAddForm> codePackageList;
    private List<ChargeSettingAddForm> chargeSettingList;

    public ActivityAddForm(Integer partnerNodeId, String activityName) {
        this.partnerNodeId = partnerNodeId;
        this.activityName = activityName;
    }

    public Integer getPartnerNodeId() {
        return partnerNodeId;
    }

    public void setPartnerNodeId(Integer partnerNodeId) {
        this.partnerNodeId = partnerNodeId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public Integer getActivityType() {
        return activityType;
    }

    public void setActivityType(Integer activityType) {
        this.activityType = activityType;
    }

    public Integer getActivityRange() {
        return activityRange;
    }

    public void setActivityRange(Integer activityRange) {
        this.activityRange = activityRange;
    }

    public Integer getCodeBatchId() {
        return codeBatchId;
    }

    public void setCodeBatchId(Integer codeBatchId) {
        this.codeBatchId = codeBatchId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Long getActivityArticleId() {
        return activityArticleId;
    }

    public void setActivityArticleId(Long activityArticleId) {
        this.activityArticleId = activityArticleId;
    }

    public Integer getDisplay() {
        return display;
    }

    public void setDisplay(Integer display) {
        this.display = display;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public List<CodePackageAddForm> getCodePackageList() {
        return codePackageList;
    }

    public void setCodePackageList(List<CodePackageAddForm> codePackageList) {
        this.codePackageList = codePackageList;
    }

    public List<ChargeSettingAddForm> getChargeSettingList() {
        return chargeSettingList;
    }

    public void setChargeSettingList(List<ChargeSettingAddForm> chargeSettingList) {
        this.chargeSettingList = chargeSettingList;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

}
