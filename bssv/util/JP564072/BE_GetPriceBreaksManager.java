package be.e1.bssv.util.JP564072;

import be.e1.bssv.util.J564072.BE_GetPriceBreaks;
import be.e1.bssv.util.J564072.valueobject.BE_GetPriceBreaks_D564072A;
import be.e1.bssv.util.JP564072.valueobject.GetPriceBreakReply;
import be.e1.bssv.util.JP564072.valueobject.GetPriceBreakRequest;
import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.PublishedBusinessService;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BusinessServiceException;
import oracle.e1.bssvfoundation.util.E1MessageList;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc for PublishedBusinessService
 */
public class BE_GetPriceBreaksManager
  extends PublishedBusinessService
{
  /**
   * TODO: PublishedBusinessService Public Constructor
   */
  public BE_GetPriceBreaksManager()
  {
  }

  /**
   * Published method for BE_GetPriceBreaksManager TODO: Document method
   * Acts as wrapper method, passing null context and null connection,
   * will call protected BE_GetPriceBreaksManager
   * @param vo the value object representing input data for TODO:complete javadoc
   * @return confirmVO the response data from the business process TODO:complete javadoc
   * @throws BusinessServiceException
   */
  public GetPriceBreakReply BE_GetPriceBreaks(GetPriceBreakRequest vo)
    throws BusinessServiceException
  {
    return BE_GetPriceBreaksManager(null,null,vo);
  }

  /**
   * Protected method for BE_GetPriceBreaksManager PublishedBusinessService. BE_GetPriceBreaksManager will call make calls to BusinessService classes
   * for completing business process.
   * TODO: Comment parameters
   * @param vo the value object representing input data for TODO:complete javadoc
   * @param context conditionally provides the connection for the database operation and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @return response value object is the data returned from the business process TODO:complete javadoc
   * @throws BusinessServiceException
   */
  protected GetPriceBreakReply BE_GetPriceBreaksManager(IContext context, IConnection connection, GetPriceBreakRequest vo)
    throws BusinessServiceException
  {
    //perform all work within try block, finally will clean up any connections.
    try
    {
      //Call start published method, passing context of null
      //will return context object so BSFN or DB operation can be called later.
      //Context will be used to indicate default transaction boundary, as well as access
      //to formatting and logging operations.
      context = startPublishedMethod(context, "BE_GetPriceBreaksManager", vo);

      //Create new PublishedBusinessService messages object for holding errors and warnings that occur during processing.
      E1MessageList messages = new E1MessageList();
      //TODO: Create a new internal value object.
      BE_GetPriceBreaks_D564072A internalDS= new BE_GetPriceBreaks_D564072A(); 
      internalDS.setSzPriceAdjustmentName(vo.getPriceAdjustmentName());
      internalDS.setMnAddressNumber(new MathNumeric(vo.getAddressNumber()));
      internalDS.setSzIdentifier2ndItem(vo.getNdItemNumber());
      internalDS.setMnQuantityBreak1(new MathNumeric(vo.getQuantityBreak1()));
      internalDS.setMnQuantityBreak2(new MathNumeric(vo.getQuantityBreak2()));
      internalDS.setMnQuantityBreak3(new MathNumeric(vo.getQuantityBreak3()));
      internalDS.setMnQuantityBreak4(new MathNumeric(vo.getQuantityBreak4()));
      internalDS.setMnQuantityBreak5(new MathNumeric(vo.getQuantityBreak5()));
      internalDS.setMnQuantityBreak6(new MathNumeric(vo.getQuantityBreak6()));
      internalDS.setMnQuantityBreak7(new MathNumeric(vo.getQuantityBreak7()));
      internalDS.setMnQuantityBreak8(new MathNumeric(vo.getQuantityBreak8()));
      internalDS.setMnQuantityBreak9(new MathNumeric(vo.getQuantityBreak9()));
      internalDS.setMnQuantityBreak10(new MathNumeric(vo.getQuantityBreak10()));
      internalDS.setMnQuantityBreak11(new MathNumeric(vo.getQuantityBreak11()));
      internalDS.setMnQuantityBreak12(new MathNumeric(vo.getQuantityBreak12()));
      internalDS.setMnQuantityBreak13(new MathNumeric(vo.getQuantityBreak13()));
      internalDS.setMnQuantityBreak14(new MathNumeric(vo.getQuantityBreak14()));
      internalDS.setMnQuantityBreak15(new MathNumeric(vo.getQuantityBreak15()));
      internalDS.setSzCostCenter(vo.getCostCenter());
      internalDS.setSzCompany(vo.getCompany());
            
      //TODO: Call BusinessService passing context, connection and inteernal VO
      messages.addMessages(BE_GetPriceBreaks.InternalBE_GetPriceBreaks(context, connection, internalDS));
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
      GetPriceBreakReply confirmVO = new GetPriceBreakReply(internalDS);
      confirmVO.setE1MessageList(messages);
      finishPublishedMethod(context, "BE_GetPriceBreaksManager");
      //return outVO, filled with return values and messages
      return confirmVO;
    }
    finally
    {
      //Call close to clean up all remaining connections and resources.
      close(context, "BE_GetPriceBreaksManager");
    }
  }
}
