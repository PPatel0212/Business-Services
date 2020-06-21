package be.e1.bssv.util.JP560118;

import be.e1.bssv.util.J5601018.BE_GetAbsAddlData;
import be.e1.bssv.util.J5601018.valueobject.BE_GetABSAddlData_D5601018A;
import be.e1.bssv.util.J5601019.BEUpdateABSRequestNumber;
import be.e1.bssv.util.J5601019.valueobject.BEUpdateABSRequestNumber_D5601019A;
import be.e1.bssv.util.JP560118.valueobject.GetABSDataReply;
import be.e1.bssv.util.JP560118.valueobject.GetABSDataRequest;

import be.e1.bssv.util.JP560118.valueobject.UpdateABSReply;
import be.e1.bssv.util.JP560118.valueobject.UpdateABSRequest;

import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.PublishedBusinessService;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BusinessServiceException;
import oracle.e1.bssvfoundation.util.E1MessageList;

/**
 * TODO: Java Doc for PublishedBusinessService
 */
public class BE_ABSDataManager extends PublishedBusinessService {
    /**
     * TODO: PublishedBusinessService Public Constructor
     */
    public BE_ABSDataManager() {
    }

    /**
     * Published method for getABSData TODO: Document method
     * Acts as wrapper method, passing null context and null connection,
     * will call protected getABSData
     * @param vo the value object representing input data for TODO:complete javadoc
     * @return confirmVO the response data from the business process TODO:complete javadoc
     * @throws BusinessServiceException
     */
    public GetABSDataReply getABSData(GetABSDataRequest vo) throws BusinessServiceException {
        return getABSData(null,null,vo);
    }

    /**
     * Protected method for BE_ABSDataManager PublishedBusinessService. getABSData will call make calls to BusinessService classes
     * for completing business process.
     * TODO: Comment parameters
     * @param vo the value object representing input data for TODO:complete javadoc
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @return response value object is the data returned from the business process TODO:complete javadoc
     * @throws BusinessServiceException
     */
    protected GetABSDataReply getABSData(IContext context, IConnection connection, GetABSDataRequest vo) throws BusinessServiceException {
        //perform all work within try block, finally will clean up any connections.
        try {
            //Call start published method, passing context of null
            //will return context object so BSFN or DB operation can be called later.
            //Context will be used to indicate default transaction boundary, as well as access
            //to formatting and logging operations.
            context = startPublishedMethod(context, "getABSData", vo);

            //Create new PublishedBusinessService messages object for holding errors and warnings that occur during processing.
            E1MessageList messages = new E1MessageList();
            //TODO: Create a new internal value object.
            BE_GetABSAddlData_D5601018A internalData = new BE_GetABSAddlData_D5601018A();
            //TODO: Call BusinessService passing context, connection and internal VO
            messages.addMessages(vo.mapPublishedToInternal(context, internalData));
            //TODO: Add messages returned from BusinessService to message list for PublishedBusinessService.
            messages.addMessages(BE_GetAbsAddlData.getAbsAddlData(context, connection, internalData));
            //PublishedBusinessService will send either warnings in the Confirm Value Object or throw a BusinessServiceException.
            //If messages contains errors, throw the exception

            if (messages.hasErrors()) {
                //Get the string representation of all the messages.
                String error = messages.getMessagesAsString();
                //Throw new BusinessServiceException
                throw new BusinessServiceException(error, context);
            }

            //Exception was not thrown, so create the confirm VO from internal VO
            GetABSDataReply confirmVO = new GetABSDataReply(internalData);
            confirmVO.setE1MessageList(messages);
            finishPublishedMethod(context, "getABSData");
            //return outVO, filled with return values and messages
            return confirmVO;
        } finally {
            //Call close to clean up all remaining connections and resources.
            close(context, "getABSData");
        }
    }
    
    
    /**
     * Published method for getABSData TODO: Document method
     * Acts as wrapper method, passing null context and null connection,
     * will call protected getABSData
     * @param vo the value object representing input data for TODO:complete javadoc
     * @return confirmVO the response data from the business process TODO:complete javadoc
     * @throws BusinessServiceException
     */
    public UpdateABSReply updateABSRequestNumber(UpdateABSRequest vo) throws BusinessServiceException {
        return updateABSRequestNumber(null,null,vo);
    }

    /**
     * Protected method for BE_ABSDataManager PublishedBusinessService. updateABSRequestNumber will call make calls to BusinessService classes
     * for completing business process.
     * TODO: Comment parameters
     * @param vo the value object representing input data for TODO:complete javadoc
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @return response value object is the data returned from the business process TODO:complete javadoc
     * @throws BusinessServiceException
     */
    protected UpdateABSReply updateABSRequestNumber(IContext context, IConnection connection, UpdateABSRequest vo) throws BusinessServiceException {
        //perform all work within try block, finally will clean up any connections.
        try {
            //Call start published method, passing context of null
            //will return context object so BSFN or DB operation can be called later.
            //Context will be used to indicate default transaction boundary, as well as access
            //to formatting and logging operations.
            context = startPublishedMethod(context, "updateABSRequestNumber", vo);

            //Create new PublishedBusinessService messages object for holding errors and warnings that occur during processing.
            E1MessageList messages = new E1MessageList();
            //TODO: Create a new internal value object.
             BEUpdateABSRequestNumber_D5601019A internalData = new BEUpdateABSRequestNumber_D5601019A();
            
            //TODO: Call BusinessService passing context, connection and internal VO
            messages.addMessages( vo.mapPublishedToInternal(context, internalData) );
             
            //TODO: Add messages returned from BusinessService to message list for PublishedBusinessService.
            messages.addMessages( BEUpdateABSRequestNumber.updateABSRequestNumber(context, connection, internalData) );
            //PublishedBusinessService will send either warnings in the Confirm Value Object or throw a BusinessServiceException.
            //If messages contains errors, throw the exception

            if (messages.hasErrors()) {
                //Get the string representation of all the messages.
                String error = messages.getMessagesAsString();
                //Throw new BusinessServiceException
                throw new BusinessServiceException(error, context);
            }

            //Exception was not thrown, so create the confirm VO from internal VO
            UpdateABSReply confirmVO = new UpdateABSReply(internalData);
            confirmVO.setE1MessageList(messages);
            finishPublishedMethod(context, "updateABSRequestNumber");
            //return outVO, filled with return values and messages
            return confirmVO;
        } finally {
            //Call close to clean up all remaining connections and resources.
            close(context, "updateABSRequestNumber");
        }
    }    
    
}
