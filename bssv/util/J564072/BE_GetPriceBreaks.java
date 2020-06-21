package be.e1.bssv.util.J564072;

import be.e1.bssv.util.J564072.valueobject.BE_GetPriceBreaks_D564072A;

import oracle.e1.bssvfoundation.base.BSFNParameters;
import oracle.e1.bssvfoundation.base.BusinessService;
import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BSFNServiceInvalidArgException;
import oracle.e1.bssvfoundation.exception.BSFNServiceSystemException;
import oracle.e1.bssvfoundation.services.IBSFNService;
import oracle.e1.bssvfoundation.util.E1Message;
import oracle.e1.bssvfoundation.util.E1MessageList;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc for BusinessService
 */
public abstract class BE_GetPriceBreaks
  extends BusinessService
{
  /**
   * TODO: Create Java Doc for: BE_GetPriceBreaks
   * Method BE_GetPriceBreaks is used for...?
   * @param context conditionally provides the connection for the database operation and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
   * @return an E1Message containing the text of any errors or warnings that may have occurred
   */
  public static E1MessageList InternalBE_GetPriceBreaks(IContext context, IConnection connection, BE_GetPriceBreaks_D564072A internalVO)
  {

    //Call start internal method, passing the context (which was passed from PublishedBusinessService).
    startInternalMethod(context, "InternalBE_GetPriceBreaks", internalVO);
    //Create new message list for BusinessService processing.
    E1MessageList messages = new E1MessageList();

    //TODO: call method (created by the wizard), which then executes Business Function or Database operation.
    messages.addMessages(BE_GetPriceBreaks_D564072A(context, connection, internalVO));
    //TODO:  add messages returned from E1 processing to BusinessService message list.
    

    //Call finish internal method passing context.
    finishInternalMethod(context, "InternalBE_GetPriceBreaks");

    //Call finish internal method passing context.
    return messages;
  }
  private static E1MessageList BE_GetPriceBreaks_D564072A (IContext context, IConnection connection, BE_GetPriceBreaks_D564072A internalVO)
  {
                                                                                                                       
    BSFNParameters bsfnParams = new BSFNParameters();     
    bsfnParams.setValue("szPriceAdjustmentName", internalVO.getSzPriceAdjustmentName());
    bsfnParams.setValue("mnAddressNumber", internalVO.getMnAddressNumber());
    bsfnParams.setValue("szIdentifier2ndItem", internalVO.getSzIdentifier2ndItem());
    bsfnParams.setValue("mnQuantityBreak1", internalVO.getMnQuantityBreak1());
    bsfnParams.setValue("mnQuantityBreak2", internalVO.getMnQuantityBreak2());
    bsfnParams.setValue("mnQuantityBreak3", internalVO.getMnQuantityBreak3());
    bsfnParams.setValue("mnQuantityBreak4", internalVO.getMnQuantityBreak4());
    bsfnParams.setValue("mnQuantityBreak5", internalVO.getMnQuantityBreak5());
    bsfnParams.setValue("mnQuantityBreak6", internalVO.getMnQuantityBreak6());
    bsfnParams.setValue("mnQuantityBreak7", internalVO.getMnQuantityBreak7());
    bsfnParams.setValue("mnQuantityBreak8", internalVO.getMnQuantityBreak8());
    bsfnParams.setValue("mnQuantityBreak9", internalVO.getMnQuantityBreak9());
    bsfnParams.setValue("mnQuantityBreak10", internalVO.getMnQuantityBreak10());
    bsfnParams.setValue("mnQuantityBreak11", internalVO.getMnQuantityBreak11());
    bsfnParams.setValue("mnQuantityBreak12", internalVO.getMnQuantityBreak12());
    bsfnParams.setValue("mnQuantityBreak13", internalVO.getMnQuantityBreak13());
    bsfnParams.setValue("mnQuantityBreak14", internalVO.getMnQuantityBreak14());
    bsfnParams.setValue("mnQuantityBreak15", internalVO.getMnQuantityBreak15());
    bsfnParams.setValue("jdDateEffective", internalVO.getJdDateEffective());
    bsfnParams.setValue("szCurrencyCodeFrom", internalVO.getSzCurrencyCodeFrom());
    bsfnParams.setValue("szCompany", internalVO.getSzCompany());
    bsfnParams.setValue("szCostCenter", internalVO.getSzCostCenter());
          
    try
    {
      //get bsfnService from context
      IBSFNService bsfnService = context.getBSFNService();

      //execute business function
      bsfnService.execute(context, connection, "BE_GetPriceAdjustmentBreaks", bsfnParams);
    }
    catch (BSFNServiceInvalidArgException invalidArgEx)
    {
      //Create error message for Invalid Argument exception and return it in ErrorList
      E1MessageList returnMessages = new E1MessageList();
      returnMessages.addMessage(new E1Message(context, "018FIS", invalidArgEx.getMessage()));
      return returnMessages;
    }
    catch (BSFNServiceSystemException systemEx)
    {
      //Create error message for System exception and return it in ErrorList
      E1MessageList returnMessages = new E1MessageList();
      returnMessages.addMessage(new E1Message(context, "019FIS", systemEx.getMessage()));
      return returnMessages;
    }

                    
     internalVO.setMnPriceBreak1((MathNumeric)bsfnParams.getValue("mnPriceBreak1"));
     internalVO.setMnPriceBreak2((MathNumeric)bsfnParams.getValue("mnPriceBreak2"));
     internalVO.setMnPriceBreak3((MathNumeric)bsfnParams.getValue("mnPriceBreak3"));
     internalVO.setMnPriceBreak4((MathNumeric)bsfnParams.getValue("mnPriceBreak4"));
     internalVO.setMnPriceBreak5((MathNumeric)bsfnParams.getValue("mnPriceBreak5"));
     internalVO.setMnPriceBreak6((MathNumeric)bsfnParams.getValue("mnPriceBreak6"));
     internalVO.setMnPriceBreak7((MathNumeric)bsfnParams.getValue("mnPriceBreak7"));
     internalVO.setMnPriceBreak8((MathNumeric)bsfnParams.getValue("mnPriceBreak8"));
     internalVO.setMnPriceBreak9((MathNumeric)bsfnParams.getValue("mnPriceBreak9"));
     internalVO.setMnPriceBreak10((MathNumeric)bsfnParams.getValue("mnPriceBreak10"));
     internalVO.setMnPriceBreak11((MathNumeric)bsfnParams.getValue("mnPriceBreak11"));
     internalVO.setMnPriceBreak12((MathNumeric)bsfnParams.getValue("mnPriceBreak12"));
     internalVO.setMnPriceBreak13((MathNumeric)bsfnParams.getValue("mnPriceBreak13"));
     internalVO.setMnPriceBreak14((MathNumeric)bsfnParams.getValue("mnPriceBreak14"));
     internalVO.setMnPriceBreak15((MathNumeric)bsfnParams.getValue("mnPriceBreak15"));
     internalVO.setMnQuantityBreak1((MathNumeric)bsfnParams.getValue("mnQuantityBreak1"));
     internalVO.setMnQuantityBreak2((MathNumeric)bsfnParams.getValue("mnQuantityBreak2"));
     internalVO.setMnQuantityBreak3((MathNumeric)bsfnParams.getValue("mnQuantityBreak3"));
     internalVO.setMnQuantityBreak4((MathNumeric)bsfnParams.getValue("mnQuantityBreak4"));
     internalVO.setMnQuantityBreak5((MathNumeric)bsfnParams.getValue("mnQuantityBreak5"));
     internalVO.setMnQuantityBreak6((MathNumeric)bsfnParams.getValue("mnQuantityBreak6"));
     internalVO.setMnQuantityBreak7((MathNumeric)bsfnParams.getValue("mnQuantityBreak7"));
     internalVO.setMnQuantityBreak8((MathNumeric)bsfnParams.getValue("mnQuantityBreak8"));
     internalVO.setMnQuantityBreak9((MathNumeric)bsfnParams.getValue("mnQuantityBreak9"));
     internalVO.setMnQuantityBreak10((MathNumeric)bsfnParams.getValue("mnQuantityBreak10"));
     internalVO.setMnQuantityBreak11((MathNumeric)bsfnParams.getValue("mnQuantityBreak11"));
     internalVO.setMnQuantityBreak12((MathNumeric)bsfnParams.getValue("mnQuantityBreak12"));
     internalVO.setMnQuantityBreak13((MathNumeric)bsfnParams.getValue("mnQuantityBreak13"));
     internalVO.setMnQuantityBreak14((MathNumeric)bsfnParams.getValue("mnQuantityBreak14"));
     internalVO.setMnQuantityBreak15((MathNumeric)bsfnParams.getValue("mnQuantityBreak15"));
     internalVO.setCErrorCode((String)bsfnParams.getValue("cErrorCode"));
     internalVO.setSzErrorDescription((String)bsfnParams.getValue("szErrorDescription"));
          
          
          return bsfnParams.getE1MessageList();
  }
}
