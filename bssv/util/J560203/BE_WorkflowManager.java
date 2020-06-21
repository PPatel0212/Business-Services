package be.e1.bssv.util.J560203;

import be.e1.bssv.util.J560203.valueobject.BE_AddWorkFlowDetail_D5602000C;

import be.e1.bssv.util.J560203.valueobject.BE_AddWorkFlowHeader_D5602000B;
import be.e1.bssv.util.J560203.valueobject.BE_BuildParameterizedUrl_D5602000H;
import be.e1.bssv.util.J560203.valueobject.BE_FormatWorkFlowMessage_D5602000E;
import be.e1.bssv.util.J560203.valueobject.BE_HumanTaskQuery;
import be.e1.bssv.util.J560203.valueobject.BE_HumanTaskResult;
import be.e1.bssv.util.J560203.valueobject.BE_ProcessWorkflowMessage_D5602000F;
import be.e1.bssv.util.J560203.valueobject.BE_UpdateWorkflowHeader_D5602000I;

import java.util.ArrayList;

import java.util.Date;

import oracle.e1.bssvfoundation.base.BSFNParameters;
import oracle.e1.bssvfoundation.base.BusinessService;
import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BSFNServiceInvalidArgException;
import oracle.e1.bssvfoundation.exception.BSFNServiceSystemException;
import oracle.e1.bssvfoundation.exception.DBServiceException;
import oracle.e1.bssvfoundation.services.BSSVDBField;
import oracle.e1.bssvfoundation.services.BSSVDBFieldMap;
import oracle.e1.bssvfoundation.services.BSSVDBResultSet;
import oracle.e1.bssvfoundation.services.BSSVDBSortField;
import oracle.e1.bssvfoundation.services.BSSVDBWhereClauseBuilder;
import oracle.e1.bssvfoundation.services.BSSVDBWhereField;
import oracle.e1.bssvfoundation.services.IBSFNService;
import oracle.e1.bssvfoundation.services.IDBService;
import oracle.e1.bssvfoundation.util.E1Message;
import oracle.e1.bssvfoundation.util.E1MessageList;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc for BusinessService
 */
public abstract class BE_WorkflowManager extends BusinessService
{
  /**
   * TODO: Create Java Doc for: BE_AddWorkFlowDetail
   * Method BE_AddWorkFlowDetail is used for...?
   * @param context conditionally provides the connection for the database operation and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
   * @return an E1Message containing the text of any errors or warnings that may have occurred
   */
  public static E1MessageList InternalBE_AddWorkFlowDetail(IContext context, IConnection connection, BE_AddWorkFlowDetail_D5602000C internalVO)
  {
    //Call start internal method, passing the context (which was passed from PublishedBusinessService).
    startInternalMethod(context, "InternalBE_AddWorkFlowDetail", internalVO);
    //Create new message list for BusinessService processing.
    E1MessageList messages = new E1MessageList();
 
    //TODO: call method (created by the wizard), which then executes Business Function or Database operation.
    messages.addMessages(BE_AddWorkflowDetail(context, connection, internalVO));
    //TODO:  add messages returned from E1 processing to BusinessService message list.
    //Call finish internal method passing context.
    finishInternalMethod(context, "InternalBE_AddWorkFlowDetail");

    //Call finish internal method passing context.
    return messages;
  }

  /** TODO: Create Java Doc for: BE_AddWorkFlowHeader
  * Method BE_AddWorkFlowDetail is used for...?
  * @param context conditionally provides the connection for the database operation and logging information
  * @param connection can either be an explicit connection or null. If null the default connection is used.
  * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
  * @return an E1Message containing the text of any errors or warnings that may have occurred
  */
  public static E1MessageList InternalBE_AddWorkFlowHeader(IContext context, IConnection connection, BE_AddWorkFlowHeader_D5602000B internalVO)
  {
   //Call start internal method, passing the context (which was passed from PublishedBusinessService).
   startInternalMethod(context, "InternalBE_AddWorkFlowHeader", internalVO);
   //Create new message list for BusinessService processing.
   E1MessageList messages = new E1MessageList();
       //TODO: call method (created by the wizard), which then executes Business Function or Database operation.
   messages.addMessages(BE_AddWorkflowHeader(context, connection, internalVO));
   //TODO:  add messages returned from E1 processing to BusinessService message list.
   //Call finish internal method passing context.
   finishInternalMethod(context, "InternalBE_AddWorkFlowHeader");

   //Call finish internal method passing context.
   return messages;
  }

  public static E1MessageList InternalBE_BuildParameterizedUrl(IContext context, IConnection connection, BE_BuildParameterizedUrl_D5602000H internalVO)
  {
    //Call start internal method, passing the context (which was passed from PublishedBusinessService).
    startInternalMethod(context, "InternalBE_BuildParameterizedUrl", internalVO);
    //Create new message list for BusinessService processing.
    E1MessageList messages = new E1MessageList();

    //TODO: call method (created by the wizard), which then executes Business Function or Database operation.
    messages.addMessages(BE_BuildParameterizedUrl (context, connection, internalVO));
  //TODO:  add messages returned from E1 processing to BusinessService message list.
  //Call finish internal method passing context.
  finishInternalMethod(context, "InternalBE_BuildParameterizedUrl");

  //Call finish internal method passing context.
  return messages;
  }

  public static E1MessageList InternalBE_UpdateWorkflowHeader(IContext context, IConnection connection, BE_UpdateWorkflowHeader_D5602000I internalVO)
  {
   //Call start internal method, passing the context (which was passed from PublishedBusinessService).
   startInternalMethod(context, "InternalBE_UpdateWorkflowHeader", internalVO);
   //Create new message list for BusinessService processing.
   E1MessageList messages = new E1MessageList();
       //TODO: call method (created by the wizard), which then executes Business Function or Database operation.
   messages.addMessages(BE_UpdateWorkflowHeader(context, connection, internalVO));
   //TODO:  add messages returned from E1 processing to BusinessService message list.
   //Call finish internal method passing context.
   finishInternalMethod(context, "InternalBE_UpdateWorkflowHeader");
  
   //Call finish internal method passing context.
   return messages;
  }

  public static E1MessageList InternalBE_ProcessWorkflowMessage(IContext context, IConnection connection, BE_ProcessWorkflowMessage_D5602000F internalVO)
  {
   //Call start internal method, passing the context (which was passed from PublishedBusinessService).
   startInternalMethod(context, "InternalBE_ProcessWorkflowMessage", internalVO);
   //Create new message list for BusinessService processing.
   E1MessageList messages = new E1MessageList();
       //TODO: call method (created by the wizard), which then executes Business Function or Database operation.
   messages.addMessages(BE_ProcessWorkflowMessage(context, connection, internalVO));
   //TODO:  add messages returned from E1 processing to BusinessService message list.
   //Call finish internal method passing context.
   finishInternalMethod(context, "InternalBE_ProcessWorkFlowMessage");

   //Call finish internal method passing context.
   return messages;
  }
  
  public static E1MessageList InternalBE_FormatWorkflowMessage(IContext context, IConnection connection, BE_FormatWorkFlowMessage_D5602000E internalVO)
  {
   //Call start internal method, passing the context (which was passed from PublishedBusinessService).
   startInternalMethod(context, "InternalBE_ProcessWorkflowMessage", internalVO);
   //Create new message list for BusinessService processing.
   E1MessageList messages = new E1MessageList();
       //TODO: call method (created by the wizard), which then executes Business Function or Database operation.
   messages.addMessages(BE_FormatWorkFlowMessage(context, connection, internalVO));
   //TODO:  add messages returned from E1 processing to BusinessService message list.
   //Call finish internal method passing context.
   finishInternalMethod(context, "InternalBE_FormatWorkFlowMessage");

   //Call finish internal method passing context.
   return messages;
  }

  public static E1MessageList InternalBE_GetHumanTaskInfo(IContext context, IConnection connection, BE_HumanTaskQuery internalVO)
  {
    //Call start internal method, passing the context (which was passed from PublishedBusinessService).
    startInternalMethod(context, "InternalBE_GetHumanTaskInfo", internalVO);
    //Create new message list for BusinessService processing.
    E1MessageList messages = new E1MessageList();
        //TODO: call method (created by the wizard), which then executes Business Function or Database operation.
    messages.addMessages(selectFromF560205(context, connection, internalVO));
    //TODO:  add messages returned from E1 processing to BusinessService message list.
    //Call finish internal method passing context.
    finishInternalMethod(context, "InternalBE_GetHumanTaskInfo");

    //Call finish internal method passing context.
    return messages;
  }

  /**
   * Calls the BE_AddWorkflowHeader(N5602000) business function which has the D5602000B datastructure.
   * @param context conditionally provides the connection for the business function call and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @param TODO document input parameters
   * @return A list of messages if there were application errors, warnings, or informational
   * messages. Returns null if there were no messages.
   */
  private static E1MessageList BE_AddWorkflowHeader(IContext context, IConnection connection, BE_AddWorkFlowHeader_D5602000B internalVO)
  {
    BSFNParameters bsfnParams = new BSFNParameters();

    // map input parameters from input value object
    bsfnParams.setValue("mnGroupId", internalVO.getMnGroupId());
    bsfnParams.setValue("mnMessageId", internalVO.getMnMessageId());
    bsfnParams.setValue("mnParentId", internalVO.getMnParentId());
    bsfnParams.setValue("szBranch", internalVO.getSzBranch());
    bsfnParams.setValue("szWorkflowType", internalVO.getSzWorkflowType());
    bsfnParams.setValue("szWorkflowOriginator", internalVO.getSzWorkflowOriginator());
    bsfnParams.setValue("szAuditProgramId", internalVO.getSzAuditProgramId());

    try
    {
      //get bsfnService from context
      IBSFNService bsfnService = context.getBSFNService();

      //execute business function
      bsfnService.execute(context, connection, "BE_AddWorkflowHeader", bsfnParams);
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
    internalVO.setMnGroupId((MathNumeric)bsfnParams.getValue("mnGroupId"));
    internalVO.setMnMessageId((MathNumeric)bsfnParams.getValue("mnMessageId"));
    internalVO.setMnParentId((MathNumeric)bsfnParams.getValue("mnParentId"));
    internalVO.setSzBranch((String)bsfnParams.getValue("szBranch"));
    internalVO.setSzWorkflowType((String)bsfnParams.getValue("szWorkflowType"));
    internalVO.setSzWorkflowOriginator((String)bsfnParams.getValue("szWorkflowOriginator"));
    internalVO.setCErrorFlag(bsfnParams.getValue("cErrorFlag").toString());
    internalVO.setSzErrorMessage((String)bsfnParams.getValue("szErrorMessage"));
    internalVO.setSzAuditProgramId((String)bsfnParams.getValue("szAuditProgramId"));
    internalVO.setCSuppressErrorMessage(bsfnParams.getValue("cSuppressErrorMessage").toString());

    //return any errors, warnings, or informational messages to the caller
    return bsfnParams.getE1MessageList();
  }

  /**
   * Calls the BE_AddWorkflowDetail(N5602000) business function which has the D5602000C datastructure.
   * @param context conditionally provides the connection for the business function call and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @param TODO document input parameters
   * @return A list of messages if there were application errors, warnings, or informational
   * messages. Returns null if there were no messages.
   */
  private static E1MessageList BE_AddWorkflowDetail(IContext context, IConnection connection, BE_AddWorkFlowDetail_D5602000C internalVO)
  {
    BSFNParameters bsfnParams = new BSFNParameters();

    // map input parameters from input value object
    bsfnParams.setValue("mnMessageId", internalVO.getMnMessageId());
    bsfnParams.setValue("mnLineNumber", internalVO.getMnLineNumber());
    bsfnParams.setValue("szMessageTemplate", internalVO.getSzMessageTemplate());
    bsfnParams.setValue("szXmlTag", internalVO.getSzXmlTag());
    bsfnParams.setValue("szXmlData", internalVO.getSzXmlData());
    bsfnParams.setValue("szAuditProgramId", internalVO.getSzAuditProgramId());

    try
    {
      //get bsfnService from context
      IBSFNService bsfnService = context.getBSFNService();

      //execute business function
      bsfnService.execute(context, connection, "BE_AddWorkflowDetail", bsfnParams);
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
    internalVO.setMnMessageId((MathNumeric)bsfnParams.getValue("mnMessageId"));
    internalVO.setMnLineNumber((MathNumeric)bsfnParams.getValue("mnLineNumber"));
    internalVO.setSzMessageTemplate((String)bsfnParams.getValue("szMessageTemplate"));
    internalVO.setSzXmlTag((String)bsfnParams.getValue("szXmlTag"));
    internalVO.setSzXmlData((String)bsfnParams.getValue("szXmlData"));
    internalVO.setSzAuditProgramId((String)bsfnParams.getValue("szAuditProgramId"));
    internalVO.setCErrorFlag(bsfnParams.getValue("cErrorFlag").toString());
    internalVO.setSzErrorMessage((String)bsfnParams.getValue("szErrorMessage"));
    internalVO.setCSuppressErrorMessage(bsfnParams.getValue("cSuppressErrorMessage").toString());

    //return any errors, warnings, or informational messages to the caller
    return bsfnParams.getE1MessageList();
  }

  /**
   * Calls the BE_BuildParameterizedUrl(B5602000) business function which has the D5602000H datastructure.
   * @param context conditionally provides the connection for the business function call and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @param TODO document input parameters
   * @return A list of messages if there were application errors, warnings, or informational
   * messages. Returns null if there were no messages.
   */
  private static E1MessageList BE_BuildParameterizedUrl(IContext context, IConnection connection,  BE_BuildParameterizedUrl_D5602000H internalVO)
  {
    BSFNParameters bsfnParams = new BSFNParameters();

    // map input parameters from input value object
    bsfnParams.setValue("szProgramName", internalVO.getSzProgramName());
    bsfnParams.setValue("szFormName", internalVO.getSzFormName());
    bsfnParams.setValue("szVersion", internalVO.getSzVersion());
    bsfnParams.setValue("szEncodedRedirectUrl", internalVO.getSzEncodedRedirectUrl());
    bsfnParams.setValue("szParameterIdList", internalVO.getSzParameterIdList());
    bsfnParams.setValue("szParameterValueList", internalVO.getSzParameterValueList());
    bsfnParams.setValue("szParameterizedURL", internalVO.getSzParameterizedURL());

    try
    {
      //get bsfnService from context
      IBSFNService bsfnService = context.getBSFNService();

      //execute business function
      bsfnService.execute(context, connection, "BE_BuildParameterizedUrl", bsfnParams);
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
    internalVO.setSzProgramName((String)bsfnParams.getValue("szProgramName"));
    internalVO.setSzFormName((String)bsfnParams.getValue("szFormName"));
    internalVO.setSzVersion((String)bsfnParams.getValue("szVersion"));
    internalVO.setSzEncodedRedirectUrl((String)bsfnParams.getValue("szEncodedRedirectUrl"));
    internalVO.setSzParameterIdList((String)bsfnParams.getValue("szParameterIdList"));
    internalVO.setSzParameterValueList((String)bsfnParams.getValue("szParameterValueList"));
    internalVO.setSzParameterizedURL((String)bsfnParams.getValue("szParameterizedURL"));
    internalVO.setCErrorFlag(bsfnParams.getValue("cErrorFlag").toString());
    internalVO.setSzErrorDescription((String)bsfnParams.getValue("szErrorDescription"));

    //return any errors, warnings, or informational messages to the caller
    return bsfnParams.getE1MessageList();
  }

  /**
   * Calls the BE_ProcessWorkflowMessage(B5602000) business function which has the D5602000F datastructure.
   * @param context conditionally provides the connection for the business function call and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @param TODO document input parameters
   * @return A list of messages if there were application errors, warnings, or informational
   * messages. Returns null if there were no messages.
   */
  private static E1MessageList BE_ProcessWorkflowMessage(IContext context, IConnection connection, BE_ProcessWorkflowMessage_D5602000F internalVO)
  {
    BSFNParameters bsfnParams = new BSFNParameters();

    // map input parameters from input value object
    bsfnParams.setValue("mnGroupId", internalVO.getMnGroupId());
    bsfnParams.setValue("cWriteXmlToFile", internalVO.getCWriteXmlToFile());

    try
    {
      //get bsfnService from context
      IBSFNService bsfnService = context.getBSFNService();

      //execute business function
      bsfnService.execute(context, connection, "BE_ProcessWorkflowMessage", bsfnParams);
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
    internalVO.setMnGroupId((MathNumeric)bsfnParams.getValue("mnGroupId"));
    internalVO.setCWriteXmlToFile(bsfnParams.getValue("cWriteXmlToFile").toString());
    internalVO.setCErrorFlag(bsfnParams.getValue("cErrorFlag").toString());
    internalVO.setSzErrorDescription((String)bsfnParams.getValue("szErrorDescription"));

    //return any errors, warnings, or informational messages to the caller
    return bsfnParams.getE1MessageList();
  }

  /**
   * Calls the BE_UpdateWorkflowHeader(N5602000) business function which has the D5602000I datastructure.
   * @param context conditionally provides the connection for the business function call and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @param TODO document input parameters
   * @return A list of messages if there were application errors, warnings, or informational
   * messages. Returns null if there were no messages.
   */
  private static E1MessageList BE_UpdateWorkflowHeader(IContext context, IConnection connection, BE_UpdateWorkflowHeader_D5602000I internalVO)
  {
    BSFNParameters bsfnParams = new BSFNParameters();

    // map input parameters from input value object
    bsfnParams.setValue("mnTaskId", internalVO.getMnTaskId());
    bsfnParams.setValue("szCompanyKeyOrderNo", internalVO.getSzCompanyKeyOrderNo());
    bsfnParams.setValue("mnDocumentOrderInvoiceE", internalVO.getMnDocumentOrderInvoiceE());
    bsfnParams.setValue("szOrderType", internalVO.getSzOrderType());
    bsfnParams.setValue("mnLineNumber", internalVO.getMnLineNumber());
    bsfnParams.setValue("szCostCenterHeader", internalVO.getSzCostCenterHeader());
    bsfnParams.setValue("mnIdentifierShortItem", internalVO.getMnIdentifierShortItem());
    bsfnParams.setValue("szAccountId", internalVO.getSzAccountId());
    bsfnParams.setValue("mnSequenceNumber1", internalVO.getMnSequenceNumber1());
    bsfnParams.setValue("szLineType", internalVO.getSzLineType());
    bsfnParams.setValue("szGenericKey", internalVO.getSzGenericKey());
    bsfnParams.setValue("mnCompositeKeyValues", internalVO.getMnCompositeKeyValues());
    bsfnParams.setValue("mnDocVoucherInvoiceE", internalVO.getMnDocVoucherInvoiceE());
    bsfnParams.setValue("szDocumentType", internalVO.getSzDocumentType());
    bsfnParams.setValue("szCompany", internalVO.getSzCompany());
    bsfnParams.setValue("szUserId", internalVO.getSzUserId());
    bsfnParams.setValue("jdDateUpdated", internalVO.getJdDateUpdated());
    bsfnParams.setValue("mnTimeLastUpdated", internalVO.getMnTimeLastUpdated());
    bsfnParams.setValue("szWorkStationId", internalVO.getSzWorkStationId());
    bsfnParams.setValue("szProgramId", internalVO.getSzProgramId());

    try
    {
      //get bsfnService from context
      IBSFNService bsfnService = context.getBSFNService();

      //execute business function
      bsfnService.execute(context, connection, "BE_UpdateWorkflowHeader", bsfnParams);
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
    internalVO.setCErrorCode(bsfnParams.getValue("cErrorCode").toString());
    internalVO.setSzErrorDescription((String)bsfnParams.getValue("szErrorDescription"));

    //return any errors, warnings, or informational messages to the caller
    return bsfnParams.getE1MessageList();
  }
  
  private static E1MessageList BE_FormatWorkFlowMessage(IContext context, IConnection connection, BE_FormatWorkFlowMessage_D5602000E internalVO)
  {
    BSFNParameters bsfnParams = new BSFNParameters();

    // map input parameters from input value object
    
    bsfnParams.setValue("szMessageTemplate", internalVO.getSzMessageTemplate());
    bsfnParams.setValue("szParameter01", internalVO.getSzParameter01());
    bsfnParams.setValue("szParameter02", internalVO.getSzParameter02());
    bsfnParams.setValue("szParameter03", internalVO.getSzParameter03());
    bsfnParams.setValue("szParameter04", internalVO.getSzParameter04());
    bsfnParams.setValue("szParameter05", internalVO.getSzParameter05());
    bsfnParams.setValue("szParameter06", internalVO.getSzParameter06());
    bsfnParams.setValue("szParameter07", internalVO.getSzParameter07());
    bsfnParams.setValue("szParameter08", internalVO.getSzParameter08());
    bsfnParams.setValue("szParameter09", internalVO.getSzParameter09());
    bsfnParams.setValue("szParameter10", internalVO.getSzParameter10());
    bsfnParams.setValue("szEmailMsg", internalVO.getSzEmailMsg());   
    bsfnParams.setValue("mnMessageId", internalVO.getMnMessageId());
    bsfnParams.setValue("mnMessageLineNum", internalVO.getMnMessageLineNum());
    bsfnParams.setValue("szWorkflowLineType", internalVO.getSzWorkflowLineType());
    bsfnParams.setValue("szXmlTag", internalVO.getSzXmlTag());
    
        try
    {
      //get bsfnService from context
      IBSFNService bsfnService = context.getBSFNService();

      //execute business function
      bsfnService.execute(context, connection, "BE_FormatWorkflowMessage", bsfnParams);
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
    internalVO.setCErrorCode(bsfnParams.getValue("cErrorFlag").toString());
    internalVO.setSzErrorDescription((String)bsfnParams.getValue("szErrorMessage"));
    //return any errors, warnings, or informational messages to the caller
    return bsfnParams.getE1MessageList();
  }
  
  /**
   * Selects records from the F560205 table.
   * <p>Following SQL statement can be produced by this generated code
   * <blockquote><pre><code>
   * SELECT F560205.Z56WFTP, F560205.MCU, F560205.ALKY, F560205.ALKY1, F560205.SLCUSTFN, F560205.CUID, F560205.GROUP, F560205.FTH1, F560205.FTH2, F560205.FMTST, F560205.CFGGC, F560205.FMTET, F560205.RVID
   * FROM F560205
   * WHERE F560205.Z56WFTP=? AND F560205.MCU=? AND F560205.ALKY=? AND F560205.ALKY1=? AND F560205.SLCUSTFN=?
   * </code></pre></blockquote>
   * @param context conditionally provides the connection for the database operation and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @param internalVO TODO document input parameters
   * @return an E1Message containing the text of any database exceptions that may have occurred
   */
  private static E1MessageList selectFromF560205(IContext context, IConnection connection, BE_HumanTaskQuery internalVO)
  {
    //create return object
    E1MessageList returnMessages = new E1MessageList();

    //specify columns to select
    BSSVDBField[] selectFields =
    {
      new BSSVDBField("F560205.Z56WFTP"), // String - WorkflowType
      new BSSVDBField("F560205.Z56WTDS"), // String - WorkflowTypeDescription
      new BSSVDBField("F560205.MCU"), // String - CostCenter
      new BSSVDBField("F560205.ALKY"), // String - AlternateAddressKey
      new BSSVDBField("F560205.ALKY1"), // String - AlternateAddressKey1
      new BSSVDBField("F560205.Z56ALKY3"), // String - AlternateAddressKey3
      new BSSVDBField("F560205.Z56ALKY4"), // String - AlternateAddressKey4
      new BSSVDBField("F560205.Z56ALKY5"), // String - AlternateAddressKey5
      new BSSVDBField("F560205.Z56ALKY6"), // String - AlternateAddressKey6
      new BSSVDBField("F560205.Z56ALKY7"), // String - AlternateAddressKey7
      new BSSVDBField("F560205.Z56ALKY8"), // String - AlternateAddressKey8
      new BSSVDBField("F560205.SLCUSTFN"), // String - ServiceLevelCustomFunction
      new BSSVDBField("F560205.GROUP"), // String - GROUP
      new BSSVDBField("F560205.CUID"), // String - CurrentUserID
      new BSSVDBField("F560205.SUBGRP"), // String - SubscriberGroup
      new BSSVDBField("F560205.FTH1"), // Numeric - ForeignThreshold1
      new BSSVDBField("F560205.FTH2"), // Numeric - ForeignThreshold2
      new BSSVDBField("F560205.FMTST"), // String - StartTime9
      new BSSVDBField("F560205.CFGGC"), // String - ConfigurationGroupCode
      new BSSVDBField("F560205.GRPNAME"), // String - GroupName
      new BSSVDBField("F560205.FMTET"), // String - EndTime9
      new BSSVDBField("F560205.RVID"), // String - ReviewerID
      new BSSVDBField("F560205.WGNA"), // String - WorkGroupName
      new BSSVDBField("F560205.URCD"), // String - UserReservedCode
      new BSSVDBField("F560205.URDT"), // Date - UserReservedDate
      new BSSVDBField("F560205.URAT"), // Numeric - UserReservedAmount
      new BSSVDBField("F560205.URAB"), // Numeric - UserReservedNumber
      new BSSVDBField("F560205.URRF"), // String - UserReservedReference
    };
    
    //specify sort order
    BSSVDBSortField[] sortOrder = null;
    BSSVDBWhereClauseBuilder whereClause = null;
    BSSVDBResultSet resultSet = null;
    BSSVDBFieldMap[] fieldMap = null;
    boolean selectDistinct = false;
    boolean recordFound = false;
    
    try
    {
      //get dbService from context
      IDBService dbService = context.getDBService();
      //Build the where clasue
      whereClause = buildF560205WhereClause(context, internalVO);
      //execute select operation
      resultSet = dbService.select(context, connection, "F560205", IDBService.DB_TABLE, selectDistinct, IDBService.DB_FETCH_ALL, selectFields, sortOrder, whereClause);
      if(resultSet != null)
      {
        fieldMap = resultSet.getFieldMap();
        if(fieldMap != null && fieldMap.length > 0)
          recordFound = true;
      }
    }
    catch (DBServiceException e)
    {
      internalVO.setCErrorFlag("1");
      internalVO.setSzErrorDescription("Problems performing F560205 SELECT");
      returnMessages.addMessage(new E1Message(context, "005FIS", e.getMessage()));
    }
    
    if(recordFound == true)
    {
      //process the results of the select
      ArrayList queryResults = new ArrayList();
      for (int i = 0; i < fieldMap.length; i++)
      {
        BSSVDBFieldMap map = fieldMap[i];
        BE_HumanTaskResult result = new BE_HumanTaskResult();
        
        result.setF560205_Z56WFTP((String)map.getValue("F560205.Z56WFTP"));
        result.setF560205_Z56WTDS((String)map.getValue("F560205.Z56WTDS"));
        result.setF560205_MCU((String)map.getValue("F560205.MCU"));
        result.setF560205_ALKY((String)map.getValue("F560205.ALKY"));
        result.setF560205_ALKY1((String)map.getValue("F560205.ALKY1"));
        result.setF560205_Z56ALKY3((String)map.getValue("F560205.Z56ALKY3"));
        result.setF560205_Z56ALKY4((String)map.getValue("F560205.Z56ALKY4"));
        result.setF560205_Z56ALKY5((String)map.getValue("F560205.Z56ALKY5"));
        result.setF560205_Z56ALKY6((String)map.getValue("F560205.Z56ALKY6"));
        result.setF560205_Z56ALKY7((String)map.getValue("F560205.Z56ALKY7"));
        result.setF560205_Z56ALKY8((String)map.getValue("F560205.Z56ALKY8"));
        result.setF560205_SLCUSTFN((String)map.getValue("F560205.SLCUSTFN"));
        result.setF560205_GROUP((String)map.getValue("F560205.GROUP"));
        result.setF560205_CUID((String)map.getValue("F560205.CUID"));
        result.setF560205_SUBGRP((String)map.getValue("F560205.SUBGRP"));
        result.setF560205_FTH1((MathNumeric)map.getValue("F560205.FTH1"));
        result.setF560205_FTH2((MathNumeric)map.getValue("F560205.FTH2"));
        result.setF560205_FMTST((String)map.getValue("F560205.FMTST"));
        result.setF560205_CFGGC((String)map.getValue("F560205.CFGGC"));
        result.setF560205_FMTET((String)map.getValue("F560205.FMTET"));
        result.setF560205_RVID((String)map.getValue("F560205.RVID"));
        result.setF560205_WGNA((String)map.getValue("F560205.WGNA"));
        result.setF560205_URCD((String)map.getValue("F560205.URCD"));
        result.setF560205_URDT((Date)map.getValue("F560205.URDT"));
        result.setF560205_URAT((MathNumeric)map.getValue("F560205.URAT"));
        result.setF560205_URAB((MathNumeric)map.getValue("F560205.URAB"));
        result.setF560205_URRF((String)map.getValue("F560205.URRF"));
        
        queryResults.add(result);
      }
      
      if (resultSet.hasMoreRows())
      {
        returnMessages.addMessage(new E1Message(context, "028FIS", ""));
      }
      
      //map results to internal vo
      internalVO.setQueryResults(queryResults);
    }
    else
    {
      internalVO.setCErrorFlag("1");
      internalVO.setSzErrorDescription("No F560205 records found");      
    }
    
    return returnMessages;
  }
  
  private static BSSVDBWhereClauseBuilder buildF560205WhereClause(IContext context, BE_HumanTaskQuery internalVO)
  {
    //specify condition records must meet to be selected
    boolean processFlag = false;
    ArrayList whereFields = new ArrayList();

    //Include workflow type
    String workflowType = internalVO.getF560205_Z56WFTP();
    String workflowLevel = internalVO.getF560205_SLCUSTFN();
    if(workflowType != null && workflowLevel != null)
    {
      whereFields.add(new BSSVDBWhereField(null, new BSSVDBField("F560205.Z56WFTP"), IDBService.EQUALS, workflowType));
      whereFields.add(new BSSVDBWhereField(IDBService.AND, new BSSVDBField("F560205.SLCUSTFN"), IDBService.EQUALS, workflowLevel));
      processFlag = true;
    }
    else
      return null;
    
    //include workflow branch if present
    String workflowBranch = internalVO.getF560205_MCU();
    if(workflowBranch != null)
    {
      whereFields.add(new BSSVDBWhereField(IDBService.AND, new BSSVDBField("F560205.MCU"), IDBService.EQUALS, workflowBranch));
      processFlag = true;
    }
    
    //include alternate key 1 if present
    String altKey1 = internalVO.getF560205_ALKY();
    if(altKey1 != null)
    {
      whereFields.add(new BSSVDBWhereField(IDBService.AND, new BSSVDBField("F560205.ALKY"), IDBService.EQUALS, altKey1));
      processFlag = true;
    }
    //include alternate key 2 if present
    String altKey2 = internalVO.getF560205_ALKY1();
    if(altKey2 != null)
    {
      whereFields.add(new BSSVDBWhereField(IDBService.AND, new BSSVDBField("F560205.ALKY1"), IDBService.EQUALS, altKey2));
      processFlag = true;
    }
    //include alternate key 3 if present
    String altKey3 = internalVO.getF560205_Z56ALKY3();
    if(altKey3 != null)
    {
      whereFields.add(new BSSVDBWhereField(IDBService.AND, new BSSVDBField("F560205.Z56ALKY3"), IDBService.EQUALS, altKey3));
      processFlag = true;
    }
    //include alternate key 4 if present
    String altKey4 = internalVO.getF560205_Z56ALKY4();
    if(altKey4 != null)
    {
      whereFields.add(new BSSVDBWhereField(IDBService.AND, new BSSVDBField("F560205.Z56ALKY4"), IDBService.EQUALS, altKey4));
      processFlag = true;
    }
    //include alternate key 5 if present
    String altKey5 = internalVO.getF560205_Z56ALKY5();
    if(altKey5 != null)
    {
      whereFields.add(new BSSVDBWhereField(IDBService.AND, new BSSVDBField("F560205.Z56ALKY5"), IDBService.EQUALS, altKey5));
      processFlag = true;    
    }
    //include alternate key 6 if present
    String altKey6 = internalVO.getF560205_Z56ALKY6();
    if(altKey6 != null)
    {
      whereFields.add(new BSSVDBWhereField(IDBService.AND, new BSSVDBField("F560205.Z56ALKY6"), IDBService.EQUALS, altKey6));
      processFlag = true;    
    }
    //include alternate key 7 if present
    String altKey7 = internalVO.getF560205_Z56ALKY7();
    if(altKey7 != null)
    {
      whereFields.add(new BSSVDBWhereField(IDBService.AND, new BSSVDBField("F560205.Z56ALKY7"), IDBService.EQUALS, altKey7));
      processFlag = true;    
    }
    //include alternate key 8 if present
    String altKey8 = internalVO.getF560205_Z56ALKY8();
    if(altKey8 != null)
    {
      whereFields.add(new BSSVDBWhereField(IDBService.AND, new BSSVDBField("F560205.Z56ALKY8"), IDBService.EQUALS, altKey8));
      processFlag = true;    
    }
    //build the where clause
    int size = whereFields.size();
    BSSVDBWhereField[] whereArray = new BSSVDBWhereField[size];
    for(int x = 0; x<size; x++)
    {
      whereArray[x] = (BSSVDBWhereField)whereFields.get(x);
    }
    
    BSSVDBWhereClauseBuilder whereClause = null;
    if(processFlag == true)
    {
      whereClause = new BSSVDBWhereClauseBuilder(context, whereArray);
    }
    return whereClause;      
  }
}
