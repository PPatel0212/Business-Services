package be.e1.bssv.J564203.valueobject;

import java.io.Serializable;

import java.util.Date;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalTransaction extends ValueObject implements Serializable
{
  private java.lang.String embargoScreening;
  private java.lang.String partyScreening;
  private java.lang.String licenseScreening;
  private java.lang.String ticket;
  private java.lang.String comments;
  private java.util.Date transactionDate;
  private java.lang.String userDefined;
  private InternalShipFromCountry shipFromCountry;
  private InternalShipToCountry shipToCountry;
  private InternalClassify[] classifier;
  private InternalParty[] party;
  private InternalTransactionLine[] transactionLine;
  private InternalDescriptor[] descriptor;
  private InternalParameters parameters;
  private java.lang.String type;
  private java.lang.String version;
  private java.lang.String language;
  private java.lang.String dateFormat;
  private java.lang.String deployMode;
  private java.util.Date requestDate;

  public void setEmbargoScreening(String embargoScreening)
  {
    this.embargoScreening = embargoScreening;
  }

  public String getEmbargoScreening()
  {
    return embargoScreening;
  }

  public void setPartyScreening(String partyScreening)
  {
    this.partyScreening = partyScreening;
  }

  public String getPartyScreening()
  {
    return partyScreening;
  }

  public void setLicenseScreening(String licenseScreening)
  {
    this.licenseScreening = licenseScreening;
  }

  public String getLicenseScreening()
  {
    return licenseScreening;
  }

  public void setTicket(String ticket)
  {
    this.ticket = ticket;
  }

  public String getTicket()
  {
    return ticket;
  }

  public void setComments(String comments)
  {
    this.comments = comments;
  }

  public String getComments()
  {
    return comments;
  }

  public void setTransactionDate(Date transactionDate)
  {
    this.transactionDate = transactionDate;
  }

  public Date getTransactionDate()
  {
    return transactionDate;
  }

  public void setUserDefined(String userDefined)
  {
    this.userDefined = userDefined;
  }

  public String getUserDefined()
  {
    return userDefined;
  }

  public void setShipFromCountry(InternalShipFromCountry shipFromCountry)
  {
    this.shipFromCountry = shipFromCountry;
  }

  public InternalShipFromCountry getShipFromCountry()
  {
    return shipFromCountry;
  }

  public void setShipToCountry(InternalShipToCountry shipToCountry)
  {
    this.shipToCountry = shipToCountry;
  }

  public InternalShipToCountry getShipToCountry()
  {
    return shipToCountry;
  }

  public void setClassifier(InternalClassify[] classifier)
  {
    this.classifier = classifier;
  }

  public InternalClassify[] getClassifier()
  {
    return classifier;
  }

  public void setParty(InternalParty[] party)
  {
    this.party = party;
  }

  public InternalParty[] getParty()
  {
    return party;
  }

  public void setTransactionLine(InternalTransactionLine[] transactionLine)
  {
    this.transactionLine = transactionLine;
  }

  public InternalTransactionLine[] getTransactionLine()
  {
    return transactionLine;
  }

  public void setDescriptor(InternalDescriptor[] descriptor)
  {
    this.descriptor = descriptor;
  }

  public InternalDescriptor[] getDescriptor()
  {
    return descriptor;
  }

  public void setParameters(InternalParameters parameters)
  {
    this.parameters = parameters;
  }

  public InternalParameters getParameters()
  {
    return parameters;
  }

  public void setType(String type)
  {
    this.type = type;
  }

  public String getType()
  {
    return type;
  }

  public void setVersion(String version)
  {
    this.version = version;
  }

  public String getVersion()
  {
    return version;
  }

  public void setLanguage(String language)
  {
    this.language = language;
  }

  public String getLanguage()
  {
    return language;
  }

  public void setDateFormat(String dateFormat)
  {
    this.dateFormat = dateFormat;
  }

  public String getDateFormat()
  {
    return dateFormat;
  }

  public void setDeployMode(String deployMode)
  {
    this.deployMode = deployMode;
  }

  public String getDeployMode()
  {
    return deployMode;
  }

  public void setRequestDate(Date requestDate)
  {
    this.requestDate = requestDate;
  }

  public Date getRequestDate()
  {
    return requestDate;
  }
}
