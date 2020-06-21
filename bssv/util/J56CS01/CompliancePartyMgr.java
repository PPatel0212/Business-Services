package be.e1.bssv.util.J56CS01;

import be.e1.bssv.util.J56CS01.valueobject.CompliancePartyVO;

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
public abstract class CompliancePartyMgr extends BusinessService
{
  /**
   * TODO: Create Java Doc for: getComplianceParty
   * Method getComplianceParty is used for...?
   * @param context conditionally provides the connection for the database operation and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
   * @return an E1Message containing the text of any errors or warnings that may have occurred
   */
  public static E1MessageList getComplianceParty(IContext context, IConnection connection, CompliancePartyVO internalVO)
  {

    //Call start internal method, passing the context (which was passed from PublishedBusinessService).
    startInternalMethod(context, "getComplianceParty", internalVO);
    //Create new message list for BusinessService processing.
    E1MessageList messages = new E1MessageList();

    //TODO: call method (created by the wizard), which then executes Business Function or Database operation.
    messages.addMessages(callBE_ExportComplianceParty(context, connection, internalVO));
    //TODO:  add messages returned from E1 processing to BusinessService message list.


    //Call finish internal method passing context.
    finishInternalMethod(context, "getComplianceParty");

    //Call finish internal method passing context.
    return messages;
  }

  /**
   * Calls the BE_ExportComplianceParty(N5642014) business function which has the D5642014B datastructure.
   * @param context conditionally provides the connection for the business function call and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @param TODO document input parameters
   * @return A list of messages if there were application errors, warnings, or informational
   * messages. Returns null if there were no messages.
   */
  private static E1MessageList callBE_ExportComplianceParty(IContext context, IConnection connection, CompliancePartyVO internalVO)
  {
    BSFNParameters bsfnParams = new BSFNParameters();

    // map input parameters from input value object
    bsfnParams.setValue("mnAddressNumber", internalVO.getMnAddressNumber());
    bsfnParams.setValue("cAddressType", internalVO.getCAddressType());

    try
    {
      //get bsfnService from context
      IBSFNService bsfnService = context.getBSFNService();

      //execute business function
      bsfnService.execute(context, connection, "BE_ExportComplianceParty", bsfnParams);
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
    internalVO.setMnAddressNumber((MathNumeric) bsfnParams.getValue("mnAddressNumber"));
    internalVO.setCAddressType(bsfnParams.getValue("cAddressType").toString());
    internalVO.setSzMailingName((String) bsfnParams.getValue("szMailingName"));
    internalVO.setSzAddressLine((String) bsfnParams.getValue("szAddressLine"));
    internalVO.setSzCity((String) bsfnParams.getValue("szCity"));
    internalVO.setSzState((String) bsfnParams.getValue("szState"));
    internalVO.setSzZipCode((String) bsfnParams.getValue("szZipCode"));
    internalVO.setSzCountry((String) bsfnParams.getValue("szCountry"));
    internalVO.setSzEmail((String) bsfnParams.getValue("szEmail"));
    internalVO.setSzPhoneNumber((String) bsfnParams.getValue("szPhoneNumber"));
    internalVO.setSzFaxNumber((String) bsfnParams.getValue("szFaxNumber"));
    internalVO.setMnRelatedOrderNumber((MathNumeric) bsfnParams.getValue("mnRelatedOrderNumber"));
    internalVO.setSzRelatedOrderType((String) bsfnParams.getValue("szRelatedOrderType"));
    internalVO.setSzRelatedOrderCompany((String) bsfnParams.getValue("szRelatedOrderCompany"));
    internalVO.setSzCustomerContact((String) bsfnParams.getValue("szCustomerContact"));

    //return any errors, warnings, or informational messages to the caller
    return bsfnParams.getE1MessageList();
  }
}
