package be.e1.bssv.util.J569804;

import be.e1.bssv.util.J569804.com.beav.e1.mediaobjectnotify.MediaObject;
import be.e1.bssv.util.J569804.com.beav.e1.mediaobjectnotify.MediaObjectNotifyRequest;
import be.e1.bssv.util.J569804.com.beav.e1.mediaobjectnotify.MediaObjectNotifyResponce;
import be.e1.bssv.util.J569804.proxy.MediaObjectNotificationPortClient;
import be.e1.bssv.util.J569804.valueobject.MONotify_D5698003B;

import java.math.BigInteger;

import oracle.e1.bssvfoundation.base.BusinessService;
import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.util.E1Message;
import oracle.e1.bssvfoundation.util.E1MessageList;
import oracle.e1.bssvfoundation.util.SoftCodingRecordAccess;

import org.w3c.dom.Element; 

/**
 * TODO: Java Doc for BusinessService
 */
public abstract class BE_MONotify extends BusinessService
{
  /**
   * TODO: Create Java Doc for: InternalMediaObjectNotify_B5698003
   * Method InternalMediaObjectNotify_B5698003 is used for...?
   * @param context conditionally provides the connection for the database operation and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
   * @return an E1Message containing the text of any errors or warnings that may have occurred
   */
  public static E1MessageList InternalMediaObjectNotify_B5698003(IContext context, IConnection connection, MONotify_D5698003B internalVO)
  {
    //Call start internal method, passing the context (which was passed from PublishedBusinessService).
    startInternalMethod(context, "InternalMediaObjectNotify_B5698003", internalVO);
    //Create new message list for BusinessService processing.
    E1MessageList messages = new E1MessageList();

    MediaObject media = new MediaObject();
    media.setName(internalVO.getSzMOName());
    media.setKey(internalVO.getSzMOKey());
    media.setSequenceNumber(BigInteger.valueOf(internalVO.getNMOSeqNumber()));
    media.setItemName(internalVO.getSzItemName());
    media.setType(internalVO.getSzMOTypeString());
    
    MediaObjectNotifyRequest mediaNotificationRequest = new MediaObjectNotifyRequest();
    mediaNotificationRequest.setActionCode(internalVO.getCActionCode());
    mediaNotificationRequest.setMediaObject(media);
    
    try
    {
      MediaObjectNotificationPortClient proxyClient = new MediaObjectNotificationPortClient();
      initPortWithSoftCoding(context, proxyClient, messages);
      MediaObjectNotifyResponce mediaNotificationResponse = proxyClient.process(mediaNotificationRequest);
      internalVO.setCErrorCode(mediaNotificationResponse.getStatusCode().toString());
      internalVO.setSzErrorDescription(mediaNotificationResponse.getStatusMessage());
    }
    catch(Exception exp)
    {
      internalVO.setCErrorCode("1");
      internalVO.setSzErrorDescription("Problems calling webservice via proxy");
    }

    //Call finish internal method passing context.
    finishInternalMethod(context, "InternalMediaObjectNotify_B5698003");

    //Call finish internal method passing context.
    return messages;
  }
  
  public static E1MessageList initPortWithSoftCoding(IContext context, MediaObjectNotificationPortClient portClient, E1MessageList msgList)
  {
    final String softCodingKey = "J569804";
    try
    {
      Element softCodingRecord = SoftCodingRecordAccess.getSoftCodingRecord(context, softCodingKey);
      if(softCodingRecord != null)
      {
        String serviceUrl = SoftCodingRecordAccess.getSoftcodingRecordFieldvalue(context, "endpoint", softCodingRecord);
        if(serviceUrl != null)
        {
          portClient.setEndpoint(serviceUrl);
        }
      }
    }
    catch(Exception exp)
    {
      context.getBSSVLogger().app(context, "WEB_SERVICE_CALL", "Invalid Softcoding Record", null, exp);
      System.out.println("Error: Invalid softcoding record");
      E1Message e1Msg = new E1Message(context, "004FIS", "Invalid Softcoding Record");
      msgList.addMessage(e1Msg);      
    }
    return msgList;
  }
}
