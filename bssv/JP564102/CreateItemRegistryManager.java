package be.e1.bssv.JP564102;


import be.e1.bssv.J564102.CreateItemRegInternalService;
import be.e1.bssv.J564102.valueobject.InternalCreateItemRegistry;
import be.e1.bssv.JP564102.valueobject.InputVOCreateItemReg;
import be.e1.bssv.JP564102.valueobject.ReturnVOCreateItemReg;


import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.PublishedBusinessService;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BusinessServiceException;
import oracle.e1.bssvfoundation.util.E1MessageList;



/**
 * TODO: Java Doc for PublishedBusinessService
 */
public class CreateItemRegistryManager extends PublishedBusinessService {
    /**
     * TODO: PublishedBusinessService Public Constructor
     */
    public CreateItemRegistryManager() {
    }

    /**
     * Published method for CreateItemRegPubMethod TODO: Document method
     * Acts as wrapper method, passing null context and null connection,
     * will call protected CreateItemRegPubMethod
     * @param vo the value object representing input data for TODO:complete javadoc
     * @return confirmVO the response data from the business process TODO:complete javadoc
     * @throws BusinessServiceException
     */
    public ReturnVOCreateItemReg CreateItemRegPubMethod(InputVOCreateItemReg vo) throws BusinessServiceException {
        return CreateItemRegPubMethod(null,null,vo);
    }

    /**
     * Protected method for CreateItemRegistryManager PublishedBusinessService. CreateItemRegPubMethod will call make calls to BusinessService classes
     * for completing business process.
     * TODO: Comment parameters
     * @param vo the value object representing input data for TODO:complete javadoc
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @return response value object is the data returned from the business process TODO:complete javadoc
     * @throws BusinessServiceException
     */
    protected ReturnVOCreateItemReg CreateItemRegPubMethod(IContext context, IConnection connection, InputVOCreateItemReg vo) throws BusinessServiceException {
        //perform all work within try block, finally will clean up any connections.
        try {
            //Call start published method, passing context of null
            //will return context object so BSFN or DB operation can be called later.
            //Context will be used to indicate default transaction boundary, as well as access
            //to formatting and logging operations.
            context = startPublishedMethod(context, "CreateItemRegPubMethod", vo);

            //Create new PublishedBusinessService messages object for holding errors and warnings that occur during processing.
            E1MessageList messages = new E1MessageList();
            //TODO: Create a new internal value object.
            InternalCreateItemRegistry internalVO = new InternalCreateItemRegistry();
            //Copy the values from Published VO and copy to the Internal VO
            E1MessageList mapMessages = vo.mapFromPublished(internalVO);
            //TODO: Call BusinessService passing context, connection and internal VO
            E1MessageList bssvMessages = CreateItemRegInternalService.CreateItemRegInternalMethod(context, connection, internalVO); 
            //TODO: Add messages returned from BusinessService to message list for PublishedBusinessService.
            messages.addMessages(bssvMessages);
            //PublishedBusinessService will send either warnings in the Confirm Value Object or throw a BusinessServiceException.
            //If messages contains errors, throw the exception

            if (messages.hasErrors()) {
                //Get the string representation of all the messages.
                String error = messages.getMessagesAsString();
                //Throw new BusinessServiceException
                throw new BusinessServiceException(error, context);
            }

            //Exception was not thrown, so create the confirm VO from internal VO
            ReturnVOCreateItemReg confirmVO = new ReturnVOCreateItemReg(internalVO);
            confirmVO.setE1MessageList(messages);
            finishPublishedMethod(context, "CreateItemRegPubMethod");
            //return outVO, filled with return values and messages
            return confirmVO;
        } finally {
            //Call close to clean up all remaining connections and resources.
            close(context, "CreateItemRegPubMethod");
        }
    }
}
