package be.e1.bssv.util.J560203.valueobject;

import java.io.Serializable;

import java.util.ArrayList;

import java.util.Date;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class BE_HumanTaskQuery extends ValueObject implements Serializable
{
  /**
   * Workflow Type
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: Z56WFTP <br>
   * EnterpriseOne field length:  20 <br>
   * EnterpriseOne User Defined Code: 56/WT <br>
   */
  private String F560205_Z56WFTP = null;

  /**
   * Workflow Type Desciption
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: Z56WTDS <br>
   * EnterpriseOne field length:  50 <br>
   */
  private String F560205_Z56WTDS = null;

  /**
   * Business Unit
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: MCU <br>
   * EnterpriseOne field length:  12 <br>
   */
  private String F560205_MCU = null;

  /**
   * Long Address Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: ALKY <br>
   * EnterpriseOne field length:  20 <br>
   */
  private String F560205_ALKY = null;

  /**
   * Long Address Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: ALKY1 <br>
   * EnterpriseOne field length:  20 <br>
   */
  private String F560205_ALKY1 = null;

  /**
   * Long Address Number 3
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: Z56ALKY3 <br>
   * EnterpriseOne field length:  20 <br>
   */
  private String F560205_Z56ALKY3 = null;

  /**
   * Long Address Number 4
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: Z56ALKY4 <br>
   * EnterpriseOne field length:  20 <br>
   */
  private String F560205_Z56ALKY4 = null;

  /**
   * Long Address Number 5
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: Z56ALKY5 <br>
   * EnterpriseOne field length:  20 <br>
   */
  private String F560205_Z56ALKY5 = null;
  
  /**
   * Long Address Number 6
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: Z56ALKY5 <br>
   * EnterpriseOne field length:  20 <br>
   */
  private String F560205_Z56ALKY6 = null;
  
  /**
   * Long Address Number 7
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: Z56ALKY5 <br>
   * EnterpriseOne field length:  20 <br>
   */
  private String F560205_Z56ALKY7 = null;

  /**
   * Long Address Number 8
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: Z56ALKY5 <br>
   * EnterpriseOne field length:  20 <br>
   */
  private String F560205_Z56ALKY8 = null;

  /**
   * Service Level Custom Function
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: SLCUSTFN <br>
   * EnterpriseOne field length:  32 <br>
   */
  private String F560205_SLCUSTFN = null;

  /**
   * Group
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: GROUP <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String F560205_GROUP = null;

  /**
   * Current User ID
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: CUID <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String F560205_CUID = null;

  /**
   * Subscriber Group
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: SUBGRP <br>
   * EnterpriseOne field length:  64 <br>
   */
  private String F560205_SUBGRP = null;

  /**
   * Foreign - Threshold 1
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: FTH1 <br>
   * EnterpriseOne field length:  15 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private MathNumeric F560205_FTH1 = null;

  /**
   * Foreign - Threshold 2
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: FTH2 <br>
   * EnterpriseOne field length:  15 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private MathNumeric F560205_FTH2 = null;

  /**
   * Formatted Start Time
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: FMTST <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String F560205_FMTST = null;

  /**
   * Configuration Group Code
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: CFGGC <br>
   * EnterpriseOne field length:  10 <br>
   * EnterpriseOne User Defined Code: 00/CG <br>
   */
  private String F560205_CFGGC = null;

  /**
   * Group Name (related words)
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: GRPNAME <br>
   * EnterpriseOne field length:  30 <br>
   */
  private String F560205_GRPNAME = null;

  /**
   * Formatted End Time
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: FMTET <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String F560205_FMTET = null;

  /**
   * Reviewer ID
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: RVID <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String F560205_RVID = null;

  /**
   * Work Group Name
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: WGNA <br>
   * EnterpriseOne field length:  30 <br>
   */
  private String F560205_WGNA = null;

  /**
   * User Reserved Code
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: URCD <br>
   * EnterpriseOne field length:  2 <br>
   */
  private String F560205_URCD = null;

  /**
   * User Reserved Date
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: URDT <br>
   * EnterpriseOne field length:  6 <br>
   */
  private Date F560205_URDT = null;

  /**
   * User Reserved Amount
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: URAT <br>
   * EnterpriseOne field length:  15 <br>
   * EnterpriseOne decimal places: 2 <br>
   */
  private MathNumeric F560205_URAT = null;

  /**
   * User Reserved Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: URAB <br>
   * EnterpriseOne field length:  8 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private MathNumeric F560205_URAB = null;

  /**
   * User Reserved Reference
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: URRF <br>
   * EnterpriseOne field length:  15 <br>
   */
  private String F560205_URRF = null;
  
  /**
   * Flag to indicate whether an error is encountered during processing.
   * If no errors exists value is 0 otherwise it's 1
   */
  private String cErrorFlag = null;
  
  /**
   * Field containing descriptive text of any error that may have occured.
   * This field is only set if cErrorFlag is not zero
   */
  private String szErrorDescription = null;
  
  /**
   * An ArrayList holding the results from the select query
   */
  private ArrayList queryResults = null;

  public void setF560205_Z56WFTP(String F560205_Z56WFTP)
  {
    this.F560205_Z56WFTP = F560205_Z56WFTP;
  }

  public String getF560205_Z56WFTP()
  {
    return F560205_Z56WFTP;
  }

  public void setF560205_Z56WTDS(String F560205_Z56WTDS)
  {
    this.F560205_Z56WTDS = F560205_Z56WTDS;
  }

  public String getF560205_Z56WTDS()
  {
    return F560205_Z56WTDS;
  }

  public void setF560205_MCU(String F560205_MCU)
  {
    if(F560205_MCU != null)
      this.F560205_MCU = String.format("%1$12s", F560205_MCU);
    else
      this.F560205_MCU = F560205_MCU;
  }

  public String getF560205_MCU()
  {
    return F560205_MCU;
  }

  public void setF560205_ALKY(String F560205_ALKY)
  {
    this.F560205_ALKY = F560205_ALKY;
  }

  public String getF560205_ALKY()
  {
    return F560205_ALKY;
  }

  public void setF560205_ALKY1(String F560205_ALKY1)
  {
    this.F560205_ALKY1 = F560205_ALKY1;
  }

  public String getF560205_ALKY1()
  {
    return F560205_ALKY1;
  }

  public void setF560205_Z56ALKY3(String F560205_Z56ALKY3)
  {
    this.F560205_Z56ALKY3 = F560205_Z56ALKY3;
  }

  public String getF560205_Z56ALKY3()
  {
    return F560205_Z56ALKY3;
  }

  public void setF560205_Z56ALKY4(String F560205_Z56ALKY4)
  {
    this.F560205_Z56ALKY4 = F560205_Z56ALKY4;
  }

  public String getF560205_Z56ALKY4()
  {
    return F560205_Z56ALKY4;
  }

  public void setF560205_Z56ALKY5(String F560205_Z56ALKY5)
  {
    this.F560205_Z56ALKY5 = F560205_Z56ALKY5;
  }

  public String getF560205_Z56ALKY5()
  {
    return F560205_Z56ALKY5;
  }

  public String getF560205_Z56ALKY6()
  {
    return F560205_Z56ALKY6;
  }
  
  public String getF560205_Z56ALKY7()
  {
    return F560205_Z56ALKY7;
  }
  
  public String getF560205_Z56ALKY8()
  {
    return F560205_Z56ALKY8;
  }

  public void setF560205_SLCUSTFN(String F560205_SLCUSTFN)
  {
    this.F560205_SLCUSTFN = F560205_SLCUSTFN;
  }

  public String getF560205_SLCUSTFN()
  {
    return F560205_SLCUSTFN;
  }

  public void setF560205_GROUP(String F560205_GROUP)
  {
    this.F560205_GROUP = F560205_GROUP;
  }

  public String getF560205_GROUP()
  {
    return F560205_GROUP;
  }

  public void setF560205_CUID(String F560205_CUID)
  {
    this.F560205_CUID = F560205_CUID;
  }

  public String getF560205_CUID()
  {
    return F560205_CUID;
  }

  public void setF560205_SUBGRP(String F560205_SUBGRP)
  {
    this.F560205_SUBGRP = F560205_SUBGRP;
  }

  public String getF560205_SUBGRP()
  {
    return F560205_SUBGRP;
  }

  public void setF560205_FTH1(MathNumeric F560205_FTH1)
  {
    this.F560205_FTH1 = F560205_FTH1;
  }

  public MathNumeric getF560205_FTH1()
  {
    return F560205_FTH1;
  }

  public void setF560205_FTH2(MathNumeric F560205_FTH2)
  {
    this.F560205_FTH2 = F560205_FTH2;
  }

  public MathNumeric getF560205_FTH2()
  {
    return F560205_FTH2;
  }

  public void setF560205_FMTST(String F560205_FMTST)
  {
    this.F560205_FMTST = F560205_FMTST;
  }

  public String getF560205_FMTST()
  {
    return F560205_FMTST;
  }

  public void setF560205_CFGGC(String F560205_CFGGC)
  {
    this.F560205_CFGGC = F560205_CFGGC;
  }

  public String getF560205_CFGGC()
  {
    return F560205_CFGGC;
  }

  public void setF560205_GRPNAME(String F560205_GRPNAME)
  {
    this.F560205_GRPNAME = F560205_GRPNAME;
  }

  public String getF560205_GRPNAME()
  {
    return F560205_GRPNAME;
  }

  public void setF560205_FMTET(String F560205_FMTET)
  {
    this.F560205_FMTET = F560205_FMTET;
  }

  public String getF560205_FMTET()
  {
    return F560205_FMTET;
  }

  public void setF560205_RVID(String F560205_RVID)
  {
    this.F560205_RVID = F560205_RVID;
  }

  public String getF560205_RVID()
  {
    return F560205_RVID;
  }

  public void setF560205_WGNA(String F560205_WGNA)
  {
    this.F560205_WGNA = F560205_WGNA;
  }

  public String getF560205_WGNA()
  {
    return F560205_WGNA;
  }

  public void setF560205_URCD(String F560205_URCD)
  {
    this.F560205_URCD = F560205_URCD;
  }

  public String getF560205_URCD()
  {
    return F560205_URCD;
  }

  public void setF560205_URDT(Date F560205_URDT)
  {
    this.F560205_URDT = F560205_URDT;
  }

  public Date getF560205_URDT()
  {
    return F560205_URDT;
  }

  public void setF560205_URAT(MathNumeric F560205_URAT)
  {
    this.F560205_URAT = F560205_URAT;
  }

  public MathNumeric getF560205_URAT()
  {
    return F560205_URAT;
  }

  public void setF560205_URAB(MathNumeric F560205_URAB)
  {
    this.F560205_URAB = F560205_URAB;
  }

  public MathNumeric getF560205_URAB()
  {
    return F560205_URAB;
  }

  public void setF560205_URRF(String F560205_URRF)
  {
    this.F560205_URRF = F560205_URRF;
  }

  public String getF560205_URRF()
  {
    return F560205_URRF;
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

  public void setQueryResults(ArrayList queryResults)
  {
    this.queryResults = queryResults;
  }

  public ArrayList getQueryResults()
  {
    return queryResults;
  }
  
  public BE_HumanTaskResult getResultData(int index)
  {
    BE_HumanTaskResult result = null;
    if(index >= 0 && index < this.queryResults.size())
      result = (BE_HumanTaskResult)this.queryResults.get(index);
    return result;
  }

  public void setF560205_Z56ALKY6(String F560205_Z56ALKY6)
  {
    this.F560205_Z56ALKY6 = F560205_Z56ALKY6;
  }

  public void setF560205_Z56ALKY7(String F560205_Z56ALKY7)
  {
    this.F560205_Z56ALKY7 = F560205_Z56ALKY7;
  }

  public void setF560205_Z56ALKY8(String F560205_Z56ALKY8)
  {
    this.F560205_Z56ALKY8 = F560205_Z56ALKY8;
  }
}
