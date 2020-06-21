package be.e1.bssv.util.JP569804.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class SelectMORequest extends ValueObject implements Serializable
{
  /**
   * Media Object Array <br>
   */
  private MOItem_Publish[] moItems = null;
  
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
   * TODO: Default public constructor for instantiating: SelectMORequest
   */
  public SelectMORequest()
  {
  }

  public void setMoItems(MOItem_Publish[] moItems)
  {
    this.moItems = moItems;
  }

  public MOItem_Publish[] getMoItems()
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

  public void setSzMediaObjectKey(String szMediaObjectKey)
  {
    this.szMediaObjectKey = szMediaObjectKey;
  }

  public String getSzMediaObjectKey()
  {
    return szMediaObjectKey;
  }

  public void setSzMoName(String szMoName)
  {
    this.szMoName = szMoName;
  }

  public String getSzMoName()
  {
    return szMoName;
  }
}
