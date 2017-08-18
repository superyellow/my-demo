/**
 * Created by simple_huang@foxmail.com on 2017/8/1.
 */
public class ChargeSettingAddForm {
    private Long id;

    /** 冲入金额 */
    private Integer chargeAmount;

    /** 赠送金额 */
    private Integer backAmount;

    /** 名称 如冲一百送二十 */
    private String chargeName;

    /** 合作伙伴 */
    private Integer partnerId;

    /** 营业网点 */
    private Integer partnerNodeId;

    /** 0开启1关闭 */
    private Integer chargeStatus;

    private Integer chargeType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getChargeAmount() {
        return chargeAmount;
    }

    public void setChargeAmount(Integer chargeAmount) {
        this.chargeAmount = chargeAmount;
    }

    public Integer getBackAmount() {
        return backAmount;
    }

    public void setBackAmount(Integer backAmount) {
        this.backAmount = backAmount;
    }

    public String getChargeName() {
        return chargeName;
    }

    public void setChargeName(String chargeName) {
        this.chargeName = chargeName;
    }

    public Integer getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(Integer partnerId) {
        this.partnerId = partnerId;
    }

    public Integer getPartnerNodeId() {
        return partnerNodeId;
    }

    public void setPartnerNodeId(Integer partnerNodeId) {
        this.partnerNodeId = partnerNodeId;
    }

    public Integer getChargeStatus() {
        return chargeStatus;
    }

    public void setChargeStatus(Integer chargeStatus) {
        this.chargeStatus = chargeStatus;
    }

    public Integer getChargeType() {
        return chargeType;
    }

    public void setChargeType(Integer chargeType) {
        this.chargeType = chargeType;
    }
}
