package be.e1.bssv.util.J569804.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalMOValueObject extends ValueObject implements Serializable
{
  /**
   * Media Object Array <br>
   */
  private MOItem_Internal[] moItems = null;

  /**
   * Download Attachments <br>
   */
  private boolean downloadMediaObject = true;
  
  /**
   * Media object key
   */
  private String szMediaObjectKey = null;
  
  /**
   * Name of the media object
   */
  private String szMoName = null;
  
  /**
   * Builds and returns the Media Object Key with the media object attributes
   */
  public String getSzMoKey()
  {
    return szMediaObjectKey;
  }

  /**
   * Returns the Media Object name
   */
  public String getSzMoName()
  {
    return szMoName;
  }

  public void setMoItems(MOItem_Internal[] moItems)
  {
    this.moItems = moItems;
  }

  public MOItem_Internal[] getMoItems()
  {
    return moItems;
  }

  public void setDownloadMediaObject(boolean downloadMediaObject)
  {
    this.downloadMediaObject = downloadMediaObject;
  }

  public boolean isDownloadMediaObject()
  {
    return downloadMediaObject;
  }

  public void setSzMoKey(String szMediaObjectKey)
  {
    this.szMediaObjectKey = szMediaObjectKey;
  }

  public void setSzMoName(String szMoName)
  {
    this.szMoName = szMoName;
  }
}
