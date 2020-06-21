package be.e1.bssv.JP564207.valueobject;

import be.e1.bssv.J564207.valueobject.InternalGetSalesOrderHeader;

import be.e1.bssv.J564207.valueobject.InternalGetSalesOrderHeaderWhereFields;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.Calendar;

import java.util.Date;

import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.exception.BSSVDataFormatterException;
import oracle.e1.bssvfoundation.util.E1Message;
import oracle.e1.bssvfoundation.util.E1MessageList;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class GetSalesOrderHeader extends ValueObject implements Serializable {
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
  private Integer soOrderNumber = null;

  /**
   * Order Type
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: DCTO <br>
   * EnterpriseOne field length:  2 <br>
   */
  private String soOrderType = null;

  /**
   * Production Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PMPN <br>
   * EnterpriseOne field length:  30 <br>
   */
  private String ProductionNumber = null;

  /**
   * Line Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: LNID <br>
   * EnterpriseOne field length:  6 <br>
   * EnterpriseOne decimal places: 3 <br>
   */
  private BigDecimal lineNumber = null;

  /**
   * Order Type
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: DCTO <br>
   * EnterpriseOne field length:  2 <br>
   */
  private String woOrderType = null;

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
  private Integer woOrderNumber = null;

  /**
   * Business Unit
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: MCU <br>
   * EnterpriseOne field length:  12 <br>
   */
  private String costCenter = null;

  /**
   * Address Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: AN8 <br>
   * EnterpriseOne field length:  8 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private Integer addressNumber = null;

  /**
   * Aircraft Type Series
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: Z56ACTS <br>
   * EnterpriseOne field length:  25 <br>
   */
  private String aircraftTypeSeries = null;

  /**
   * Tail Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: Z56TAIL <br>
   * EnterpriseOne field length:  8 <br>
   */
  private String tailNumber = null;

  /**
   * Date - MPS Due
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: Z56MDRQJ <br>
   * EnterpriseOne field length:  6 <br>
   */
  private Calendar dateDueMPS = null;

  /**
   * Sales Category Code 3
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: SRP3 <br>
   * EnterpriseOne field length:  3 <br>
   */
  private String salesReportingCode3 = null;

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
   * TODO: Default public constructor for instantiating: GetSalesOrderHeader
   */
  public GetSalesOrderHeader() {
  }

  public E1MessageList mapFromPublished(IContext context,
                                        InternalGetSalesOrderHeader vo) {

    BigDecimal myBigDecimal =  BigDecimal.ZERO; 
    E1MessageList messages = new E1MessageList();
    InternalGetSalesOrderHeaderWhereFields queryWhereFields =
      vo.getQueryWhereFields();

    if (this.getCostCenter() != null && !this.getCostCenter().isEmpty()) {


      queryWhereFields.setF4211_MCU(FormatterUtility(context,
                                                     this.getCostCenter(),
                                                     "MCU", messages,
                                                     "BusinessUnit"));
    }
    if (this.getAircraftTypeSeries() != null && !this.getAircraftTypeSeries().isEmpty())
      queryWhereFields.setF564211_Z56ACTS(this.getAircraftTypeSeries());

    if (this.getAddressNumber() != null && this.getAddressNumber() > 0)
      queryWhereFields.setF4211_AN8(new MathNumeric(this.getAddressNumber()));


    if (this.getLineNumber() != null && !this.getLineNumber().equals(myBigDecimal))
      queryWhereFields.setF4211_LNID(new MathNumeric(this.getLineNumber()));


    if (this.getSoOrderNumber() != null && this.getSoOrderNumber() > 0)
      queryWhereFields.setF4211_DOCO(new MathNumeric(this.getSoOrderNumber()));


    if (this.getSoOrderType() != null && !this.getSoOrderType().isEmpty())
      queryWhereFields.setF4211_DCTO(this.getSoOrderType());

    if (this.getWoOrderNumber() != null && this.getWoOrderNumber() > 0)
      queryWhereFields.setF4801_DOCO(new MathNumeric(this.getWoOrderNumber()));


    if (this.getWoOrderType() != null && !this.getWoOrderType().isEmpty())
      queryWhereFields.setF4801_DCTO(this.getWoOrderType());

     if (this.getDateDueMPS() != null)
      queryWhereFields.setF564201_Z56MDRQJ(this.getDateDueMPS().getTime()); 


    if (this.getTailNumber() != null && !this.getTailNumber().isEmpty())
      queryWhereFields.setF564211_Z56TAIL(this.getTailNumber());

    if (this.getSalesReportingCode3() != null &&
        !this.getSalesReportingCode3().isEmpty())
      queryWhereFields.setF4211_SRP3(this.getSalesReportingCode3());

    if (this.getIdentifier2ndItem() != null &&
        !this.getIdentifier2ndItem().isEmpty())
      queryWhereFields.setF4211_LITM(this.getIdentifier2ndItem());

    if (this.getProductionNumber() != null &&
        !this.getProductionNumber().isEmpty())
      queryWhereFields.setF4211_PMPN(this.getProductionNumber());

    vo.setQueryWhereFields(queryWhereFields);
    return messages;
  }

  public void setSoOrderNumber(Integer soOrderNumber) {
    this.soOrderNumber = soOrderNumber;
  }

  public Integer getSoOrderNumber() {
    return soOrderNumber;
  }

  public void setSoOrderType(String soOrderType) {
    this.soOrderType = soOrderType;
  }

  public String getSoOrderType() {
    return soOrderType;
  }

  public void setLineNumber(BigDecimal lineNumber) {
    this.lineNumber = lineNumber;
  }

  public BigDecimal getLineNumber() {
    return lineNumber;
  }

  public void setWoOrderType(String woOrderType) {
    this.woOrderType = woOrderType;
  }

  public String getWoOrderType() {
    return woOrderType;
  }

  public void setWoOrderNumber(Integer woOrderNumber) {
    this.woOrderNumber = woOrderNumber;
  }

  public Integer getWoOrderNumber() {
    return woOrderNumber;
  }

  public void setCostCenter(String costCenter) {
    this.costCenter = costCenter;
  }

  public String getCostCenter() {
    return costCenter;
  }

  public void setAddressNumber(Integer addressNumber) {
    this.addressNumber = addressNumber;
  }

  public Integer getAddressNumber() {
    return addressNumber;
  }

  public void setAircraftTypeSeries(String aircraftTypeSeries) {
    this.aircraftTypeSeries = aircraftTypeSeries;
  }

  public String getAircraftTypeSeries() {
    return aircraftTypeSeries;
  }

  public void setTailNumber(String tailNumber) {
    this.tailNumber = tailNumber;
  }

  public String getTailNumber() {
    return tailNumber;
  }

  public void setDateDueMPS(Calendar dateDueMPS) {
    this.dateDueMPS = dateDueMPS;
  }


  public Calendar getDateDueMPS() {
    return dateDueMPS;
  }

  public void setSalesReportingCode3(String salesReportingCode3) {
    this.salesReportingCode3 = salesReportingCode3;
  }

  public String getSalesReportingCode3() {
    return salesReportingCode3;
  }

  public void setIdentifier2ndItem(String identifier2ndItem) {
    this.identifier2ndItem = identifier2ndItem;
  }

  public String getIdentifier2ndItem() {
    return identifier2ndItem;
  }

  public void setProductionNumber(String ProductionNumber) {
    this.ProductionNumber = ProductionNumber;
  }

  public String getProductionNumber() {
    return ProductionNumber;
  }

  public String FormatterUtility(IContext context, String fieldToFormat,
                                 String aliasName, E1MessageList messages,
                                 String fieldName) {
    String formattedMCU = null;

    if (fieldToFormat != null && (fieldToFormat.length() > 0)) {
      try {
        formattedMCU =
            context.getBSSVDataFormatter().format(fieldToFormat, aliasName);
      } catch (BSSVDataFormatterException e) {
        context.getBSSVLogger().app(context,
                                    "Error when formatting " + fieldName, null,
                                    null, e);
        //Create new E1 Message with error from exception
        messages.addMessage(new E1Message(context, "002FIS", fieldToFormat));
      }
    }

    return (formattedMCU);
  }

}
