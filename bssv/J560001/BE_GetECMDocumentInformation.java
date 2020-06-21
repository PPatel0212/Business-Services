package be.e1.bssv.J560001;

import be.e1.bssv.J560001.valueobject.InternalAddECMDocumentIDInformation;
import be.e1.bssv.J560001.valueobject.InternalDeleteECMDocumentInformation;
import be.e1.bssv.J560001.valueobject.InternalGetECMDocumentInformation;

import be.e1.bssv.J560001.valueobject.InternalShowECMDocumentInformation;

import java.util.ArrayList;

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

/**
 * TODO: Java Doc for BusinessService
 */
public abstract class BE_GetECMDocumentInformation extends BusinessService {
    /**
     * TODO: Create Java Doc for: getECMDocumentInformation
     * Method getECMDocumentInformation is used for...?
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
     * @return an E1Message containing the text of any errors or warnings that may have occurred
     */
    public static E1MessageList getECMDocumentInformation(IContext context,
                                                          IConnection connection,
                                                          InternalGetECMDocumentInformation internalVO) {

        //Call start internal method, passing the context (which was passed from PublishedBusinessService).
        startInternalMethod(context, "getECMDocumentInformation", internalVO);
        //Create new message list for BusinessService processing.
        E1MessageList messages = new E1MessageList();
        InternalShowECMDocumentInformation showDocumentInfo =
            new InternalShowECMDocumentInformation();
        ArrayList errorQueryResults = new ArrayList();
        //TODO: call method (created by the wizard), which then executes Business Function or Database operation.

        if (internalVO.getQueryWhereFields().getF5600028_SESSID() != null) {
            if (internalVO.getQueryWhereFields().getMode().equalsIgnoreCase("D")) {

                InternalDeleteECMDocumentInformation deleteInformation =
                    new InternalDeleteECMDocumentInformation();

                deleteInformation.setCActionType_ACTION("D");
                deleteInformation.setSzSystemIdentifier("JDE");
                deleteInformation.setSzBarCodeID(internalVO.getQueryWhereFields().getF5600028_SESSID().trim());
                messages.addMessages(callBE_ECMDocumentIDInformation(context,
                                                                     connection,
                                                                     deleteInformation));

                showDocumentInfo.setErroCode(deleteInformation.getCErrorCode_ERRC());
                showDocumentInfo.setErrorDescription(deleteInformation.getSzErrorMessageKey_EKEY());
                errorQueryResults.add(0, showDocumentInfo);
                internalVO.setQueryResults(errorQueryResults);

            }
            if (internalVO.getQueryWhereFields().getMode().equalsIgnoreCase("I")) {
                messages.addMessages(selectFromF5600028(context, connection,
                                                        internalVO));
            }

        }
        if (internalVO.getQueryWhereFields().getMode().equalsIgnoreCase("A")) {


            InternalAddECMDocumentIDInformation internalAddECMDocumentIDInformation =
                new InternalAddECMDocumentIDInformation();

            for (int i = 0;
                 i < internalVO.getInternalECMDocumentIDInformation().size();
                 i++) {

                internalAddECMDocumentIDInformation.setCActionType_ACTION("A");
                if(internalVO.getQueryWhereFields().getF5600028_SESSID() != null){
                internalAddECMDocumentIDInformation.setSzSessionID(internalVO.getQueryWhereFields().getF5600028_SESSID().trim());
                }
                internalAddECMDocumentIDInformation.setSzSystemIdentifier("JDE");
                internalAddECMDocumentIDInformation.setSzProgramId_PID("JP560001");

                if (internalVO.getInternalECMDocumentIDInformation(i).getSzDataValue() !=
                    null &&
                    internalVO.getInternalECMDocumentIDInformation(i).getSzFieldName() !=
                    null) {

                    if (i == 0) {
                        internalAddECMDocumentIDInformation.setSzDataValue01_GS5A(internalVO.getInternalECMDocumentIDInformation(i).getSzDataValue());
                        internalAddECMDocumentIDInformation.setSzFieldName01_GS2A(internalVO.getInternalECMDocumentIDInformation(i).getSzFieldName());
                    }


                    if (i == 1) {
                        internalAddECMDocumentIDInformation.setSzDataValue02_GS5A(internalVO.getInternalECMDocumentIDInformation(i).getSzDataValue());
                        internalAddECMDocumentIDInformation.setSzFieldName02_GS2A(internalVO.getInternalECMDocumentIDInformation(i).getSzFieldName());

                    }

                    if (i == 2) {
                        internalAddECMDocumentIDInformation.setSzDataValue03_GS5A(internalVO.getInternalECMDocumentIDInformation(i).getSzDataValue());
                        internalAddECMDocumentIDInformation.setSzFieldName03_GS2A(internalVO.getInternalECMDocumentIDInformation(i).getSzFieldName());

                    }


                    if (i == 3) {
                        internalAddECMDocumentIDInformation.setSzDataValue04_GS5A(internalVO.getInternalECMDocumentIDInformation(i).getSzDataValue());
                        internalAddECMDocumentIDInformation.setSzFieldName04_GS2A(internalVO.getInternalECMDocumentIDInformation(i).getSzFieldName());

                    }

                    if (i == 4) {
                        internalAddECMDocumentIDInformation.setSzDataValue05_GS5A(internalVO.getInternalECMDocumentIDInformation(i).getSzDataValue());
                        internalAddECMDocumentIDInformation.setSzFieldName05_GS2A(internalVO.getInternalECMDocumentIDInformation(i).getSzFieldName());

                    }

                    if (i == 5) {
                        internalAddECMDocumentIDInformation.setSzDataValue06_GS5A(internalVO.getInternalECMDocumentIDInformation(i).getSzDataValue());
                        internalAddECMDocumentIDInformation.setSzFieldName06_GS2A(internalVO.getInternalECMDocumentIDInformation(i).getSzFieldName());

                    }

                    if (i == 6) {
                        internalAddECMDocumentIDInformation.setSzDataValue07_GS5A(internalVO.getInternalECMDocumentIDInformation(i).getSzDataValue());
                        internalAddECMDocumentIDInformation.setSzFieldName07_GS2A(internalVO.getInternalECMDocumentIDInformation(i).getSzFieldName());

                    }

                    if (i == 7) {
                        internalAddECMDocumentIDInformation.setSzDataValue08_GS5A(internalVO.getInternalECMDocumentIDInformation(i).getSzDataValue());
                        internalAddECMDocumentIDInformation.setSzFieldName08_GS2A(internalVO.getInternalECMDocumentIDInformation(i).getSzFieldName());

                    }

                    if (i == 8) {
                        internalAddECMDocumentIDInformation.setSzDataValue09_GS5A(internalVO.getInternalECMDocumentIDInformation(i).getSzDataValue());
                        internalAddECMDocumentIDInformation.setSzFieldName09_GS2A(internalVO.getInternalECMDocumentIDInformation(i).getSzFieldName());

                    }

                    if (i == 9) {
                        internalAddECMDocumentIDInformation.setSzDataValue10_GS5A(internalVO.getInternalECMDocumentIDInformation(i).getSzDataValue());
                        internalAddECMDocumentIDInformation.setSzFieldName10_GS2A(internalVO.getInternalECMDocumentIDInformation(i).getSzFieldName());

                    }

                    if (i == 10) {
                        internalAddECMDocumentIDInformation.setSzDataValue11_GS5A(internalVO.getInternalECMDocumentIDInformation(i).getSzDataValue());
                        internalAddECMDocumentIDInformation.setSzFieldName11_GS2A(internalVO.getInternalECMDocumentIDInformation(i).getSzFieldName());

                    }

                    if (i == 11) {
                        internalAddECMDocumentIDInformation.setSzDataValue12_GS5A(internalVO.getInternalECMDocumentIDInformation(i).getSzDataValue());
                        internalAddECMDocumentIDInformation.setSzFieldName12_GS2A(internalVO.getInternalECMDocumentIDInformation(i).getSzFieldName());

                    }

                    if (i == 12) {
                        internalAddECMDocumentIDInformation.setSzDataValue13_GS5A(internalVO.getInternalECMDocumentIDInformation(i).getSzDataValue());
                        internalAddECMDocumentIDInformation.setSzFieldName13_GS2A(internalVO.getInternalECMDocumentIDInformation(i).getSzFieldName());

                    }

                    if (i == 13) {
                        internalAddECMDocumentIDInformation.setSzDataValue14_GS5A(internalVO.getInternalECMDocumentIDInformation(i).getSzDataValue());
                        internalAddECMDocumentIDInformation.setSzFieldName14_GS2A(internalVO.getInternalECMDocumentIDInformation(i).getSzFieldName());

                    }

                    if (i == 14) {
                        internalAddECMDocumentIDInformation.setSzDataValue15_GS5A(internalVO.getInternalECMDocumentIDInformation(i).getSzDataValue());
                        internalAddECMDocumentIDInformation.setSzFieldName15_GS2A(internalVO.getInternalECMDocumentIDInformation(i).getSzFieldName());

                    }
                    if (i == 15) {
                        internalAddECMDocumentIDInformation.setSzDataValue16_GS5A(internalVO.getInternalECMDocumentIDInformation(i).getSzDataValue());
                        internalAddECMDocumentIDInformation.setSzFieldName16_GS2A(internalVO.getInternalECMDocumentIDInformation(i).getSzFieldName());

                    }


                    if (i == 16) {
                        internalAddECMDocumentIDInformation.setSzDataValue17_GS5A(internalVO.getInternalECMDocumentIDInformation(i).getSzDataValue());
                        internalAddECMDocumentIDInformation.setSzFieldName17_GS2A(internalVO.getInternalECMDocumentIDInformation(i).getSzFieldName());

                    }


                    if (i == 17) {
                        internalAddECMDocumentIDInformation.setSzDataValue18_GS5A(internalVO.getInternalECMDocumentIDInformation(i).getSzDataValue());
                        internalAddECMDocumentIDInformation.setSzFieldName18_GS2A(internalVO.getInternalECMDocumentIDInformation(i).getSzFieldName());

                    }

                    if (i == 18) {
                        internalAddECMDocumentIDInformation.setSzDataValue19_GS5A(internalVO.getInternalECMDocumentIDInformation(i).getSzDataValue());
                        internalAddECMDocumentIDInformation.setSzFieldName19_GS2A(internalVO.getInternalECMDocumentIDInformation(i).getSzFieldName());

                    }

                    if (i == 19) {
                        internalAddECMDocumentIDInformation.setSzDataValue20_GS5A(internalVO.getInternalECMDocumentIDInformation(i).getSzDataValue());
                        internalAddECMDocumentIDInformation.setSzFieldName20_GS2A(internalVO.getInternalECMDocumentIDInformation(i).getSzFieldName());

                    }

                    if (i == 20) {
                        internalAddECMDocumentIDInformation.setSzDataValue21_GS5A(internalVO.getInternalECMDocumentIDInformation(i).getSzDataValue());
                        internalAddECMDocumentIDInformation.setSzFieldName21_GS2A(internalVO.getInternalECMDocumentIDInformation(i).getSzFieldName());

                    }

                    if (i == 21) {
                        internalAddECMDocumentIDInformation.setSzDataValue22_GS5A(internalVO.getInternalECMDocumentIDInformation(i).getSzDataValue());
                        internalAddECMDocumentIDInformation.setSzFieldName22_GS2A(internalVO.getInternalECMDocumentIDInformation(i).getSzFieldName());

                    }


                    if (i == 22) {
                        internalAddECMDocumentIDInformation.setSzDataValue23_GS5A(internalVO.getInternalECMDocumentIDInformation(i).getSzDataValue());
                        internalAddECMDocumentIDInformation.setSzFieldName23_GS2A(internalVO.getInternalECMDocumentIDInformation(i).getSzFieldName());
                    }

                    if (i == 23) {
                        internalAddECMDocumentIDInformation.setSzDataValue24_GS5A(internalVO.getInternalECMDocumentIDInformation(i).getSzDataValue());
                        internalAddECMDocumentIDInformation.setSzFieldName24_GS2A(internalVO.getInternalECMDocumentIDInformation(i).getSzFieldName());

                    }

                    if (i == 24) {
                        internalAddECMDocumentIDInformation.setSzDataValue25_GS5A(internalVO.getInternalECMDocumentIDInformation(i).getSzDataValue());
                        internalAddECMDocumentIDInformation.setSzFieldName25_GS2A(internalVO.getInternalECMDocumentIDInformation(i).getSzFieldName());

                    }
                }
            }
            messages.addMessages(callBE_ECMDocumentIDInformation1(context,
                                                                  connection,
                                                                  internalAddECMDocumentIDInformation));
            showDocumentInfo.setErroCode(internalAddECMDocumentIDInformation.getCErrorCode_ERRC());
            showDocumentInfo.setErrorDescription(internalAddECMDocumentIDInformation.getSzErrorMessageKey_EKEY());
            showDocumentInfo.setF5600028_SESSID(internalAddECMDocumentIDInformation.getSzSessionID());
            errorQueryResults.add(0, showDocumentInfo);
            internalVO.setQueryResults(errorQueryResults);
        }


        //TODO:  add messages returned from E1 processing to BusinessService message list.


        //Call finish internal method passing context.
        finishInternalMethod(context, "getECMDocumentInformation");

        //Call finish internal method passing context.
        return messages;
    }

    /**
     * Selects records from the F5600028 table.
     * <p>Following SQL statement can be produced by this generated code
     * <blockquote><pre><code>
     * SELECT F5600028.SESSID, F5600028.GS2A, F5600028.GS5A
     *
     * FROM F5600028
     *
     * WHERE F5600028.SESSID=?
     *
     *
     * </code></pre></blockquote>
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param internalVO TODO document input parameters
     * @param maxReturnedRows the maximium number of rows returned from the select operation.
     * @return an E1Message containing the text of any database exceptions that may have occurred
     */
    private static E1MessageList selectFromF5600028(IContext context,
                                                    IConnection connection,
                                                    InternalGetECMDocumentInformation internalVO) {
        //create return object
        E1MessageList returnMessages = new E1MessageList();

        //specify columns to select
        BSSVDBField[] selectFields =
        { new BSSVDBField("F5600028.SESSID"), // String - SessionID
            new BSSVDBField("F5600028.GS2A"), // String - szGenericStr20A
            new BSSVDBField("F5600028.GS5A") // String - szGenericStr50A
            } ;

        //specify sort order
        BSSVDBSortField[] sortOrder = null;

        //specify condition records must meet - assume inputs are optional
        ArrayList whereFieldsList = new ArrayList();
        if (internalVO.getQueryWhereFields().getF5600028_SESSID() != null) {
            whereFieldsList.add(new BSSVDBWhereField(null,
                                                     new BSSVDBField("F5600028.SESSID"),
                                                     IDBService.EQUALS,
                                                     internalVO.getQueryWhereFields().getF5600028_SESSID()));
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
                    dbService.select(context, connection, "F5600028", IDBService.DB_TABLE,
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
                    InternalShowECMDocumentInformation result =
                        new InternalShowECMDocumentInformation();
                    result.setF5600028_SESSID((String)map.getValue("F5600028.SESSID"));
                    result.setF5600028_GS2A((String)map.getValue("F5600028.GS2A"));
                    result.setF5600028_GS5A((String)map.getValue("F5600028.GS5A"));
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
     * Calls the BE_ECMDocumentIDInformation(N5600028) business function which has the D5600028 datastructure.
     * @param context conditionally provides the connection for the business function call and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param TODO document input parameters
     * @return A list of messages if there were application errors, warnings, or informational
     * messages. Returns null if there were no messages.
     */
    private static E1MessageList callBE_ECMDocumentIDInformation(IContext context,
                                                                 IConnection connection,
                                                                 InternalDeleteECMDocumentInformation internalVO) {
        BSFNParameters bsfnParams = new BSFNParameters();

        // map input parameters from input value object
        bsfnParams.setValue("cActionType_ACTION",
                            internalVO.getCActionType_ACTION());
        bsfnParams.setValue("szSystemIdentifier",
                            internalVO.getSzSystemIdentifier());
        bsfnParams.setValue("szSessionID", internalVO.getSzBarCodeID());

        try {
            //get bsfnService from context
            IBSFNService bsfnService = context.getBSFNService();

            //execute business function
            bsfnService.execute(context, connection,
                                "BE_ECMDocumentIDInformation", bsfnParams);
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
        internalVO.setCErrorCode_ERRC(bsfnParams.getValue("cErrorCode_ERRC").toString());
        internalVO.setSzErrorMessageKey_EKEY((String)bsfnParams.getValue("szErrorMessageKey_EKEY"));

        //return any errors, warnings, or informational messages to the caller
        return bsfnParams.getE1MessageList();
    }


    /**
     * Calls the BE_ECMDocumentIDInformation(N5600028) business function which has the D5600028 datastructure.
     * @param context conditionally provides the connection for the business function call and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param TODO document input parameters
     * @return A list of messages if there were application errors, warnings, or informational
     * messages. Returns null if there were no messages.
     */
    private static E1MessageList callBE_ECMDocumentIDInformation1(IContext context,
                                                                  IConnection connection,
                                                                  InternalAddECMDocumentIDInformation internalVO) {
        BSFNParameters bsfnParams = new BSFNParameters();

        // map input parameters from input value object
        bsfnParams.setValue("cActionType_ACTION",
                            internalVO.getCActionType_ACTION());
        bsfnParams.setValue("szProgramId_PID",
                            internalVO.getSzProgramId_PID());
        bsfnParams.setValue("szFieldName01_GS2A",
                            internalVO.getSzFieldName01_GS2A());
        bsfnParams.setValue("szDataValue01_GS5A",
                            internalVO.getSzDataValue01_GS5A());
        bsfnParams.setValue("szFieldName02_GS2A",
                            internalVO.getSzFieldName02_GS2A());
        bsfnParams.setValue("szDataValue02_GS5A",
                            internalVO.getSzDataValue02_GS5A());
        bsfnParams.setValue("szFieldName03_GS2A",
                            internalVO.getSzFieldName03_GS2A());
        bsfnParams.setValue("szDataValue03_GS5A",
                            internalVO.getSzDataValue03_GS5A());
        bsfnParams.setValue("szFieldName04_GS2A",
                            internalVO.getSzFieldName04_GS2A());
        bsfnParams.setValue("szDataValue04_GS5A",
                            internalVO.getSzDataValue04_GS5A());
        bsfnParams.setValue("szFieldName05_GS2A",
                            internalVO.getSzFieldName05_GS2A());
        bsfnParams.setValue("szDataValue05_GS5A",
                            internalVO.getSzDataValue05_GS5A());
        bsfnParams.setValue("szFieldName06_GS2A",
                            internalVO.getSzFieldName06_GS2A());
        bsfnParams.setValue("szDataValue06_GS5A",
                            internalVO.getSzDataValue06_GS5A());
        bsfnParams.setValue("szFieldName07_GS2A",
                            internalVO.getSzFieldName07_GS2A());
        bsfnParams.setValue("szDataValue07_GS5A",
                            internalVO.getSzDataValue07_GS5A());
        bsfnParams.setValue("szFieldName08_GS2A",
                            internalVO.getSzFieldName08_GS2A());
        bsfnParams.setValue("szDataValue08_GS5A",
                            internalVO.getSzDataValue08_GS5A());
        bsfnParams.setValue("szFieldName09_GS2A",
                            internalVO.getSzFieldName09_GS2A());
        bsfnParams.setValue("szDataValue09_GS5A",
                            internalVO.getSzDataValue09_GS5A());
        bsfnParams.setValue("szFieldName10_GS2A",
                            internalVO.getSzFieldName10_GS2A());
        bsfnParams.setValue("szDataValue10_GS5A",
                            internalVO.getSzDataValue10_GS5A());
        bsfnParams.setValue("szFieldName11_GS2A",
                            internalVO.getSzFieldName11_GS2A());
        bsfnParams.setValue("szDataValue11_GS5A",
                            internalVO.getSzDataValue11_GS5A());
        bsfnParams.setValue("szFieldName12_GS2A",
                            internalVO.getSzFieldName12_GS2A());
        bsfnParams.setValue("szDataValue12_GS5A",
                            internalVO.getSzDataValue12_GS5A());
        bsfnParams.setValue("szFieldName13_GS2A",
                            internalVO.getSzFieldName13_GS2A());
        bsfnParams.setValue("szDataValue13_GS5A",
                            internalVO.getSzDataValue13_GS5A());
        bsfnParams.setValue("szFieldName14_GS2A",
                            internalVO.getSzFieldName14_GS2A());
        bsfnParams.setValue("szDataValue14_GS5A",
                            internalVO.getSzDataValue14_GS5A());
        bsfnParams.setValue("szFieldName15_GS2A",
                            internalVO.getSzFieldName15_GS2A());
        bsfnParams.setValue("szDataValue15_GS5A",
                            internalVO.getSzDataValue15_GS5A());
        bsfnParams.setValue("szFieldName16_GS2A",
                            internalVO.getSzFieldName16_GS2A());
        bsfnParams.setValue("szDataValue16_GS5A",
                            internalVO.getSzDataValue16_GS5A());
        bsfnParams.setValue("szFieldName17_GS2A",
                            internalVO.getSzFieldName17_GS2A());
        bsfnParams.setValue("szDataValue17_GS5A",
                            internalVO.getSzDataValue17_GS5A());
        bsfnParams.setValue("szFieldName18_GS2A",
                            internalVO.getSzFieldName18_GS2A());
        bsfnParams.setValue("szDataValue18_GS5A",
                            internalVO.getSzDataValue18_GS5A());
        bsfnParams.setValue("szFieldName19_GS2A",
                            internalVO.getSzFieldName19_GS2A());
        bsfnParams.setValue("szDataValue19_GS5A",
                            internalVO.getSzDataValue19_GS5A());
        bsfnParams.setValue("szFieldName20_GS2A",
                            internalVO.getSzFieldName20_GS2A());
        bsfnParams.setValue("szDataValue20_GS5A",
                            internalVO.getSzDataValue20_GS5A());
        bsfnParams.setValue("szFieldName21_GS2A",
                            internalVO.getSzFieldName21_GS2A());
        bsfnParams.setValue("szDataValue21_GS5A",
                            internalVO.getSzDataValue21_GS5A());
        bsfnParams.setValue("szFieldName22_GS2A",
                            internalVO.getSzFieldName22_GS2A());
        bsfnParams.setValue("szDataValue22_GS5A",
                            internalVO.getSzDataValue22_GS5A());
        bsfnParams.setValue("szFieldName23_GS2A",
                            internalVO.getSzFieldName23_GS2A());
        bsfnParams.setValue("szDataValue23_GS5A",
                            internalVO.getSzDataValue23_GS5A());
        bsfnParams.setValue("szFieldName24_GS2A",
                            internalVO.getSzFieldName24_GS2A());
        bsfnParams.setValue("szDataValue24_GS5A",
                            internalVO.getSzDataValue24_GS5A());
        bsfnParams.setValue("szFieldName25_GS2A",
                            internalVO.getSzFieldName25_GS2A());
        bsfnParams.setValue("szDataValue25_GS5A",
                            internalVO.getSzDataValue25_GS5A());
        bsfnParams.setValue("szSessionID", internalVO.getSzSessionID());
        bsfnParams.setValue("szSystemIdentifier",
                            internalVO.getSzSystemIdentifier());

        try {
            //get bsfnService from context
            IBSFNService bsfnService = context.getBSFNService();

            //execute business function
            bsfnService.execute(context, connection,
                                "BE_ECMDocumentIDInformation", bsfnParams);
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
        internalVO.setCErrorCode_ERRC(bsfnParams.getValue("cErrorCode_ERRC").toString());
        internalVO.setSzErrorMessageKey_EKEY((String)bsfnParams.getValue("szErrorMessageKey_EKEY"));
        internalVO.setSzSessionID((String)bsfnParams.getValue("szSessionID"));

        //return any errors, warnings, or informational messages to the caller
        return bsfnParams.getE1MessageList();
    }
}
