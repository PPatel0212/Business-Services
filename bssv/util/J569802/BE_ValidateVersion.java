package be.e1.bssv.util.J569802;

import be.e1.bssv.util.J569802.valueobject.ValidateVersion_D4002400;

import com.jdedwards.system.connector.dynamic.callmethod.InvalidBSFNMethodArgumentException;

import oracle.e1.bssvfoundation.base.BSFNParameters;
import oracle.e1.bssvfoundation.base.BusinessService;
import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.services.IBSFNService;
import oracle.e1.bssvfoundation.util.E1MessageList;

/**
 * TODO: Java Doc for BusinessService
 */
public abstract class BE_ValidateVersion extends BusinessService {
    /**
     * TODO: Create Java Doc for: InternalValidateVersion
     * Method InternalValidateVersion is used for...?
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
     * @return an E1Message containing the text of any errors or warnings that may have occurred
     */
    public static E1MessageList InternalValidateVersion(IContext context, IConnection connection, ValidateVersion_D4002400 internalVO) {

        //Call start internal method, passing the context (which was passed from PublishedBusinessService).
        startInternalMethod(context, "InternalValidateVersion", internalVO);
        //Create new message list for BusinessService processing.
        E1MessageList messages = new E1MessageList();

        //TODO: call method (created by the wizard), which then executes Business Function or Database operation.
        messages.addMessages(jdeValidateVersion(context, connection, internalVO));
        //TODO:  add messages returned from E1 processing to BusinessService message list.


        //Call finish internal method passing context.
        finishInternalMethod(context, "InternalValidateVersion");

        //Call finish internal method passing context.
        return messages;
    }
    
    private static  E1MessageList  jdeValidateVersion (IContext context, IConnection connection, ValidateVersion_D4002400 internalVO)
    {
        BSFNParameters bsfnParams = new BSFNParameters();
        bsfnParams.setValue("szProgramId", internalVO.getSzProgramId());
        bsfnParams.setValue("szVersion", internalVO.getSzVersion());
         
        /* Call the jde business function */
        try
        { 
                /* Execute the bsfn service */
                IBSFNService bsfnService = context.getBSFNService();
                bsfnService.execute(context, connection, "F983051GetVersionTitle", bsfnParams);
                internalVO.setSzVersionTitle(bsfnParams.getValue("szVersionTitle").toString());         
        }
        catch(Exception invExp)
        {
        }
        return bsfnParams.getE1MessageList();
    }
}


