package be.e1.bssv.util.J5606001;

import be.e1.bssv.util.J5606001.timetracproxy.H2RINT0010BPELPortClient;
import be.e1.bssv.util.J5606001.valueobject.InternalProcessTimetrac_D564072A;

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
public abstract class Internal_ProcessTimeTrac extends BusinessService {
    /**
     * TODO: Create Java Doc for: Internal_ProcessTimetrac
     * Method Internal_ProcessTimetrac is used for...?
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
     * @return an E1Message containing the text of any errors or warnings that may have occurred
     */
    public static E1MessageList ProcessTimeTrac(IContext context, IConnection connection, InternalProcessTimetrac_D564072A internalVO) {

        //Call start internal method, passing the context (which was passed from PublishedBusinessService).
        startInternalMethod(context, "Internal_ProcessTimetrac", internalVO);
        //Create new message list for BusinessService processing.
        E1MessageList messages = new E1MessageList();

        //TODO: call method (created by the wizard), which then executes Business Function or Database operation.
        try{
            H2RINT0010BPELPortClient H2RPortClient = new H2RINT0010BPELPortClient();
            String serviceUrl = initPortWithSoftCoding(context, "J5606001", messages);  
            H2RPortClient.setEndpoint(serviceUrl);
            H2RPortClient.process(internalVO.getSzProcessString());
            }
        catch
          (Exception Exp) {
            System.out.println("call failed to portclient");
          }

        //TODO:  add messages returned from E1 processing to BusinessService message list.


        //Call finish internal method passing context.
        finishInternalMethod(context, "Internal_ProcessTimetrac");

        //Call finish internal method passing context.
        return messages;
    }
    

    public static String initPortWithSoftCoding(IContext context, String softCodeKey, E1MessageList msgList) throws Exception
    {
      String serviceUrl = null;
      try
      {
        Element softCodingValue = SoftCodingRecordAccess.getSoftCodingRecord(context, softCodeKey);
        if(softCodingValue != null)
        {
          serviceUrl = SoftCodingRecordAccess.getSoftcodingRecordFieldvalue(context, "endpoint", softCodingValue);
        }
      }
      catch(Exception exp)
      {
        context.getBSSVLogger().app(context, "WEB_SERVICE_CALL", "Invalid Softcoding Record", null, exp);
        E1Message e1Msg = new E1Message(context, "004FIS", "Invalid Softcoding Record");
        msgList.addMessage(e1Msg);
      }
      return serviceUrl;
    }
}
