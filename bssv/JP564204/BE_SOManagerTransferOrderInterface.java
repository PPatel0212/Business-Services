package be.e1.bssv.JP564204;


import be.e1.bssv.J564204.BE_SOManagerTransferOrderProcessor;
import be.e1.bssv.J564204.valueobject.InternalValidateSOandUpdateTagFiles;
import be.e1.bssv.JP564204.valueobject.GetTransferOrderDetails;
import be.e1.bssv.JP564204.valueobject.SetTransferOrderResponse;

import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.PublishedBusinessService;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BusinessServiceException;
import oracle.e1.bssvfoundation.util.E1MessageList;

/**
 * TODO: Java Doc for PublishedBusinessService
 */
public class BE_SOManagerTransferOrderInterface extends PublishedBusinessService {
    /**
     * TODO: PublishedBusinessService Public Constructor
     */
    public BE_SOManagerTransferOrderInterface() {
    }

    /**
     * Published method for GetTransferOrderDetails TODO: Document method
     * Acts as wrapper method, passing null context and null connection,
     * will call protected GetTransferOrderDetails
     * @param vo the value object representing input data for TODO:complete javadoc
     * @return confirmVO the response data from the business process TODO:complete javadoc
     * @throws BusinessServiceException
     */
    public SetTransferOrderResponse validateSOandUpdateTagFiles(GetTransferOrderDetails vo) throws BusinessServiceException {
        return GetTransferOrderDetails(null,null,vo);
    }

    /**
     * Protected method for BE_SOManagerTransferOrderInterface PublishedBusinessService. GetTransferOrderDetails will call make calls to BusinessService classes
     * for completing business process.
     * TODO: Comment parameters
     * @param vo the value object representing input data for TODO:complete javadoc
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @return response value object is the data returned from the business process TODO:complete javadoc
     * @throws BusinessServiceException
     */
    protected SetTransferOrderResponse GetTransferOrderDetails(IContext context, IConnection connection, GetTransferOrderDetails vo) throws BusinessServiceException {
        //perform all work within try block, finally will clean up any connections.
        try {
            //Call start published method, passing context of null
            //will return context object so BSFN or DB operation can be called later.
            //Context will be used to indicate default transaction boundary, as well as access
            //to formatting and logging operations.
            context = startPublishedMethod(context, "GetTransferOrderDetails", vo);

            //Create new PublishedBusinessService messages object for holding errors and warnings that occur during processing.
            E1MessageList messages = new E1MessageList();
            E1MessageList bssvMessages = new E1MessageList();
            IConnection autoConnection = context.getNewConnection(IConnection.AUTO);
            //TODO: Create a new internal value object.
            InternalValidateSOandUpdateTagFiles internalVO = new InternalValidateSOandUpdateTagFiles();
            vo.mapFromPublished(context,internalVO);
            
            //TODO: Call BusinessService passing context, connection and internal VO
            bssvMessages = BE_SOManagerTransferOrderProcessor.validateSOandUpdateTagFiles(context, autoConnection, internalVO);
            messages.addMessages(bssvMessages);
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
            SetTransferOrderResponse confirmVO = new SetTransferOrderResponse();
            //SetPickSlipPrintResponse confirmVO = new SetPickSlipPrintResponse();
            // confirmVO.setE1MessageList(messages);
            if  (internalVO.getCErrorCode_ERRC().equalsIgnoreCase("0")){
                confirmVO.setErrorCode("0");
                confirmVO.setDataItem(internalVO.getSzErrorCodeId_DTAI());
            }
            else
            {
                confirmVO.setErrorCode("1");
                confirmVO.setDataItem(internalVO.getSzErrorCodeId_DTAI());
                         
            }
            autoConnection.close();
            finishPublishedMethod(context, "GetTransferOrderDetails");
            //return outVO, filled with return values and messages
            return confirmVO;
        } finally {
            //Call close to clean up all remaining connections and resources.
            close(context, "GetTransferOrderDetails");
        }
    }
}
