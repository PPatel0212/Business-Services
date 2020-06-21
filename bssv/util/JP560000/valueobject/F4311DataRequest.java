package be.e1.bssv.util.JP560000.valueobject;

import be.e1.bssv.util.J560000.valueobject.SupDataF4211_D5600007C;

import be.e1.bssv.util.J560000.valueobject.SupDataF4311_D5600007B;

import java.io.Serializable;

import java.math.BigDecimal;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class F4311DataRequest
    extends ValueObject
    implements Serializable
{
    private String actionCode = null;
    private String orderCompanyPO = null;
    private Integer orderNumberPO = null;
    private String orderTypePO = null;
    private String orderSuffixPO = null;
    private BigDecimal orderLinePO = null;
    private String itemRevisionLevel = null;
    private String bspStatus = null;
    private String auditUser = null;
    private String auditProgram = null;
    private String productionNumber = null;
    private String revControlLineSplitFlag = null;

    /**
     * TODO: Default public constructor for instantiating: F4311DataRequest
     */
    public F4311DataRequest()
    {
    }

    public void setActionCode(String actionCode)
    {
        this.actionCode = actionCode;
    }

    public String getActionCode()
    {
        return actionCode;
    }

    public void setOrderCompanyPO(String orderCompanyPO)
    {
        this.orderCompanyPO = orderCompanyPO;
    }

    public String getOrderCompanyPO()
    {
        return orderCompanyPO;
    }

    public void setOrderNumberPO(Integer orderNumberPO)
    {
        this.orderNumberPO = orderNumberPO;
    }

    public Integer getOrderNumberPO()
    {
        return orderNumberPO;
    }

    public void setOrderTypePO(String orderTypePO)
    {
        this.orderTypePO = orderTypePO;
    }

    public String getOrderTypePO()
    {
        return orderTypePO;
    }

    public void setOrderSuffixPO(String orderSuffixPO)
    {
        this.orderSuffixPO = orderSuffixPO;
    }

    public String getOrderSuffixPO()
    {
        return orderSuffixPO;
    }

    public void setOrderLinePO(BigDecimal orderLinePO)
    {
        this.orderLinePO = orderLinePO;
    }

    public BigDecimal getOrderLinePO()
    {
        return orderLinePO;
    }

    public void setItemRevisionLevel(String itemRevisionLevel)
    {
        this.itemRevisionLevel = itemRevisionLevel;
    }

    public String getItemRevisionLevel()
    {
        return itemRevisionLevel;
    }

    public void setBspStatus(String bspStatus)
    {
        this.bspStatus = bspStatus;
    }

    public String getBspStatus()
    {
        return bspStatus;
    }

    public void setAuditUser(String auditUser)
    {
        this.auditUser = auditUser;
    }

    public String getAuditUser()
    {
        return auditUser;
    }

    public void setAuditProgram(String auditProgram)
    {
        this.auditProgram = auditProgram;
    }

    public String getAuditProgram()
    {
        return auditProgram;
    }

    public void copyToInternalValueObject(SupDataF4311_D5600007B inData)
    {
        inData.setCActionCode(this.actionCode);
        inData.setSzAuditProgramId(this.auditProgram);
        inData.setSzAuditUserId(this.auditUser);
        inData.setSzOrderCompanyPO(this.orderCompanyPO);
        inData.setSzOrderTypePO(this.orderTypePO);
        inData.setSzOrderSuffixPO(this.orderSuffixPO);
        inData.setSzRevisionLevel(this.itemRevisionLevel);
        inData.setSzBSPStatus(this.bspStatus);
        inData.setSzRevisionLevel(this.itemRevisionLevel);
        inData.setSzProductionNumber(this.productionNumber);
        inData.setCRevControlLineSplitFlag(this.revControlLineSplitFlag);

        if (this.orderNumberPO != null)
        {
            inData.setMnOrderNumberPO(new MathNumeric(this.orderNumberPO));
        }
        if (this.orderLinePO != null)
        {
            inData.setMnOrderLineNumberPO(new MathNumeric(this.orderLinePO));
        }
    }

    public void setProductionNumber(String productionNumber)
    {
        this.productionNumber = productionNumber;
    }

    public String getProductionNumber()
    {
        return productionNumber;
    }

    public void setRevControlLineSplitFlag(String revControlLineSplitFlag)
    {
        this.revControlLineSplitFlag = revControlLineSplitFlag;
    }

    public String getRevControlLineSplitFlag()
    {
        return revControlLineSplitFlag;
    }
}
