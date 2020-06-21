package be.e1.bssv.JP564301;

import be.e1.bssv.J5643001.InternalPaymentTerms;
import be.e1.bssv.J5643001.valueobject.InternalPaymentTerms_D48S0350;
import be.e1.bssv.JP564301.valueobject.PaymentTermsReply;
import be.e1.bssv.JP564301.valueobject.PaymentTermsRequest;

import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.PublishedBusinessService;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BusinessServiceException;
import oracle.e1.bssvfoundation.util.E1MessageList;

/**
 * TODO: Java Doc for PublishedBusinessService
 */
public class PaymentTermsManager extends PublishedBusinessService {
    /**
     * TODO: PublishedBusinessService Public Constructor
     */
    public PaymentTermsManager() {
    }

    /**
     * Published method for getPaymentTerms TODO: Document method
     * Acts as wrapper method, passing null context and null connection,
     * will call protected getPaymentTerms
     * @param vo the value object representing input data for TODO:complete javadoc
     * @return confirmVO the response data from the business process TODO:complete javadoc
     * @throws BusinessServiceException
     */
    public PaymentTermsReply getPaymentTerms(PaymentTermsRequest vo) throws BusinessServiceException {
        return getPaymentTerms(null,null,vo);
    }

    /**
     * Protected method for PaymentTermsManager PublishedBusinessService. getPaymentTerms will call make calls to BusinessService classes
     * for completing business process.
     * TODO: Comment parameters
     * @param vo the value object representing input data for TODO:complete javadoc
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @return response value object is the data returned from the business process TODO:complete javadoc
     * @throws BusinessServiceException
     */
    protected PaymentTermsReply getPaymentTerms(IContext context, IConnection connection, PaymentTermsRequest vo) throws BusinessServiceException {
        //perform all work within try block, finally will clean up any connections.
        try {
            //Call start published method, passing context of null
            //will return context object so BSFN or DB operation can be called later.
            //Context will be used to indicate default transaction boundary, as well as access
            //to formatting and logging operations.
            context = startPublishedMethod(context, "getPaymentTerms", vo);

            //Create new PublishedBusinessService messages object for holding errors and warnings that occur during processing.
            E1MessageList messages = new E1MessageList();
            //TODO: Create a new internal value object.
            InternalPaymentTerms_D48S0350 internalPaymentTerms = new InternalPaymentTerms_D48S0350();
            
            messages.addMessages(vo.mapPublishedToInternal(context, connection, internalPaymentTerms));

            //TODO: Call BusinessService passing context, connection and internal VO
            if (!messages.hasErrors()){
                messages.addMessages(InternalPaymentTerms.getPaymentTerms(context, connection, internalPaymentTerms));
            }

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
            PaymentTermsReply confirmVO = new PaymentTermsReply(internalPaymentTerms);
            confirmVO.setE1MessageList(messages);
            finishPublishedMethod(context, "getPaymentTerms");
            //return outVO, filled with return values and messages
            return confirmVO;
        } finally {
            //Call close to clean up all remaining connections and resources.
            close(context, "getPaymentTerms");
        }
    }
}
