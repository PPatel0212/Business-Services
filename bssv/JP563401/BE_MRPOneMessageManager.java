package be.e1.bssv.JP563401;

import be.e1.bssv.J563401.BE_MRPOneMessageProcessor;
import be.e1.bssv.J563401.valueobject.InternalMessageCancellationRequest;
import be.e1.bssv.JP563401.valueobject.GetMessageCancellationRequest;
import be.e1.bssv.JP563401.valueobject.ShowMessageCancellationReply;

import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.PublishedBusinessService;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BusinessServiceException;
import oracle.e1.bssvfoundation.util.E1MessageList;

/**
 * TODO: Java Doc for PublishedBusinessService
 */
public class BE_MRPOneMessageManager extends PublishedBusinessService {
    /**
     * TODO: PublishedBusinessService Public Constructor
     */
    public BE_MRPOneMessageManager() {
    }

    /**
     * Published method for getMRPOneMessage TODO: Document method
     * Acts as wrapper method, passing null context and null connection,
     * will call protected getMRPOneMessage
     * @param vo the value object representing input data for TODO:complete javadoc
     * @return confirmVO the response data from the business process TODO:complete javadoc
     * @throws BusinessServiceException
     */
    public ShowMessageCancellationReply getMRPOneMessage(GetMessageCancellationRequest vo) throws BusinessServiceException {
        return getMRPOneMessage(null,null,vo);
    }

    /**
     * Protected method for BE_MRPOneMessageManager PublishedBusinessService. getMRPOneMessage will call make calls to BusinessService classes
     * for completing business process.
     * TODO: Comment parameters
     * @param vo the value object representing input data for TODO:complete javadoc
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @return response value object is the data returned from the business process TODO:complete javadoc
     * @throws BusinessServiceException
     */
    protected ShowMessageCancellationReply getMRPOneMessage(IContext context, IConnection connection, GetMessageCancellationRequest vo) throws BusinessServiceException {
        //perform all work within try block, finally will clean up any connections.
        try {
            //Call start published method, passing context of null
            //will return context object so BSFN or DB operation can be called later.
            //Context will be used to indicate default transaction boundary, as well as access
            //to formatting and logging operations.
            context = startPublishedMethod(context, "getMRPOneMessage", vo);

            //Create new PublishedBusinessService messages object for holding errors and warnings that occur during processing.
            E1MessageList messages = new E1MessageList();
            //TODO: Create a new internal value object.
            InternalMessageCancellationRequest internalVO = new InternalMessageCancellationRequest();
            vo.mapFromPublished(internalVO);
            //TODO: Call BusinessService passing context, connection and internal VO
            IConnection connectionnew = context.getNewConnection(IConnection.AUTO);
            
            E1MessageList bssvMessages = BE_MRPOneMessageProcessor.callMRPOneMessageProcessor(context, connectionnew, internalVO);
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
            ShowMessageCancellationReply confirmVO = new ShowMessageCancellationReply(internalVO);
            confirmVO.setE1MessageList(messages);
            confirmVO.setErrorCode(internalVO.getCErrorCode());
            int ErrorCode = Integer.parseInt(confirmVO.getErrorCode());
            switch (ErrorCode){
            case 0: confirmVO.setErroMessage("Success");break;
            case 1: confirmVO.setErroMessage("Error");break;
            case 2: confirmVO.setErroMessage("Records not found for given UKID");break;
            case 3: confirmVO.setErroMessage("Invalid processing Mode");break;
            }
            
            finishPublishedMethod(context, "getMRPOneMessage");
            //return outVO, filled with return values and messages
            return confirmVO;
        } 
        
                 catch(BusinessServiceException e){
                    e.printStackTrace();
                    context.getBSSVLogger().app(context, "@@@@@Business Services Exception Occured -Inside BSSV JP563401@@@@@", "\n", e.toString(), null);
                    throw new BusinessServiceException(e.toString(),context);
                }catch(Exception e){
                    e.printStackTrace();
                    context.getBSSVLogger().app(context, "@@@@@Generic Exception Occured -Inside BSSV JP563401@@@@@", "\n", e.toString(), null);
                    throw new BusinessServiceException(e.toString(),context);
                }
        
        finally {
            //Call close to clean up all remaining connections and resources.
            close(context, "getMRPOneMessage");
        }
    }
}
