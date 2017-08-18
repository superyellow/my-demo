import java.util.Date;

/**
 * Created by simple_huang@foxmail.com on 2017/8/1.
 */
public class CodePackageAddForm {
    private String name;
    private Integer activityId;
    private Integer timeRange;

    /**
     * '时间范围单位，0:天,1:周，2:月，3:年',
     */
    private Integer timeRangeUnit;
    private Date startTime;
    private Date endTime;
    /**
     * '折扣，注意80 表示8折',
     */
    private Integer discount;
    private Integer nums;
    private Date careteTime;
    private Date updateTime;
    private Integer isOpen;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Integer getTimeRange() {
        return timeRange;
    }

    public void setTimeRange(Integer timeRange) {
        this.timeRange = timeRange;
    }

    public Integer getTimeRangeUnit() {
        return timeRangeUnit;
    }

    public void setTimeRangeUnit(Integer timeRangeUnit) {
        this.timeRangeUnit = timeRangeUnit;
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

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Integer getNums() {
        return nums;
    }

    public void setNums(Integer nums) {
        this.nums = nums;
    }

    public Date getCareteTime() {
        return careteTime;
    }

    public void setCareteTime(Date careteTime) {
        this.careteTime = careteTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Integer isOpen) {
        this.isOpen = isOpen;
    }

    public CodePackageAddForm(String name, Integer activityId, Integer timeRange, Integer timeRangeUnit, Date startTime, Date endTime, Integer discount, Integer nums, Date careteTime, Date updateTime, Integer isOpen) {
        this.name = name;
        this.activityId = activityId;
        this.timeRange = timeRange;
        this.timeRangeUnit = timeRangeUnit;
        this.startTime = startTime;
        this.endTime = endTime;
        this.discount = discount;
        this.nums = nums;
        this.careteTime = careteTime;
        this.updateTime = updateTime;
        this.isOpen = isOpen;
    }
}
