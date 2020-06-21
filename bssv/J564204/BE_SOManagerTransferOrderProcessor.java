package be.e1.bssv.J564204;

import be.e1.bssv.J564204.valueobject.InternalValidateSOandUpdateTagFiles;

import oracle.e1.bssvfoundation.base.BSFNParameters;
import oracle.e1.bssvfoundation.base.BusinessService;
import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BSFNServiceInvalidArgException;
import oracle.e1.bssvfoundation.exception.BSFNServiceSystemException;
import oracle.e1.bssvfoundation.services.IBSFNService;
import oracle.e1.bssvfoundation.util.E1Message;
import oracle.e1.bssvfoundation.util.E1MessageList;

/**
 * TODO: Java Doc for BusinessService
 */
public abstract class BE_SOManagerTransferOrderProcessor extends BusinessService {
    /**
     * TODO: Create Java Doc for: ValidateSOandUpdateTagFiles
     * Method ValidateSOandUpdateTagFiles is used for...?
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
     * @return an E1Message containing the text of any errors or warnings that may have occurred
     */
    public static E1MessageList validateSOandUpdateTagFiles(IContext context, IConnection connection, InternalValidateSOandUpdateTagFiles internalVO) {

        //Call start internal method, passing the context (which was passed from PublishedBusinessService).
        startInternalMethod(context, "validateSOandUpdateTagFiles", internalVO);
        //Create new message list for BusinessService processing.
        E1MessageList messages = new E1MessageList();

        //TODO: call method (created by the wizard), which then executes Business Function or Database operation.
       // Call E1 BSFN for SO validations and updating tag files.
       // InternalValidateSOandUpdateTagFiles internalValidateSOandUpdateTagFiles = new InternalValidateSOandUpdateTagFiles();
       // internalValidateSOandUpdateTagFiles.setSzProgramId_PID("N5642024");
        //internalValidateSOandUpdateTagFiles.setMnUniqueKeyID(new MathNumeric(0));
        callBE_F4211Validations(context, connection, internalVO);
        //TODO:  add messages returned from E1 processing to BusinessService message list.


        //Call finish internal method passing context.
        finishInternalMethod(context, "validateSOandUpdateTagFiles");

        //Call finish internal method passing context.
        return messages;
    }

    /**
     * Calls the BE_F4211Validations(N5642024) business function which has the D5642024 datastructure.
     * @param context conditionally provides the connection for the business function call and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param TODO document input parameters
     * @return A list of messages if there were application errors, warnings, or informational
     * messages. Returns null if there were no messages.
     */
    private static E1MessageList callBE_F4211Validations(IContext context, IConnection connection, InternalValidateSOandUpdateTagFiles internalVO) {
        BSFNParameters bsfnParams = new BSFNParameters();

        // map input parameters from input value object
        bsfnParams.setValue("szCompanyKeyOrderNo_KCOO", internalVO.getSzCompanyKeyOrderNo_KCOO());
        bsfnParams.setValue("mnDocumentOrderInvoiceE_DOCO", internalVO.getMnDocumentOrderInvoiceE_DOCO());
        bsfnParams.setValue("szOrderType_DCTO", internalVO.getSzOrderType_DCTO());
        bsfnParams.setValue("szP4210Version_VERS", internalVO.getSzP4210Version_VERS());
        bsfnParams.setValue("mnProdNoShort_Z56PNS", internalVO.getMnProdNoShort_Z56PNS());
        bsfnParams.setValue("szProductionNumber_Z56PN", internalVO.getSzProductionNumber_Z56PN());
        bsfnParams.setValue("c56ShipConsolidateFlag_Z56SCF", internalVO.getC56ShipConsolidateFlag_Z56SCF());
        bsfnParams.setValue("szTypeCode_CACTN", internalVO.getSzTypeCode_CACTN());
        try {
            //get bsfnService from context
            IBSFNService bsfnService = context.getBSFNService();

            //execute business function
            bsfnService.execute(context, connection, "BE_F4211Validations", bsfnParams);
        } catch (BSFNServiceInvalidArgException invalidArgEx) {
            //Create error message for Invalid Argument exception and return it in ErrorList
            E1MessageList returnMessages = new E1MessageList();
            returnMessages.addMessage(new E1Message(context, "018FIS", invalidArgEx.getMessage()));
            return returnMessages;
        }
        catch (BSFNServiceSystemException systemEx) {
            //Create error message for System exception and return it in ErrorList
            E1MessageList returnMessages = new E1MessageList();
            returnMessages.addMessage(new E1Message(context, "019FIS", systemEx.getMessage()));
            return returnMessages;
        }


        //map output parameters to output value object
        internalVO.setCErrorCode_ERRC(bsfnParams.getValue("cErrorCode_ERRC").toString());
        internalVO.setSzErrorCodeId_DTAI(bsfnParams.getValue("szErrorCodeId_DTAI").toString());

        //return any errors, warnings, or informational messages to the caller
        return bsfnParams.getE1MessageList();
    }
}
