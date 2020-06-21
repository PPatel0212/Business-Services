package be.e1.bssv.J564203.valueobject;

import java.io.Serializable;

import java.util.Date;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalAdmin
  extends ValueObject
  implements Serializable
{
  private java.lang.String ticket;
  private java.lang.String subscriberId;
  private java.lang.String subscriberPassword;
  private java.util.Date requestDate;
  private java.lang.String outputFormat;
  private java.lang.String includedRequest;
  private java.lang.String comments;
  private InternalAdjustHolds orderKeys;

  public void setTicket(String ticket)
  {
    this.ticket = ticket;
  }

  public String getTicket()
  {
    return ticket;
  }

  public void setSubscriberId(String subscriberId)
  {
    this.subscriberId = subscriberId;
  }

  public String getSubscriberId()
  {
    return subscriberId;
  }

  public void setSubscriberPassword(String subscriberPassword)
  {
    this.subscriberPassword = subscriberPassword;
  }

  public String getSubscriberPassword()
  {
    return subscriberPassword;
  }

  public void setRequestDate(Date requestDate)
  {
    this.requestDate = requestDate;
  }

  public Date getRequestDate()
  {
    return requestDate;
  }

  public void setOutputFormat(String outputFormat)
  {
    this.outputFormat = outputFormat;
  }

  public String getOutputFormat()
  {
    return outputFormat;
  }

  public void setIncludedRequest(String includedRequest)
  {
    this.includedRequest = includedRequest;
  }

  public String getIncludedRequest()
  {
    return includedRequest;
  }

  public void setComments(String comments)
  {
    this.comments = comments;
  }

  public String getComments()
  {
    return comments;
  }

  public void setOrderKeys(InternalAdjustHolds orderKeys)
  {
    this.orderKeys = orderKeys;
  }

  public InternalAdjustHolds getOrderKeys()
  {
    return orderKeys;
  }
}
