package be.e1.bssv.J564101;

import be.e1.bssv.J564101.valueobject.InternalGetCCBTrackerInfo;

import be.e1.bssv.J564101.valueobject.InternalGetRevisionItem;
import be.e1.bssv.J564101.valueobject.InternalItemUseUpF59RC003;
import be.e1.bssv.J564101.valueobject.InternalShowCCBTrackerInfo;

import be.e1.bssv.J564101.valueobject.InternalShowRevItem;

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
public abstract class BE_GetCCBTrackerInfoProcessor extends BusinessService {
    /**
     * TODO: Create Java Doc for: getCCBTrackerInfoProcessor
     * Method getCCBTrackerInfoProcessor is used for...?
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
     * @return an E1Message containing the text of any errors or warnings that may have occurred
     */
    public static E1MessageList getCCBTrackerInfoProcessor(IContext context,
                                                           IConnection connection,
                                                           InternalGetCCBTrackerInfo internalVO) {

        //Call start internal method, passing the context (which was passed from PublishedBusinessService).
        startInternalMethod(context, "getCCBTrackerInfoProcessor", internalVO);
        //Create new message list for BusinessService processing.
        E1MessageList messages = new E1MessageList();

        //TODO: call method (created by the wizard), which then executes Business Function or Database operation.
        E1MessageList dbMessage = new E1MessageList();
        dbMessage = selectFromF4102(context, connection, internalVO);
        messages.addMessages(dbMessage);

        //TODO:  add messages returned from E1 processing to BusinessService message list.

        if (internalVO.getQueryResults() != null &&
            internalVO.getQueryResults().size() > 0) {
            ArrayList queryResult = new ArrayList();

            for (int i = 0; i < internalVO.getQueryResults().size(); i++) {
                InternalShowCCBTrackerInfo showCCBTrackerInfo =
                    new InternalShowCCBTrackerInfo();
                InternalItemUseUpF59RC003 itemUseUp =
                    new InternalItemUseUpF59RC003();
                showCCBTrackerInfo = internalVO.getQueryResults(i);
                String useUpItemCallYN = "N";

                InternalGetRevisionItem internalGetRevisionItem =
                    new InternalGetRevisionItem();
                internalGetRevisionItem.setF59RC002_RCREVID(internalVO.getQueryWhereFields().getF4101_MERL());
                internalGetRevisionItem.setF59RC002_RCITMB(internalVO.getQueryWhereFields().getF4101_LITM());
                internalGetRevisionItem.setF59RC002_RCRMCU(internalVO.getQueryResults(i).getSzCostCenter_MCU());
                internalGetRevisionItem.setF59RC002_RCAI("A");
            
                
                //selectFromF59RC002(context, connection, internalGetRevisionItem);
                selectFromF59RC002(context, connection,
                                   internalGetRevisionItem);
                
                if (internalGetRevisionItem.getF59RC002_RCITMR() != null) {
                    itemUseUp.setF59RC003_RCAI("A");
                    itemUseUp.setF59RC003_RCITMR(internalVO.getQueryWhereFields().getF4101_LITM().trim()+"+"+
                                                 internalVO.getQueryWhereFields().getF4101_MERL().trim());
                    itemUseUp.setF59RC003_RCRMCU(internalVO.getQueryResults(i).getSzCostCenter_MCU());
                    selectFromF59RC003(context, connection, itemUseUp);

                    if (itemUseUp.getF59RC003_RCITMS() != null)

                    {
                        String firstRecord = "Y";

                        do {
                            if (firstRecord.equals("Y")) {
                                //ner call
                                showCCBTrackerInfo.setSzItem_LITM(itemUseUp.getF59RC003_RCITMR());
                                showCCBTrackerInfo.setSzCostCenter_MCU(itemUseUp.getF59RC003_RCRMCU());
                                showCCBTrackerInfo.setSzCNNumber_CREF(internalVO.getQueryWhereFields().getCNNumber());
//                                showCCBTrackerInfo.setCIsItemUseUpYN_EV01("Y");
                                // Calling item revision Item use up should be N in reply
                                showCCBTrackerInfo.setCIsItemUseUpYN("N");
                                callCCBTrackerExtractInformation(context,
                                                                 connection,
                                                                 showCCBTrackerInfo);
                                showCCBTrackerInfo.setCIsRevControlledYN("Y");
                                showCCBTrackerInfo.setSzItem_LITM(internalVO.getQueryWhereFields().getF4101_LITM());
                                firstRecord = "N";
                                if(showCCBTrackerInfo.getCSendDataYN_FLAG().equalsIgnoreCase("Y")){
                                queryResult.add(showCCBTrackerInfo);
                                }
                                useUpItemCallYN = "Y";
                            } else {
                                InternalShowCCBTrackerInfo showCCBTrackerInfUseUp =
                                    new InternalShowCCBTrackerInfo();
                                showCCBTrackerInfUseUp.setSzItem_LITM(itemUseUp.getF59RC003_RCITMS());
                                showCCBTrackerInfUseUp.setSzCostCenter_MCU(itemUseUp.getF59RC003_RCSMCU());
                                showCCBTrackerInfUseUp.setSzCNNumber_CREF(internalVO.getQueryWhereFields().getCNNumber());
                                showCCBTrackerInfUseUp.setCIsItemUseUpYN("Y");
                                callCCBTrackerExtractInformation(context,
                                                                 connection,
                                                                 showCCBTrackerInfUseUp);
                                showCCBTrackerInfUseUp.setCIsRevControlledYN("Y");
                                showCCBTrackerInfUseUp.setSzItem_LITM(internalVO.getQueryWhereFields().getF4101_LITM());
                                if(showCCBTrackerInfUseUp.getCSendDataYN_FLAG().equalsIgnoreCase("Y")){
                                queryResult.add(showCCBTrackerInfUseUp);
                                }
                                useUpItemCallYN = "Y";
                                itemUseUp.setF59RC003_RCITMR(itemUseUp.getF59RC003_RCITMS());
                                itemUseUp.setF59RC003_RCRMCU(itemUseUp.getF59RC003_RCSMCU());
                                selectFromF59RC003(context, connection,
                                                   itemUseUp);
                            }
                        } while (itemUseUp.getF59RC003_RCITMS() != null);

                    } else {
                        showCCBTrackerInfo.setSzItem_LITM(internalGetRevisionItem.getF59RC002_RCITMR());
                        showCCBTrackerInfo.setCIsRevControlledYN("Y");
                    }
                } else {
                    showCCBTrackerInfo.setSzItem_LITM(internalVO.getQueryWhereFields().getF4101_LITM());
                    showCCBTrackerInfo.setCIsRevControlledYN("N");
                }
                if (useUpItemCallYN.equals("N")) {
                    showCCBTrackerInfo.setSzCNNumber_CREF(internalVO.getQueryWhereFields().getCNNumber());
                    showCCBTrackerInfo.setSzCostCenter_MCU(internalVO.getQueryResults(i).getSzCostCenter_MCU());

                    showCCBTrackerInfo.setCIsItemUseUpYN("N");                   
                    //callCCBTrackerExtractInformation(context, connection, showCCBTrackerInfo);

                    callCCBTrackerExtractInformation(context, connection,
                                                     showCCBTrackerInfo);
                    
                    showCCBTrackerInfo.setSzItem_LITM(internalVO.getQueryWhereFields().getF4101_LITM());
                    if(showCCBTrackerInfo.getCSendDataYN_FLAG().equalsIgnoreCase("Y")){
                    queryResult.add(showCCBTrackerInfo);
                    }
                }

            }
            internalVO.setQueryResults(queryResult);
        }
        //Call finish internal method passing context.
        finishInternalMethod(context, "getCCBTrackerInfoProcessor");

        //Call finish internal method passing context.
        return messages;
    }


    /**
     * Selects records from the F4102 table.
     * <p>Following SQL statement can be produced by this generated code
     * <blockquote><pre><code>
     * SELECT F4102.LITM, F4102.MCU
     *
     * FROM F4102
     *
     * WHERE F4102.LITM=?
     *
     *
     * </code></pre></blockquote>
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param internalVO TODO document input parameters
     * @param maxReturnedRows the maximium number of rows returned from the select operation.
     * @return an E1Message containing the text of any database exceptions that may have occurred
     */
    private static E1MessageList selectFromF4102(IContext context,
                                                 IConnection connection,
                                                 InternalGetCCBTrackerInfo internalVO) {
        //create return object
        E1MessageList returnMessages = new E1MessageList();

        //specify columns to select
        BSSVDBField[] selectFields =
        { new BSSVDBField("F4102.LITM"), // String - Identifier2ndItem
            new BSSVDBField("F4102.MCU") // String - CostCenter
            } ;

        //specify sort order
        BSSVDBSortField[] sortOrder = null;

        //specify condition records must meet - assume inputs are optional
        ArrayList whereFieldsList = new ArrayList();
        if (internalVO.getQueryWhereFields().getF4101_LITM() != null) {
            whereFieldsList.add(new BSSVDBWhereField(null,
                                                     new BSSVDBField("F4102.LITM"),
                                                     IDBService.EQUALS,
                                                     internalVO.getQueryWhereFields().getF4101_LITM()));
        }

        //TODO: CHECK FOR EMPTY whereFieldsList ARRAY LIST
        BSSVDBWhereField[] whereFields =
            new BSSVDBWhereField[whereFieldsList.size()];
        whereFieldsList.toArray(whereFields);
        BSSVDBWhereClauseBuilder whereClause =
            new BSSVDBWhereClauseBuilder(context, whereFields);

        BSSVDBResultSet resultSet = null;
        boolean selectDistinct = false;

        try {
            //get dbService from context
            IDBService dbService = context.getDBService();
            //execute db select operation
            resultSet =
                    dbService.select(context, connection, "F4102", IDBService.DB_TABLE,
                                     selectDistinct, IDBService.DB_FETCH_ALL,
                                     selectFields, sortOrder, whereClause);
        } catch (DBServiceException e) {
            //TODO take some action in response to the database exception
            returnMessages.addMessage(new E1Message(context, "005FIS",
                                                    e.getMessage()));
        }

        //process the results of the select
        if (resultSet != null) {
            BSSVDBFieldMap[] fieldMap = resultSet.getFieldMap();
            if (fieldMap != null && fieldMap.length > 0) {
                ArrayList queryResults = new ArrayList();
                for (int i = 0; i < fieldMap.length; i++) {
                    BSSVDBFieldMap map = fieldMap[i];
                    InternalShowCCBTrackerInfo result =
                        new InternalShowCCBTrackerInfo();
                    result.setSzItem_LITM((String)map.getValue("F4102.LITM"));
                    result.setSzCostCenter_MCU((String)map.getValue("F4102.MCU"));
                    queryResults.add(result);
                }

                if (resultSet.hasMoreRows()) {
                    returnMessages.addMessage(new E1Message(context, "028FIS",
                                                            ""));
                }

                //map results to internal vo
                internalVO.setQueryResults(queryResults);
            }
        }
        return returnMessages;
    }


    /**
     * Calls the CCBTrackerExtractInformation(N5641019) business function which has the D5641019 datastructure.
     * @param context conditionally provides the connection for the business function call and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param TODO document input parameters
     * @return A list of messages if there were application errors, warnings, or informational
     * messages. Returns null if there were no messages.
     */
    private static E1MessageList callCCBTrackerExtractInformation(IContext context,
                                                                  IConnection connection,
                                                                  InternalShowCCBTrackerInfo internalVO) {
        BSFNParameters bsfnParams = new BSFNParameters();

        // map input parameters from input value object
        bsfnParams.setValue("szItem_LITM", internalVO.getSzItem_LITM());
        bsfnParams.setValue("szCostCenter_MCU",
                            internalVO.getSzCostCenter_MCU());
        bsfnParams.setValue("szCNNumber_CREF",
                            internalVO.getSzCNNumber_CREF());
        bsfnParams.setValue("cIsItemUseUpYN_EV01", internalVO.getCIsItemUseUpYN());

        try {
            //get bsfnService from context
            IBSFNService bsfnService = context.getBSFNService();

            //execute business function
            bsfnService.execute(context, connection,
                                "CCBTrackerExtractInformation", bsfnParams);
        } catch (BSFNServiceInvalidArgException invalidArgEx) {
            //Create error message for Invalid Argument exception and return it in ErrorList
            E1MessageList returnMessages = new E1MessageList();
            returnMessages.addMessage(new E1Message(context, "018FIS",
                                                    invalidArgEx.getMessage()));
            return returnMessages;
        } catch (BSFNServiceSystemException systemEx) {
            //Create error message for System exception and return it in ErrorList
            E1MessageList returnMessages = new E1MessageList();
            returnMessages.addMessage(new E1Message(context, "019FIS",
                                                    systemEx.getMessage()));
            return returnMessages;
        }


        //map output parameters to output value object
        internalVO.setSzItem_LITM((String)bsfnParams.getValue("szItem_LITM"));
        internalVO.setSzCostCenter_MCU((String)bsfnParams.getValue("szCostCenter_MCU"));
        internalVO.setSzCNNumber_CREF((String)bsfnParams.getValue("szCNNumber_CREF"));
        internalVO.setSzRevisionF4102_MERL((String)bsfnParams.getValue("szRevisionF4102_MERL"));
        internalVO.setMnPlannerNumberF4102_ANPL((MathNumeric)bsfnParams.getValue("mnPlannerNumberF4102_ANPL"));
        internalVO.setSzGLClassF4102_GLPT((String)bsfnParams.getValue("szGLClassF4102_GLPT"));
        internalVO.setCStockingTypeF4102_STKT(bsfnParams.getValue("cStockingTypeF4102_STKT").toString());
        internalVO.setMnSupplierNumberF4102_VEND((MathNumeric)bsfnParams.getValue("mnSupplierNumberF4102_VEND"));
        internalVO.setSzDrawingRevisionF4101_RVNO((String)bsfnParams.getValue("szDrawingRevisionF4101_RVNO"));
        internalVO.setSzSupplierNameF0101_ALPH((String)bsfnParams.getValue("szSupplierNameF0101_ALPH"));
        internalVO.setMnBuyerNumberF4102_BUYR((MathNumeric)bsfnParams.getValue("mnBuyerNumberF4102_BUYR"));
        internalVO.setMnUnitCostF4105_UNCS((MathNumeric)bsfnParams.getValue("mnUnitCostF4105_UNCS"));
        internalVO.setMnUnitsOpenQuantityF4311_UOPN((MathNumeric)bsfnParams.getValue("mnUnitsOpenQuantityF4311_UOPN"));
        internalVO.setMnUnitsTransQtyF4801_UORG((MathNumeric)bsfnParams.getValue("mnUnitsTransQtyF4801_UORG"));
        internalVO.setMnUnitsQtyShippedF4801_SOQS((MathNumeric)bsfnParams.getValue("mnUnitsQtyShippedF4801_SOQS"));
        internalVO.setMnQtySoftCommittedF41021_PCOM((MathNumeric)bsfnParams.getValue("mnQtySoftCommittedF41021_PCOM"));
        internalVO.setMnQtyHardCommittedF41021_HCOM((MathNumeric)bsfnParams.getValue("mnQtyHardCommittedF41021_HCOM"));
        internalVO.setMnQtyWOHardCommitF41021_QOWO((MathNumeric)bsfnParams.getValue("mnQtyWOHardCommitF41021_QOWO"));
        internalVO.setMnQtyOnHandPrimF41021_PQOH((MathNumeric)bsfnParams.getValue("mnQtyOnHandPrimF41021_PQOH"));
        internalVO.setMnQtyAtOperationF43092_QTYO((MathNumeric)bsfnParams.getValue("mnQtyAtOperationF43092_QTYO"));
        internalVO.setSzComponentItemF3111_CPIL((String)bsfnParams.getValue("szComponentItemF3111_CPIL"));
        internalVO.setMnUnitsTransnQty_F3111_UORG((MathNumeric)bsfnParams.getValue("mnUnitsTransnQty_F3111_UORG"));
        internalVO.setMnQuantityTransn_F3111_TRQT((MathNumeric)bsfnParams.getValue("mnQuantityTransn_F3111_TRQT"));
        internalVO.setJdDateEffectiF0015_EFT((Date)bsfnParams.getValue("jdDateEffectiF0015_EFT"));
        internalVO.setMnCurrencyConverRateF0015_CRR((MathNumeric)bsfnParams.getValue("mnCurrencyConverRateF0015_CRR"));
        internalVO.setSzErrorCOde_DTAI((String)bsfnParams.getValue("szErrorCOde_DTAI"));
        internalVO.setSzErrorDescription_DL011((String)bsfnParams.getValue("szErrorDescription_DL011"));
        internalVO.setSzBuyerNameF0101_ALPH((String)bsfnParams.getValue("szBuyerNameF0101_ALPH"));
        internalVO.setSzPlannerNameF0101_ALPH((String)bsfnParams.getValue("szPlannerNameF0101_ALPH"));
        internalVO.setCSendDataYN_FLAG(bsfnParams.getValue("cSendDataYN_FLAG").toString());
        

        //return any errors, warnings, or informational messages to the caller
        return bsfnParams.getE1MessageList();
    }


    /**
     * Selects records from the F59RC002 table.
     * <p>Following SQL statement can be produced by this generated code
     * <blockquote><pre><code>
     * SELECT F59RC002.RCITMR
     *
     * FROM F59RC002
     *
     * WHERE F59RC002.RCITMB=? AND F59RC002.RCRMCU=? AND F59RC002.RCREVID=?
     *
     *
     * </code></pre></blockquote>
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param internalVO TODO document input parameters
     * @param maxReturnedRows the maximium number of rows returned from the select operation.
     * @return an E1Message containing the text of any database exceptions that may have occurred
     */
    private static E1MessageList selectFromF59RC002(IContext context,
                                                    IConnection connection,
                                                    InternalGetRevisionItem internalVO) {
        //create return object
        E1MessageList returnMessages = new E1MessageList();

        //specify columns to select
        BSSVDBField[] selectFields =
        { new BSSVDBField("F59RC002.RCITMR") // String - RCRevItemId
            } ;

        //specify sort order
        BSSVDBSortField[] sortOrder = null;

        //specify condition records must meet to be selected
        BSSVDBWhereField[] whereFields =
        { new BSSVDBWhereField(null, new BSSVDBField("F59RC002.RCITMB"),
                               IDBService.EQUALS,
                               internalVO.getF59RC002_RCITMB()),
        new BSSVDBWhereField(IDBService.AND,
                             new BSSVDBField("F59RC002.RCAI"),
                             IDBService.EQUALS,
                             internalVO.getF59RC002_RCAI()),
          new BSSVDBWhereField(IDBService.AND,
                               new BSSVDBField("F59RC002.RCRMCU"),
                               IDBService.EQUALS,
                               internalVO.getF59RC002_RCRMCU()),
          new BSSVDBWhereField(IDBService.AND,
                               new BSSVDBField("F59RC002.RCREVID"),
                               IDBService.EQUALS,
                               internalVO.getF59RC002_RCREVID()) };
        BSSVDBWhereClauseBuilder whereClause =
            new BSSVDBWhereClauseBuilder(context, whereFields);

        BSSVDBResultSet resultSet = null;
        boolean selectDistinct = false;

        try {
            //get dbService from context
            IDBService dbService = context.getDBService();
            //execute db select operation
            resultSet =
                    dbService.select(context, connection, "F59RC002", IDBService.DB_TABLE,
                                     selectDistinct, IDBService.DB_FETCH_ALL,
                                     selectFields, sortOrder, whereClause);
        } catch (DBServiceException e) {
            //TODO take some action in response to the database exception
            returnMessages.addMessage(new E1Message(context, "005FIS",
                                                    e.getMessage()));
        }

        //process the results of the select
        if (resultSet != null) {
            BSSVDBFieldMap[] fieldMap = resultSet.getFieldMap();
            if (fieldMap != null && fieldMap.length > 0) {
                ArrayList queryResults = new ArrayList();
                for (int i = 0; i < fieldMap.length; i++) {
                    BSSVDBFieldMap map = fieldMap[i];
                    //ResultVOType result = new ResultVOType();
                    // result.setF59RC002_RCITMR();
                    internalVO.setF59RC002_RCITMR((String)map.getValue("F59RC002.RCITMR"));
                    queryResults.add(internalVO);
                }

                if (resultSet.hasMoreRows()) {
                    returnMessages.addMessage(new E1Message(context, "028FIS",
                                                            ""));
                }

                //map results to internal vo
                // internalVO.setQueryResults(queryResults);
            }
        }
        return returnMessages;
    }

    /**
     * Selects records from the F59RC003 table.
     * <p>Following SQL statement can be produced by this generated code
     * <blockquote><pre><code>
     * SELECT F59RC003.RCSMCU, F59RC003.RCITMS
     *
     * FROM F59RC003
     *
     * WHERE F59RC003.RCRMCU=? AND F59RC003.RCITMR=? AND F59RC003.RCAI=?
     *
     *
     * </code></pre></blockquote>
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param internalVO TODO document input parameters
     * @param maxReturnedRows the maximium number of rows returned from the select operation.
     * @return an E1Message containing the text of any database exceptions that may have occurred
     */
    private static E1MessageList selectFromF59RC003(IContext context,
                                                    IConnection connection,
                                                    InternalItemUseUpF59RC003 internalVO) {
        //create return object
        E1MessageList returnMessages = new E1MessageList();

        //specify columns to select
        BSSVDBField[] selectFields =
        { new BSSVDBField("F59RC003.RCSMCU"), // String - RCSubstituteBusinessUnit
            new BSSVDBField("F59RC003.RCITMS") // String - RCSubstituteItemId
            } ;

        //specify sort order
        BSSVDBSortField[] sortOrder = null;

        //specify condition records must meet - assume inputs are optional
        ArrayList whereFieldsList = new ArrayList();
        if (internalVO.getF59RC003_RCRMCU() != null) {
            whereFieldsList.add(new BSSVDBWhereField(null,
                                                     new BSSVDBField("F59RC003.RCRMCU"),
                                                     IDBService.EQUALS,
                                                     internalVO.getF59RC003_RCRMCU()));
        }
        if (internalVO.getF59RC003_RCITMR() != null) {
            whereFieldsList.add(new BSSVDBWhereField(IDBService.AND,
                                                     new BSSVDBField("F59RC003.RCITMR"),
                                                     IDBService.EQUALS,
                                                     internalVO.getF59RC003_RCITMR()));
        }
        if (internalVO.getF59RC003_RCAI() != null) {
            whereFieldsList.add(new BSSVDBWhereField(IDBService.AND,
                                                     new BSSVDBField("F59RC003.RCAI"),
                                                     IDBService.EQUALS,
                                                     internalVO.getF59RC003_RCAI()));
        }

        //TODO: CHECK FOR EMPTY whereFieldsList ARRAY LIST
        BSSVDBWhereField[] whereFields =
            new BSSVDBWhereField[whereFieldsList.size()];
        whereFieldsList.toArray(whereFields);
        BSSVDBWhereClauseBuilder whereClause =
            new BSSVDBWhereClauseBuilder(context, whereFields);

        BSSVDBResultSet resultSet = null;
        boolean selectDistinct = false;

        try {
            //get dbService from context
            IDBService dbService = context.getDBService();
            //execute db select operation
            resultSet =
                    dbService.select(context, connection, "F59RC003", IDBService.DB_TABLE,
                                     selectDistinct, IDBService.DB_FETCH_ALL,
                                     selectFields, sortOrder, whereClause);
        } catch (DBServiceException e) {
            //TODO take some action in response to the database exception
            returnMessages.addMessage(new E1Message(context, "005FIS",
                                                    e.getMessage()));
        }

        //process the results of the select
        if (resultSet != null) {
            BSSVDBFieldMap[] fieldMap = resultSet.getFieldMap();
            if (fieldMap != null && fieldMap.length > 0) {
                ArrayList queryResults = new ArrayList();
                for (int i = 0; i < fieldMap.length; i++) {
                    BSSVDBFieldMap map = fieldMap[i];
                   // InternalItemUseUpF59RC003 result =
                       // new InternalItemUseUpF59RC003();
                    
                    internalVO.setF59RC003_RCSMCU((String)map.getValue("F59RC003.RCSMCU"));
                    internalVO.setF59RC003_RCITMS((String)map.getValue("F59RC003.RCITMS"));
                    
                    //queryResults.add(result);
                }
            
            
                if (resultSet.hasMoreRows()) {
                    returnMessages.addMessage(new E1Message(context, "028FIS",
                                                            ""));
                }

                //map results to internal vo
                //internalVO.setQueryResults(queryResults);
            }
            else {
                                internalVO.setF59RC003_RCSMCU(null);
                                internalVO.setF59RC003_RCITMS(null);    
                            }
        }
        return returnMessages;
    }
}
