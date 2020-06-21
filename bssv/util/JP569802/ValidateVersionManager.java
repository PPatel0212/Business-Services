package be.e1.bssv.util.JP569802;

import be.e1.bssv.util.J569802.BE_ValidateVersion;
import be.e1.bssv.util.J569802.valueobject.ValidateVersion_D4002400;
import be.e1.bssv.util.JP569802.valueobject.ValidateVersionReply;
import be.e1.bssv.util.JP569802.valueobject.ValidateVersionRequest;

import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.PublishedBusinessService;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BusinessServiceException;
import oracle.e1.bssvfoundation.util.E1MessageList;

/**
 * TODO: Java Doc for PublishedBusinessService
 */
public class ValidateVersionManager extends PublishedBusinessService {
    /**
     * TODO: PublishedBusinessService Public Constructor
     */
    public ValidateVersionManager() {
    }

    /**
     * Published method for BE_ValidateVersion TODO: Document method
     * Acts as wrapper method, passing null context and null connection,
     * will call protected BE_ValidateVersion
     * @param vo the value object representing input data for TODO:complete javadoc
     * @return confirmVO the response data from the business process TODO:complete javadoc
     * @throws BusinessServiceException
     */
    public ValidateVersionReply BE_ValidateVersion(ValidateVersionRequest vo) throws BusinessServiceException 
    {
               return BE_ValidateVersion(null,null,vo);
    }

    /**
     * Protected method for ValidateVersionManager PublishedBusinessService. BE_ValidateVersion will call make calls to BusinessService classes
     * for completing business process.
     * TODO: Comment parameters
     * @param vo the value object representing input data for TODO:complete javadoc
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @return response value object is the data returned from the business process TODO:complete javadoc
     * @throws BusinessServiceException
     */
    protected ValidateVersionReply BE_ValidateVersion(IContext context, IConnection connection, ValidateVersionRequest vo) throws BusinessServiceException {
        //perform all work within try block, finally will clean up any connections.
        try {
            //Call start published method, passing context of null
            //will return context object so BSFN or DB operation can be called later.
            //Context will be used to indicate default transaction boundary, as well as access
            //to formatting and logging operations.
            context = startPublishedMethod(context, "BE_ValidateVersion", vo);

            //Create new PublishedBusinessService messages object for holding errors and warnings that occur during processing.
            E1MessageList messages = new E1MessageList();
            //TODO: Create a new internal value object.
            
            ValidateVersion_D4002400 internalDS= new ValidateVersion_D4002400(); 
            internalDS.setSzProgramId(vo.getProgramID());
            internalDS.setSzVersion(vo.getVersionHistory());
            BE_ValidateVersion.InternalValidateVersion(context, connection, internalDS);
                
            //TODO: Call BusinessService passing context, connection and internal VO            
            messages.addMessages(BE_ValidateVersion.InternalValidateVersion(context, connection, internalDS));
            
            //PublishedBusinessService will send either warnings in the Confirm Value Object or throw a BusinessServiceException.
            //If messages contains errors, throw the exception

            if (messages.hasErrors()) {
                //Get the string representation of all the messages.
                String error = messages.getMessagesAsString();
                //Throw new BusinessServiceException
                throw new BusinessServiceException(error, context);
            }

                                
            //Exception was not thrown, so create the confirm VO from internal VO
            ValidateVersionReply confirmVO = new ValidateVersionReply(internalDS);
            confirmVO.setE1MessageList(messages);
            finishPublishedMethod(context, "BE_ValidateVersion");
            //return outVO, filled with return values and messages
            return confirmVO;
        } finally {
            //Call close to clean up all remaining connections and resources.
            close(context, "BE_ValidateVersion");
        }
    }
}
