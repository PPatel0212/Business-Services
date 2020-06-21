package be.e1.bssv.JP563002;

import be.e1.bssv.J563002.BE_LoadBOMProcessor;
import be.e1.bssv.J563002.valueobject.InternalBOMParent;
import be.e1.bssv.JP563002.valueobject.LoadBOMParent;
import be.e1.bssv.JP563002.valueobject.ConfirmLoadItemBOM;

import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.PublishedBusinessService;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BusinessServiceException;
import oracle.e1.bssvfoundation.util.E1MessageList;

/**
 * TODO: Java Doc for PublishedBusinessService
 */
public class BE_LoadItemBOMManager extends PublishedBusinessService {
    /**
     * TODO: PublishedBusinessService Public Constructor
     */
    public BE_LoadItemBOMManager() {
    }

    /**
     * Published method for loadBOM TODO: Document method
     * Acts as wrapper method, passing null context and null connection,
     * will call protected loadBOM
     * @param vo the value object representing input data for TODO:complete javadoc
     * @return confirmVO the response data from the business process TODO:complete javadoc
     * @throws BusinessServiceException
     */
    public ConfirmLoadItemBOM loadBOM(LoadBOMParent vo) throws BusinessServiceException {
        return loadBOM(null,null,vo);
    }

    /**
     * Protected method for BE_LoadItemBOMManager PublishedBusinessService. loadBOM will call make calls to BusinessService classes
     * for completing business process.
     * TODO: Comment parameters
     * @param vo the value object representing input data for TODO:complete javadoc
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @return response value object is the data returned from the business process TODO:complete javadoc
     * @throws BusinessServiceException
     */
    protected ConfirmLoadItemBOM loadBOM(IContext context, IConnection connection, LoadBOMParent vo) throws BusinessServiceException {
        //perform all work within try block, finally will clean up any connections.
        try {
            //Call start published method, passing context of null
            //will return context object so BSFN or DB operation can be called later.
            //Context will be used to indicate default transaction boundary, as well as access
            //to formatting and logging operations.
            context = startPublishedMethod(context, "loadBOM", vo, IConnection.AUTO);

            //Create new PublishedBusinessService messages object for holding errors and warnings that occur during processing.
            E1MessageList messages = new E1MessageList();
            //TODO: Create a new internal value object.
            InternalBOMParent internalVO = new InternalBOMParent();
            
            //Call routine mapFromPublished that maps values from vo to internalVO.
            messages.addMessages(vo.mapFromPublished(context, connection, internalVO));
            //TODO: Call BusinessService passing context, connection and internal VO
            if (!messages.hasErrors())
            {        
              messages.addMessages(BE_LoadBOMProcessor.loadBOM(context, connection, internalVO)); 
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
            ConfirmLoadItemBOM confirmVO = new ConfirmLoadItemBOM(internalVO);
            confirmVO.setE1MessageList(messages);
            finishPublishedMethod(context, "loadBOM");
            //return outVO, filled with return values and messages
            return confirmVO;
        } finally {
            //Call close to clean up all remaining connections and resources.
            close(context, "loadBOM");
        }
    }
}
