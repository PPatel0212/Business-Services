package be.e1.bssv.util.JP564303;

import be.e1.bssv.util.J564303.BE_LaunchPOManager;
import be.e1.bssv.util.J564303.valueobject.LaunchPO_D5643001A;
import be.e1.bssv.util.JP564303.valueobject.POReply;
import be.e1.bssv.util.JP564303.valueobject.PORequest;

import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.PublishedBusinessService;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BusinessServiceException;
import oracle.e1.bssvfoundation.util.E1MessageList;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc for PublishedBusinessService
 */
public class BE_RunPOManager
  extends PublishedBusinessService
{
  /**
   * TODO: PublishedBusinessService Public Constructor
   */
  public BE_RunPOManager()
  {
  }

  /**
   * Published method for BE_LaunchR43500WithRI TODO: Document method
   * Acts as wrapper method, passing null context and null connection,
   * will call protected BE_LaunchR43500WithRI
   * @param vo the value object representing input data for TODO:complete javadoc
   * @return confirmVO the response data from the business process TODO:complete javadoc
   * @throws BusinessServiceException
   */
  public POReply runPO(PORequest vo)
    throws BusinessServiceException
  {
    return runPO(null,null,vo);
  }

  /**
   * Protected method for BE_RunPOManager PublishedBusinessService. BE_LaunchR43500WithRI will call make calls to BusinessService classes
   * for completing business process.
   * TODO: Comment parameters
   * @param vo the value object representing input data for TODO:complete javadoc
   * @param context conditionally provides the connection for the database operation and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @return response value object is the data returned from the business process TODO:complete javadoc
   * @throws BusinessServiceException
   */
  protected POReply runPO(IContext context, IConnection connection, PORequest vo)
    throws BusinessServiceException
  {
    //perform all work within try block, finally will clean up any connections.
    try
    {
      //Call start published method, passing context of null
      //will return context object so BSFN or DB operation can be called later.
      //Context will be used to indicate default transaction boundary, as well as access
      //to formatting and logging operations.
      context = startPublishedMethod(context, "runPO", vo);

      //Create new PublishedBusinessService messages object for holding errors and warnings that occur during processing.
      E1MessageList messages = new E1MessageList();
      //TODO: Create a new internal value object.
      LaunchPO_D5643001A internalDS= new LaunchPO_D5643001A(); 
      internalDS.setSzReportName(vo.getReportName());
      internalDS.setSzReportVersion(vo.getReportVersion());
      internalDS.setSzPrintQueue(vo.getPrintQueue());
      internalDS.setCRunAsynchronous(vo.getRunAsynch());
      internalDS.setMnPONumberRI(new MathNumeric(vo.getOrderNumber()));
      internalDS.setSzPODocTypeRI(vo.getOrderType());
      internalDS.setSzPOOrderSuffixRI(vo.getOrderSuffix());
      internalDS.setSzPOCompanyRI(vo.getOrderCompanyOrderNumber());
      internalDS.setCPOProcessModeRI(vo.getModeProcessing());
      internalDS.setCPOGenSourceSystemRI(vo.getPOGeneratorSourceSystem());
      internalDS.setMnPOUniqueKeyRI(new MathNumeric(vo.getUniqueKeyIDInternal()));
      internalDS.setCGenerateBIPubLink(vo.getBiLinkFlag());
      
      //TODO: Call BusinessService passing context, connection and internal VO
      messages.addMessages(BE_LaunchPOManager.InternalLaunchPO_B5643001(context, connection, internalDS));
      //TODO: Add messages returned from BusinessService to message list for PublishedBusinessService.

      //PublishedBusinessService will send either warnings in the Confirm Value Object or throw a BusinessServiceException.
      //If messages contains errors, throw the exception

      if (messages.hasErrors())
      {
        //Get the string representation of all the messages.
        String error = messages.getMessagesAsString();
        //Throw new BusinessServiceException
        throw new BusinessServiceException(error, context);
      }

      //Exception was not thrown, so create the confirm VO from internal VO
      POReply confirmVO = new POReply(internalDS);
      confirmVO.setE1MessageList(messages);
      finishPublishedMethod(context, "RunPO");
      //return outVO, filled with return values and messages
      return confirmVO;
    } 
    finally
    {
      //Call close to clean up all remaining connections and resources.
      close(context, "RunPO");
    }
    }

    private static void InternalrunPO(IContext context,
                                       IConnection connection,
                                       LaunchPO_D5643001A internalDS) {
  }
}
