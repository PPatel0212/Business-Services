package be.e1.bssv.J563000;

import be.e1.bssv.J563000.ItemBOMNotifyProxy.ProcessItemBOMNotificationPortClient;
import be.e1.bssv.J563000.com.beav.plm.itembomnotification.ErrorMessages;
import be.e1.bssv.J563000.com.beav.plm.itembomnotification.ItemBOMNotification;
import be.e1.bssv.J563000.com.beav.plm.itembomnotification.ItemBOMNotificationResponse;
import be.e1.bssv.J563000.valueobject.ErrorMsgs;
import be.e1.bssv.J563000.valueobject.ItemBOM_D563000A;

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
public abstract class ItemBOMNotify extends BusinessService 
{
    /**
     * TODO: Create Java Doc for: InternalProcessNotification
     * Method InternalProcessNotification is used for...?
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
     * @return an E1Message containing the text of any errors or warnings that may have occurred
     */
    public static E1MessageList InternalProcessNotification(IContext context, IConnection connection, ItemBOM_D563000A internalVO) 
    {
        //Call start internal method, passing the context (which was passed from PublishedBusinessService).
        startInternalMethod(context, "InternalProcessNotification", internalVO);
        
        //Create new message list for BusinessService processing.
        E1MessageList messages = new E1MessageList();

        ItemBOMNotification notifyReq = new ItemBOMNotification();
        
        notifyReq.setTransactionType(internalVO.getSzTxnType());
        notifyReq.setPlmSystem(internalVO.getSzPlmSystem());
        notifyReq.setChangeNumber(internalVO.getSzChangeNumber());
        notifyReq.setSiteId(internalVO.getSzSiteId());
        
        if(internalVO.getMnTxnId() != null)
          notifyReq.setTransactionId(BigInteger.valueOf(internalVO.getMnTxnId().intValue()));
        else
          notifyReq.setTransactionId(BigInteger.ZERO);
        
        if(internalVO.getMnErrorCount() != null)
          notifyReq.setErrorCount(BigInteger.valueOf(internalVO.getMnErrorCount().intValue()));
        else
          notifyReq.setErrorCount(BigInteger.ZERO);
        
        ErrorMsgs[] errArray = internalVO.getErrorMessages();
        if(errArray != null)
        {
          ErrorMessages[] errMsgs = new ErrorMessages[errArray.length];
          for(int idx=0; idx<errArray.length; idx++)
          {
            errMsgs[idx] = new ErrorMessages();
            errMsgs[idx].setKeyIdentifier(errArray[idx].getSzMsgKey());
            errMsgs[idx].setMessage(errArray[idx].getSzMsgData());
          }
          notifyReq.setErrorMessages(errMsgs);
        }
        
        try
        {
          //Call the proxy
          ProcessItemBOMNotificationPortClient notifyProxy = new ProcessItemBOMNotificationPortClient();
          initPortWithSoftCoding(context, notifyProxy, messages);
          ItemBOMNotificationResponse notifyRep = notifyProxy.process(notifyReq);
          
          if(notifyRep != null && notifyRep.getStatusCode() != null)
          {
            if(notifyRep.getStatusCode().intValue() > 0)
              internalVO.setCBssvError("1");
            internalVO.setSzBssvErrorMsg(notifyRep.getStatusMessage());
          }
        }
        catch(Exception exp)
        {
          internalVO.setCBssvError("1");
          internalVO.setSzBssvErrorMsg(exp.getMessage());
        }
        
        //Call finish internal method passing context.
        finishInternalMethod(context, "InternalProcessNotification");
        //Call finish internal method passing context.
        return messages;
    }
 
  public static E1MessageList initPortWithSoftCoding(IContext context, ProcessItemBOMNotificationPortClient portClient, E1MessageList msgList)
  {
    final String softCodingKey = "J563000";
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
