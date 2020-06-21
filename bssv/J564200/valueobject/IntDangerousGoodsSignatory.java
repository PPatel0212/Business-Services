package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.DangerousGoodsSignatory;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class IntDangerousGoodsSignatory extends ValueObject implements Serializable
{
  private String contactName = null;
  private String title = null;
  private String place = null;

  public void setContactName(String contactName)
  {
    this.contactName = contactName;
  }

  public String getContactName()
  {
    return contactName;
  }

  public void setTitle(String title)
  {
    this.title = title;
  }

  public String getTitle()
  {
    return title;
  }

  public void setPlace(String place)
  {
    this.place = place;
  }

  public String getPlace()
  {
    return place;
  }
  
  public void copyToContentRecord(DangerousGoodsSignatory outData)
  {
    if(outData != null)
    {
      outData.setContactName(this.contactName);
      outData.setPlace(this.place);
      outData.setTitle(this.title);
    }
  }
}
