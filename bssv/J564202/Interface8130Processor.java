package be.e1.bssv.J564202;

import be.e1.bssv.J564202.valueobject.InternalCreatePickSlipDetails;
import be.e1.bssv.J564202.valueobject.InternalGetNextUKIDF5642008;
import be.e1.bssv.J564202.valueobject.InternalGetPickSlipDetails;

import be.e1.bssv.J564202.valueobject.InternalGetSODetailsKey;
import be.e1.bssv.J564202.valueobject.InternalShowPickSlipDetails;

import be.e1.bssv.J564202.valueobject.InternalShowSODetailsKey;

import be.e1.bssv.J564202.valueobject.InternalUpdateSODetailsTag;

import be.e1.bssv.J564202.valueobject.InternalUpdateSODetailsTagUpdateFields;

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
public abstract class Interface8130Processor extends BusinessService {
    /**
     * TODO: Create Java Doc for: getPickSlipDetails
     * Method getPickSlipDetails is used for...?
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
     * @return an E1Message containing the text of any errors or warnings that may have occurred
     */
    public static E1MessageList getPickSlipDetails(IContext context, IConnection connection, InternalGetPickSlipDetails internalVO) {

        //Call start internal method, passing the context (which was passed from PublishedBusinessService).
        startInternalMethod(context, "getPickSlipDetails", internalVO);
        //Create new message list for BusinessService processing.
        E1MessageList messages = new E1MessageList();

        //TODO: call method (created by the wizard), which then executes Business Function or Database operation.
        // Get Next Unique Key Id for File F5642008 to store pick slip details
        InternalGetNextUKIDF5642008 internalGetNextUKIDF5642008 = new InternalGetNextUKIDF5642008();
        internalGetNextUKIDF5642008.setSzObjectName("F5642008");
        internalGetNextUKIDF5642008.setMnUniqueKeyID(new MathNumeric(0));
        callGetNextUniqueKeyID(context, connection, internalGetNextUKIDF5642008);

        // Retrieve Pick Slip Details and create records in F5642008 file
        InternalCreatePickSlipDetails internalCreatePickSlipDetails = new InternalCreatePickSlipDetails();
        internalCreatePickSlipDetails.setMnUniqueKeyIDInternal(internalGetNextUKIDF5642008.getMnUniqueKeyID());
        internalCreatePickSlipDetails.setMnPickSlipNumber(internalVO.getQueryWhereFields().getF5642008_PSN());
        internalCreatePickSlipDetails.setCRecordSuccefullyUpdatedYN("Y");
        callInterfaceTo8130Website(context, connection, internalCreatePickSlipDetails);

        // Retrieve Pick Slip Details from records created in F5642008 file
        long maxReturnedRows = 100;
        internalVO.getQueryWhereFields().setF5642008_UKID(internalGetNextUKIDF5642008.getMnUniqueKeyID());
        selectFromF5642008(context, connection, internalVO, maxReturnedRows);

        //TODO:  add messages returned from E1 processing to BusinessService message list.


        //Call finish internal method passing context.
        finishInternalMethod(context, "getPickSlipDetails");

        //Call finish internal method passing context.
        return messages;
    }
    /**
     * TODO: Create Java Doc for: setPickSlipPrint
     * Method getPickSlipDetails is used for...?
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
     * @return an E1Message containing the text of any errors or warnings that may have occurred
     */
    public static E1MessageList setPickSlipPrint(IContext context, IConnection connection, InternalGetSODetailsKey internalVO) {

        //Call start internal method, passing the context (which was passed from PublishedBusinessService).
        startInternalMethod(context, "setPickSlipPrint", internalVO);
        //Create new message list for BusinessService processing.
        E1MessageList messages = new E1MessageList();
        E1MessageList dbmessages = new E1MessageList();
        //TODO: call method (created by the wizard), which then executes Business Function or Database operation.
        // Retrieve SO Detail records for given Pick SLip Number
        long maxReturnedRows = 100;
        selectFromF4211(context, connection, internalVO, maxReturnedRows);
        if (internalVO.getQueryResults() != null) {
                    InternalUpdateSODetailsTag internalUpdateSODetailsTag = new InternalUpdateSODetailsTag();
                    for (int i = 0; i < internalVO.getQueryResults().size(); i++) {
                        internalUpdateSODetailsTag.getUpdateWhereFields().setF564211_DOCO(internalVO.getQueryResults(i).getF4211_DOCO());
                        internalUpdateSODetailsTag.getUpdateWhereFields().setF564211_DCTO(internalVO.getQueryResults(i).getF4211_DCTO());
                        internalUpdateSODetailsTag.getUpdateWhereFields().setF564211_KCOO(internalVO.getQueryResults(i).getF4211_KCOO());
                        internalUpdateSODetailsTag.getUpdateWhereFields().setF564211_LNID(internalVO.getQueryResults(i).getF4211_LNID());
                        internalUpdateSODetailsTag.getUpdateFields().setF564211_Z56ACERT("2");
                        dbmessages = updateF564211(context, connection, internalUpdateSODetailsTag);
                        if (dbmessages != null){
                                messages.addMessages(dbmessages);
                            }
                    }
                }
        //TODO:  add messages returned from E1 processing to BusinessService message list.


        //Call finish internal method passing context.
        finishInternalMethod(context, "setPickSlipPrint");

        //Call finish internal method passing context.
        return messages;
    }

    /**
     * Calls the GetNextUniqueKeyID(X00022) business function which has the DX00022A datastructure.
     * @param context conditionally provides the connection for the business function call and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param TODO document input parameters
     * @return A list of messages if there were application errors, warnings, or informational
     * messages. Returns null if there were no messages.
     */
    private static E1MessageList callGetNextUniqueKeyID(IContext context, IConnection connection, InternalGetNextUKIDF5642008 internalVO) {
        BSFNParameters bsfnParams = new BSFNParameters();

        // map input parameters from input value object
        bsfnParams.setValue("szObjectName", internalVO.getSzObjectName());

        try {
            //get bsfnService from context
            IBSFNService bsfnService = context.getBSFNService();

            //execute business function
            bsfnService.execute(context, connection, "GetNextUniqueKeyID", bsfnParams);
        } catch (BSFNServiceInvalidArgException invalidArgEx) {
            //Create error message for Invalid Argument exception and return it in ErrorList
            E1MessageList returnMessages = new E1MessageList();
            returnMessages.addMessage(new E1Message(context, "018FIS", invalidArgEx.getMessage()));
            return returnMessages;
        }
        catch (BSFNServiceSystemException systemEx) {
            //Create error message for System exception and return it in ErrorList
            E1MessageList returnMessages = new E1MessageList();
            returnMessages.addMessage(new E1Message(context, "019FIS", systemEx.getMessage()));
            return returnMessages;
        }


        //map output parameters to output value object
        internalVO.setMnUniqueKeyID((MathNumeric)bsfnParams.getValue("mnUniqueKeyID"));

        //return any errors, warnings, or informational messages to the caller
        return bsfnParams.getE1MessageList();
    }

    /**
     * Calls the InterfaceTo8130Website(N5642008) business function which has the D5642008 datastructure.
     * @param context conditionally provides the connection for the business function call and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param TODO document input parameters
     * @return A list of messages if there were application errors, warnings, or informational
     * messages. Returns null if there were no messages.
     */
    private static E1MessageList callInterfaceTo8130Website(IContext context, IConnection connection, InternalCreatePickSlipDetails internalVO) {
        BSFNParameters bsfnParams = new BSFNParameters();

        // map input parameters from input value object
        bsfnParams.setValue("mnPickSlipNumber", internalVO.getMnPickSlipNumber());
        bsfnParams.setValue("mnUniqueKeyIDInternal", internalVO.getMnUniqueKeyIDInternal());

        try {
            //get bsfnService from context
            IBSFNService bsfnService = context.getBSFNService();

            //execute business function
            bsfnService.execute(context, connection, "InterfaceTo8130Website", bsfnParams);
        } catch (BSFNServiceInvalidArgException invalidArgEx) {
            //Create error message for Invalid Argument exception and return it in ErrorList
            E1MessageList returnMessages = new E1MessageList();
            returnMessages.addMessage(new E1Message(context, "018FIS", invalidArgEx.getMessage()));
            return returnMessages;
        }
        catch (BSFNServiceSystemException systemEx) {
            //Create error message for System exception and return it in ErrorList
            E1MessageList returnMessages = new E1MessageList();
            returnMessages.addMessage(new E1Message(context, "019FIS", systemEx.getMessage()));
            return returnMessages;
        }


        //map output parameters to output value object
        internalVO.setCRecordSuccefullyUpdatedYN(bsfnParams.getValue("cRecordSuccefullyUpdatedYN").toString());

        //return any errors, warnings, or informational messages to the caller
        return bsfnParams.getE1MessageList();
    }

    /**
     * Selects records from the F5642008 table.
     * <p>Following SQL statement can be produced by this generated code
     * <blockquote><pre><code>
     * SELECT *
     *
     * FROM F5642008
     *
     * WHERE F5642008.UKID=?
     *
     *
     * </code></pre></blockquote>
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param internalVO TODO document input parameters
     * @param maxReturnedRows the maximium number of rows returned from the select operation.
     * @return an E1Message containing the text of any database exceptions that may have occurred
     */
    private static E1MessageList selectFromF5642008(IContext context, IConnection connection, InternalGetPickSlipDetails internalVO,
        long maxReturnedRows) {
        //create return object
        E1MessageList returnMessages = new E1MessageList();

        //specify columns to select
        BSSVDBField[] selectFields =
        {new BSSVDBField("F5642008.UKID"), // Numeric - UniqueKeyIDInternal
         new BSSVDBField("F5642008.N001"), // Numeric - NextNumber001
         new BSSVDBField("F5642008.PSN"), // Numeric - PickSlipNumber
         new BSSVDBField("F5642008.KCOO"), // String - CompanyKeyOrderNo
         new BSSVDBField("F5642008.DOCO"), // Numeric - DocumentOrderInvoiceE
         new BSSVDBField("F5642008.DCTO"), // String - OrderType
         new BSSVDBField("F5642008.LNID"), // Numeric - LineNumber
         new BSSVDBField("F5642008.MCU"), // String - CostCenter
         new BSSVDBField("F5642008.ITM"), // Numeric - IdentifierShortItem
         new BSSVDBField("F5642008.LITM"), // String - Identifier2ndItem
         new BSSVDBField("F5642008.DSC1"), // String - DescriptionLine1
         new BSSVDBField("F5642008.LOTN"), // String - Lot
         new BSSVDBField("F5642008.VR01"), // String - Reference1
         new BSSVDBField("F5642008.SOQS"), // Numeric - UnitsQuantityShipped
         new BSSVDBField("F5642008.AN8"), // Numeric - AddressNumber
         new BSSVDBField("F5642008.CITM"), // String - ItemNoCustomerVendor
         new BSSVDBField("F5642008.Z56CLITM"), // String - CustomerLongItemNumber
         new BSSVDBField("F5642008.Z56CAN8"), // Numeric - Partner
         new BSSVDBField("F5642008.SRL1"), // String - SerialNumber1
         new BSSVDBField("F5642008.Z56ACERT"), // Character - AirworthinessCertRequiredYN
         new BSSVDBField("F5642008.Z56MNSRL"), // String - MinSerialNumber
         new BSSVDBField("F5642008.Z56MXSRL"), // String - MaxSerialNumber
         new BSSVDBField("F5642008.Z56SRLCN"), // Numeric - SerialNumberCount
         new BSSVDBField("F5642008.CTR"), // String - Country
         new BSSVDBField("F5642008.PID"), // String - ProgramId
         new BSSVDBField("F5642008.USER"), // String - UserId
         new BSSVDBField("F5642008.JOBN"), // String - WorkStationId
         new BSSVDBField("F5642008.UPMT"), // Numeric - TimeLastUpdated
         new BSSVDBField("F5642008.UPMJ"), // Date - DateUpdated
         new BSSVDBField("F5642008.IAT01"), // Numeric - IATFutureMathNumeric01
         new BSSVDBField("F5642008.IAT02"), // Numeric - IATFutureMathNumeric02
         new BSSVDBField("F5642008.IAT03"), // Numeric - IATFutureMathNumeric03
         new BSSVDBField("F5642008.DATF01"), // Date - DateFuture01
         new BSSVDBField("F5642008.DATF02"), // Date - DateFuture02
         new BSSVDBField("F5642008.DATF03"), // Date - DateFuture03
         new BSSVDBField("F5642008.UD01"), // String - UseDescription1
         new BSSVDBField("F5642008.UD02"), // String - UseDescription2
         new BSSVDBField("F5642008.UD03"), // String - UseDescription3
         new BSSVDBField("F5642008.NZCF1"), // Character - FutureCharacter1
         new BSSVDBField("F5642008.NZCF2"), // Character - FutureCharacter2
         new BSSVDBField("F5642008.NZCF3") // Character - FutureCharacter3
         } ;

        //specify sort order
        BSSVDBSortField[] sortOrder = null;

        //specify condition records must meet to be selected
        BSSVDBWhereField[] whereFields =
        {new BSSVDBWhereField(null, new BSSVDBField("F5642008.UKID"), IDBService.EQUALS, internalVO.getQueryWhereFields().getF5642008_UKID())};

        BSSVDBWhereClauseBuilder whereClause =
            new BSSVDBWhereClauseBuilder(context, whereFields);

        BSSVDBResultSet resultSet = null;
        boolean selectDistinct = false;

        try {
            //get dbService from context
            IDBService dbService = context.getDBService();
            //execute db select operation
            resultSet = dbService.select(context, connection, "F5642008", IDBService.DB_TABLE, selectDistinct,
                 maxReturnedRows, selectFields, sortOrder, whereClause);
        } catch (DBServiceException e) {
            //TODO take some action in response to the database exception
            returnMessages.addMessage(new E1Message(context, "005FIS", e.getMessage()));
        }

        //process the results of the select
        if (resultSet != null) {
            BSSVDBFieldMap[] fieldMap = resultSet.getFieldMap();
            if (fieldMap != null && fieldMap.length > 0) {
                ArrayList queryResults = new ArrayList();
                for (int i = 0; i < fieldMap.length; i++) {
                    BSSVDBFieldMap map = fieldMap[i];
                    InternalShowPickSlipDetails result = new InternalShowPickSlipDetails();
                    result.setF5642008_UKID((MathNumeric)map.getValue("F5642008.UKID"));
                    result.setF5642008_N001((MathNumeric)map.getValue("F5642008.N001"));
                    result.setF5642008_PSN((MathNumeric)map.getValue("F5642008.PSN"));
                    result.setF5642008_KCOO((String)map.getValue("F5642008.KCOO"));
                    result.setF5642008_DOCO((MathNumeric)map.getValue("F5642008.DOCO"));
                    result.setF5642008_DCTO((String)map.getValue("F5642008.DCTO"));
                    result.setF5642008_LNID((MathNumeric)map.getValue("F5642008.LNID"));
                    result.setF5642008_MCU((String)map.getValue("F5642008.MCU"));
                    result.setF5642008_ITM((MathNumeric)map.getValue("F5642008.ITM"));
                    result.setF5642008_LITM((String)map.getValue("F5642008.LITM"));
                    result.setF5642008_DSC1((String)map.getValue("F5642008.DSC1"));
                    result.setF5642008_LOTN((String)map.getValue("F5642008.LOTN"));
                    result.setF5642008_VR01((String)map.getValue("F5642008.VR01"));
                    result.setF5642008_SOQS((MathNumeric)map.getValue("F5642008.SOQS"));
                    result.setF5642008_AN8((MathNumeric)map.getValue("F5642008.AN8"));
                    result.setF5642008_CITM((String)map.getValue("F5642008.CITM"));
                    result.setF5642008_Z56CLITM((String)map.getValue("F5642008.Z56CLITM"));
                    result.setF5642008_Z56CAN8((MathNumeric)map.getValue("F5642008.Z56CAN8"));
                    result.setF5642008_SRL1((String)map.getValue("F5642008.SRL1"));
                    result.setF5642008_Z56ACERT(map.getValue("F5642008.Z56ACERT").toString());
                    result.setF5642008_Z56MNSRL((String)map.getValue("F5642008.Z56MNSRL"));
                    result.setF5642008_Z56MXSRL((String)map.getValue("F5642008.Z56MXSRL"));
                    result.setF5642008_Z56SRLCN((MathNumeric)map.getValue("F5642008.Z56SRLCN"));
                    result.setF5642008_CTR((String)map.getValue("F5642008.CTR"));
                    result.setF5642008_PID((String)map.getValue("F5642008.PID"));
                    result.setF5642008_USER((String)map.getValue("F5642008.USER"));
                    result.setF5642008_JOBN((String)map.getValue("F5642008.JOBN"));
                    result.setF5642008_UPMT((MathNumeric)map.getValue("F5642008.UPMT"));
                    result.setF5642008_UPMJ((Date)map.getValue("F5642008.UPMJ"));
                    result.setF5642008_IAT01((MathNumeric)map.getValue("F5642008.IAT01"));
                    result.setF5642008_IAT02((MathNumeric)map.getValue("F5642008.IAT02"));
                    result.setF5642008_IAT03((MathNumeric)map.getValue("F5642008.IAT03"));
                    result.setF5642008_DATF01((Date)map.getValue("F5642008.DATF01"));
                    result.setF5642008_DATF02((Date)map.getValue("F5642008.DATF02"));
                    result.setF5642008_DATF03((Date)map.getValue("F5642008.DATF03"));
                    result.setF5642008_UD01((String)map.getValue("F5642008.UD01"));
                    result.setF5642008_UD02((String)map.getValue("F5642008.UD02"));
                    result.setF5642008_UD03((String)map.getValue("F5642008.UD03"));
                    result.setF5642008_NZCF1(map.getValue("F5642008.NZCF1").toString());
                    result.setF5642008_NZCF2(map.getValue("F5642008.NZCF2").toString());
                    result.setF5642008_NZCF3(map.getValue("F5642008.NZCF3").toString());
                    queryResults.add(result);
                }

                if (resultSet.hasMoreRows()) {
                    returnMessages.addMessage(new E1Message(context, "028FIS", ""));
                }

                //map results to internal vo
                internalVO.setQueryResults(queryResults);
            }
        }
        return returnMessages;
    }

    /**
     * Selects records from the F4211 table.
     * <p>Following SQL statement can be produced by this generated code
     * <blockquote><pre><code>
     * SELECT F4211.KCOO, F4211.DOCO, F4211.DCTO, F4211.LNID
     *
     * FROM F4211
     *
     * WHERE F4211.PSN=?
     *
     *
     * </code></pre></blockquote>
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param internalVO TODO document input parameters
     * @param maxReturnedRows the maximium number of rows returned from the select operation.
     * @return an E1Message containing the text of any database exceptions that may have occurred
     */
    private static E1MessageList selectFromF4211(IContext context, IConnection connection, InternalGetSODetailsKey internalVO,
        long maxReturnedRows) {
        //create return object
        E1MessageList returnMessages = new E1MessageList();

        //specify columns to select
        BSSVDBField[] selectFields =
        {new BSSVDBField("F4211.KCOO"), // String - CompanyKeyOrderNo
         new BSSVDBField("F4211.DOCO"), // Numeric - DocumentOrderInvoiceE
         new BSSVDBField("F4211.DCTO"), // String - OrderType
         new BSSVDBField("F4211.LNID") // Numeric - LineNumber
         } ;

        //specify sort order
        BSSVDBSortField[] sortOrder = null;

        //specify condition records must meet to be selected
        BSSVDBWhereField[] whereFields =
        {new BSSVDBWhereField(null, new BSSVDBField("F4211.PSN"), IDBService.EQUALS, internalVO.getQueryWhereFields().getF4211_PSN())};

        BSSVDBWhereClauseBuilder whereClause =
            new BSSVDBWhereClauseBuilder(context, whereFields);

        BSSVDBResultSet resultSet = null;
        boolean selectDistinct = false;

        try {
            //get dbService from context
            IDBService dbService = context.getDBService();
            //execute db select operation
            resultSet = dbService.select(context, connection, "F4211", IDBService.DB_TABLE, selectDistinct,
                 maxReturnedRows, selectFields, sortOrder, whereClause);
        } catch (DBServiceException e) {
            //TODO take some action in response to the database exception
            returnMessages.addMessage(new E1Message(context, "005FIS", e.getMessage()));
        }

        //process the results of the select
        if (resultSet != null) {
            BSSVDBFieldMap[] fieldMap = resultSet.getFieldMap();
            if (fieldMap != null && fieldMap.length > 0) {
                ArrayList queryResults = new ArrayList();
                for (int i = 0; i < fieldMap.length; i++) {
                    BSSVDBFieldMap map = fieldMap[i];
                    InternalShowSODetailsKey result = new InternalShowSODetailsKey();
                    result.setF4211_KCOO((String)map.getValue("F4211.KCOO"));
                    result.setF4211_DOCO((MathNumeric)map.getValue("F4211.DOCO"));
                    result.setF4211_DCTO((String)map.getValue("F4211.DCTO"));
                    result.setF4211_LNID((MathNumeric)map.getValue("F4211.LNID"));
                    queryResults.add(result);
                }

                if (resultSet.hasMoreRows()) {
                    returnMessages.addMessage(new E1Message(context, "028FIS", ""));
                }

                //map results to internal vo
                internalVO.setQueryResults(queryResults);
            }
        }
        return returnMessages;
    }

    /**
     * Updates one or more records in the F564211 table.
     * <p>Following SQL statement can be produced by this generated code
     * <blockquote><pre><code>
     * UPDATE F564211
     *
     * SET  F564211.Z56ACERT=?
     *
     * WHERE F564211.DOCO=? AND F564211.DCTO=? AND F564211.KCOO=? AND F564211.LNID=?
     *
     *
     * </code></pre></blockquote>
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param internalVO TODO document input parameters
     * @return an E1Message containing the text of any database exceptions that may have occurred
     */
    private static E1MessageList updateF564211(IContext context, IConnection connection, InternalUpdateSODetailsTag internalVO) {
        //create return object
        E1MessageList returnMessages = new E1MessageList();

        //specify columns to update
        BSSVDBField[] updateFields =
        {new BSSVDBField("F564211.Z56ACERT") // Character - AirworthinessCertRequiredYN
         } ;

        //specify update values
        Object[] updateValues = {internalVO.getUpdateFields().getF564211_Z56ACERT()
         };

        //specify condition records must meet to be updated
        BSSVDBWhereField[] whereFields =
        {new BSSVDBWhereField(null, new BSSVDBField("F564211.DOCO"), IDBService.EQUALS, internalVO.getUpdateWhereFields().getF564211_DOCO()),
         new BSSVDBWhereField(IDBService.AND, new BSSVDBField("F564211.DCTO"), IDBService.EQUALS, internalVO.getUpdateWhereFields().getF564211_DCTO()),
         new BSSVDBWhereField(IDBService.AND, new BSSVDBField("F564211.KCOO"), IDBService.EQUALS, internalVO.getUpdateWhereFields().getF564211_KCOO()),
         new BSSVDBWhereField(IDBService.AND, new BSSVDBField("F564211.LNID"), IDBService.EQUALS, internalVO.getUpdateWhereFields().getF564211_LNID())};

        BSSVDBWhereClauseBuilder whereClause =
            new BSSVDBWhereClauseBuilder(context, whereFields);

        try {
            //get dbService from context
            IDBService dbService = context.getDBService();
            //execute db update operation
            long numRecordsUpdated =
                dbService.update(context, connection, "F564211", IDBService.DB_TABLE, updateFields, updateValues, whereClause);
            // internalVO.setNumberRowsUpdated(numRecordsUpdated);
        } catch (DBServiceException e) {
            //TODO take some action in response to the database exception
            returnMessages.addMessage(new E1Message(context, "005FIS", e.getMessage()));
        }

        return returnMessages;
    }
}
