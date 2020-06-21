package be.e1.bssv.util.JP560000.valueobject;

import be.e1.bssv.util.J560000.valueobject.SupDataF4211_D5600007C;

import be.e1.bssv.util.J560000.valueobject.SupDataF4311_D5600007B;

import java.io.Serializable;

import java.math.BigDecimal;

import oracle.e1.bssvfoundation.base.MessageValueObject;
import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class F4311DataReply
    extends MessageValueObject
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
    private String errorFlag = null;
    private String errorDescription = null;
    private String productionNumber = null;
    private String revControlLineSplitFlag = null;
    private String baseRevItem = null;
    private Integer buyerNumberPO = null;
    private String relatedOrderCompany = null;
    private String relatedOrderNumber = null;
    private String relatedOrderType = null;
    private BigDecimal relatedOrderLine = null;
    private String buyerName = null;

    /**
     * TODO: Default public constructor for instantiating: F4311DataReply
     */
    public F4311DataReply()
    {
    }

    public F4311DataReply(SupDataF4311_D5600007B inData)
    {
        this.actionCode = inData.getCActionCode();
        this.errorFlag = inData.getCErrorFlag();
        this.errorDescription = inData.getSzErrorDescription();
        this.itemRevisionLevel = inData.getSzRevisionLevel();
        this.orderCompanyPO = inData.getSzOrderCompanyPO();
        this.orderTypePO = inData.getSzOrderTypePO();
        this.orderSuffixPO = inData.getSzOrderSuffixPO();
        this.productionNumber = inData.getSzProductionNumber();
        this.revControlLineSplitFlag = inData.getCRevControlLineSplitFlag();
        this.baseRevItem = inData.getSzSecondItemNumber();
        this.buyerNumberPO = inData.getMnBuyerNumber().intValue();
        this.relatedOrderCompany = inData.getSzRelatedOrderCompany();
        this.relatedOrderType = inData.getSzRelatedOrderType();
        this.buyerName = inData.getSzBuyerName();
        this.relatedOrderNumber = inData.getSzRelatedOrderNumber();
        
        this.orderNumberPO = 0;
        if (inData.getMnOrderNumberPO() != null)
        {
            this.orderNumberPO = inData.getMnOrderNumberPO().intValue();
        }
        
        this.orderLinePO = BigDecimal.ZERO;
        if (inData.getMnOrderLineNumberPO() != null)
        {
            this.orderLinePO = inData.getMnOrderLineNumberPO().asBigDecimal();
        }
        
        this.relatedOrderLine = BigDecimal.ZERO;
        if(inData.getMnRelatedOrderLine() != null)
        {
            this.relatedOrderLine = inData.getMnRelatedOrderLine().asBigDecimal();
        }
    }

    public void setBuyerNumberPO(Integer buyerNumberPO)
    {
        this.buyerNumberPO = buyerNumberPO;
    }

    public Integer getBuyerNumberPO()
    {
        return buyerNumberPO;
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

    public void setErrorFlag(String errorFlag)
    {
        this.errorFlag = errorFlag;
    }

    public String getErrorFlag()
    {
        return errorFlag;
    }

    public void setErrorDescription(String errorDescription)
    {
        this.errorDescription = errorDescription;
    }

    public String getErrorDescription()
    {
        return errorDescription;
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

    public void setBaseRevItem(String baseRevItem)
    {
        this.baseRevItem = baseRevItem;
    }

    public String getBaseRevItem()
    {
        return baseRevItem;
    }

    public void setRelatedOrderCompany(String relatedOrderCompany)
    {
        this.relatedOrderCompany = relatedOrderCompany;
    }

    public String getRelatedOrderCompany()
    {
        return relatedOrderCompany;
    }

    public void setRelatedOrderNumber(String relatedOrderNumber) {
        this.relatedOrderNumber = relatedOrderNumber;
    }

    public String getRelatedOrderNumber() {
        return relatedOrderNumber;
    }

    public void setRelatedOrderType(String relatedOrderType)
    {
        this.relatedOrderType = relatedOrderType;
    }

    public String getRelatedOrderType()
    {
        return relatedOrderType;
    }

    public void setRelatedOrderLine(BigDecimal relatedOrderLine)
    {
        this.relatedOrderLine = relatedOrderLine;
    }

    public BigDecimal getRelatedOrderLine()
    {
        return relatedOrderLine;
    }

    public void setBuyerName(String buyerName)
    {
        this.buyerName = buyerName;
    }

    public String getBuyerName()
    {
        return buyerName;
    }
}
