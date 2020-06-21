package be.e1.bssv.J563106.valueobject;

import java.io.Serializable;

import java.util.ArrayList;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalShowSalesDetails extends ValueObject implements Serializable {
  /**
   * 2nd Item Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: LITM <br>
   * EnterpriseOne field length:  25 <br>
   */
  private String F5631006_LITM = null;

  /**
   * Document (Order No, Invoice, etc.)
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: DOCO <br>
   * EnterpriseOne field length:  8 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private MathNumeric F4211_DOCO = null;

  /**
   * Order Type
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: DCTO <br>
   * EnterpriseOne field length:  2 <br>
   * EnterpriseOne User Defined Code: 00/DT <br>
   */
  private String F4211_DCTO = null;

  /**
   * Stocking Type
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: STKT <br>
   * EnterpriseOne field length:  1 <br>
   * EnterpriseOne User Defined Code: 41/I <br>
   */
  private String F5631006_STKT = null;

  /**
   * Kit - 2nd Item Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: KITL <br>
   * EnterpriseOne field length:  25 <br>
   */
  private String F5631006_KITL = null;

  /**
   * Parent (short) Item Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: KIT <br>
   * EnterpriseOne field length:  8 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private MathNumeric F5631006_KIT = null;

  /**
   * Business Unit
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: MCU <br>
   * EnterpriseOne field length:  12 <br>
   */
  private String F4211_MCU = null;

  /**
   * Production Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PMPN <br>
   * EnterpriseOne field length:  30 <br>
   */
  private String F4211_PMPN = null;

  /**
   * Item Number - Short
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ITM <br>
   * EnterpriseOne field length:  8 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private MathNumeric F4211_ITM = null;

  /**
   * 2nd Item Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: LITM <br>
   * EnterpriseOne field length:  25 <br>
   */
  private String F4211_LITM = null;
  
  /**
   * Units - Order/Transaction Quantity
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: UORG <br>
   * EnterpriseOne field length:  15 <br>
   * EnterpriseOne decimal places: 4 <br>
   */
  private MathNumeric F5631006_UORG = null;

  

  /**
   * Item Revision Level
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: MERL <br>
   * EnterpriseOne field length:  3 <br>
   */
  private String F5631006_MERL = null;

  /**
   * Description
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DSC1 <br>
   * EnterpriseOne field length:  30 <br>
   */
  private String F5631006_DSC1 = null;

  /**
   * Item Number - Short
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ITM <br>
   * EnterpriseOne field length:  8 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private MathNumeric F5631006_ITM = null;
  
  private ArrayList queryWOResults = null;

  public void setF5631006_LITM(String F5631006_LITM) {
    this.F5631006_LITM = F5631006_LITM;
  }

  public String getF5631006_LITM() {
    return F5631006_LITM;
  }

  public void setF4211_DOCO(MathNumeric F4211_DOCO) {
    this.F4211_DOCO = F4211_DOCO;
  }

  public MathNumeric getF4211_DOCO() {
    return F4211_DOCO;
  }

  public void setF4211_DCTO(String F4211_DCTO) {
    this.F4211_DCTO = F4211_DCTO;
  }

  public String getF4211_DCTO() {
    return F4211_DCTO;
  }

  public void setF5631006_STKT(String F5631006_STKT) {
    this.F5631006_STKT = F5631006_STKT;
  }

  public String getF5631006_STKT() {
    return F5631006_STKT;
  }

  public void setF5631006_KITL(String F5631006_KITL) {
    this.F5631006_KITL = F5631006_KITL;
  }

  public String getF5631006_KITL() {
    return F5631006_KITL;
  }

  public void setF5631006_KIT(MathNumeric F5631006_KIT) {
    this.F5631006_KIT = F5631006_KIT;
  }

  public MathNumeric getF5631006_KIT() {
    return F5631006_KIT;
  }

  public void setF4211_MCU(String F4211_MCU) {
    this.F4211_MCU = F4211_MCU;
  }

  public String getF4211_MCU() {
    return F4211_MCU;
  }

  public void setF4211_PMPN(String F4211_PMPN) {
    this.F4211_PMPN = F4211_PMPN;
  }

  public String getF4211_PMPN() {
    return F4211_PMPN;
  }

  public void setF4211_ITM(MathNumeric F4211_ITM) {
    this.F4211_ITM = F4211_ITM;
  }

  public MathNumeric getF4211_ITM() {
    return F4211_ITM;
  }

  public void setF4211_LITM(String F4211_LITM) {
    this.F4211_LITM = F4211_LITM;
  }

  public String getF4211_LITM() {
    return F4211_LITM;
  }

  public void setQueryWOResults(ArrayList queryWOResults) {
    this.queryWOResults = queryWOResults;
  }

  public ArrayList getQueryWOResults() {
    return queryWOResults;
  }
 

  public InternalShowSerialNo getQueryWOResults(int i) {
    return (InternalShowSerialNo)queryWOResults.get(i);
  
}

  public void setF5631006_UORG(MathNumeric F5631006_UORG) {
    this.F5631006_UORG = F5631006_UORG;
  }

  public MathNumeric getF5631006_UORG() {
    return F5631006_UORG;
  }

  public void setF5631006_MERL(String F5631006_MERL) {
    this.F5631006_MERL = F5631006_MERL;
  }

  public String getF5631006_MERL() {
    return F5631006_MERL;
  }

  public void setF5631006_DSC1(String F5631006_DSC1) {
    this.F5631006_DSC1 = F5631006_DSC1;
  }

  public String getF5631006_DSC1() {
    return F5631006_DSC1;
  }

  public void setF5631006_ITM(MathNumeric F5631006_ITM) {
    this.F5631006_ITM = F5631006_ITM;
  }

  public MathNumeric getF5631006_ITM() {
    return F5631006_ITM;
  }
}
