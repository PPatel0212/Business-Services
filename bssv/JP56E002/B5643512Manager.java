package be.e1.bssv.JP56E002;

import be.e1.bssv.JP56E002.valueobject.B5643512Internal;
import be.e1.bssv.JP56E002.valueobject.B5643512Reply;
import be.e1.bssv.JP56E002.valueobject.B5643512Request;

import oracle.e1.bssvfoundation.base.BSFNParameters;
import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.PublishedBusinessService;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BSFNServiceInvalidArgException;
import oracle.e1.bssvfoundation.exception.BSFNServiceSystemException;
import oracle.e1.bssvfoundation.exception.BusinessServiceException;
import oracle.e1.bssvfoundation.services.IBSFNService;
import oracle.e1.bssvfoundation.util.E1Message;
import oracle.e1.bssvfoundation.util.E1MessageList;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc for PublishedBusinessService
 */
public class B5643512Manager extends PublishedBusinessService {
    /**
     * TODO: PublishedBusinessService Public Constructor
     */
    public B5643512Manager() {
    }

    /**
     * Published method for processB5643512UBE TODO: Document method
     * Acts as wrapper method, passing null context and null connection,
     * will call protected processB5643512UBE
     * @param vo the value object representing input data for TODO:complete javadoc
     * @return confirmVO the response data from the business process TODO:complete javadoc
     * @throws BusinessServiceException
     */
    public B5643512Reply processB5643512UBE(B5643512Request vo) throws BusinessServiceException {
        return processB5643512UBE(null,null,vo);
    }

    /**
     * Protected method for B5643512Manager PublishedBusinessService. processB5643512UBE will call make calls to BusinessService classes
     * for completing business process.
     * TODO: Comment parameters
     * @param vo the value object representing input data for TODO:complete javadoc
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @return response value object is the data returned from the business process TODO:complete javadoc
     * @throws BusinessServiceException
     */
    protected B5643512Reply processB5643512UBE(IContext context, IConnection connection, B5643512Request vo) throws BusinessServiceException {
        //perform all work within try block, finally will clean up any connections.
        try {
            //Call start published method, passing context of null
            //will return context object so BSFN or DB operation can be called later.
            //Context will be used to indicate default transaction boundary, as well as access
            //to formatting and logging operations.
            context = startPublishedMethod(context, "processB5643512UBE", vo);

            //Create new PublishedBusinessService messages object for holding errors and warnings that occur during processing.
            E1MessageList messages = new E1MessageList();
            //TODO: Create a new internal value object.
            B5643512Internal internalVO = new B5643512Internal();
            messages.addMessages(vo.mapToIntenalVO(internalVO));
            //TODO: Call BusinessService passing context, connection and internal VO
            messages.addMessages(callLaunchPurchaseOrderReceiptTravel(context, connection, internalVO));
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
            B5643512Reply confirmVO = new B5643512Reply(internalVO);
            confirmVO.setE1MessageList(messages);
            finishPublishedMethod(context, "processB5643512UBE");
            //return outVO, filled with return values and messages
            return confirmVO;
        } finally {
            //Call close to clean up all remaining connections and resources.
            close(context, "processB5643512UBE");
        }
    }

    /**
     * Calls the LaunchPurchaseOrderReceiptTravel(B5643512) business function which has the D5643003 datastructure.
     * @param context conditionally provides the connection for the business function call and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param TODO document input parameters
     * @return A list of messages if there were application errors, warnings, or informational
     * messages. Returns null if there were no messages.
     */
    private static E1MessageList callLaunchPurchaseOrderReceiptTravel(IContext context, IConnection connection, B5643512Internal internalVO) {
        BSFNParameters bsfnParams = new BSFNParameters();

        // map input parameters from input value object
        bsfnParams.setValue("szPrinterName", internalVO.getSzPrinterName());
        bsfnParams.setValue("szVersion", internalVO.getSzVersion());
        bsfnParams.setValue("mnDocVoucherInvoiceE", internalVO.getMnDocVoucherInvoiceE());
        bsfnParams.setValue("szCompanyKey", internalVO.getSzCompanyKey());
        bsfnParams.setValue("szDocumentType", internalVO.getSzDocumentType());

        try {
            //get bsfnService from context
            IBSFNService bsfnService = context.getBSFNService();

            //execute business function
            bsfnService.execute(context, connection, "LaunchPurchaseOrderReceiptTravel", bsfnParams);
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
        internalVO.setSzPrinterName((String)bsfnParams.getValue("szPrinterName"));
        internalVO.setSzVersion((String)bsfnParams.getValue("szVersion"));
        internalVO.setMnDocVoucherInvoiceE((MathNumeric)bsfnParams.getValue("mnDocVoucherInvoiceE"));
        internalVO.setSzCompanyKey((String)bsfnParams.getValue("szCompanyKey"));
        internalVO.setSzDocumentType((String)bsfnParams.getValue("szDocumentType"));

        //return any errors, warnings, or informational messages to the caller
        return bsfnParams.getE1MessageList();
    }
}
