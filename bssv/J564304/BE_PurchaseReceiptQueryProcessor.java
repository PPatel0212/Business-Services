package be.e1.bssv.J564304;

import be.e1.bssv.J564304.valueobject.InternalGetF43121;

import be.e1.bssv.J564304.valueobject.InternalShowF43121Field;

import java.util.ArrayList;

import oracle.e1.bssvfoundation.base.BusinessService;
import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.DBServiceException;
import oracle.e1.bssvfoundation.services.BSSVDBField;
import oracle.e1.bssvfoundation.services.BSSVDBFieldMap;
import oracle.e1.bssvfoundation.services.BSSVDBResultSet;
import oracle.e1.bssvfoundation.services.BSSVDBSortField;
import oracle.e1.bssvfoundation.services.BSSVDBWhereClauseBuilder;
import oracle.e1.bssvfoundation.services.BSSVDBWhereField;
import oracle.e1.bssvfoundation.services.IDBService;
import oracle.e1.bssvfoundation.util.E1Message;
import oracle.e1.bssvfoundation.util.E1MessageList;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc for BusinessService
 */
public abstract class BE_PurchaseReceiptQueryProcessor extends BusinessService {
    /**
     * TODO: Create Java Doc for: getF43121Record
     * Method getF43121Record is used for...?
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
     * @return an E1Message containing the text of any errors or warnings that may have occurred
     */
    public static E1MessageList getF43121Record(IContext context,
                                                IConnection connection,
                                                InternalGetF43121 internalVO) {

        //Call start internal method, passing the context (which was passed from PublishedBusinessService).
        startInternalMethod(context, "getF43121Record", internalVO);
        //Create new message list for BusinessService processing.
        E1MessageList messages = new E1MessageList();

        //TODO: call method (created by the wizard), which then executes Business Function or Database operation.
        long maxReturnedRows = 10;

        E1MessageList dbMessages =
            selectFromF43121(context, connection, internalVO, maxReturnedRows);
        //TODO:  add messages returned from E1 processing to BusinessService message list.
        messages.addMessages(dbMessages);

        //Call finish internal method passing context.
        finishInternalMethod(context, "getF43121Record");

        //Call finish internal method passing context.
        return messages;
    }

    /**
     * Selects records from the F43121 table.
     * <p>Following SQL statement can be produced by this generated code
     * <blockquote><pre><code>
     * SELECT F43121.DOC
     *
     * FROM F43121
     *
     * WHERE F43121.MATC=? AND F43121.KCOO=? AND F43121.DOCO=? AND F43121.DCTO=? AND F43121.LNID=?
     *
     *
     * </code></pre></blockquote>
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param internalVO TODO document input parameters
     * @param maxReturnedRows the maximium number of rows returned from the select operation.
     * @return an E1Message containing the text of any database exceptions that may have occurred
     */
    private static E1MessageList selectFromF43121(IContext context,
                                                  IConnection connection,
                                                  InternalGetF43121 internalVO,
                                                  long maxReturnedRows) {
        //create return object
        E1MessageList returnMessages = new E1MessageList();

        //specify columns to select
        BSSVDBField[] selectFields =
        { new BSSVDBField("F43121.DOC") // Numeric - DocVoucherInvoiceE
            } ;

        //specify sort order
        BSSVDBSortField[] sortOrder = null;


        //specify condition records must meet to be selected
        BSSVDBWhereField[] whereFields =
        { new BSSVDBWhereField(null, new BSSVDBField("F43121.MATC"),
                               IDBService.EQUALS,
                               internalVO.getInternalGetF43121WhereFields().getF43121_MATC()),
          new BSSVDBWhereField(IDBService.AND, new BSSVDBField("F43121.KCOO"),
                               IDBService.EQUALS,
                               internalVO.getInternalGetF43121WhereFields().getF43121_KCOO()),
          new BSSVDBWhereField(IDBService.AND, new BSSVDBField("F43121.DOCO"),
                               IDBService.EQUALS,
                               internalVO.getInternalGetF43121WhereFields().getF43121_DOCO()),
          new BSSVDBWhereField(IDBService.AND, new BSSVDBField("F43121.DCTO"),
                               IDBService.EQUALS,
                               internalVO.getInternalGetF43121WhereFields().getF43121_DCTO()),
          new BSSVDBWhereField(IDBService.AND, new BSSVDBField("F43121.LNID"),
                               IDBService.EQUALS,
                               internalVO.getInternalGetF43121WhereFields().getF43121_LNID()) };

        BSSVDBWhereClauseBuilder whereClause =
            new BSSVDBWhereClauseBuilder(context, whereFields);

        BSSVDBResultSet resultSet = null;
        boolean selectDistinct = false;

        try {
            //get dbService from context
            IDBService dbService = context.getDBService();
            //execute db select operation
            resultSet =
                    dbService.select(context, connection, "F43121", IDBService.DB_TABLE,
                                     selectDistinct, maxReturnedRows,
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
                    InternalShowF43121Field result =
                        new InternalShowF43121Field();
                    result.setF43121_DOC((MathNumeric)map.getValue("F43121.DOC"));
                    queryResults.add(result);
                }

                if (resultSet.hasMoreRows()) {
                    returnMessages.addMessage(new E1Message(context, "028FIS",
                                                            ""));
                }

                //map results to internal vo
                internalVO.setQueryResult(queryResults);

            }
        }
        return returnMessages;
    }
}
