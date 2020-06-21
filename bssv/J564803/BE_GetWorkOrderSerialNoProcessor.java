package be.e1.bssv.J564803;

import be.e1.bssv.J564803.valueobject.InternalGetWorkOrderSerialNo;

import be.e1.bssv.J564803.valueobject.InternalShowWorkOrderSerialNo;

import java.util.ArrayList;

import oracle.e1.bssvfoundation.base.BusinessService;
import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.DBServiceException;
import oracle.e1.bssvfoundation.services.BSSVDBField;
import oracle.e1.bssvfoundation.services.BSSVDBFieldMap;
import oracle.e1.bssvfoundation.services.BSSVDBResultSet;
import oracle.e1.bssvfoundation.services.BSSVDBSortDirection;
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
public abstract class BE_GetWorkOrderSerialNoProcessor extends BusinessService {
  
 
  /**
   * TODO: Create Java Doc for: GetWorkOrderSerialNoProcessor
   * Method GetWorkOrderSerialNoProcessor is used for...?
   * @param context conditionally provides the connection for the database operation and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
   * @return an E1Message containing the text of any errors or warnings that may have occurred
   */
  public static E1MessageList GetWorkOrderSerialNoProcessor(IContext context, IConnection connection, InternalGetWorkOrderSerialNo internalVO) {



    //Call start internal method, passing the context (which was passed from PublishedBusinessService).
    startInternalMethod(context, "GetWorkOrderSerialNoProcessor", internalVO);
    //Create new message list for BusinessService processing.
    E1MessageList messages = new E1MessageList();
    
    //TODO: call method (created by the wizard), which then executes Business Function or Database operation.
   E1MessageList dbMessages = selectFromV564801K(context, connection, internalVO);
    //TODO:  add messages returned from E1 processing to BusinessService message list.
    messages.addMessages(dbMessages);

    //Call finish internal method passing context.
    finishInternalMethod(context, "GetWorkOrderSerialNoProcessor");

    //Call finish internal method passing context.
    return messages;
  }

  /**
   * Selects records from the V564801K business view.
   * <p>Following SQL statement can be produced by this generated code
   * <blockquote><pre><code>
   * SELECT F4801.DOCO, F4801.DCTO, F4220.SRL1, F4801.LITM
   *
   * FROM V564801K
   *
   * WHERE F4801T.DOCO=? AND F4801.LITM=? AND F4801T.PMPN=?
   *
   * ORDER BY F4801.DOCO ASC, F4220.SRL1 ASC
   * </code></pre></blockquote>
   * @param context conditionally provides the connection for the database operation and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @param internalVO TODO document input parameters
   * @param maxReturnedRows the maximium number of rows returned from the select operation.
   * @return an E1Message containing the text of any database exceptions that may have occurred
   */
  private static E1MessageList selectFromV564801K(IContext context, IConnection connection, InternalGetWorkOrderSerialNo internalVO) {
    //create return object
    E1MessageList returnMessages = new E1MessageList();

    //specify columns to select
    BSSVDBField[] selectFields =
    {new BSSVDBField("F4801.DOCO"), // Numeric - DocumentOrderInvoiceE
         new BSSVDBField("F4801.DCTO"), // String - OrderType
         new BSSVDBField("F4220.SRL1"), // String - SerialNumber1
         new BSSVDBField("F4801.LITM") // String - Identifier2ndItem
         } ;

    //specify sort order
    BSSVDBSortField[] sortOrder =
    {new BSSVDBSortField(new BSSVDBField("F4801.DOCO"), BSSVDBSortDirection.ASCENDING),
         new BSSVDBSortField(new BSSVDBField("F4220.SRL1"), BSSVDBSortDirection.ASCENDING)};

    //specify condition records must meet - assume inputs are optional
    ArrayList whereFieldsList = new ArrayList();
    if (internalVO.getQueryWhereFields().getF4801_DOCO() != null) {
      whereFieldsList.add(new BSSVDBWhereField(null, new BSSVDBField("F4801.DOCO"), IDBService.EQUALS, internalVO.getQueryWhereFields().getF4801_DOCO()));
    }
    if (internalVO.getQueryWhereFields().getF4801_LITM() != null) {
      whereFieldsList.add(new BSSVDBWhereField(IDBService.AND, new BSSVDBField("F4801.LITM"), IDBService.EQUALS, internalVO.getQueryWhereFields().getF4801_LITM()));
    }
    if (internalVO.getQueryWhereFields().getF4801T_PMPN() != null) {
      whereFieldsList.add(new BSSVDBWhereField(IDBService.AND, new BSSVDBField("F4801T.PMPN"), IDBService.EQUALS, internalVO.getQueryWhereFields().getF4801T_PMPN()));
    }

    //TODO: CHECK FOR EMPTY whereFieldsList ARRAY LIST
    BSSVDBWhereField[] whereFields = new BSSVDBWhereField[whereFieldsList.size()];
    whereFieldsList.toArray(whereFields);
    BSSVDBWhereClauseBuilder whereClause =
      new BSSVDBWhereClauseBuilder(context, whereFields);

    BSSVDBResultSet resultSet = null;
    boolean selectDistinct = false;

    try {
      //get dbService from context
      IDBService dbService = context.getDBService();
      //execute db select operation
      resultSet = dbService.select(context, connection, "V564801K", IDBService.DB_BSVW, selectDistinct,
                 IDBService.DB_FETCH_ALL, selectFields, sortOrder, whereClause);
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
          InternalShowWorkOrderSerialNo result = new InternalShowWorkOrderSerialNo();
          result.setF4801_DOCO((MathNumeric)map.getValue("F4801.DOCO"));
          result.setF4801_DCTO((String)map.getValue("F4801.DCTO"));
          result.setF4220_SRL1((String)map.getValue("F4220.SRL1"));
          result.setF4801_LITM((String)map.getValue("F4801.LITM"));
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
}
