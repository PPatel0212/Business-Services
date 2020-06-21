package be.e1.bssv.util.JP569804.valueobject;

import be.e1.bssv.util.J569804.valueobject.InternalMOValueObject;

import be.e1.bssv.util.J569804.valueobject.MOItem_Internal;

import be.e1.bssv.util.JP569804.BE_MediaObjectManager;

import java.io.Serializable;

import java.util.ArrayList;

import oracle.e1.bssvfoundation.base.MessageValueObject;
import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class SelectMOReply extends MessageValueObject implements Serializable
{
  /**
   * Media Object Array <br>
   */
  private MOItem_Publish[] moItems = null;

  /**
   * Object Name
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DCTO <br>
   * EnterpriseOne field length:  2 <br>
   */
  private String szMediaObjectName = null;

  /**
   * Order Suffix
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: SFXO <br>
   * EnterpriseOne field length:  3 <br>
   */
  private String szMediaObjectKey = null;
  
  /**
   * Download Attachments <br>
   */
  private boolean downloadMediaObject = true;

  /**
   * TODO: Default public constructor for instantiating: SelectMOReply
   */
  public SelectMOReply()
  {
  }

  /**
   * Constructor to initialize a new SelectMOReply object with data from internal value object.
   * @param internalVO
   */
  public SelectMOReply(InternalMOValueObject internalVO)
  {
    this.szMediaObjectKey = internalVO.getSzMoKey();
    this.szMediaObjectName = internalVO.getSzMoName();
    this.downloadMediaObject = internalVO.isDownloadMediaObject();
    this.moItems = BE_MediaObjectManager.convertMOItemInternal(internalVO.getMoItems());
  }
  
  public void setDownloadMediaObject(boolean downloadMediaObject)
  {
    this.downloadMediaObject = downloadMediaObject;
  }

  public boolean isDownloadMediaObject()
  {
    return downloadMediaObject;
  }

  public void setMoItems(MOItem_Publish[] moItems)
  {
    this.moItems = moItems;
  }

  public MOItem_Publish[] getMoItems()
  {
    return moItems;
  }

  public void setSzMediaObjectName(String szMediaObjectName)
  {
    this.szMediaObjectName = szMediaObjectName;
  }

  public String getSzMediaObjectName()
  {
    return szMediaObjectName;
  }

  public void setSzMediaObjectKey(String szMediaObjectKey)
  {
    this.szMediaObjectKey = szMediaObjectKey;
  }

  public String getSzMediaObjectKey()
  {
    return szMediaObjectKey;
  }
}
