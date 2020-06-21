package be.e1.bssv.util.J569803;

import be.e1.bssv.util.J569803.valueobject.LaunchUBE_D5698002A;

import oracle.e1.bssvfoundation.base.BSFNParameters;
import oracle.e1.bssvfoundation.base.BusinessService;
import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.services.IBSFNService;
import oracle.e1.bssvfoundation.util.E1Message;
import oracle.e1.bssvfoundation.util.E1MessageList;

/**
 * TODO: Java Doc for BusinessService
 */
public abstract class BE_LaunchUBEManager extends BusinessService {
    /**
     * TODO: Create Java Doc for: InternalLaunchUBE_B5698002
     * Method InternalLaunchUBE_B5698002 is used for...?
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
     * @return an E1Message containing the text of any errors or warnings that may have occurred
     */
    public static E1MessageList InternalLaunchUBE_B5698002(IContext context, IConnection connection, LaunchUBE_D5698002A internalVO) {

        //Call start internal method, passing the context (which was passed from PublishedBusinessService).
        startInternalMethod(context, "InternalLaunchUBE_B5698002", internalVO);
        //Create new message list for BusinessService processing.
        E1MessageList messages = new E1MessageList();

        //TODO: call method (created by the wizard), which then executes Business Function or Database operation.
        messages.addMessages(jdeLaunchUBE_B5698002(context, connection, internalVO));
        //TODO:  add messages returned from E1 processing to BusinessService message list.


        //Call finish internal method passing context.
        finishInternalMethod(context, "InternalLaunchUBE_B5698002");

        //Call finish internal method passing context.
        return messages;
    }
    private static E1MessageList jdeLaunchUBE_B5698002 (IContext context, IConnection connection, LaunchUBE_D5698002A internalVO)
    {
                                                                                                                         
            BSFNParameters bsfnParams = new BSFNParameters();
            bsfnParams.setValue("szReportName", internalVO.getSzReportName());
            bsfnParams.setValue("szReportVersion", internalVO.getSzReportVersion());
            bsfnParams.setValue("cGenerateBIPubLink", internalVO.getCGenerateBIPubLink());
            bsfnParams.setValue("cRunAsynchronous", internalVO.getCRunAsynchronous());
            bsfnParams.setValue("szPrintQueue", internalVO.getSzPrintQueue());
            
            
    /* Call the jde business function */
            try
            { 
                    /* Execute the bsfn service */
                    IBSFNService bsfnService = context.getBSFNService();
                    bsfnService.execute(context, connection, "BE_LaunchUBE", bsfnParams);
                    internalVO.setSzPrintQueue(bsfnParams.getValue("szPrintQueue").toString());
                    internalVO.setSzOutputFileName(bsfnParams.getValue("szOutputFileName").toString());
                    internalVO.setSzOutputFileLink(bsfnParams.getValue("szOutputFileLink").toString());
                    internalVO.setCErrorFlag(bsfnParams.getValue("CErrorFlag").toString());
                    internalVO.setSzErrorMessage(bsfnParams.getValue("szErrorMessage").toString());
            }
            catch(Exception invExp)
            {
            }
            return bsfnParams.getE1MessageList();
    }
}