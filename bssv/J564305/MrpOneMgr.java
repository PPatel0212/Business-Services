package be.e1.bssv.J564305;

import be.e1.bssv.J564305.valueobject.CreatePOLine_D5643006;

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
public abstract class MrpOneMgr
  extends BusinessService
{
  /**
   * TODO: Create Java Doc for: InternalCreatePOLineRevisedItem
   * Method InternalCreatePOLineRevisedItem is used for...?
   * @param context conditionally provides the connection for the database operation and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
   * @return an E1Message containing the text of any errors or warnings that may have occurred
   */
  public static E1MessageList InternalCreatePOLineRevisedItem(IContext context, IConnection connection, CreatePOLine_D5643006 internalVO)
  {

    //Call start internal method, passing the context (which was passed from PublishedBusinessService).
    startInternalMethod(context, "InternalCreatePOLineRevisedItem", internalVO);
    //Create new message list for BusinessService processing.
    E1MessageList messages = new E1MessageList();

    messages.addMessages(callMRPOne(context, connection, internalVO));
    //Call finish internal method passing context.
    finishInternalMethod(context, "InternalCreatePOLineRevisedItem");

    //Call finish internal method passing context.
    return messages;
  }

  /**
   * Calls the MRPOne(N5643006) business function which has the D5643006 datastructure.
   * @param context conditionally provides the connection for the business function call and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @param TODO document input parameters
   * @return A list of messages if there were application errors, warnings, or informational
   * messages. Returns null if there were no messages.
   */
  private static E1MessageList callMRPOne(IContext context, IConnection connection, CreatePOLine_D5643006 internalVO)
  {
    BSFNParameters bsfnParams = new BSFNParameters();

    // map input parameters from input value object
    bsfnParams.setValue("mnDocumentOrderInvoiceE_DOCO", internalVO.getMnDocumentOrderInvoiceE_DOCO());
    bsfnParams.setValue("szOrderType_DCTO", internalVO.getSzOrderType_DCTO());
    bsfnParams.setValue("szCompanyKeyOrderNo_KCOO", internalVO.getSzCompanyKeyOrderNo_KCOO());
    bsfnParams.setValue("szOrderSuffix_SFXO", internalVO.getSzOrderSuffix_SFXO());
    bsfnParams.setValue("mnLineNumber_LNID", internalVO.getMnLineNumber_LNID());
    bsfnParams.setValue("szRCBaseItemId_RCITMB", internalVO.getSzRCBaseItemId_RCITMB());
    bsfnParams.setValue("szRCRevItemId_RCITMR", internalVO.getSzRCRevItemId_RCITMR());
    bsfnParams.setValue("szVersion_VERS", internalVO.getSzVersion_VERS());

    try
    {
      //get bsfnService from context
      IBSFNService bsfnService = context.getBSFNService();

      //execute business function
      bsfnService.execute(context, connection, "MRPOne", bsfnParams);
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
    //map output parameters to output value object
    internalVO.setCErrorCode_EV01(bsfnParams.getValue("cErrorCode_EV01").toString());
    internalVO.setSzErrorDescription_D200((String)bsfnParams.getValue("szErrorDescription_D200"));
    internalVO.setSzMeRevisionLevel_MERL((String)bsfnParams.getValue("szMeRevisionLevel_MERL"));
    internalVO.setSzDataItem_DATI((String)bsfnParams.getValue("szDataItem_DATI"));
    internalVO.setMnLineNumber_LNID((MathNumeric)bsfnParams.getValue("mnLineNumber_LNID"));

    //return any errors, warnings, or informational messages to the caller
    return bsfnParams.getE1MessageList();
  }
}
