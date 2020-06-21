package be.e1.bssv.util.JP569803;

import be.e1.bssv.util.J569802.BE_ValidateVersion;
import be.e1.bssv.util.J569803.BE_LaunchUBEManager;
import be.e1.bssv.util.J569803.valueobject.LaunchUBE_D5698002A;
import be.e1.bssv.util.JP569803.valueobject.UBEReply;
import be.e1.bssv.util.JP569803.valueobject.UBERequest;

import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.PublishedBusinessService;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BusinessServiceException;
import oracle.e1.bssvfoundation.util.E1MessageList;

/**
 * TODO: Java Doc for PublishedBusinessService
 */
public class BE_RunUBEManager extends PublishedBusinessService {
    /**
     * TODO: PublishedBusinessService Public Constructor
     */
    public BE_RunUBEManager() {
    }

    /**
     * Published method for runUBE TODO: Document method
     * Acts as wrapper method, passing null context and null connection,
     * will call protected runUBE
     * @param vo the value object representing input data for TODO:complete javadoc
     * @return confirmVO the response data from the business process TODO:complete javadoc
     * @throws BusinessServiceException
     */
    public UBEReply runUBE(UBERequest vo) throws BusinessServiceException {
        return runUBE(null,null,vo);
    }

    /**
     * Protected method for BE_RunUBEManager PublishedBusinessService. runUBE will call make calls to BusinessService classes
     * for completing business process.
     * TODO: Comment parameters
     * @param vo the value object representing input data for TODO:complete javadoc
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @return response value object is the data returned from the business process TODO:complete javadoc
     * @throws BusinessServiceException
     */
    protected UBEReply runUBE(IContext context, IConnection connection, UBERequest vo) throws BusinessServiceException {
        //perform all work within try block, finally will clean up any connections.
        try {
            //Call start published method, passing context of null
            //will return context object so BSFN or DB operation can be called later.
            //Context will be used to indicate default transaction boundary, as well as access
            //to formatting and logging operations.
            context = startPublishedMethod(context, "runUBE", vo);

            //Create new PublishedBusinessService messages object for holding errors and warnings that occur during processing.
            E1MessageList messages = new E1MessageList();
            //TODO: Create a new internal value object.
            LaunchUBE_D5698002A internalDS= new LaunchUBE_D5698002A(); 
            internalDS.setSzReportName(vo.getReportName());
            internalDS.setSzReportVersion(vo.getReportVersion());
            internalDS.setSzPrintQueue(vo.getPrintQueue());
            internalDS.setCRunAsynchronous(vo.getRunAsynch());
            
            //TODO: Call BusinessService passing context, connection and internal VO
            messages.addMessages(BE_LaunchUBEManager.InternalLaunchUBE_B5698002(context, connection, internalDS));
            //TODO: Add messages returned from BusinessService to message list for PublishedBusinessService.

            //PublishedBusinessService will send either warnings in the Confirm Value Object or throw a BusinessServiceException.
            //If messages contains errors, throw the exception

            if (messages.hasErrors()) {
                //Get the string representation of all the messages.
                String error = messages.getMessagesAsString();
                //Throw new BusinessServiceException
                throw new BusinessServiceException(error, context);
            }

            //Exception was not thrown, so create the confirm VO from internal VO
            UBEReply confirmVO = new UBEReply(internalDS);
          
            confirmVO.setE1MessageList(messages);
            finishPublishedMethod(context, "runUBE");
            //return outVO, filled with return values and messages
            return confirmVO;
        } finally {
            //Call close to clean up all remaining connections and resources.
            close(context, "runUBE");
        }
    }

    private static void InternalrunUBE(IContext context,
                                       IConnection connection,
                                       LaunchUBE_D5698002A internalDS) {
    }
}
