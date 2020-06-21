package be.e1.bssv.J564203.valueobject;

import java.io.Serializable;
import java.util.Date;
import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalCountry extends ValueObject implements Serializable
{
  private java.lang.String schema;
  private java.lang.String domain;
  private java.lang.String code;

  public void setSchema(String schema)
  {
    this.schema = schema;
  }

  public String getSchema()
  {
    return schema;
  }

  public void setDomain(String domain)
  {
    this.domain = domain;
  }

  public String getDomain()
  {
    return domain;
  }

  public void setCode(String code)
  {
    this.code = code;
  }

  public String getCode()
  {
    return code;
  }
}
