package be.e1.bssv.util.J560000.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class SupDataF4311_D5600007B
    extends ValueObject
    implements Serializable
{
    private String cActionCode = null;
    private String szOrderCompanyPO = null;
    private MathNumeric mnOrderNumberPO = null;
    private String szOrderTypePO = null;
    private String szOrderSuffixPO = null;
    private MathNumeric mnOrderLineNumberPO = null;
    private String szRevisionLevel = null;
    private String szBSPStatus = null;
    private String szAuditUserId = null;
    private String szAuditProgramId = null;
    private String cErrorFlag = null;
    private String szErrorDescription = null;
    private String szProductionNumber = null;
    private String cRevControlLineSplitFlag = null;
    private String szSecondItemNumber = null;
    private MathNumeric mnBuyerNumber = null;
    private String szRelatedOrderCompany = null;
    private String szRelatedOrderNumber = null;
    private String szRelatedOrderType = null;
    private MathNumeric mnRelatedOrderLine = null;
    private String szBuyerName = null;

    public void setMnBuyerNumber(MathNumeric mnBuyerNumber)
    {
        this.mnBuyerNumber = mnBuyerNumber;
    }

    public MathNumeric getMnBuyerNumber()
    {
        return mnBuyerNumber;
    }

    public void setCActionCode(String cActionCode)
    {
        this.cActionCode = cActionCode;
    }

    public String getCActionCode()
    {
        return cActionCode;
    }

    public void setSzOrderCompanyPO(String szOrderCompanyPO)
    {
        this.szOrderCompanyPO = szOrderCompanyPO;
    }

    public String getSzOrderCompanyPO()
    {
        return szOrderCompanyPO;
    }

    public void setMnOrderNumberPO(MathNumeric mnOrderNumberPO)
    {
        this.mnOrderNumberPO = mnOrderNumberPO;
    }

    public MathNumeric getMnOrderNumberPO()
    {
        return mnOrderNumberPO;
    }

    public void setSzOrderTypePO(String szOrderTypePO)
    {
        this.szOrderTypePO = szOrderTypePO;
    }

    public String getSzOrderTypePO()
    {
        return szOrderTypePO;
    }

    public void setSzOrderSuffixPO(String szOrderSuffixPO)
    {
        this.szOrderSuffixPO = szOrderSuffixPO;
    }

    public String getSzOrderSuffixPO()
    {
        return szOrderSuffixPO;
    }

    public void setMnOrderLineNumberPO(MathNumeric mnOrderLineNumberPO)
    {
        this.mnOrderLineNumberPO = mnOrderLineNumberPO;
    }

    public MathNumeric getMnOrderLineNumberPO()
    {
        return mnOrderLineNumberPO;
    }

    public void setSzRevisionLevel(String szRevisionLevel)
    {
        this.szRevisionLevel = szRevisionLevel;
    }

    public String getSzRevisionLevel()
    {
        return szRevisionLevel;
    }

    public void setSzBSPStatus(String szBSPStatus)
    {
        this.szBSPStatus = szBSPStatus;
    }

    public String getSzBSPStatus()
    {
        return szBSPStatus;
    }

    public void setSzAuditUserId(String szAuditUserId)
    {
        this.szAuditUserId = szAuditUserId;
    }

    public String getSzAuditUserId()
    {
        return szAuditUserId;
    }

    public void setSzAuditProgramId(String szAuditProgramId)
    {
        this.szAuditProgramId = szAuditProgramId;
    }

    public String getSzAuditProgramId()
    {
        return szAuditProgramId;
    }

    public void setCErrorFlag(String cErrorFlag)
    {
        this.cErrorFlag = cErrorFlag;
    }

    public String getCErrorFlag()
    {
        return cErrorFlag;
    }

    public void setSzErrorDescription(String szErrorDescription)
    {
        this.szErrorDescription = szErrorDescription;
    }

    public String getSzErrorDescription()
    {
        return szErrorDescription;
    }

    public void setSzProductionNumber(String szProductionNumber)
    {
        this.szProductionNumber = szProductionNumber;
    }

    public String getSzProductionNumber()
    {
        return szProductionNumber;
    }

    public void setCRevControlLineSplitFlag(String cRevControlLineSplitFlag)
    {
        this.cRevControlLineSplitFlag = cRevControlLineSplitFlag;
    }

    public String getCRevControlLineSplitFlag()
    {
        return cRevControlLineSplitFlag;
    }

    public void setSzSecondItemNumber(String szSecondItemNumber)
    {
        this.szSecondItemNumber = szSecondItemNumber;
    }

    public String getSzSecondItemNumber()
    {
        return szSecondItemNumber;
    }

    public void setSzRelatedOrderCompany(String szRelatedOrderCompany)
    {
        this.szRelatedOrderCompany = szRelatedOrderCompany;
    }

    public String getSzRelatedOrderCompany()
    {
        return szRelatedOrderCompany;
    }

    public void setSzRelatedOrderNumber(String szRelatedOrderNumber)
    {
        this.szRelatedOrderNumber = szRelatedOrderNumber;
    }

    public String getSzRelatedOrderNumber()
    {
        return szRelatedOrderNumber;
    }

    public void setSzRelatedOrderType(String szRelatedOrderType)
    {
        this.szRelatedOrderType = szRelatedOrderType;
    }

    public String getSzRelatedOrderType()
    {
        return szRelatedOrderType;
    }

    public void setMnRelatedOrderLine(MathNumeric mnRelatedOrderLine)
    {
        this.mnRelatedOrderLine = mnRelatedOrderLine;
    }

    public MathNumeric getMnRelatedOrderLine()
    {
        return mnRelatedOrderLine;
    }

    public void setSzBuyerName(String szBuyerName)
    {
        this.szBuyerName = szBuyerName;
    }

    public String getSzBuyerName()
    {
        return szBuyerName;
    }
}
