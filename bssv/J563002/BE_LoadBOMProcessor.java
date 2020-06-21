package be.e1.bssv.J563002;

import be.e1.bssv.J563002.valueobject.InternalBOMChild;
import be.e1.bssv.J563002.valueobject.InternalBOMParent;

import be.e1.bssv.J563002.valueobject.InternalCacheMaintainCacheForDeleteBOMMBF;
import be.e1.bssv.J563002.valueobject.InternalF3002GetNextBillOfMaterial;

import be.e1.bssv.J563002.valueobject.InternalF3015DeleteComponentLocator;
import be.e1.bssv.J563002.valueobject.InternalGT3002BCopyDeleteUpdateGenericText;

import java.util.Date;

import oracle.e1.bssvfoundation.base.BSFNParameters;
import oracle.e1.bssvfoundation.base.BusinessService;
import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BSFNServiceInvalidArgException;
import oracle.e1.bssvfoundation.exception.BSFNServiceSystemException;
import oracle.e1.bssvfoundation.exception.BSSVConnectionException;
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
public abstract class BE_LoadBOMProcessor extends BusinessService {

    private static final String PROGRAM_ID = "J563002";
    private static final String ADD_ACTION = "A";
    private static final String CHANGE_ACTION = "C";
    private static final String DELETE_ACTION = "D";
    private static final String DFT_BOMTYPE = "M";
    private static final String BLANK = " ";
    private static final String DFT_STOCKINGTYPE = "1";
    private static final MathNumeric ZERO = new MathNumeric(0);

    /**
     * TODO: Create Java Doc for: loadBOM
     * Method loadBOM is used for...?
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
     * @return an E1Message containing the text of any errors or warnings that may have occurred
     */
    public static E1MessageList loadBOM(IContext context,
                                        IConnection connection,
                                        InternalBOMParent internalVO) {

        //Call start internal method, passing the context (which was passed from PublishedBusinessService).
        startInternalMethod(context, "loadBOM", internalVO);
        //Create new message list for BusinessService processing.
        E1MessageList messages = new E1MessageList();
        E1MessageList bsfnMessages = new E1MessageList();
        E1MessageList dbMessages = new E1MessageList();

        try {
            bsfnMessages =
                    callGetLocalComputerId(context, connection, internalVO);
            //Initial processing for ActionCode
            initialProcessing(internalVO);

            //Get ITM and STKT from F4102 for BOM Parent
            internalVO.setF3002_KIT(ZERO);
            dbMessages = selectFromF4102(context, connection, internalVO);

            //Begin Doc
            bsfnMessages =
                    callF3002BeginDocument(context, connection, internalVO);
            if (!messages.hasErrors()) {
                //Begin: Type Code = "NPB" New Preliminary BOM
                if (internalVO.getF30UI004_TP().equals("NPB")) {
                    if (internalVO.getF4102_STKT().equals("1")) {
                        //Delete BOM
                        deleteBOM(context, connection, internalVO, messages);
                        if (!messages.hasErrors()) {
                            //Create BOM
                            createBOM(context, connection, internalVO,
                                      messages);
                            if (!messages.hasErrors()) {
                                internalVO.setStatus("SUCCESS");
                                internalVO.setStatusMessage("BOM ADDED SUCCESSFULLY");
                                dbMessages =
                                        updateF4102(context, connection, internalVO);
                            }
                        }
                    } else {
                        if (internalVO.getCF3002BOMExists().equals("1")) {
                            internalVO.setStatus("ERROR");
                            internalVO.setStatusMessage("ERROR: BOM ALREADY EXISTS");
                        } else {
                            //Create BOM
                            createBOM(context, connection, internalVO,
                                      messages);
                            if (!messages.hasErrors()) {
                                internalVO.setStatus("SUCCESS");
                                internalVO.setStatusMessage("BOM ADDED SUCCESSFULLY");
                            }
                        }
                    }
                } //End: Type Code = "NPB" New Preliminary BOM

                //Begin: Type Code = "UPB" Update Preliminary BOM
                if (internalVO.getF30UI004_TP().equals("UPB")) {
                    if (internalVO.getF4102_STKT().equals("1")) {
                        //Delete BOM
                        deleteBOM(context, connection, internalVO, messages);
                        if (!messages.hasErrors()) {
                            //Create BOM
                            createBOM(context, connection, internalVO,
                                      messages);
                            if (!messages.hasErrors()) {
                                internalVO.setStatus("SUCCESS");
                                internalVO.setStatusMessage("BOM UPDATED SUCCESSFULLY");
                            }
                        }
                    }
                } else {
                    internalVO.setStatus("ERROR");
                    internalVO.setStatusMessage("ERROR: FINAL BOM ALREADY EXISTS");
                } //End: Type Code = "UPB" Update Preliminary BOM

                //Begin: Type Code = "NB" New or Finalized BOM
                if (internalVO.getF30UI004_TP().equals("NB")) {
                    if (internalVO.getF4102_STKT().equals("1")) {
                        //Delete BOM
                        deleteBOM(context, connection, internalVO, messages);
                        if (!messages.hasErrors()) {
                            //Create BOM
                            createBOM(context, connection, internalVO,
                                      messages);
                            if (!messages.hasErrors()) {
                                internalVO.setStatus("SUCCESS");
                                internalVO.setStatusMessage("BOM CREATED SUCCESSFULLY");
                            }
                        }
                    }
                } else {
                    if (internalVO.getCF3002BOMExists().equals("1")) {
                        internalVO.setStatus("ERROR");
                        internalVO.setStatusMessage("ERROR: BOM ALREADY EXISTS");
                    } //End: Type Code = "NB" New or Finalized BOM

                }
            } //Begin Doc successful
            //TODO:  add messages returned from E1 processing to BusinessService message list.

            //Commit Sales Order
            if (!messages.hasErrors()) {
                commitBOM(context, connection, internalVO, messages);
            }

        } catch (Exception e) {
            //Build text substitution elements for error message separated by pipe character
            String substitutionText =
                e.getStackTrace()[0].getClassName() + "." +
                e.getStackTrace()[0].getMethodName() + "|" + e.getMessage();
            //Create new E1 Message for the web service exception.
            E1Message msg = new E1Message(context, "003FIS", substitutionText);
            //Add messages to final message list to be returned.
            messages.addMessage(msg);

            //Send message to the logs and return error id and text to calling function
            context.getBSSVLogger().app(context,
                                        msg.getCallObjError().getGlossaryText(),
                                        null, null, e);
            internalVO.setDTAI(msg.getCallObjError().getDDItem());
            internalVO.setDSCA(msg.getCallObjError().getAlphaDescription());
        }

        //Call finish internal method passing context.
        finishInternalMethod(context, "loadBOM");

        //Call finish internal method passing context.
        return messages;
    }

    /**
     * Calls the GetLocalComputerId(B9800181) business function which has the D9800180 datastructure.
     * @param context conditionally provides the connection for the business function call and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param TODO document input parameters
     * @return A list of messages if there were application errors, warnings, or informational
     * messages. Returns null if there were no messages.
     */
    private static E1MessageList callGetLocalComputerId(IContext context,
                                                        IConnection connection,
                                                        InternalBOMParent internalVO) {
        BSFNParameters bsfnParams = new BSFNParameters();

        // map input parameters from input value object
        bsfnParams.setValue("szMachineKey", internalVO.getSzComputerID());

        try {
            //get bsfnService from context
            IBSFNService bsfnService = context.getBSFNService();

            //execute business function
            bsfnService.execute(context, connection, "GetLocalComputerId",
                                bsfnParams);
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
        internalVO.setSzComputerID((String)bsfnParams.getValue("szMachineKey"));

        //return any errors, warnings, or informational messages to the caller
        return bsfnParams.getE1MessageList();
    }

    private static void initialProcessing(InternalBOMParent internalVO) {
        internalVO.setMnJobNumber(ZERO);
        internalVO.setF3002_TBM(DFT_BOMTYPE);
        internalVO.setF3002_BQTY(ZERO);
    }

    private static void commitBOM(IContext context, IConnection connection,
                                  InternalBOMParent internalVO,
                                  E1MessageList messages) {
        E1MessageList bsfnMessages = new E1MessageList();
        String statusTP = "0";

        //Explicit Manual TP Connection
        IConnection loadBOMConnection =
            context.getNewConnection(IConnection.MANUAL);

        if (loadBOMConnection != null) {
            try {
                //Call to BOM End Doc
                bsfnMessages =
                        callF3002EndDocument(context, loadBOMConnection, internalVO);
                messages.addMessages(bsfnMessages);

                if (!messages.hasErrors()) {
                    loadBOMConnection.commit();
                    statusTP = "1";
                } else {
                    loadBOMConnection.rollback();
                }

                //Close the explicit manual TP connection
                loadBOMConnection.close();

            } catch (BSSVConnectionException e) {
                //Create new error and return E1MessageList
                E1Message tpMessage =
                    new E1Message(context, "006FIS", e.getMessage());
                messages.addMessage(tpMessage);
            }
        } //end - connection is not null
    }

    /**
     * Calls the F3002EndDocument(N3002040) business function which has the D3002040D datastructure.
     * @param context conditionally provides the connection for the business function call and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param TODO document input parameters
     * @return A list of messages if there were application errors, warnings, or informational
     * messages. Returns null if there were no messages.
     */
    private static E1MessageList callF3002EndDocument(IContext context,
                                                      IConnection connection,
                                                      InternalBOMParent internalVO) {
        BSFNParameters bsfnParams = new BSFNParameters();

        // map input parameters from input value object
        bsfnParams.setValue("mnJobnumber", internalVO.getMnJobNumber());
        bsfnParams.setValue("szComputerID", internalVO.getSzComputerID());
        bsfnParams.setValue("szProgramId", PROGRAM_ID);

        try {
            //get bsfnService from context
            IBSFNService bsfnService = context.getBSFNService();

            //execute business function
            bsfnService.execute(context, connection, "F3002EndDocument",
                                bsfnParams);
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
        internalVO.setMnJobNumber((MathNumeric)bsfnParams.getValue("mnJobnumber"));

        //return any errors, warnings, or informational messages to the caller
        return bsfnParams.getE1MessageList();
    }

    /**
     * Selects records from the F4102 table.
     * <p>Following SQL statement can be produced by this generated code
     * <blockquote><pre><code>
     * SELECT F4102.ITM, F4102.STKT
     *
     * FROM F4102
     *
     * WHERE F4102.LITM=? AND F4102.MCU=?
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
                                                 InternalBOMParent internalVO) {
        //create return object
        E1MessageList returnMessages = new E1MessageList();

        //specify columns to select
        BSSVDBField[] selectFields =
        { new BSSVDBField("F4102.ITM"), // Numeric - IdentifierShortItem
            new BSSVDBField("F4102.STKT") // Character - StockingType
            } ;

        //specify sort order
        BSSVDBSortField[] sortOrder = null;

        //specify condition records must meet to be selected
        BSSVDBWhereField[] whereFields =
        { new BSSVDBWhereField(null, new BSSVDBField("F4102.LITM"),
                               IDBService.EQUALS, internalVO.getF3002_KITL()),
          new BSSVDBWhereField(IDBService.AND, new BSSVDBField("F4102.MCU"),
                               IDBService.EQUALS,
                               internalVO.getF3002_MMCU()) };

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
                for (int i = 0; i < fieldMap.length; i++) {
                    BSSVDBFieldMap map = fieldMap[i];
                    internalVO.setF3002_KIT((MathNumeric)map.getValue("F4102.ITM"));
                    internalVO.setF4102_STKT(map.getValue("F4102.STKT").toString());
                }

                if (resultSet.hasMoreRows()) {
                    returnMessages.addMessage(new E1Message(context, "028FIS",
                                                            ""));
                }
            }
        }
        return returnMessages;
    }

    /**
     * Calls the F3002BeginDocument(N3002040) business function which has the D3002040A datastructure.
     * @param context conditionally provides the connection for the business function call and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param TODO document input parameters
     * @return A list of messages if there were application errors, warnings, or informational
     * messages. Returns null if there were no messages.
     */
    private static E1MessageList callF3002BeginDocument(IContext context,
                                                        IConnection connection,
                                                        InternalBOMParent internalVO) {
        BSFNParameters bsfnParams = new BSFNParameters();

        // map input parameters from input value object
        bsfnParams.setValue("mnJobNumber", internalVO.getMnJobNumber());
        bsfnParams.setValue("szComputerID", internalVO.getSzComputerID());
        bsfnParams.setValue("szTypeBill", internalVO.getF3002_TBM());
        bsfnParams.setValue("mnParentItemNumber", internalVO.getF3002_KIT());
        bsfnParams.setValue("szParentBranch", internalVO.getF3002_MMCU());
        bsfnParams.setValue("mnUnitsBatchQuantityDisp",
                            internalVO.getF3002_BQTY());
        bsfnParams.setValue("cMode", CHANGE_ACTION);
        bsfnParams.setValue("szOrigTypeBill", internalVO.getF3002_TBM());
        bsfnParams.setValue("mnOrigParentItemNumber",
                            internalVO.getF3002_KIT());
        bsfnParams.setValue("szOrigParentBranch", internalVO.getF3002_MMCU());
        bsfnParams.setValue("mnOrigBatchQuantityDisp",
                            internalVO.getF3002_BQTY());

        try {
            //get bsfnService from context
            IBSFNService bsfnService = context.getBSFNService();

            //execute business function
            bsfnService.execute(context, connection, "F3002BeginDocument",
                                bsfnParams);
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
        internalVO.setMnJobNumber((MathNumeric)bsfnParams.getValue("mnJobNumber"));
        internalVO.setCF3002BOMExists(bsfnParams.getValue("cF3002BOMExists").toString());

        //return any errors, warnings, or informational messages to the caller
        return bsfnParams.getE1MessageList();
    }

    private static void createBOM(IContext context, IConnection connection,
                                  InternalBOMParent internalVO,
                                  E1MessageList messages) {
        E1MessageList bsfnMessages = new E1MessageList();

        if ((internalVO.getInternalBOMChild() != null) &&
            (!messages.hasErrors())) {

            for (int childRecords = 0;
                 childRecords < internalVO.getInternalBOMChild().size();
                 childRecords++) {
                //Get ITM using component LITM
                bsfnMessages =
                        callGetItemMasterBy2ndItem(context, connection, internalVO.getInternalBOMChild(childRecords));
                messages.addMessages(bsfnMessages);
                //Edit Line
                bsfnMessages =
                        callF3002EditLine(context, connection, internalVO,
                                          childRecords);
                messages.addMessages(bsfnMessages);

            } //end - loop for detail lines
        } //end - no errors
    }

    private static void deleteBOM(IContext context, IConnection connection,
                                  InternalBOMParent internalVO,
                                  E1MessageList messages) {
        E1MessageList bsfnMessages = new E1MessageList();
        InternalF3002GetNextBillOfMaterial internalF3002GetNextBillOfMaterial =
            new InternalF3002GetNextBillOfMaterial();
        InternalGT3002BCopyDeleteUpdateGenericText internalGT3002B =
            new InternalGT3002BCopyDeleteUpdateGenericText();
        MathNumeric mnComponentLineNumberSaved = new MathNumeric(0);

        //Get Next BOM Line
        internalF3002GetNextBillOfMaterial.setSzTypeBOM(internalVO.getF3002_TBM());
        internalF3002GetNextBillOfMaterial.setSzBranchPlant(internalVO.getF3002_MMCU());
        internalF3002GetNextBillOfMaterial.setMnParentItemNumber(internalVO.getF3002_KIT());
        internalF3002GetNextBillOfMaterial.setMnBatchQuantity(internalVO.getF3002_BQTY());
        internalF3002GetNextBillOfMaterial.setCRequestType("1");
        internalF3002GetNextBillOfMaterial.setSzErrorMessageID(" ");
        internalF3002GetNextBillOfMaterial.setSzIndex("1");
        internalF3002GetNextBillOfMaterial.setSzKeys("4");
        internalF3002GetNextBillOfMaterial.setCEndOfFile(" ");
        internalF3002GetNextBillOfMaterial.setCReturnFieldValues("1");
        internalF3002GetNextBillOfMaterial.setCSuppressErrorMessages("1");
        internalF3002GetNextBillOfMaterial.setIdRequestHandleID(new Integer(0));
        internalF3002GetNextBillOfMaterial.setIdUserHandleID(new Integer(0));
        bsfnMessages =
                callGetNextBillOfMaterial(context, connection, internalF3002GetNextBillOfMaterial);
        messages.addMessages(bsfnMessages);

        while (!messages.hasErrors() &&
               !internalF3002GetNextBillOfMaterial.getCEndOfFile().equals("1")) {

            if (mnComponentLineNumberSaved !=
                internalF3002GetNextBillOfMaterial.getMnComponentLineNumber()) {
                mnComponentLineNumberSaved =
                        internalF3002GetNextBillOfMaterial.getMnComponentLineNumber();
                //Delete Bill of Material record using Delete cache
                InternalCacheMaintainCacheForDeleteBOMMBF cacheDeleteBOMMBF =
                    new InternalCacheMaintainCacheForDeleteBOMMBF();
                cacheDeleteBOMMBF.setMnPreviousComponentNumber(internalF3002GetNextBillOfMaterial.getMnComponentLineNumber());
                cacheDeleteBOMMBF.setMnPreviousSubstituteItemSeqNo(ZERO);
                cacheDeleteBOMMBF.setCPreviousCoproductsByproducts(BLANK);
                cacheDeleteBOMMBF.setMnNewComponentNumber(internalF3002GetNextBillOfMaterial.getMnComponentLineNumber());
                cacheDeleteBOMMBF.setMnNewSubstituteItemSeqNo(ZERO);
                cacheDeleteBOMMBF.setCNewCoproductsByproducts(BLANK);
                cacheDeleteBOMMBF.setMnJobNumber(internalVO.getMnJobNumber());
                bsfnMessages =
                        callCacheMaintainCacheForDeleteBOM(context, connection,
                                                           cacheDeleteBOMMBF);
                messages.addMessages(bsfnMessages);
            }

            InternalF3015DeleteComponentLocator internalF3015DeleteComponentLocator =
                new InternalF3015DeleteComponentLocator();
            internalF3015DeleteComponentLocator.setSzParentBranch(internalF3002GetNextBillOfMaterial.getSzBranchPlant());
            internalF3015DeleteComponentLocator.setMnParentItemShort(internalF3002GetNextBillOfMaterial.getMnParentItemNumber());
            internalF3015DeleteComponentLocator.setMnComponentShort(internalF3002GetNextBillOfMaterial.getMnComponentItemNo());
            internalF3015DeleteComponentLocator.setJdEffectiveFrom(internalF3002GetNextBillOfMaterial.getJdEffectiveFrom());
            internalF3015DeleteComponentLocator.setJdEffectiveThru(internalF3002GetNextBillOfMaterial.getJdEffectiveThru());
            internalF3015DeleteComponentLocator.setMnLineNo(internalF3002GetNextBillOfMaterial.getMnComponentLineNumber());
            bsfnMessages =
                    callDeleteComponentLocator(context, connection, internalF3015DeleteComponentLocator);
            messages.addMessages(bsfnMessages);

            internalF3002GetNextBillOfMaterial.setCRequestType("2");
            bsfnMessages =
                    callGetNextBillOfMaterial(context, connection, internalF3002GetNextBillOfMaterial);
            messages.addMessages(bsfnMessages);
        }
        internalF3002GetNextBillOfMaterial.setCRequestType("3");
        bsfnMessages =
                callGetNextBillOfMaterial(context, connection, internalF3002GetNextBillOfMaterial);
        messages.addMessages(bsfnMessages);

        if (!messages.hasErrors()) {
            internalGT3002B.setCProcessEdits("X");
            internalGT3002B.setCSuppressErrorMessage("1");
            internalGT3002B.setSzFromTypeBill(internalVO.getF3002_TBM());
            internalGT3002B.setMnFromParentItemShort(internalVO.getF3002_KIT());
            internalGT3002B.setSzFromParentBranch(internalVO.getF3002_MMCU());
            internalGT3002B.setMnFromUnitsBatchQuantity(internalVO.getF3002_BQTY());
            bsfnMessages =
                    callGT3002BCopyorDeleteGenericText(context, connection,
                                                       internalGT3002B);
            messages.addMessages(bsfnMessages);
        }
    }

    /**
     * Calls the GetNextBillOfMaterial(B3001020) business function which has the D3001020 datastructure.
     * @param context conditionally provides the connection for the business function call and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param TODO document input parameters
     * @return A list of messages if there were application errors, warnings, or informational
     * messages. Returns null if there were no messages.
     */
    private static E1MessageList callGetNextBillOfMaterial(IContext context,
                                                           IConnection connection,
                                                           InternalF3002GetNextBillOfMaterial internalVO) {
        BSFNParameters bsfnParams = new BSFNParameters();

        // map input parameters from input value object
        bsfnParams.setValue("szTypeBOM", internalVO.getSzTypeBOM());
        bsfnParams.setValue("szBranchPlant", internalVO.getSzBranchPlant());
        bsfnParams.setValue("mnParentItemNumber",
                            internalVO.getMnParentItemNumber());
        bsfnParams.setValue("mnBatchQuantity",
                            internalVO.getMnBatchQuantity());
        bsfnParams.setValue("cRequestType", internalVO.getCRequestType());
        bsfnParams.setValue("szIndex", internalVO.getSzIndex());
        bsfnParams.setValue("szKeys", internalVO.getSzKeys());
        bsfnParams.setValue("cReturnFieldValues",
                            internalVO.getCReturnFieldValues());
        bsfnParams.setValue("cSuppressErrorMessages",
                            internalVO.getCSuppressErrorMessages());
        bsfnParams.setValue("idRequestHandleID",
                            internalVO.getIdRequestHandleID());
        bsfnParams.setValue("idUserHandleID", internalVO.getIdUserHandleID());

        try {
            //get bsfnService from context
            IBSFNService bsfnService = context.getBSFNService();

            //execute business function
            bsfnService.execute(context, connection, "GetNextBillOfMaterial",
                                bsfnParams);
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
        internalVO.setSzErrorMessageID((String)bsfnParams.getValue("szErrorMessageID"));
        internalVO.setCEndOfFile(bsfnParams.getValue("cEndOfFile").toString());
        internalVO.setIdRequestHandleID((Integer)bsfnParams.getValue("idRequestHandleID"));
        internalVO.setIdUserHandleID((Integer)bsfnParams.getValue("idUserHandleID"));
        internalVO.setMnComponentLineNumber((MathNumeric)bsfnParams.getValue("mnComponentLineNumber"));
        internalVO.setJdEffectiveFrom((Date)bsfnParams.getValue("jdEffectiveFrom"));
        internalVO.setJdEffectiveThru((Date)bsfnParams.getValue("jdEffectiveThru"));
        internalVO.setMnComponentItemNo((MathNumeric)bsfnParams.getValue("mnComponentItemNo"));

        //return any errors, warnings, or informational messages to the caller
        return bsfnParams.getE1MessageList();
    }

    /**
     * Calls the GT3002BCopyorDeleteGenericText(B3003650) business function which has the D3003650 datastructure.
     * @param context conditionally provides the connection for the business function call and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param TODO document input parameters
     * @return A list of messages if there were application errors, warnings, or informational
     * messages. Returns null if there were no messages.
     */
    private static E1MessageList callGT3002BCopyorDeleteGenericText(IContext context,
                                                                    IConnection connection,
                                                                    InternalGT3002BCopyDeleteUpdateGenericText internalVO) {
        BSFNParameters bsfnParams = new BSFNParameters();

        // map input parameters from input value object
        bsfnParams.setValue("cProcessEdits", internalVO.getCProcessEdits());
        bsfnParams.setValue("cSuppressErrorMessage",
                            internalVO.getCSuppressErrorMessage());
        bsfnParams.setValue("mnFromParentItemShort",
                            internalVO.getMnFromParentItemShort());
        bsfnParams.setValue("szFromParentBranch",
                            internalVO.getSzFromParentBranch());
        bsfnParams.setValue("szFromTypeBill", internalVO.getSzFromTypeBill());
        bsfnParams.setValue("mnFromUnitsBatchQuantity",
                            internalVO.getMnFromUnitsBatchQuantity());

        try {
            //get bsfnService from context
            IBSFNService bsfnService = context.getBSFNService();

            //execute business function
            bsfnService.execute(context, connection,
                                "GT3002BCopyorDeleteGenericText", bsfnParams);
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

        //return any errors, warnings, or informational messages to the caller
        return bsfnParams.getE1MessageList();
    }

    /**
     * Calls the CacheMaintainCacheForDeleteBOM(B3002040) business function which has the D3002040M datastructure.
     * @param context conditionally provides the connection for the business function call and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param TODO document input parameters
     * @return A list of messages if there were application errors, warnings, or informational
     * messages. Returns null if there were no messages.
     */
    private static E1MessageList callCacheMaintainCacheForDeleteBOM(IContext context,
                                                                    IConnection connection,
                                                                    InternalCacheMaintainCacheForDeleteBOMMBF internalVO) {
        BSFNParameters bsfnParams = new BSFNParameters();

        // map input parameters from input value object
        bsfnParams.setValue("mnPreviousComponentNumber",
                            internalVO.getMnPreviousComponentNumber());
        bsfnParams.setValue("mnPreviousSubstituteItemSeqNo",
                            internalVO.getMnPreviousSubstituteItemSeqNo());
        bsfnParams.setValue("cPreviousCoproductsByproducts",
                            internalVO.getCPreviousCoproductsByproducts());
        bsfnParams.setValue("mnNewComponentNumber",
                            internalVO.getMnNewComponentNumber());
        bsfnParams.setValue("mnNewSubstituteItemSeqNo",
                            internalVO.getMnNewSubstituteItemSeqNo());
        bsfnParams.setValue("cNewCoproductsByproducts",
                            internalVO.getCNewCoproductsByproducts());
        bsfnParams.setValue("mnJobNumber", internalVO.getMnJobNumber());

        try {
            //get bsfnService from context
            IBSFNService bsfnService = context.getBSFNService();

            //execute business function
            bsfnService.execute(context, connection,
                                "CacheMaintainCacheForDeleteBOM", bsfnParams);
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

        //return any errors, warnings, or informational messages to the caller
        return bsfnParams.getE1MessageList();
    }

    /**
     * Calls the DeleteComponentLocator(B3000410) business function which has the D3000410 datastructure.
     * @param context conditionally provides the connection for the business function call and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param TODO document input parameters
     * @return A list of messages if there were application errors, warnings, or informational
     * messages. Returns null if there were no messages.
     */
    private static E1MessageList callDeleteComponentLocator(IContext context,
                                                            IConnection connection,
                                                            InternalF3015DeleteComponentLocator internalVO) {
        BSFNParameters bsfnParams = new BSFNParameters();

        // map input parameters from input value object
        bsfnParams.setValue("szParentBranch", internalVO.getSzParentBranch());
        bsfnParams.setValue("mnParentItemShort",
                            internalVO.getMnParentItemShort());
        bsfnParams.setValue("mnComponentShort",
                            internalVO.getMnComponentShort());
        bsfnParams.setValue("jdEffectiveFrom",
                            internalVO.getJdEffectiveFrom());
        bsfnParams.setValue("jdEffectiveThru",
                            internalVO.getJdEffectiveThru());
        bsfnParams.setValue("mnLineNo", internalVO.getMnLineNo());

        try {
            //get bsfnService from context
            IBSFNService bsfnService = context.getBSFNService();

            //execute business function
            bsfnService.execute(context, connection, "DeleteComponentLocator",
                                bsfnParams);
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

        //return any errors, warnings, or informational messages to the caller
        return bsfnParams.getE1MessageList();
    }

    /**
     * Calls the GetItemMasterBy2ndItem(X4101) business function which has the DX4101C datastructure.
     * @param context conditionally provides the connection for the business function call and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param TODO document input parameters
     * @return A list of messages if there were application errors, warnings, or informational
     * messages. Returns null if there were no messages.
     */
    private static E1MessageList callGetItemMasterBy2ndItem(IContext context,
                                                            IConnection connection,
                                                            InternalBOMChild internalVO) {
        BSFNParameters bsfnParams = new BSFNParameters();

        // map input parameters from input value object
        bsfnParams.setValue("sz2ndItemNumber", internalVO.getF3002_LITM());

        try {
            //get bsfnService from context
            IBSFNService bsfnService = context.getBSFNService();

            //execute business function
            bsfnService.execute(context, connection, "GetItemMasterBy2ndItem",
                                bsfnParams);
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
        internalVO.setF3002_ITM((MathNumeric)bsfnParams.getValue("mnShortItemNumber"));

        //return any errors, warnings, or informational messages to the caller
        return bsfnParams.getE1MessageList();
    }

    /**
     * Calls the F3002EditLine(N3002040) business function which has the D3002040B datastructure.
     * @param context conditionally provides the connection for the business function call and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param TODO document input parameters
     * @return A list of messages if there were application errors, warnings, or informational
     * messages. Returns null if there were no messages.
     */
    private static E1MessageList callF3002EditLine(IContext context,
                                                   IConnection connection,
                                                   InternalBOMParent internalVO,
                                                   Integer childRecords) {
        BSFNParameters bsfnParams = new BSFNParameters();

        // map input parameters from input value object
        bsfnParams.setValue("mnJobnumber", internalVO.getMnJobNumber());
        bsfnParams.setValue("szComputerID", internalVO.getSzComputerID());
        bsfnParams.setValue("cActionCode", ADD_ACTION);
        bsfnParams.setValue("mnComponentItem",
                            internalVO.getInternalBOMChild(childRecords).getF3002_ITM());
        bsfnParams.setValue("szBranchComponent", internalVO.getF3002_MMCU());
        bsfnParams.setValue("cValidateComponentItemBranch", "1");
        bsfnParams.setValue("mnQtyRequiredStandard",
                            internalVO.getInternalBOMChild(childRecords).getF3002_QNTY());
        bsfnParams.setValue("szUnitOfMeasure",
                            internalVO.getInternalBOMChild(childRecords).getF3002_UM());
        bsfnParams.setValue("cFixedOrVariableQty",
                            internalVO.getInternalBOMChild(childRecords).getF3002_FORQ());
        bsfnParams.setValue("mnBubbleSequence",
                            internalVO.getInternalBOMChild(childRecords).getF3002_BSEQ());
        bsfnParams.setValue("mnPercentOfScrap",
                            internalVO.getInternalBOMChild(childRecords).getF3002_SCRP());
        bsfnParams.setValue("mnLeadtimeOffsetDays",
                            internalVO.getInternalBOMChild(childRecords).getF3002_LOVD());
        bsfnParams.setValue("szComponentUnknownFormat",
                            internalVO.getInternalBOMChild(childRecords).getF3002_LITM());
        bsfnParams.setValue("szProgramId", PROGRAM_ID);
        bsfnParams.setValue("szMachineId", internalVO.getSzComputerID());

        try {
            //get bsfnService from context
            IBSFNService bsfnService = context.getBSFNService();

            //execute business function
            bsfnService.execute(context, connection, "F3002EditLine",
                                bsfnParams);
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
        String err1 = (String)bsfnParams.getValue("cErrorConditions");
        String err2 = (String)bsfnParams.getValue("cErrorF3002");

        //return any errors, warnings, or informational messages to the caller
        return bsfnParams.getE1MessageList();
    }

    /**
     * Updates one or more records in the F4102 table.
     * <p>Following SQL statement can be produced by this generated code
     * <blockquote><pre><code>
     * UPDATE F4102
     *
     * SET  F4102.STKT=?
     *
     * WHERE F4102.ITM=? AND F4102.MCU=?
     *
     *
     * </code></pre></blockquote>
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param internalVO TODO document input parameters
     * @return an E1Message containing the text of any database exceptions that may have occurred
     */
    private static E1MessageList updateF4102(IContext context,
                                             IConnection connection,
                                             InternalBOMParent internalVO) {
        //create return object
        E1MessageList returnMessages = new E1MessageList();

        //specify columns to update
        BSSVDBField[] updateFields =
        { new BSSVDBField("F4102.STKT") // Character - StockingType
            } ;

        //specify update values
        Object[] updateValues = { DFT_STOCKINGTYPE };

        //specify condition records must meet to be updated
        BSSVDBWhereField[] whereFields =
        { new BSSVDBWhereField(null, new BSSVDBField("F4102.ITM"),
                               IDBService.EQUALS, internalVO.getF3002_KIT()),
          new BSSVDBWhereField(IDBService.AND, new BSSVDBField("F4102.MCU"),
                               IDBService.EQUALS,
                               internalVO.getF3002_MMCU()) };

        BSSVDBWhereClauseBuilder whereClause =
            new BSSVDBWhereClauseBuilder(context, whereFields);

        try {
            //get dbService from context
            IDBService dbService = context.getDBService();
            //execute db update operation
            long numRecordsUpdated =
                dbService.update(context, connection, "F4102",
                                 IDBService.DB_TABLE, updateFields,
                                 updateValues, whereClause);
            //internalVO.setNumberRowsUpdated(numRecordsUpdated);
        } catch (DBServiceException e) {
            //TODO take some action in response to the database exception
            returnMessages.addMessage(new E1Message(context, "005FIS",
                                                    e.getMessage()));
        }

        return returnMessages;
    }
}
