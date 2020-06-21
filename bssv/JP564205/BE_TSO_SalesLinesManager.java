package be.e1.bssv.JP564205;

import be.e1.bssv.J564205.BE_TSO_SalesLineProcessor;
import be.e1.bssv.J564205.valueobject.InternalVOTSOSalesLines;
import be.e1.bssv.JP564205.valueobject.GetTSOSalesOrderLines;
import be.e1.bssv.JP564205.valueobject.ShowTSOSalesOrderLines;

import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.PublishedBusinessService;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BusinessServiceException;
import oracle.e1.bssvfoundation.util.E1MessageList;

/**
 * TODO: Java Doc for PublishedBusinessService
 */
public class BE_TSO_SalesLinesManager extends PublishedBusinessService {
    /**
     * TODO: PublishedBusinessService Public Constructor
     */
    public BE_TSO_SalesLinesManager() {
    }

    /**
     * Published method for GetTSOSalesLinesDetails TODO: Document method
     * Acts as wrapper method, passing null context and null connection,
     * will call protected GetTSOSalesLinesDetails
     * @param vo the value object representing input data for TODO:complete javadoc
     * @return confirmVO the response data from the business process TODO:complete javadoc
     * @throws BusinessServiceException
     */
    public ShowTSOSalesOrderLines GetTSOSalesLinesDetails(GetTSOSalesOrderLines vo) throws BusinessServiceException {
        return GetTSOSalesLinesDetails(null,null,vo);
    }

    /**
     * Protected method for BE_TSO_SalesLinesManager PublishedBusinessService. GetTSOSalesLinesDetails will call make calls to BusinessService classes
     * for completing business process.
     * TODO: Comment parameters
     * @param vo the value object representing input data for TODO:complete javadoc
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @return response value object is the data returned from the business process TODO:complete javadoc
     * @throws BusinessServiceException
     */
    protected ShowTSOSalesOrderLines GetTSOSalesLinesDetails(IContext context, IConnection connection, GetTSOSalesOrderLines vo) throws BusinessServiceException {
        //perform all work within try block, finally will clean up any connections.
        try {
            //Call start published method, passing context of null
            //will return context object so BSFN or DB operation can be called later.
            //Context will be used to indicate default transaction boundary, as well as access
            //to formatting and logging operations.
            context = startPublishedMethod(context, "GetTSOSalesLinesDetails", vo);

            //Create new PublishedBusinessService messages object for holding errors and warnings that occur during processing.
            E1MessageList messages = new E1MessageList();
            //TODO: Create a new internal value object.
            InternalVOTSOSalesLines inputVO = new InternalVOTSOSalesLines();
            //TODO: Call BusinessService passing context, connection and internal VO
            messages.addMessages(vo.mapFromPublished(context, connection, inputVO));
            //TODO: Add messages returned from BusinessService to message list for PublishedBusinessService.
            System.out.println("After mapFromPublished: "+inputVO);
            //PublishedBusinessService will send either warnings in the Confirm Value Object or throw a BusinessServiceException.
            //If messages contains errors, throw the exception
            
            messages.addMessages(BE_TSO_SalesLineProcessor.GetSalesAndWorkOrderDetails(context, connection, inputVO));

            if (messages.hasErrors()) {
                //Get the string representation of all the messages.
                String error = messages.getMessagesAsString();
                //Throw new BusinessServiceException
                throw new BusinessServiceException(error, context);
            }
        
            System.out.println("Before mapToPublish: "+inputVO);
            //Exception was not thrown, so create the confirm VO from internal VO
            ShowTSOSalesOrderLines confirmVO = new ShowTSOSalesOrderLines(inputVO);
            System.out.println("Final VO: "+confirmVO);
            //confirmVO.setE1MessageList(messages);
            finishPublishedMethod(context, "GetTSOSalesLinesDetails");
            //return outVO, filled with return values and messages
            return confirmVO;
        } finally {
            //Call close to clean up all remaining connections and resources.
            close(context, "GetTSOSalesLinesDetails");
        }
    }
}
