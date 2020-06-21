package be.e1.bssv.util.JP560203;

import be.e1.bssv.util.J560203.valueobject.BE_AddWorkFlowDetail_D5602000C;
import be.e1.bssv.util.J560203.valueobject.BE_AddWorkFlowHeader_D5602000B;
import be.e1.bssv.util.J560203.valueobject.BE_BuildParameterizedUrl_D5602000H;
import be.e1.bssv.util.J560203.valueobject.BE_FormatWorkFlowMessage_D5602000E;
import be.e1.bssv.util.J560203.valueobject.BE_HumanTaskQuery;
import be.e1.bssv.util.J560203.valueobject.BE_HumanTaskResult;
import be.e1.bssv.util.J560203.valueobject.BE_ProcessWorkflowMessage_D5602000F;
import be.e1.bssv.util.J560203.valueobject.BE_UpdateWorkflowHeader_D5602000I;
import be.e1.bssv.util.JP560203.valueobject.AddWorkFlowDetailReply;
import be.e1.bssv.util.JP560203.valueobject.AddWorkFlowDetailRequest;
import be.e1.bssv.util.JP560203.valueobject.AddWorkFlowHeaderReply;
import be.e1.bssv.util.JP560203.valueobject.AddWorkFlowHeaderRequest;
import be.e1.bssv.util.JP560203.valueobject.BuildParameterizedUrlReply;
import be.e1.bssv.util.JP560203.valueobject.BuildParameterizedUrlRequest;
import be.e1.bssv.util.JP560203.valueobject.FormatWorkFlowMessageReply;
import be.e1.bssv.util.JP560203.valueobject.FormatWorkFlowMessageRequest;
import be.e1.bssv.util.JP560203.valueobject.HumanTaskData;
import be.e1.bssv.util.JP560203.valueobject.HumanTaskReply;
import be.e1.bssv.util.JP560203.valueobject.HumanTaskRequest;
import be.e1.bssv.util.JP560203.valueobject.ProcessWorkFlowMessageReply;
import be.e1.bssv.util.JP560203.valueobject.ProcessWorkFlowMessageRequest;

import be.e1.bssv.util.JP560203.valueobject.UpdateWorkFlowHeaderReply;
import be.e1.bssv.util.JP560203.valueobject.UpdateWorkFlowHeaderRequest;

import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.PublishedBusinessService;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BusinessServiceException;
import oracle.e1.bssvfoundation.util.E1MessageList;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc for PublishedBusinessService
 */
public class BE_WorkflowManager
  extends PublishedBusinessService
{
  /**
   * TODO: PublishedBusinessService Public Constructor
   */
  public BE_WorkflowManager()
  {
  }

  /**
   * Published method for BE_AddWorkflowHeader TODO: Document method
   * Acts as wrapper method, passing null context and null connection,
   * will call protected BE_AddWorkflowHeader
   * @param vo the value object representing input data for TODO:complete javadoc
   * @return confirmVO the response data from the business process TODO:complete javadoc
   * @throws BusinessServiceException
   */
  public AddWorkFlowHeaderReply BE_AddWorkflowHeader(AddWorkFlowHeaderRequest vo)
    throws BusinessServiceException
  {
    return BE_AddWorkflowHeader(null, null, vo);
  }

  /**
   * Protected method for BE_AddWfHeaderManager PublishedBusinessService. BE_AddWorkflowHeader will call make calls to BusinessService classes
   * for completing business process.
   * TODO: Comment parameters
   * @param vo the value object representing input data for TODO:complete javadoc
   * @param context conditionally provides the connection for the database operation and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @return response value object is the data returned from the business process TODO:complete javadoc
   * @throws BusinessServiceException
   */
  protected AddWorkFlowHeaderReply BE_AddWorkflowHeader(IContext context,
                                                        IConnection connection,
                                                        AddWorkFlowHeaderRequest vo)
    throws BusinessServiceException
  {
    //perform all work within try block, finally will clean up any connections.
    try
    {
      //Call start published method, passing context of null
      //will return context object so BSFN or DB operation can be called later.
      //Context will be used to indicate default transaction boundary, as well as access
      //to formatting and logging operations.
      context = startPublishedMethod(context, "BE_AddWorkflowHeader", vo);

      //Create new PublishedBusinessService messages object for holding errors and warnings that occur during processing.
      E1MessageList messages = new E1MessageList();
      //TODO: Create a new internal value object.
      BE_AddWorkFlowHeader_D5602000B internalDS =
        new BE_AddWorkFlowHeader_D5602000B();
      internalDS.setMnGroupId(new MathNumeric(vo.getGroupNumber()));
      internalDS.setMnMessageId(new MathNumeric(vo.getMessageID()));
      internalDS.setMnParentId(new MathNumeric(vo.getLeadId()));
      internalDS.setSzBranch(vo.getBusinessUnit());
      internalDS.setSzWorkflowType(vo.getWorkflowType());
      internalDS.setSzWorkflowOriginator(vo.getTransactionOriginator());
      internalDS.setSzAuditProgramId(vo.getProgramID());
      internalDS.setCSuppressErrorMessage(vo.getcSuppressErrorMessage());

      //TODO: Call BusinessService passing context, connection and internal VO
      messages.addMessages(be.e1.bssv.util.J560203.BE_WorkflowManager.InternalBE_AddWorkFlowHeader(context,
                                                                                                   connection,
                                                                                                   internalDS));
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
      AddWorkFlowHeaderReply confirmVO =
        new AddWorkFlowHeaderReply(internalDS);
      confirmVO.setE1MessageList(messages);

      finishPublishedMethod(context, "BE_AddWfHeaderManager");
      //return outVO, filled with return values and messages
      return confirmVO;
    }
    finally
    {
      //Call close to clean up all remaining connections and resources.
      close(context, "BE_AddWfHeaderManager");
    }
  }

  /**
   * Published method for BE_AddWfDetailManager TODO: Document method
   * Acts as wrapper method, passing null context and null connection,
   * will call protected BE_AddWfDetailManager
   * @param vo the value object representing input data for TODO:complete javadoc
   * @return confirmVO the response data from the business process TODO:complete javadoc
   * @throws BusinessServiceException
   */
  public AddWorkFlowDetailReply BE_AddWfDetailManager(AddWorkFlowDetailRequest vo)
    throws BusinessServiceException
  {
    return BE_AddWfDetailManager(null, null, vo);
  }

  /**
   * Protected method for BE_AddWfDetailManager PublishedBusinessService. BE_AddWfDetailManager will call make calls to BusinessService classes
   * for completing business process.
   * TODO: Comment parameters
   * @param vo the value object representing input data for TODO:complete javadoc
   * @param context conditionally provides the connection for the database operation and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @return response value object is the data returned from the business process TODO:complete javadoc
   * @throws BusinessServiceException
   */
  protected AddWorkFlowDetailReply BE_AddWfDetailManager(IContext context,
                                                         IConnection connection,
                                                         AddWorkFlowDetailRequest vo)
    throws BusinessServiceException
  {
    //perform all work within try block, finally will clean up any connections.
    try
    {
      //Call start published method, passing context of null
      //will return context object so BSFN or DB operation can be called later.
      //Context will be used to indicate default transaction boundary, as well as access
      //to formatting and logging operations.
      context = startPublishedMethod(context, "BE_AddWfDetailManager", vo);

      //Create new PublishedBusinessService messages object for holding errors and warnings that occur during processing.
      E1MessageList messages = new E1MessageList();
      //TODO: Create a new internal value object.
      BE_AddWorkFlowDetail_D5602000C internalDS =
        new BE_AddWorkFlowDetail_D5602000C();
      internalDS.setMnMessageId(new MathNumeric(vo.getMessageID()));
      internalDS.setSzXmlTag(vo.getXmlTag());
      internalDS.setSzXmlData(vo.getXmlData());

      //TODO: Call BusinessService passing context, connection and internal VO
      messages.addMessages(be.e1.bssv.util.J560203.BE_WorkflowManager.InternalBE_AddWorkFlowDetail(context,
                                                                                                   connection,
                                                                                                   internalDS));
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
      AddWorkFlowDetailReply confirmVO =
        new AddWorkFlowDetailReply(internalDS);
      confirmVO.setE1MessageList(messages);


      finishPublishedMethod(context, "BE_AddWfDetailManager");
      //return outVO, filled with return values and messages
      return confirmVO;
    }
    finally
    {
      //Call close to clean up all remaining connections and resources.
      close(context, "BE_AddWfDetailManager");
    }
  }

  /**
   * Published method for BE_FormatWorkflowMessage TODO: Document method
   * Acts as wrapper method, passing null context and null connection,
   * will call protected BE_FormatWorkflowMessage
   * @param vo the value object representing input data for TODO:complete javadoc
   * @return confirmVO the response data from the business process TODO:complete javadoc
   * @throws BusinessServiceException
   */
  public FormatWorkFlowMessageReply BE_FormatWorkflowMessage(FormatWorkFlowMessageRequest vo)
    throws BusinessServiceException
  {
    return BE_FormatWorkflowMessage(null, null, vo);
  }

  /**
   * Protected method for BE_FormatWfMessageManager PublishedBusinessService. BE_FormatWorkflowMessage will call make calls to BusinessService classes
   * for completing business process.
   * TODO: Comment parameters
   * @param vo the value object representing input data for TODO:complete javadoc
   * @param context conditionally provides the connection for the database operation and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @return response value object is the data returned from the business process TODO:complete javadoc
   * @throws BusinessServiceException
   */
  protected FormatWorkFlowMessageReply BE_FormatWorkflowMessage(IContext context,
                                                                IConnection connection,
                                                                FormatWorkFlowMessageRequest vo)
    throws BusinessServiceException
  {
    //perform all work within try block, finally will clean up any connections.
    try
    {
      //Call start published method, passing context of null
      //will return context object so BSFN or DB operation can be called later.
      //Context will be used to indicate default transaction boundary, as well as access
      //to formatting and logging operations.
      context =
          startPublishedMethod(context, "BE_FormatWorklowMessage", vo);

      //Create new PublishedBusinessService messages object for holding errors and warnings that occur during processing.
      E1MessageList messages = new E1MessageList();
      //TODO: Create a new internal value object.
      BE_FormatWorkFlowMessage_D5602000E internalDS =
        new BE_FormatWorkFlowMessage_D5602000E();
      internalDS.setSzMessageTemplate(vo.getMessageTemplate());
      internalDS.setSzParameter01(vo.getParameterDataItem01());
      internalDS.setSzParameter02(vo.getParameterDataItem02());
      internalDS.setSzParameter03(vo.getParameterDataItem03());
      internalDS.setSzParameter04(vo.getParameterDataItem04());
      internalDS.setSzParameter05(vo.getParameterDataItem05());
      internalDS.setSzParameter06(vo.getParameterDataItem06());
      internalDS.setSzParameter07(vo.getParameterDataItem07());
      internalDS.setSzParameter08(vo.getParameterDataItem08());
      internalDS.setSzParameter09(vo.getParameterDataItem09());
      internalDS.setSzParameter10(vo.getParameterDataItem10());
      internalDS.setSzEmailMsg(vo.getEMailMessage());
      internalDS.setMnMessageId(new MathNumeric(vo.getMessageID()));
      internalDS.setSzWorkflowLineType(vo.getWorkFlowLineType());
      internalDS.setSzXmlTag(vo.getElement01());


      //TODO: Call BusinessService passing context, connection and internal VO
      messages.addMessages(be.e1.bssv.util.J560203.BE_WorkflowManager.InternalBE_FormatWorkflowMessage(context,
                                                                                                       connection,
                                                                                                       internalDS));
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
      FormatWorkFlowMessageReply confirmVO =
        new FormatWorkFlowMessageReply(internalDS);
      confirmVO.setE1MessageList(messages);
      finishPublishedMethod(context, "BE_FormatWfMessageManager");
      //return outVO, filled with return values and messages
      return confirmVO;
    }
    finally
    {
      //Call close to clean up all remaining connections and resources.
      close(context, "BE_FormatWfMessageManager");
    }
  }

  /**
   * Published method for BE_ProcessWorkflowMessage TODO: Document method
   * Acts as wrapper method, passing null context and null connection,
   * will call protected BE_ProcessWorkflowMessage
   * @param vo the value object representing input data for TODO:complete javadoc
   * @return confirmVO the response data from the business process TODO:complete javadoc
   * @throws BusinessServiceException
   */
  public ProcessWorkFlowMessageReply BE_ProcessWorkflowMessage(ProcessWorkFlowMessageRequest vo)
    throws BusinessServiceException
  {
    return BE_ProcessWorkflowMessage(null, null, vo);
  }

  /**
   * Protected method for BE_ProcessWfMessageManager PublishedBusinessService. BE_ProcessWorkflowMessage will call make calls to BusinessService classes
   * for completing business process.
   * TODO: Comment parameters
   * @param vo the value object representing input data for TODO:complete javadoc
   * @param context conditionally provides the connection for the database operation and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @return response value object is the data returned from the business process TODO:complete javadoc
   * @throws BusinessServiceException
   */
  protected ProcessWorkFlowMessageReply BE_ProcessWorkflowMessage(IContext context,
                                                                  IConnection connection,
                                                                  ProcessWorkFlowMessageRequest vo)
    throws BusinessServiceException
  {
    //perform all work within try block, finally will clean up any connections.
    try
    {
      //Call start published method, passing context of null
      //will return context object so BSFN or DB operation can be called later.
      //Context will be used to indicate default transaction boundary, as well as access
      //to formatting and logging operations.
      context =
          startPublishedMethod(context, "BE_ProcessWorkflowMessage", vo);

      //Create new PublishedBusinessService messages object for holding errors and warnings that occur during processing.
      E1MessageList messages = new E1MessageList();
      //TODO: Create a new internal value object.
      BE_ProcessWorkflowMessage_D5602000F internalDS =
        new BE_ProcessWorkflowMessage_D5602000F();
      internalDS.setMnGroupId(new MathNumeric(vo.getGroupNumber()));
      internalDS.setCWriteXmlToFile(vo.getJDEnterpriseOneEventPoint01());
      //TODO: Call BusinessService passing context, connection and internal VO
      messages.addMessages(be.e1.bssv.util.J560203.BE_WorkflowManager.InternalBE_ProcessWorkflowMessage(context,
                                                                                                        connection,
                                                                                                        internalDS));
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
      ProcessWorkFlowMessageReply confirmVO =
        new ProcessWorkFlowMessageReply(internalDS);
      confirmVO.setE1MessageList(messages);
      finishPublishedMethod(context, "BE_ProcessWorkflowMessage");
      //return outVO, filled with return values and messages
      return confirmVO;
    }
    finally
    {
      //Call close to clean up all remaining connections and resources.
      close(context, "BE_ProcessWorkflowMessage");
    }
  }

  /**
   * Published method for BE_BuildParameterizedUrl TODO: Document method
   * Acts as wrapper method, passing null context and null connection,
   * will call protected BE_BuildParameterizedUrl
   * @param vo the value object representing input data for TODO:complete javadoc
   * @return confirmVO the response data from the business process TODO:complete javadoc
   * @throws BusinessServiceException
   */
  public BuildParameterizedUrlReply BE_BuildParameterizedUrl(BuildParameterizedUrlRequest vo)
    throws BusinessServiceException
  {
    return BE_BuildParameterizedUrl(null, null, vo);
  }

  /**
   * Protected method for BE_BuildParameterizedUrlManager PublishedBusinessService. BE_BuildParameterizedUrl will call make calls to BusinessService classes
   * for completing business process.
   * TODO: Comment parameters
   * @param vo the value object representing input data for TODO:complete javadoc
   * @param context conditionally provides the connection for the database operation and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @return response value object is the data returned from the business process TODO:complete javadoc
   * @throws BusinessServiceException
   */
  protected BuildParameterizedUrlReply BE_BuildParameterizedUrl(IContext context,
                                                                IConnection connection,
                                                                BuildParameterizedUrlRequest vo)
    throws BusinessServiceException
  {
    //perform all work within try block, finally will clean up any connections.
    try
    {
      //Call start published method, passing context of null
      //will return context object so BSFN or DB operation can be called later.
      //Context will be used to indicate default transaction boundary, as well as access
      //to formatting and logging operations.
      context =
          startPublishedMethod(context, "BE_BuildParameterizedUrl", vo);

      //Create new PublishedBusinessService messages object for holding errors and warnings that occur during processing.
      E1MessageList messages = new E1MessageList();
      //TODO: Create a new internal value object.
      BE_BuildParameterizedUrl_D5602000H internalDS =
        new BE_BuildParameterizedUrl_D5602000H();
      internalDS.setSzProgramName(vo.getObjectName());
      internalDS.setSzFormName(vo.getFormName());
      internalDS.setSzVersion(vo.getVersion());
      internalDS.setSzEncodedRedirectUrl(vo.getEncodedRedirectUrl());
      internalDS.setSzParameterIdList(vo.getParameterProgramCall());
      internalDS.setSzParameterValueList(vo.getParameterString());
      internalDS.setSzParameterizedURL(vo.getSupplierItemURL());


      //TODO: Call BusinessService passing context, connection and internal VO
      messages.addMessages(be.e1.bssv.util.J560203.BE_WorkflowManager.InternalBE_BuildParameterizedUrl(context,
                                                                                                       connection,
                                                                                                       internalDS));
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
      BuildParameterizedUrlReply confirmVO =
        new BuildParameterizedUrlReply(internalDS);
      confirmVO.setE1MessageList(messages);
      finishPublishedMethod(context, "BE_BuildParameterizedUrl");
      //return outVO, filled with return values and messages
      return confirmVO;
    }
    finally
    {
      //Call close to clean up all remaining connections and resources.
      close(context, "BE_BuildParameterizedUrl");
    }
  }

  /**
   * Published method for BE_UpdateWorkflowHeader TODO: Document method
   * Acts as wrapper method, passing null context and null connection,
   * will call protected BE_UpdateWorkflowHeader
   * @param vo the value object representing input data for TODO:complete javadoc
   * @return confirmVO the response data from the business process TODO:complete javadoc
   * @throws BusinessServiceException
   */
  public UpdateWorkFlowHeaderReply BE_UpdateWorkflowHeader(UpdateWorkFlowHeaderRequest vo)
    throws BusinessServiceException
  {
    return BE_UpdateWorkflowHeader(null, null, vo);
  }

  /**
   * Protected method for BE_UpdateWfHeaderManager PublishedBusinessService. BE_UpdateWorkflowHeader will call make calls to BusinessService classes
   * for completing business process.
   * TODO: Comment parameters
   * @param vo the value object representing input data for TODO:complete javadoc
   * @param context conditionally provides the connection for the database operation and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @return response value object is the data returned from the business process TODO:complete javadoc
   * @throws BusinessServiceException
   */
  protected UpdateWorkFlowHeaderReply BE_UpdateWorkflowHeader(IContext context,
                                                              IConnection connection,
                                                              UpdateWorkFlowHeaderRequest vo)
    throws BusinessServiceException
  {
    //perform all work within try block, finally will clean up any connections.
    try
    {
      //Call start published method, passing context of null
      //will return context object so BSFN or DB operation can be called later.
      //Context will be used to indicate default transaction boundary, as well as access
      //to formatting and logging operations.
      context =
          startPublishedMethod(context, "BE_UpdateWorkflowHeader", vo);

      //Create new PublishedBusinessService messages object for holding errors and warnings that occur during processing.
      E1MessageList messages = new E1MessageList();
      //TODO: Create a new internal value object.
      BE_UpdateWorkflowHeader_D5602000I internalDS =
        new BE_UpdateWorkflowHeader_D5602000I();

      if (vo.getMessageID() != null)
      {
        internalDS.setMnTaskId(new MathNumeric(vo.getMessageID()));
      }
      internalDS.setSzCompanyKeyOrderNo(vo.getOrderCompanyOrderNumber());
      if (vo.getDocumentOrderNoInvoiceetc() != null)
      {
        internalDS.setMnDocumentOrderInvoiceE(new MathNumeric(vo.getDocumentOrderNoInvoiceetc()));
      }
      internalDS.setSzOrderType(vo.getOrderType());
      if (vo.getLineNumber() != null)
      {
        internalDS.setMnLineNumber(new MathNumeric(vo.getLineNumber()));
      }
      internalDS.setSzCostCenterHeader(vo.getBusinessUnitHeader());
      internalDS.setSzAccountId(vo.getAccountID());
      if (vo.getItemNumberShort() != null)
      {
        internalDS.setMnIdentifierShortItem(new MathNumeric(vo.getItemNumberShort()));
      }
      if(vo.getSequenceNumber() != null)
      {
        internalDS.setMnSequenceNumber1(new MathNumeric(vo.getSequenceNumber()));
      }
      internalDS.setSzLineType(vo.getLineType());
      internalDS.setSzGenericKey(vo.getGenericKey());
      if(vo.getCompositeKeyValues() != null)
      {
        internalDS.setMnCompositeKeyValues(new MathNumeric(vo.getCompositeKeyValues()));
      }
      if(vo.getDocumentVoucherInvoiceetc() != null)
      {
        internalDS.setMnDocVoucherInvoiceE(new MathNumeric(vo.getDocumentVoucherInvoiceetc()));
      }
      internalDS.setSzDocumentType(vo.getDocumentType());
      internalDS.setSzCompany(vo.getCompany());
      internalDS.setSzUserId(vo.getUserID());
      internalDS.setJdDateUpdated(vo.getDateUpdated());
      if(vo.getTimeLastUpdated() != null)
      {
        internalDS.setMnTimeLastUpdated(new MathNumeric(vo.getTimeLastUpdated()));
      }
      internalDS.setSzWorkStationId(vo.getWorkStationID());
      internalDS.setSzProgramId(vo.getProgramID());

      //TODO: Call BusinessService passing context, connection and internal VO
      messages.addMessages(be.e1.bssv.util.J560203.BE_WorkflowManager.InternalBE_UpdateWorkflowHeader(context,
                                                                                                      connection,
                                                                                                      internalDS));
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
      UpdateWorkFlowHeaderReply confirmVO =
        new UpdateWorkFlowHeaderReply(internalDS);
      confirmVO.setE1MessageList(messages);
      finishPublishedMethod(context, "BE_UpdateWorkflowHeader");
      //return outVO, filled with return values and messages
      return confirmVO;
    }
    finally
    {
      //Call close to clean up all remaining connections and resources.
      close(context, "BE_UpdateWorkflowHeader");
    }
  }

  /**
   * Published method for BE_AddWfDetailManager PublishedBusinessService.
   * Acts as wrapper method, passing null context and null connection,
   * will call protected BE_GetHumanTaskInfo
   * @param vo the value object representing input data for TODO:complete javadoc
   * @return confirmVO the response data from the business process TODO:complete javadoc
   * @throws BusinessServiceException
   */
  public HumanTaskReply BE_GetHumanTaskInfo(HumanTaskRequest vo)
    throws BusinessServiceException
  {
    return BE_GetHumanTaskInfo(null, null, vo);
  }

  /**
   * Protected method for BE_AddWfDetailManager PublishedBusinessService.
   * BE_GetHumanTaskInfo will call make calls to BusinessService classes
   * for completing business process.
   * TODO: Comment parameters
   * @param vo the value object representing input data for TODO:complete javadoc
   * @param context conditionally provides the connection for the database operation and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @return response value object is the data returned from the business process TODO:complete javadoc
   * @throws BusinessServiceException
   */
  protected HumanTaskReply BE_GetHumanTaskInfo(IContext context,
                                               IConnection connection,
                                               HumanTaskRequest vo)
    throws BusinessServiceException
  {
    HumanTaskReply confirmVO = null;

    try
    {
      context = startPublishedMethod(context, "BE_GetHumanTaskInfo", vo);

      E1MessageList messages = new E1MessageList();

      BE_HumanTaskQuery internalDS = new BE_HumanTaskQuery();
      internalDS.setF560205_Z56WFTP(vo.getWorkflowType());
      internalDS.setF560205_MCU(vo.getWorkflowBranch());
      internalDS.setF560205_SLCUSTFN(vo.getWorkflowLevel());
      internalDS.setF560205_GROUP(vo.getWorkflowGroup());
      internalDS.setF560205_ALKY(vo.getAlternateKey1());
      internalDS.setF560205_ALKY1(vo.getAlternateKey2());
      internalDS.setF560205_Z56ALKY3(vo.getAlternateKey3());
      internalDS.setF560205_Z56ALKY4(vo.getAlternateKey4());
      internalDS.setF560205_Z56ALKY5(vo.getAlternateKey5());
      internalDS.setF560205_Z56ALKY6(vo.getAlternateKey6());
      internalDS.setF560205_Z56ALKY7(vo.getAlternateKey7());
      internalDS.setF560205_Z56ALKY8(vo.getAlternateKey8());

      messages.addMessages(be.e1.bssv.util.J560203.BE_WorkflowManager.InternalBE_GetHumanTaskInfo(context,
                                                                                                  connection,
                                                                                                  internalDS));

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
      confirmVO = new HumanTaskReply();
      confirmVO.setErrorFlag(internalDS.getCErrorFlag());
      confirmVO.setErrorMessage(internalDS.getSzErrorDescription());

      if (internalDS.getCErrorFlag() != "1")
      {
        int size = internalDS.getQueryResults().size();
        BE_HumanTaskResult result = null;
        HumanTaskData[] resultSet = new HumanTaskData[size];

        for (int x = 0; x < size; x++)
        {
          resultSet[x] = new HumanTaskData(internalDS.getResultData(x));
        }
        confirmVO.setHumanTaskInfo(resultSet);
      }

      confirmVO.setE1MessageList(messages);
      finishPublishedMethod(context, "BE_GetHumanTaskInfo");
    }
    catch (Exception exp)
    {
      System.out.println("Some exception occured");
    }
    finally
    {
      //Call close to clean up all remaining connections and resources.
      close(context, "BE_GetHumanTaskInfo");
    }
    //return outVO, filled with return values and messages
    return confirmVO;
  }
}
