package be.e1.bssv.J564800;

import be.e1.bssv.J564800.valueobject.WOMPSTag_D5648007;
import be.e1.bssv.J564800.valueobject.WOManager_D5648005;

import java.util.Date;

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
public abstract class BE_WorkOrderMgr extends BusinessService
{
  /**
   * TODO: Create Java Doc for: InternalProcessWorkOrder
   * Method InternalProcessWorkOrder is used for...?
   * @param context conditionally provides the connection for the database operation and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
   * @return an E1Message containing the text of any errors or warnings that may have occurred
   */
  public static E1MessageList InternalProcessWorkOrder(IContext context, IConnection connection, WOManager_D5648005 internalVO)
  {
    //Call start internal method, passing the context (which was passed from PublishedBusinessService).
    startInternalMethod(context, "InternalProcessWorkOrder", internalVO);
    //Create new message list for BusinessService processing.
    E1MessageList messages = new E1MessageList();
    //call internal function
    messages.addMessages(callN5648005WOMgr(context, connection, internalVO));
    //Call finish internal method passing context.
    finishInternalMethod(context, "InternalProcessWorkOrder");
    //Call finish internal method passing context.
    return messages;
  }
  
  public static E1MessageList InternalProcessWOMPSTag(IContext context, IConnection connection, WOMPSTag_D5648007 internalVO)
  {
    //Call start internal method, passing the context (which was passed from PublishedBusinessService).
    startInternalMethod(context, "InternalProcessWOMPSTag", internalVO);
    //Create new message list for BusinessService processing.
    E1MessageList messages = new E1MessageList();
    //call internal function
    //messages.addMessages(callN5648005WOMgr(context, connection, internalVO));
    callBE_MPS_WOTagFile_Update(context, connection, internalVO);

    //Call finish internal method passing context.
    finishInternalMethod(context, "InternalProcessWOMPSTag");
    //Call finish internal method passing context.
    return messages;
  }

  private static E1MessageList callN5648005WOMgr(IContext context, IConnection connection, WOManager_D5648005 internalVO)
  {
    BSFNParameters bsfnParams = new BSFNParameters();

    // map input parameters from input value object
    bsfnParams.setValue("szTransactionTypeCode_TD1", internalVO.getSzTransactionTypeCode_TD1());
    bsfnParams.setValue("mnWONumber_DOCO", internalVO.getMnWONumber_DOCO());
    bsfnParams.setValue("szWOType_DCTO", internalVO.getSzWOType_DCTO());
    bsfnParams.setValue("szBranchPlant_MMCU", internalVO.getSzBranchPlant_MMCU());
    bsfnParams.setValue("szBusinessUnit_MCU", internalVO.getSzBusinessUnit_MCU());
    bsfnParams.setValue("mnShortItemNumber_ITM", internalVO.getMnShortItemNumber_ITM());
    bsfnParams.setValue("szItemNumber_LITM", internalVO.getSzItemNumber_LITM());
    bsfnParams.setValue("mnOrderQuantity_UORG", internalVO.getMnOrderQuantity_UORG());
    bsfnParams.setValue("szWOStatusCode_SRST", internalVO.getSzWOStatusCode_SRST());
    bsfnParams.setValue("jdDateStart_STRT", internalVO.getJdDateStart_STRT());
    bsfnParams.setValue("jdDateRequested_DRQJ", internalVO.getJdDateRequested_DRQJ());
    bsfnParams.setValue("szWOTypeBill_TBM", internalVO.getSzWOTypeBill_TBM());
    bsfnParams.setValue("szWOTypeRouting_TRT", internalVO.getSzWOTypeRouting_TRT());
    bsfnParams.setValue("cWOFreezeCode_UNCD", internalVO.getCWOFreezeCode_UNCD());
    bsfnParams.setValue("szProductionNum_PMPN", internalVO.getSzProductionNum_PMPN());
    bsfnParams.setValue("mnProductionNumShort_PNS", internalVO.getMnProductionNumShort_PNS());
    bsfnParams.setValue("szMediaObjectName_OBNM", internalVO.getSzMediaObjectName_OBNM());
    bsfnParams.setValue("szMediaObjectKey_TXKY", internalVO.getSzMediaObjectKey_TXKY());
    bsfnParams.setValue("szMediaObjectText_MOTEXT", internalVO.getSzMediaObjectText_MOTEXT());
    bsfnParams.setValue("szF3112LineIdentifier_LINE", internalVO.getSzF3112LineIdentifier_LINE());
    bsfnParams.setValue("szF3112RoutingDesc_DSC1", internalVO.getSzF3112RoutingDesc_DSC1());
    bsfnParams.setValue("mnF3112OperationSeq_OPSQ", internalVO.getMnF3112OperationSeq_OPSQ());
    bsfnParams.setValue("szF3112OperationStatus_OPST", internalVO.getSzF3112OperationStatus_OPST());
    bsfnParams.setValue("mnF3112MoveHours_MOVD", internalVO.getMnF3112MoveHours_MOVD());
    bsfnParams.setValue("mnF3112QueueHours_QUED", internalVO.getMnF3112QueueHours_QUED());
    bsfnParams.setValue("mnF3112RunMacStd_RUNM", internalVO.getMnF3112RunMacStd_RUNM());
    bsfnParams.setValue("mnF3112RunLaborStd_RUNL", internalVO.getMnF3112RunLaborStd_RUNL());
    bsfnParams.setValue("mnF3112SetupLaborHrs_SETL", internalVO.getMnF3112SetupLaborHrs_SETL());
    bsfnParams.setValue("szP48013_WOVersion_VERS", internalVO.getSzP48013_WOVersion_VERS());
    bsfnParams.setValue("szP3112_RoutVersion_VERS", internalVO.getSzP3112_RoutVersion_VERS());
    bsfnParams.setValue("szWOItemUOM_UOM", internalVO.getSzWOItemUOM_UOM());
    bsfnParams.setValue("cMBFErrorCode_ERRC", internalVO.getCMBFErrorCode_ERRC());
    bsfnParams.setValue("szMBFErrorMessage", internalVO.getSzMBFErrorMessage());
    bsfnParams.setValue("cBSSVErrorFlag_FLAG", internalVO.getCBSSVErrorFlag_FLAG());
    bsfnParams.setValue("szBSSVErrorMsgDesc_TRANDATA", internalVO.getSzBSSVErrorMsgDesc_TRANDATA());
    bsfnParams.setValue("szBSSVRequestId_DL010", internalVO.getSzBSSVRequestId_DL010());
    bsfnParams.setValue("mnUserResNum_URAB", internalVO.getMnUserResNum_URAB());
    bsfnParams.setValue("mnUserResAmt_URAT", internalVO.getMnUserResAmt_URAT());
    bsfnParams.setValue("szUserResRef_URRF", internalVO.getSzUserResRef_URRF());
    bsfnParams.setValue("szUserResCode_URCD", internalVO.getSzUserResCode_URCD());
    bsfnParams.setValue("jdUserResDate_URDT", internalVO.getJdUserResDate_URDT());
    bsfnParams.setValue("cFUFlag_EV01", internalVO.getCFUFlag_EV01());
    bsfnParams.setValue("szF3112TypeOpCode_OPSC", internalVO.getSzF3112TypeOpCode_OPSC());
    bsfnParams.setValue("szF3112ToWorkCenter_MCU", internalVO.getSzF3112ToWorkCenter_MCU());
    bsfnParams.setValue("szRelatedOrdNum_RORN", internalVO.getSzRelatedOrdNum_RORN());
    bsfnParams.setValue("szRelatedOrderType_RCTO", internalVO.getSzRelatedOrderType_RCTO());
    bsfnParams.setValue("mnLineNumber_LNID", internalVO.getMnLineNumber_LNID());
    bsfnParams.setValue("szParentWoNum_PARS", internalVO.getSzParentWoNum_PARS());
    bsfnParams.setValue("szStatusCommentWo_STCM", internalVO.getSzStatusCommentWO_STCM());
    bsfnParams.setValue("szWOCat001_WR01", internalVO.getSzWOCat001_WR01());
    bsfnParams.setValue("szWOCat002_WR02", internalVO.getSzWOCat002_WR02());
    bsfnParams.setValue("szWOCat003_WR03", internalVO.getSzWOCat003_WR03());
    bsfnParams.setValue("szReference1_VR01", internalVO.getSzReference1_VR01());
    bsfnParams.setValue("szReference2_VR02", internalVO.getSzReference2_VR02());
    bsfnParams.setValue("szUserId_USER", internalVO.getSzUserId_USER());
    bsfnParams.setValue("mnMRPMessageID_UKID", internalVO.getMnMRPMessageID_UKID());
    
    try
    {
      //get bsfnService from context
      IBSFNService bsfnService = context.getBSFNService();
      //execute business function
      bsfnService.execute(context, connection, "BE_MRP_CRP_WOMANAGER", bsfnParams);
    }
    catch (BSFNServiceInvalidArgException invalidArgEx)
    {
      //Create error message for Invalid Argument exception and return it in ErrorList
      E1MessageList returnMessages = new E1MessageList();
      returnMessages.addMessage(new E1Message(context, "018FIS", invalidArgEx.getMessage()));
      internalVO.setCMBFErrorCode_ERRC("1");
      internalVO.setSzMBFErrorMessage("An invalid argument exception occurred");
      return returnMessages;
    }
    catch (BSFNServiceSystemException systemEx)
    {
      //Create error message for System exception and return it in ErrorList
      E1MessageList returnMessages = new E1MessageList();
      returnMessages.addMessage(new E1Message(context, "019FIS", systemEx.getMessage()));
      internalVO.setCMBFErrorCode_ERRC("1");
      internalVO.setSzMBFErrorMessage("A system exception occurred");
      return returnMessages;
    }

    //map output parameters to output value object
    internalVO.setSzTransactionTypeCode_TD1((String)bsfnParams.getValue("szTransactionTypeCode_TD1"));
    internalVO.setMnWONumber_DOCO((MathNumeric)bsfnParams.getValue("mnWONumber_DOCO"));
    internalVO.setSzWOType_DCTO((String)bsfnParams.getValue("szWOType_DCTO"));
    internalVO.setSzBranchPlant_MMCU((String)bsfnParams.getValue("szBranchPlant_MMCU"));
    internalVO.setSzBusinessUnit_MCU((String)bsfnParams.getValue("szBusinessUnit_MCU"));
    internalVO.setMnShortItemNumber_ITM((MathNumeric)bsfnParams.getValue("mnShortItemNumber_ITM"));
    internalVO.setSzItemNumber_LITM((String)bsfnParams.getValue("szItemNumber_LITM"));
    internalVO.setMnOrderQuantity_UORG((MathNumeric)bsfnParams.getValue("mnOrderQuantity_UORG"));
    internalVO.setSzWOStatusCode_SRST((String)bsfnParams.getValue("szWOStatusCode_SRST"));
    internalVO.setJdDateStart_STRT((Date)bsfnParams.getValue("jdDateStart_STRT"));
    internalVO.setJdDateRequested_DRQJ((Date)bsfnParams.getValue("jdDateRequested_DRQJ"));
    internalVO.setSzWOTypeBill_TBM((String)bsfnParams.getValue("szWOTypeBill_TBM"));
    internalVO.setSzWOTypeRouting_TRT((String)bsfnParams.getValue("szWOTypeRouting_TRT"));
    internalVO.setCWOFreezeCode_UNCD(bsfnParams.getValue("cWOFreezeCode_UNCD").toString());
    internalVO.setSzProductionNum_PMPN((String)bsfnParams.getValue("szProductionNum_PMPN"));
    internalVO.setMnProductionNumShort_PNS((MathNumeric)bsfnParams.getValue("mnProductionNumShort_PNS"));
    internalVO.setSzMediaObjectName_OBNM((String)bsfnParams.getValue("szMediaObjectName_OBNM"));
    internalVO.setSzMediaObjectKey_TXKY((String)bsfnParams.getValue("szMediaObjectKey_TXKY"));
    internalVO.setSzMediaObjectText_MOTEXT((String)bsfnParams.getValue("szMediaObjectText_MOTEXT"));
    internalVO.setSzF3112LineIdentifier_LINE((String)bsfnParams.getValue("szF3112LineIdentifier_LINE"));
    internalVO.setSzF3112RoutingDesc_DSC1((String)bsfnParams.getValue("szF3112RoutingDesc_DSC1"));
    internalVO.setMnF3112OperationSeq_OPSQ((MathNumeric)bsfnParams.getValue("mnF3112OperationSeq_OPSQ"));
    internalVO.setSzF3112OperationStatus_OPST((String)bsfnParams.getValue("szF3112OperationStatus_OPST"));
    internalVO.setMnF3112MoveHours_MOVD((MathNumeric)bsfnParams.getValue("mnF3112MoveHours_MOVD"));
    internalVO.setMnF3112QueueHours_QUED((MathNumeric)bsfnParams.getValue("mnF3112QueueHours_QUED"));
    internalVO.setMnF3112RunMacStd_RUNM((MathNumeric)bsfnParams.getValue("mnF3112RunMacStd_RUNM"));
    internalVO.setMnF3112RunLaborStd_RUNL((MathNumeric)bsfnParams.getValue("mnF3112RunLaborStd_RUNL"));
    internalVO.setMnF3112SetupLaborHrs_SETL((MathNumeric)bsfnParams.getValue("mnF3112SetupLaborHrs_SETL"));
    internalVO.setSzP48013_WOVersion_VERS((String)bsfnParams.getValue("szP48013_WOVersion_VERS"));
    internalVO.setSzP3112_RoutVersion_VERS((String)bsfnParams.getValue("szP3112_RoutVersion_VERS"));
    internalVO.setSzWOItemUOM_UOM((String)bsfnParams.getValue("szWOItemUOM_UOM"));
    internalVO.setCBSSVErrorFlag_FLAG((String)bsfnParams.getValue("cBSSVErrorFlag_FLAG"));
    internalVO.setSzBSSVErrorMsgDesc_TRANDATA((String)bsfnParams.getValue("szBSSVErrorMsgDesc_TRANDATA"));
    internalVO.setSzBSSVRequestId_DL010((String)bsfnParams.getValue("szBSSVRequestId_DL010"));
    internalVO.setMnUserResNum_URAB((MathNumeric)bsfnParams.getValue("mnUserResNum_URAB"));
    internalVO.setMnUserResAmt_URAT((MathNumeric)bsfnParams.getValue("mnUserResAmt_URAT"));
    internalVO.setSzUserResRef_URRF((String)bsfnParams.getValue("szUserResRef_URRF"));
    internalVO.setSzUserResCode_URCD((String)bsfnParams.getValue("szUserResCode_URCD"));
    internalVO.setJdUserResDate_URDT((Date)bsfnParams.getValue("jdUserResDate_URDT"));
    internalVO.setCFUFlag_EV01(bsfnParams.getValue("cFUFlag_EV01").toString());
    internalVO.setSzF3112TypeOpCode_OPSC((String)bsfnParams.getValue("szF3112TypeOpCode_OPSC"));
    internalVO.setSzF3112ToWorkCenter_MCU((String)bsfnParams.getValue("szF3112ToWorkCenter_MCU"));
    internalVO.setSzRelatedOrdNum_RORN((String)bsfnParams.getValue("szRelatedOrdNum_RORN"));
    internalVO.setSzRelatedOrderType_RCTO((String)bsfnParams.getValue("szRelatedOrderType_RCTO"));
    internalVO.setMnLineNumber_LNID((MathNumeric)bsfnParams.getValue("mnLineNumber_LNID"));
    internalVO.setSzParentWoNum_PARS((String)bsfnParams.getValue("szParentWoNum_PARS"));
    internalVO.setSzStatusCommentWO_STCM((String)bsfnParams.getValue("szStatusCommentWo_STCM"));
    internalVO.setSzWOCat001_WR01((String)bsfnParams.getValue("szWOCat001_WR01"));
    internalVO.setSzWOCat002_WR02((String)bsfnParams.getValue("szWOCat002_WR02"));
    internalVO.setSzWOCat003_WR03((String)bsfnParams.getValue("szWOCat003_WR03"));
    internalVO.setSzReference1_VR01((String)bsfnParams.getValue("szReference1_VR01"));
    internalVO.setSzReference2_VR02((String)bsfnParams.getValue("szReference2_VR02"));
    internalVO.setCMBFErrorCode_ERRC(bsfnParams.getValue("cMBFErrorCode_ERRC").toString());
    internalVO.setSzMBFErrorMessage((String)bsfnParams.getValue("szMBFErrorMessage"));
    internalVO.setSzMBFErrorMessage((String)bsfnParams.getValue("szUserId_USER"));
    
    //return any errors, warnings, or informational messages to the caller
    return bsfnParams.getE1MessageList();
  }

  /**
   * Calls the BE_MPS_WOTagFile_Update(N5648005) business function which has the D5648007 datastructure.
   * @param context conditionally provides the connection for the business function call and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @param TODO document input parameters
   * @return A list of messages if there were application errors, warnings, or informational
   * messages. Returns null if there were no messages.
   */
  private static E1MessageList callBE_MPS_WOTagFile_Update(IContext context, IConnection connection, WOMPSTag_D5648007 internalVO)
  {
    BSFNParameters bsfnParams = new BSFNParameters();

    // map input parameters from input value object
    bsfnParams.setValue("mnWONumber_DOCO", internalVO.getMnWONumber_DOCO());
    bsfnParams.setValue("szWOType_DCTO", internalVO.getSzWOType_DCTO());
    bsfnParams.setValue("cFlags008_ET08", internalVO.getCFlags008_ET08());
    bsfnParams.setValue("cAsmblyQtyChgInd_Z56AQCI", internalVO.getCAsmblyQtyChgInd_Z56AQCI());
    bsfnParams.setValue("cSoChgInd_Z56SOCI", internalVO.getCSoChgInd_Z56SOCI());
    bsfnParams.setValue("cReqDateChgInd_Z56RDCI", internalVO.getCReqDateChgInd_Z56RDCI());
    bsfnParams.setValue("cCncllDateChgInd_Z56CDI", internalVO.getCCncllDateChgInd_Z56CDI());
    bsfnParams.setValue("cPickDateChgInd_Z56PDCI", internalVO.getCPickDateChgInd_Z56PDCI());
    bsfnParams.setValue("cSONxtStChgInd_Z56NSCI", internalVO.getCSONxtStChgInd_Z56NSCI());
    bsfnParams.setValue("cPickDateReqInd_Z56PDI", internalVO.getCPickDateReqInd_Z56PDI());
    bsfnParams.setValue("szProgramId_PID", internalVO.getSzProgramId_PID());
    bsfnParams.setValue("szWorkStationId_JOBN", internalVO.getSzWorkStationId_JOBN());
    bsfnParams.setValue("szUserId_USER", internalVO.getSzUserId_USER());
    bsfnParams.setValue("jdDateUpdated_UPMJ", internalVO.getJdDateUpdated_UPMJ());
    bsfnParams.setValue("mnTimeLastUpdated_UPMT", internalVO.getMnTimeLastUpdated_UPMT());

    try
    {
      //get bsfnService from context
      IBSFNService bsfnService = context.getBSFNService();
      //execute business function
      bsfnService.execute(context, connection, "BE_MPS_WOTagFile_Update", bsfnParams);
    }
    catch (BSFNServiceInvalidArgException invalidArgEx)
    {
      //Create error message for Invalid Argument exception and return it in ErrorList
      E1MessageList returnMessages = new E1MessageList();
      returnMessages.addMessage(new E1Message(context, "018FIS", invalidArgEx.getMessage()));
      internalVO.setCErrorCode_ERRC("1");
      internalVO.setSzErrorMessage_TRANDATA("An invalid argument exception occurred");
      return returnMessages;
    }
    catch (BSFNServiceSystemException systemEx)
    {
      //Create error message for System exception and return it in ErrorList
      E1MessageList returnMessages = new E1MessageList();
      returnMessages.addMessage(new E1Message(context, "019FIS", systemEx.getMessage()));
      internalVO.setCErrorCode_ERRC("1");
      internalVO.setSzErrorMessage_TRANDATA("A system exception occurred");
      return returnMessages;
    }

    //map output parameters to output value object
    internalVO.setMnWONumber_DOCO((MathNumeric)bsfnParams.getValue("mnWONumber_DOCO"));
    internalVO.setSzWOType_DCTO((String)bsfnParams.getValue("szWOType_DCTO"));
    internalVO.setCFlags008_ET08((String)bsfnParams.getValue("cFlags008_ET08"));
    internalVO.setCAsmblyQtyChgInd_Z56AQCI((String)bsfnParams.getValue("cAsmblyQtyChgInd_Z56AQCI"));
    internalVO.setCSoChgInd_Z56SOCI((String)bsfnParams.getValue("cSoChgInd_Z56SOCI"));
    internalVO.setCReqDateChgInd_Z56RDCI((String)bsfnParams.getValue("cReqDateChgInd_Z56RDCI"));
    internalVO.setCCncllDateChgInd_Z56CDI((String)bsfnParams.getValue("cCncllDateChgInd_Z56CDI"));
    internalVO.setCPickDateChgInd_Z56PDCI((String)bsfnParams.getValue("cPickDateChgInd_Z56PDCI"));
    internalVO.setCSONxtStChgInd_Z56NSCI((String)bsfnParams.getValue("cSONxtStChgInd_Z56NSCI"));
    internalVO.setSzProgramId_PID((String)bsfnParams.getValue("szProgramId_PID"));
    internalVO.setSzUserId_USER((String)bsfnParams.getValue("szUserId_USER"));
    internalVO.setCErrorCode_ERRC((String)bsfnParams.getValue("cErrorCode_ERRC"));
    internalVO.setSzErrorMessage_TRANDATA((String)bsfnParams.getValue("szErrorMessage_TRANDATA"));

    //return any errors, warnings, or informational messages to the caller
    return bsfnParams.getE1MessageList();
  }
}
