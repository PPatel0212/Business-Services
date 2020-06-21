package be.e1.bssv.JP564102.valueobject;

import be.e1.bssv.J564102.valueobject.InternalCreateItemRegistry;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.E1MessageList;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InputVOCreateItemReg extends ValueObject implements Serializable {
    /**
     * Item ID
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: OTITEMID <br>
     * EnterpriseOne field length:  50 <br>
     */
    private String itemID = null;

    /**
     * 2nd Item Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: LITM <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String ndItemNumber = null;

    /**
     * Description
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DSC1 <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String description = null;

    /**
     * Description - Line 2
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DSC2 <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String descriptionLine2 = null;

    /**
     * Name - Remark
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: RMK <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String nameRemark = null;
    
    /**
     * Name - Remark
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: RMK <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String sourceSystem = null;

    /**
     * Item Group
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ITTP <br>
     * EnterpriseOne field length:  8 <br>
     */
    private String itemGroup = null;
    
    /**
     * Description
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DSC1 <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String itemType = null;
  /**
   * Item Number - Short
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: ITM <br>
   * EnterpriseOne field length:  8 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private Integer shortItemNumber = null;

    /**
     * TODO: Default public constructor for instantiating: InputVOCreateItemReg
     */
    public InputVOCreateItemReg() {
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public String getItemID() {
        return itemID;
    }

    public void setNdItemNumber(String ndItemNumber) {
        this.ndItemNumber = ndItemNumber;
    }

    public String getNdItemNumber() {
        return ndItemNumber;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescriptionLine2(String descriptionLine2) {
        this.descriptionLine2 = descriptionLine2;
    }

    public String getDescriptionLine2() {
        return descriptionLine2;
    }

    public void setNameRemark(String nameRemark) {
        this.nameRemark = nameRemark;
    }

    public String getNameRemark() {
        return nameRemark;
    }

    public void setItemGroup(String itemGroup) {
        this.itemGroup = itemGroup;
    }

    public String getItemGroup() {
        return itemGroup;
    }
    public E1MessageList mapFromPublished (InternalCreateItemRegistry VO) {
          E1MessageList messages = new E1MessageList();
          //Assign values from the published class to the internal vo object
          VO.setSzTypeCode(this.getItemGroup());
          VO.setSzDescription1(this.getDescription()); 
          VO.setSzDescription2(this.getDescriptionLine2());
          VO.setSzPLMSource(this.getNameRemark());
          VO.setSzItemType(this.getItemType());
          VO.setSzPLMID(this.getItemID());
          VO.setSzItemNumber(this.getNdItemNumber());
          VO.setSzSourceSystem(this.getSourceSystem());
          VO.setSzItemType(this.getItemType());
          if (this.shortItemNumber != null) 
          VO.setMnItemNumberShort(new MathNumeric(this.shortItemNumber));
          return messages;
      }

  public void setShortItemNumber(Integer shortItemNumber) {
    this.shortItemNumber = shortItemNumber;
  }

  
  public Integer getShortItemNumber() {
    return shortItemNumber;
  }

    public void setSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
    }

    public String getSourceSystem() {
        return sourceSystem;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getItemType() {
        return itemType;
    }
}
