package be.e1.bssv.util.J560011;

import be.e1.bssv.util.J560011.ADLookupProxy.GetGroupUserDataPortClient;
import be.e1.bssv.util.J560011.com.beav.e1.adgroupuserdata.ADGroupUserDataReply;
import be.e1.bssv.util.J560011.com.beav.e1.adgroupuserdata.ADGroupUserDataRequest;
import be.e1.bssv.util.J560011.valueobject.ADLookup_D5642014C;

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
public abstract class BE_ActiveDirectoryManager extends BusinessService {
    /**
     * TODO: Create Java Doc for: getActiveDirectoryUsers
     * Method getActiveDirectoryUsers is used for...?
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
     * @return an E1Message containing the text of any errors or warnings that may have occurred
     */
    public static E1MessageList getActiveDirectoryUsers(IContext context, IConnection connection, ADLookup_D5642014C internalVO) {

        //Call start internal method, passing the context (which was passed from PublishedBusinessService).
        startInternalMethod(context, "getActiveDirectoryUsers", internalVO);
        //Create new message list for BusinessService processing.
        E1MessageList messages = new E1MessageList();

        try{
            GetGroupUserDataPortClient portClient = new GetGroupUserDataPortClient();
            initPortWithSoftCoding(context, portClient, messages);
            
            ADGroupUserDataRequest req = new ADGroupUserDataRequest();
            req.setGroupName(internalVO.getSzGroupName());
            
            ADGroupUserDataReply resp = portClient.process(req);
            internalVO.loadResponseData(resp);
        }
        catch(Exception exp) {
            E1Message msg = new E1Message(context, "007FIS", "Call to webservice proxy failed");
            messages.addMessage(msg);
            internalVO.setSzStatusCode("1");
            internalVO.setSzStatusMessage("Call to webservice proxy failed");
        }

        //Call finish internal method passing context.
        finishInternalMethod(context, "getActiveDirectoryUsers");

        //Call finish internal method passing context.
        return messages;
    }
    
    public static E1MessageList initPortWithSoftCoding(IContext context, GetGroupUserDataPortClient portClient, E1MessageList msgList)
    {
      final String softCodingKey = "J560011";
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
