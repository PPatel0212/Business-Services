package be.e1.bssv.util.J560200.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class GetEmailAddress_D5601000A
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
   * EnterpriseOne User Defined Code: 56/AT <br>
   */
  private String szAddressSearchType = null;

  /**
   * Address Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: AN8 <br>
   * EnterpriseOne field length:  8 <br>
   * EnterpriseOne decimal places: 0 <br>
   * EnterpriseOne Next Number: 01/1 <br>
   */
  private MathNumeric mnAddressNumber = null;

  /**
   * Type Code
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: TYC <br>
   * EnterpriseOne field length:  1 <br>
   * EnterpriseOne User Defined Code: 01/W0 <br>
   */
  private String cAddressTypeCode = null;

  /**
   * Function Code
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: FUCO <br>
   * EnterpriseOne field length:  10 <br>
   * EnterpriseOne User Defined Code: 01/FC <br>
   */
  private String szAddressFunctionCode = null;

  /**
   * Business Unit
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: MCU <br>
   * EnterpriseOne field length:  12 <br>
   */
  private String szAddressBranch = null;

  /**
   * Parameter Data Item 01
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PV01 <br>
   * EnterpriseOne field length:  40 <br>
   */
  private String szParameter01 = null;

  /**
   * Parameter Data Item 02
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PV02 <br>
   * EnterpriseOne field length:  40 <br>
   */
  private String szParameter02 = null;

  /**
   * Parameter Data Item 03
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PV03 <br>
   * EnterpriseOne field length:  40 <br>
   */
  private String szParameter03 = null;

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
  private MathNumeric mnNumParm01 = null;

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
  private MathNumeric mnNumParm02 = null;

  /**
   * J.D. EnterpriseOne Event Point 01
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: EV01 <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String cCharacterParm = null;

  /**
   * Call Plan Ask
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: CPASK <br>
   * EnterpriseOne field length:  1000 <br>
   */
  private String szEmailAddressList = null;

  /**
   * Error Code
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ERRC <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String cErrorFlag = null;

  /**
   * Data Field 1
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DTA1 <br>
   * EnterpriseOne field length:  256 <br>
   */
  private String szErrorDescription = null;

  public void setSzAddressSearchType(String szAddressSearchType)
  {
    this.szAddressSearchType = szAddressSearchType;
  }

  public String getSzAddressSearchType()
  {
    return szAddressSearchType;
  }

  public void setMnAddressNumber(MathNumeric mnAddressNumber)
  {
    this.mnAddressNumber = mnAddressNumber;
  }

  public MathNumeric getMnAddressNumber()
  {
    return mnAddressNumber;
  }

  public void setCAddressTypeCode(String cAddressTypeCode)
  {
    this.cAddressTypeCode = cAddressTypeCode;
  }

  public String getCAddressTypeCode()
  {
    return cAddressTypeCode;
  }

  public void setSzAddressFunctionCode(String szAddressFunctionCode)
  {
    this.szAddressFunctionCode = szAddressFunctionCode;
  }

  public String getSzAddressFunctionCode()
  {
    return szAddressFunctionCode;
  }

  public void setSzAddressBranch(String szAddressBranch)
  {
    this.szAddressBranch = szAddressBranch;
  }

  public String getSzAddressBranch()
  {
    return szAddressBranch;
  }

  public void setSzParameter01(String szParameter01)
  {
    this.szParameter01 = szParameter01;
  }

  public String getSzParameter01()
  {
    return szParameter01;
  }

  public void setSzParameter02(String szParameter02)
  {
    this.szParameter02 = szParameter02;
  }

  public String getSzParameter02()
  {
    return szParameter02;
  }

  public void setSzParameter03(String szParameter03)
  {
    this.szParameter03 = szParameter03;
  }

  public String getSzParameter03()
  {
    return szParameter03;
  }

  public void setMnNumParm01(MathNumeric mnNumParm01)
  {
    this.mnNumParm01 = mnNumParm01;
  }

  public MathNumeric getMnNumParm01()
  {
    return mnNumParm01;
  }

  public void setMnNumParm02(MathNumeric mnNumParm02)
  {
    this.mnNumParm02 = mnNumParm02;
  }

  public MathNumeric getMnNumParm02()
  {
    return mnNumParm02;
  }

  public void setCCharacterParm(String cCharacterParm)
  {
    this.cCharacterParm = cCharacterParm;
  }

  public String getCCharacterParm()
  {
    return cCharacterParm;
  }

  public void setSzEmailAddressList(String szEmailAddressList)
  {
    this.szEmailAddressList = szEmailAddressList;
  }

  public String getSzEmailAddressList()
  {
    return szEmailAddressList;
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
}
