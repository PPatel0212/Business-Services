package be.e1.bssv.J564201.valueobject;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class SOHeaderQuery extends ValueObject implements Serializable
{
  /**
   * Address Number - Ship To
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: SHAN <br>
   * EnterpriseOne field length:  8 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private MathNumeric customerNumber = null;

  /**
   * Date - Order/Transaction
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: TRDJ <br>
   * EnterpriseOne field length:  6 <br>
   */
  private Date fromDate = null;

  /**
   * Date - Order/Transaction
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: TRDJ <br>
   * EnterpriseOne field length:  6 <br>
   */
  private Date throughDate = null;

  /**
   * Field is set to 0 if there are no errors.
   * Anything other than 0 should be considered an error
   */
  private String cErrorFlag = null;

  /**
   * Field contains a description of any error that occurs.
   * This field is only populated when cErrorFlag is not zero
   */
  private String szErrorMessage = null;
  
  /**
   * ArrayList for holding the results returned by the query
   */
  private ArrayList queryResults = null;
  
  /**
   * Size of the query results
   */
  int resultSize = 0;
  
  private String transactionOriginator = null;
  
  private String orderStatus = null;
  

  public void setCustomerNumber(MathNumeric customerNumber)
  {
    this.customerNumber = customerNumber;
  }

  public MathNumeric getCustomerNumber()
  {
    return customerNumber;
  }

  public void setFromDate(Date fromDate)
  {
    this.fromDate = fromDate;
  }

  public Date getFromDate()
  {
    return fromDate;
  }

  public void setThroughDate(Date throughDate)
  {
    this.throughDate = throughDate;
  }

  public Date getThroughDate()
  {
    return throughDate;
  }

  public void setCErrorFlag(String cErrorFlag)
  {
    this.cErrorFlag = cErrorFlag;
  }

  public String getCErrorFlag()
  {
    return cErrorFlag;
  }

  public void setSzErrorMessage(String szErrorMessage)
  {
    this.szErrorMessage = szErrorMessage;
  }

  public String getSzErrorMessage()
  {
    return szErrorMessage;
  }

  public void setQueryResults(ArrayList queryResults)
  {
    this.queryResults = queryResults;
    if(queryResults != null)
    {
      this.resultSize = queryResults.size();
    }
  }

  public ArrayList getQueryResults()
  {
    return queryResults;
  }

  public int getResultSize()
  {
    return resultSize;
  }
  
  public SOHeaderResult getResultData(int index)
  {
    if(index >= 0 && index < this.resultSize)
    {
      return (SOHeaderResult)queryResults.get(index);
    }
    return null;
  }

    public void setTransactionOriginator(String transactionOriginator) {
        this.transactionOriginator = transactionOriginator;
    }

    public String getTransactionOriginator() {
        return transactionOriginator;
    }

  public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
  }

  public String getOrderStatus() {
    return orderStatus;
  }
}
