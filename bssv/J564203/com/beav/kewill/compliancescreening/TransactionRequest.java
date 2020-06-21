/**
 * Generated from schema type t|e=TransactionRequest|t|e=CompliantScreeningRequest|d=CompliantScreeningRequest@http://www.beav.com/kewill/compliancescreening
 */
package be.e1.bssv.J564203.com.beav.kewill.compliancescreening;

public class TransactionRequest implements java.io.Serializable
{
  private java.lang.String embargoScreening;

  public java.lang.String getEmbargoScreening()
  {
    return this.embargoScreening;
  }

  public void setEmbargoScreening(java.lang.String embargoScreening)
  {
    this.embargoScreening = embargoScreening;
  }

  private java.lang.String partyScreening;

  public java.lang.String getPartyScreening()
  {
    return this.partyScreening;
  }

  public void setPartyScreening(java.lang.String partyScreening)
  {
    this.partyScreening = partyScreening;
  }

  private java.lang.String licenseScreening;

  public java.lang.String getLicenseScreening()
  {
    return this.licenseScreening;
  }

  public void setLicenseScreening(java.lang.String licenseScreening)
  {
    this.licenseScreening = licenseScreening;
  }

  private java.lang.String ticket;

  public java.lang.String getTicket()
  {
    return this.ticket;
  }

  public void setTicket(java.lang.String ticket)
  {
    this.ticket = ticket;
  }

  private java.lang.String comments;

  public java.lang.String getComments()
  {
    return this.comments;
  }

  public void setComments(java.lang.String comments)
  {
    this.comments = comments;
  }

  private java.util.Calendar transactionDate;

  public java.util.Calendar getTransactionDate()
  {
    return this.transactionDate;
  }

  public void setTransactionDate(java.util.Calendar transactionDate)
  {
    this.transactionDate = transactionDate;
  }

  private java.lang.String userDefined;

  public java.lang.String getUserDefined()
  {
    return this.userDefined;
  }

  public void setUserDefined(java.lang.String userDefined)
  {
    this.userDefined = userDefined;
  }

  private be.e1.bssv.J564203.com.beav.kewill.compliancescreening.ShipFromCountry shipFromCountry;

  public be.e1.bssv.J564203.com.beav.kewill.compliancescreening.ShipFromCountry getShipFromCountry()
  {
    return this.shipFromCountry;
  }

  public void setShipFromCountry(be.e1.bssv.J564203.com.beav.kewill.compliancescreening.ShipFromCountry shipFromCountry)
  {
    this.shipFromCountry = shipFromCountry;
  }

  private be.e1.bssv.J564203.com.beav.kewill.compliancescreening.ShipToCountry shipToCountry;

  public be.e1.bssv.J564203.com.beav.kewill.compliancescreening.ShipToCountry getShipToCountry()
  {
    return this.shipToCountry;
  }

  public void setShipToCountry(be.e1.bssv.J564203.com.beav.kewill.compliancescreening.ShipToCountry shipToCountry)
  {
    this.shipToCountry = shipToCountry;
  }

  private be.e1.bssv.J564203.com.beav.kewill.compliancescreening.Classifier_Element[] classifier;

  public be.e1.bssv.J564203.com.beav.kewill.compliancescreening.Classifier_Element[] getClassifier()
  {
    return this.classifier;
  }

  public void setClassifier(be.e1.bssv.J564203.com.beav.kewill.compliancescreening.Classifier_Element[] classifier)
  {
    this.classifier = classifier;
  }

  private be.e1.bssv.J564203.com.beav.kewill.compliancescreening.Party_Element[] party;

  public be.e1.bssv.J564203.com.beav.kewill.compliancescreening.Party_Element[] getParty()
  {
    return this.party;
  }

  public void setParty(be.e1.bssv.J564203.com.beav.kewill.compliancescreening.Party_Element[] party)
  {
    this.party = party;
  }

  private be.e1.bssv.J564203.com.beav.kewill.compliancescreening.TransactionLine[] transactionLine;

  public be.e1.bssv.J564203.com.beav.kewill.compliancescreening.TransactionLine[] getTransactionLine()
  {
    return this.transactionLine;
  }

  public void setTransactionLine(be.e1.bssv.J564203.com.beav.kewill.compliancescreening.TransactionLine[] transactionLine)
  {
    this.transactionLine = transactionLine;
  }

  private be.e1.bssv.J564203.com.beav.kewill.compliancescreening.Descriptor_Element[] descriptor;

  public be.e1.bssv.J564203.com.beav.kewill.compliancescreening.Descriptor_Element[] getDescriptor()
  {
    return this.descriptor;
  }

  public void setDescriptor(be.e1.bssv.J564203.com.beav.kewill.compliancescreening.Descriptor_Element[] descriptor)
  {
    this.descriptor = descriptor;
  }

  private be.e1.bssv.J564203.com.beav.kewill.compliancescreening.Parameters parameters;

  public be.e1.bssv.J564203.com.beav.kewill.compliancescreening.Parameters getParameters()
  {
    return this.parameters;
  }

  public void setParameters(be.e1.bssv.J564203.com.beav.kewill.compliancescreening.Parameters parameters)
  {
    this.parameters = parameters;
  }

  private java.lang.String type;

  public java.lang.String getType()
  {
    return this.type;
  }

  public void setType(java.lang.String type)
  {
    this.type = type;
  }

  private java.lang.String version;

  public java.lang.String getVersion()
  {
    return this.version;
  }

  public void setVersion(java.lang.String version)
  {
    this.version = version;
  }

  private java.lang.String language;

  public java.lang.String getLanguage()
  {
    return this.language;
  }

  public void setLanguage(java.lang.String language)
  {
    this.language = language;
  }

  private java.lang.String dateFormat;

  public java.lang.String getDateFormat()
  {
    return this.dateFormat;
  }

  public void setDateFormat(java.lang.String dateFormat)
  {
    this.dateFormat = dateFormat;
  }

  private java.lang.String deploymentMode;

  public java.lang.String getDeploymentMode()
  {
    return this.deploymentMode;
  }

  public void setDeploymentMode(java.lang.String deploymentMode)
  {
    this.deploymentMode = deploymentMode;
  }

  private java.lang.String requestDate;

  public java.lang.String getRequestDate()
  {
    return this.requestDate;
  }

  public void setRequestDate(java.lang.String requestDate)
  {
    this.requestDate = requestDate;
  }

}
