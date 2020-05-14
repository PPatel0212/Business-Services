package oracle.e1.bssv.JP570101;

import oracle.e1.bssv.J570101.GetACNProcessor;
import oracle.e1.bssv.J570101.valueobject.GetACN;
import oracle.e1.bssv.J570101.valueobject.InternalGetACN;
import oracle.e1.bssv.J574901.ShipmentTableProcessor;
import oracle.e1.bssv.JP570101.valueobject.ACNInput_Published;
import oracle.e1.bssv.JP570101.valueobject.ACNOutput_Published;
import oracle.e1.bssv.JP570101.valueobject.GetACNPublished;
import oracle.e1.bssv.JP570101.valueobject.ShowACNPublished;
import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.PublishedBusinessService;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BusinessServiceException;
import oracle.e1.bssvfoundation.util.E1MessageList;

/**
 * TODO: Java Doc for PublishedBusinessService
 */
public class ACNManager extends PublishedBusinessService {
    /**
     * TODO: PublishedBusinessService Public Constructor
     */
    public ACNManager() {
    }

    /**
     * Published method for AddACNInfo TODO: Document method
     * Acts as wrapper method, passing null context and null connection,
     * will call protected AddACNInfo
     * @param vo the value object representing input data for TODO:complete javadoc
     * @return confirmVO the response data from the business process TODO:complete javadoc
     * @throws BusinessServiceException
     */
    public ShowACNPublished AddACNInfo(GetACNPublished vo) throws BusinessServiceException {
        return AddACNInfo(null, null, vo);
    }

    /**
     * Protected method for ACNManager PublishedBusinessService. AddACNInfo will call make calls to BusinessService classes
     * for completing business process.
     * TODO: Comment parameters
     * @param vo the value object representing input data for TODO:complete javadoc
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @return response value object is the data returned from the business process TODO:complete javadoc
     * @throws BusinessServiceException
     */
    protected ShowACNPublished AddACNInfo(IContext context, IConnection connection,
                                             GetACNPublished vo) throws BusinessServiceException {
        //perform all work within try block, finally will clean up any connections.
        GetACN internalVO=new GetACN();
        try {
            //Call start published method, passing context of null
            //will return context object so BSFN or DB operation can be called later.
            //Context will be used to indicate default transaction boundary, as well as access
            //to formatting and logging operations.
            context = startPublishedMethod(context, "addACNInfo", vo);

            //Create new PublishedBusinessService messages object for holding errors and warnings that occur during processing.
            E1MessageList messages = new E1MessageList();
            //TODO: Create a new internal value object.
            
           messages.addMessages(vo.mapFromPublished(context,connection, internalVO));
            
            //TODO: Call BusinessService passing context, connection and internal VO
           // E1MessageList bssvMessages = GetACNProcessor.AddACNInfo(context,connection, internalVO);
            
            //TODO: Add messages returned from BusinessService to message list for PublishedBusinessService.
            if (!messages.hasErrors()) {
                messages.addMessages(GetACNProcessor.AddACNInfo(context,connection, internalVO));

            }
            //PublishedBusinessService will send either warnings in the Confirm Value Object or throw a BusinessServiceException.
            //If messages contains errors, throw the exception

            if (messages.hasErrors()) {
                //Get the string representation of all the messages.
                String error = messages.getMessagesAsString();
                //Throw new BusinessServiceException
                throw new BusinessServiceException(error, context);
            }

            //Exception was not thrown, so create the confirm VO from internal VO
            ShowACNPublished confirmVO = new ShowACNPublished(internalVO.getShowACN());
            confirmVO.setE1MessageList(messages);
            finishPublishedMethod(context, "AddACNInfo");
            //return outVO, filled with return values and messages
            return confirmVO;
        } finally {
            //Call close to clean up all remaining connections and resources.
            close(context, "AddACNInfo");
        }
    }

    ACNOutput_Published ACNManager(ACNInput_Published p) {
        return null;
    }
}
