package be.e1.bssv.JP564101;

import be.e1.bssv.J564101.BE_GetCCBTrackerInfoProcessor;
import be.e1.bssv.J564101.valueobject.InternalGetCCBTrackerInfo;
import be.e1.bssv.J564101.valueobject.InternalShowCCBTrackerInfo;
import be.e1.bssv.JP564101.valueobject.GetCCBTrackerInformation;
import be.e1.bssv.JP564101.valueobject.ShowCCBTrackerInformation;

import java.util.ArrayList;

import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.PublishedBusinessService;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BusinessServiceException;
import oracle.e1.bssvfoundation.util.E1MessageList;

/**
 * TODO: Java Doc for PublishedBusinessService
 */
public class BE_CCBTrackerInformationManager extends PublishedBusinessService {
  /**
   * TODO: PublishedBusinessService Public Constructor
   */
  public BE_CCBTrackerInformationManager() {
  }

  /**
   * Published method for ccbTrackerInformation TODO: Document method
   * Acts as wrapper method, passing null context and null connection,
   * will call protected ccbTrackerInformation
   * @param vo the value object representing input data for TODO:complete javadoc
   * @return confirmVO the response data from the business process TODO:complete javadoc
   * @throws BusinessServiceException
   */
  public ShowCCBTrackerInformation ccbTrackerInformation(GetCCBTrackerInformation vo) throws BusinessServiceException {
    return ccbTrackerInformation(null,null,vo);
  }

  /**
   * Protected method for BE_CCBTrackerInformationManager PublishedBusinessService. ccbTrackerInformation will call make calls to BusinessService classes
   * for completing business process.
   * TODO: Comment parameters
   * @param vo the value object representing input data for TODO:complete javadoc
   * @param context conditionally provides the connection for the database operation and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @return response value object is the data returned from the business process TODO:complete javadoc
   * @throws BusinessServiceException
   */
  protected ShowCCBTrackerInformation ccbTrackerInformation(IContext context, IConnection connection, GetCCBTrackerInformation vo) throws BusinessServiceException {
    //perform all work within try block, finally will clean up any connections.
    try {
      //Call start published method, passing context of null
      //will return context object so BSFN or DB operation can be called later.
      //Context will be used to indicate default transaction boundary, as well as access
      //to formatting and logging operations.
      context = startPublishedMethod(context, "ccbTrackerInformation", vo,connection.AUTO);

      //Create new PublishedBusinessService messages object for holding errors and warnings that occur during processing.
      E1MessageList messages = new E1MessageList();
      //TODO: Create a new internal value object.
      InternalGetCCBTrackerInfo  internalVO = new InternalGetCCBTrackerInfo();
      messages.addMessages(vo.mapFromPublished(context, internalVO));
      //TODO: Call BusinessService passing context, connection and internal VO
      E1MessageList bssvMessages = BE_GetCCBTrackerInfoProcessor.getCCBTrackerInfoProcessor(context, connection, internalVO);
        
        if (internalVO.getQueryResults()== null) {
            ArrayList queryResults = new ArrayList();
            InternalShowCCBTrackerInfo result = new InternalShowCCBTrackerInfo();
            result.setSzErrorCOde_DTAI("1");
            result.setSzErrorCOde_DTAI("Item Branch Record Not Found");
            queryResults.add(result);
            internalVO.setQueryResults(queryResults);
        }
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
      ShowCCBTrackerInformation confirmVO = new ShowCCBTrackerInformation(internalVO);
      confirmVO.setE1MessageList(messages);
      finishPublishedMethod(context, "ccbTrackerInformation");
      //return outVO, filled with return values and messages
      return confirmVO;
    } finally {
      //Call close to clean up all remaining connections and resources.
      close(context, "ccbTrackerInformation");
    }
  }
}
