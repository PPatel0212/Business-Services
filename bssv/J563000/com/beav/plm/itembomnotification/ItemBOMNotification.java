/**
 * Generated from schema type t|e=ItemBOMNotification|d=ItemBOMNotification@http://www.beav.com/plm/itembomnotification
 */
package be.e1.bssv.J563000.com.beav.plm.itembomnotification;

public class ItemBOMNotification implements java.io.Serializable
{

  private java.lang.String transactionType;

  public java.lang.String getTransactionType()
  {
    return this.transactionType;
  }

  public void setTransactionType(java.lang.String transactionType)
  {
    this.transactionType = transactionType;
  }

  private java.math.BigInteger transactionId;

  public java.math.BigInteger getTransactionId()
  {
    return this.transactionId;
  }

  public void setTransactionId(java.math.BigInteger transactionId)
  {
    this.transactionId = transactionId;
  }

  private java.lang.String plmSystem;

  public java.lang.String getPlmSystem()
  {
    return this.plmSystem;
  }

  public void setPlmSystem(java.lang.String plmSystem)
  {
    this.plmSystem = plmSystem;
  }
  
  private java.lang.String changeNumber;

  public void setChangeNumber(String changeNumber)
  {
    this.changeNumber = changeNumber;
  }

  public String getChangeNumber()
  {
    return changeNumber;
  }

  private java.math.BigInteger errorCount;

  public java.math.BigInteger getErrorCount()
  {
    return this.errorCount;
  }

  public void setErrorCount(java.math.BigInteger errorCount)
  {
    this.errorCount = errorCount;
  }

  private java.lang.String siteId;

  public java.lang.String getSiteId()
  {
    return this.siteId;
  }

  public void setSiteId(java.lang.String siteId)
  {
    this.siteId = siteId;
  }

  private be.e1.bssv.J563000.com.beav.plm.itembomnotification.ErrorMessages[] errorMessages;

  public be.e1.bssv.J563000.com.beav.plm.itembomnotification.ErrorMessages[] getErrorMessages()
  {
    return this.errorMessages;
  }

  public void setErrorMessages(be.e1.bssv.J563000.com.beav.plm.itembomnotification.ErrorMessages[] errorMessages)
  {
    this.errorMessages = errorMessages;
  }

}
