package be.e1.bssv.util.JP560200.valueobject;

import java.io.Serializable;

import java.math.BigDecimal;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class GetEmailRequest
  extends ValueObject
  implements Serializable
{
  /**
   * Address Search Type
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: Z56AST <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String addressSearchType = null;

  /**
   * Address Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: AN8 <br>
   * EnterpriseOne field length:  8 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private Integer addressNumber = null;

  /**
   * Type Code
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: TYC <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String typeCode = null;

  /**
   * Function Code
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: FUCO <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String functionCode = null;

  /**
   * Business Unit
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: MCU <br>
   * EnterpriseOne field length:  12 <br>
   */
  private String businessUnit = null;

  /**
   * Parameter Data Item 01
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PV01 <br>
   * EnterpriseOne field length:  40 <br>
   */
  private String parm01 = null;

  /**
   * Parameter Data Item 02
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PV02 <br>
   * EnterpriseOne field length:  40 <br>
   */
  private String parm02 = null;

  /**
   * Parameter Data Item 03
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PV03 <br>
   * EnterpriseOne field length:  40 <br>
   */
  private String parm03 = null;

  /**
   * Math Numeric 01
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: MATH01 <br>
   * EnterpriseOne field length:  15 <br>
   * EnterpriseOne decimal places: 2 <br>
   */
  private BigDecimal math01 = null;

  /**
   * Math Numeric 02
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: MATH02 <br>
   * EnterpriseOne field length:  15 <br>
   * EnterpriseOne decimal places: 2 <br>
   */
  private BigDecimal math02 = null;

  /**
   * J.D. EnterpriseOne Event Point 01
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: EV01 <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String ev01 = null;

  /**
   * TODO: Default public constructor for instantiating: GetEmailRequest
   */
  public GetEmailRequest()
  {
  this.addressNumber = 0;
  }

  public void setAddressSearchType(String addressSearchType)
  {
    this.addressSearchType = addressSearchType;
  }

  public String getAddressSearchType()
  {
    return addressSearchType;
  }

  public void setAddressNumber(Integer addressNumber)
  {
    this.addressNumber = addressNumber;
  }

  public Integer getAddressNumber()
  {
    return addressNumber;
  }

  public void setTypeCode(String typeCode)
  {
    this.typeCode = typeCode;
  }

  public String getTypeCode()
  {
    return typeCode;
  }

  public void setFunctionCode(String functionCode)
  {
    this.functionCode = functionCode;
  }

  public String getFunctionCode()
  {
    return functionCode;
  }

  public void setBusinessUnit(String businessUnit)
  {
    this.businessUnit = businessUnit;
  }

  public String getBusinessUnit()
  {
    return businessUnit;
  }

  public void setParm01(String parm01)
  {
    this.parm01 = parm01;
  }

  public String getParm01()
  {
    return parm01;
  }

  public void setParm02(String parm02)
  {
    this.parm02 = parm02;
  }

  public String getParm02()
  {
    return parm02;
  }

  public void setParm03(String parm03)
  {
    this.parm03 = parm03;
  }

  public String getParm03()
  {
    return parm03;
  }

  public void setMath01(BigDecimal math01)
  {
    this.math01 = math01;
  }

  public BigDecimal getmath01()
  {
    return math01;
  }

  public void setmath02(BigDecimal math02)
  {
    this.math02 = math02;
  }

  public BigDecimal getmath02()
  {
    return math02;
  }

  public void setev01(String ev01)
  {
    this.ev01 = ev01;
  }

  public String getev01()
  {
    return ev01;
  }
}
