package be.e1.bssv.JP563002.valueobject;

import java.io.Serializable;

import java.math.BigDecimal;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class LoadBOMChild extends ValueObject implements Serializable {
    /**
     * 2nd Item Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: LITM <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String identifier2ndItem = null;

    /**
     * Quantity - Standard Required Quantity
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: QNTY <br>
     * EnterpriseOne field length:  15 <br>
     * EnterpriseOne decimal places: 4 <br>
     * EnterpriseOne Default value: 10000 <br>
     */
    private BigDecimal qtyRequiredStandard = null;

    /**
     * Unit of Measure
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: UM <br>
     * EnterpriseOne field length:  2 <br>
     */
    private String unitOfMeasure = null;

    /**
     * Fixed or Variable Quantity
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: FORQ <br>
     * EnterpriseOne field length:  1 <br>
     * EnterpriseOne Default value: V <br>
     */
    private String fixedOrVariableQty = null;

    /**
     * Sequence - Bubble Sequence
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: BSEQ <br>
     * EnterpriseOne field length:  5 <br>
     * EnterpriseOne decimal places: 0 <br>
     * EnterpriseOne Default value: 00001 <br>
     */
    private Integer bubbleSequence = null;

    /**
     * Percent - Percent of Scrap
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: SCRP <br>
     * EnterpriseOne field length:  5 <br>
     * EnterpriseOne decimal places: 2 <br>
     */
    private BigDecimal percentOfScrap = null;

    /**
     * Leadtime Offset Days
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: LOVD <br>
     * EnterpriseOne field length:  6 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer leadtimeOffsetDays = null;

    /**
     * TODO: Default public constructor for instantiating: LoadBOMChild
     */
    public LoadBOMChild() {
    }

    public void setIdentifier2ndItem(String identifier2ndItem) {
        this.identifier2ndItem = identifier2ndItem;
    }

    public String getIdentifier2ndItem() {
        return identifier2ndItem;
    }

    public void setQtyRequiredStandard(BigDecimal qtyRequiredStandard) {
        this.qtyRequiredStandard = qtyRequiredStandard;
    }

    public BigDecimal getQtyRequiredStandard() {
        return qtyRequiredStandard;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setFixedOrVariableQty(String fixedOrVariableQty) {
        this.fixedOrVariableQty = fixedOrVariableQty;
    }

    public String getFixedOrVariableQty() {
        return fixedOrVariableQty;
    }

    public void setBubbleSequence(Integer bubbleSequence) {
        this.bubbleSequence = bubbleSequence;
    }

    public Integer getBubbleSequence() {
        return bubbleSequence;
    }

    public void setPercentOfScrap(BigDecimal percentOfScrap) {
        this.percentOfScrap = percentOfScrap;
    }

    public BigDecimal getPercentOfScrap() {
        return percentOfScrap;
    }

    public void setLeadtimeOffsetDays(Integer leadtimeOffsetDays) {
        this.leadtimeOffsetDays = leadtimeOffsetDays;
    }

    public Integer getLeadtimeOffsetDays() {
        return leadtimeOffsetDays;
    }
}
