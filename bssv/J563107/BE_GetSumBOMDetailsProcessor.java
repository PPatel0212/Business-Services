package be.e1.bssv.J563107;


import be.e1.bssv.J563107.valueobject.InternalGetSerial;
import be.e1.bssv.J563107.valueobject.InternalGetStockingType;
import be.e1.bssv.J563107.valueobject.InternalGetSumBOMDetails;
import be.e1.bssv.J563107.valueobject.InternalShowSerial;
import be.e1.bssv.J563107.valueobject.InternalShowSumBOMDetails;

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
public abstract class BE_GetSumBOMDetailsProcessor extends BusinessService {
  /**
   * TODO: Create Java Doc for: getSumBOMDetails
   * Method getSumBOMDetails is used for...?
   * @param context conditionally provides the connection for the database operation and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
   * @return an E1Message containing the text of any errors or warnings that may have occurred
   */
  public static E1MessageList getSumBOMDetails(IContext context,
                                               IConnection connection,
                                               InternalGetSumBOMDetails internalVO) {

    //Call start internal method, passing the context (which was passed from PublishedBusinessService).
    startInternalMethod(context, "getSumBOMDetails", internalVO);
    //Create new message list for BusinessService processing.
    E1MessageList messages = new E1MessageList();
    //TODO: call method (created by the wizard), which then executes Business Function or Database operation.
    messages.addMessages(selectFromV5631007(context, connection, internalVO));
    if (!messages.hasErrors()&& internalVO.getQueryResults()!=null ) {
      // Read all records based on Sales/ Sum BOM Table.
      if (internalVO.getQueryResults().size() > 0) {
        ArrayList querySumBOMResults = new ArrayList();
        for (int i = 0; i < internalVO.getQueryResults().size(); i++) {
          InternalGetStockingType getStockingType =
            new InternalGetStockingType();
          InternalShowSumBOMDetails sumBOMDetails =
            new InternalShowSumBOMDetails();
          InternalGetSerial getSerial = new InternalGetSerial();
          InternalShowSerial showSerial = new InternalShowSerial();
          sumBOMDetails = internalVO.getQueryResults(i);
          
          //Get Stocking Type of F4211.LITM
          // if F4211.LITM = Manufactured Item then do the following
          //if F4211.LITM = F5631006.KITL and F5631006.STKT = "M" then get Work Order Details based on F5631006.LITM and F4211.PMPN

          getStockingType.setF4102_ITM(sumBOMDetails.getF4211_ITM());
          getStockingType.setF4102_MCU(sumBOMDetails.getF4211_MCU());
          getStockingType.setSRNR_Flag("N");
          selectFromF4102(context, connection, getStockingType);

          
        if(getStockingType.getF4102_STKT()!=null)
          if (getStockingType.getF4102_STKT().trim().equalsIgnoreCase("M")) {
            // if F4211.LITM = F5631006.KITL determines it's first level of BOM so , send Serial No of Child Item
            // if Child Item (F5631006.LITM) is Manufacture (M), get Serial no of Child Item else for Parent Item
            /* if (sumBOMDetails.getF4211_LITM().trim().equals(sumBOMDetails.getF5631006_KITL().trim())) {
              if (sumBOMDetails.getF5631006_STKT().trim().equalsIgnoreCase("M")) {
                getSerial.setF4801_LITM(sumBOMDetails.getF5631006_LITM());
              } else {
                getSerial.setF4801_LITM(sumBOMDetails.getF4211_LITM());
              } */

            getSerial.setF4801_LITM(sumBOMDetails.getF5631006_LITM());
              getSerial.setF4801T_PMPN(sumBOMDetails.getF4211_PMPN());
              selectFromV564801K(context, connection, getSerial);
            if (getSerial.getQueryResults()!=null)
              if (getSerial.getQueryResults().size() > 0) {
                ArrayList woArrayList = new ArrayList();
                for (int j = 0; j < getSerial.getQueryResults().size(); j++) {
                  showSerial = getSerial.getQueryResults(j);
                  woArrayList.add(showSerial);
                }
                sumBOMDetails.setInternalGetSerial(woArrayList);
              }
            
          }
          // Get SRNR Required Y/N from F4102 based on F5631006 ITM
          getStockingType.setF4102_ITM(sumBOMDetails.getF5631006_ITM());
          getStockingType.setF4102_MCU(sumBOMDetails.getF4211_MCU());
          getStockingType.setSRNR_Flag("Y");
          selectFromF4102(context, connection, getStockingType);
          sumBOMDetails.setF4102_SRNR(getStockingType.getF4102_SRNR());
          querySumBOMResults.add(sumBOMDetails);
        } 
      internalVO.setQueryResults(querySumBOMResults);
      }
    }
    //TODO:  add messages returned from E1 processing to BusinessService message list.
    //Call finish internal method passing context.
    finishInternalMethod(context, "getSumBOMDetails");
    
    return messages;
  }

  /**
   * Selects records from the V5631007 business view.
   * <p>Following SQL statement can be produced by this generated code
   * <blockquote><pre><code>
   * SELECT F4211.DOCO, F4211.DCTO, F5631006.LITM, F5631006.MCU, F5631006.STKT, F5631006.KITL, F5631006.KIT, F4211.MCU, F4211.PMPN, F4211.ITM, F4211.LITM, F5631006.UORG, F5631006.MERL, F5631006.DSC1, F5631006.ITM
   *
   * FROM V5631007
   *
   * WHERE F4211.DOCO=? AND F4211.DCTO=? AND F4211.PMPN=? AND F4211.LITM=? AND F4211.MCU=?
   *
   *
   * </code></pre></blockquote>
   * @param context conditionally provides the connection for the database operation and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @param internalVO TODO document input parameters
   * @param maxReturnedRows the maximium number of rows returned from the select operation.
   * @return an E1Message containing the text of any database exceptions that may have occurred
   */
  private static E1MessageList selectFromV5631007(IContext context,
                                                  IConnection connection,
                                                  InternalGetSumBOMDetails internalVO) {
    //create return object
    E1MessageList returnMessages = new E1MessageList();

    //specify columns to select
    BSSVDBField[] selectFields =
    { new BSSVDBField("F4211.DOCO"), // Numeric - DocumentOrderInvoiceE
      new BSSVDBField("F4211.DCTO"), // String - OrderType
      new BSSVDBField("F5631006.LITM"), // String - Identifier2ndItem
      new BSSVDBField("F5631006.MCU"), // String - CostCenter
      new BSSVDBField("F5631006.STKT"), // Character - StockingType
      new BSSVDBField("F5631006.KITL"), // String - ItemNumber2ndKit
      new BSSVDBField("F5631006.KIT"), // Numeric - ItemNumberShortKit
      new BSSVDBField("F4211.MCU"), // String - CostCenter
      new BSSVDBField("F4211.PMPN"), // String - ProductionNumber
      new BSSVDBField("F4211.ITM"), // Numeric - IdentifierShortItem
      new BSSVDBField("F4211.LITM"), // String - Identifier2ndItem
      new BSSVDBField("F5631006.UORG"), // Numeric - UnitsTransactionQty
      new BSSVDBField("F5631006.MERL"), // String - MeRevisionLevel
      new BSSVDBField("F5631006.DSC1"), // String - DescriptionLine1
      new BSSVDBField("F5631006.ITM") // Numeric - IdentifierShortItem
      } ;

    //specify sort order
    BSSVDBSortField[] sortOrder = null;

    //specify condition records must meet - assume inputs are optional
    ArrayList whereFieldsList = new ArrayList();
    if (internalVO.getQueryWhereFields().getF4211_DOCO() != null) {
      whereFieldsList.add(new BSSVDBWhereField(null,
                                               new BSSVDBField("F4211.DOCO"),
                                               IDBService.EQUALS,
                                               internalVO.getQueryWhereFields().getF4211_DOCO()));
    }
    if (internalVO.getQueryWhereFields().getF4211_DCTO() != null) {
      whereFieldsList.add(new BSSVDBWhereField(IDBService.AND,
                                               new BSSVDBField("F4211.DCTO"),
                                               IDBService.EQUALS,
                                               internalVO.getQueryWhereFields().getF4211_DCTO()));
    }
    if (internalVO.getQueryWhereFields().getF4211_PMPN() != null) {
      whereFieldsList.add(new BSSVDBWhereField(IDBService.AND,
                                               new BSSVDBField("F4211.PMPN"),
                                               IDBService.EQUALS,
                                               internalVO.getQueryWhereFields().getF4211_PMPN()));
    }
    if (internalVO.getQueryWhereFields().getF4211_LITM() != null) {
      whereFieldsList.add(new BSSVDBWhereField(IDBService.AND,
                                               new BSSVDBField("F4211.LITM"),
                                               IDBService.EQUALS,
                                               internalVO.getQueryWhereFields().getF4211_LITM()));
    }
    if (internalVO.getQueryWhereFields().getF4211_MCU() != null) {
      whereFieldsList.add(new BSSVDBWhereField(IDBService.AND,
                                               new BSSVDBField("F4211.MCU"),
                                               IDBService.EQUALS,
                                               internalVO.getQueryWhereFields().getF4211_MCU()));
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
          dbService.select(context, connection, "V5631007", IDBService.DB_BSVW,
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
          InternalShowSumBOMDetails result = new InternalShowSumBOMDetails();
          result.setF4211_DOCO((MathNumeric)map.getValue("F4211.DOCO"));
          result.setF4211_DCTO((String)map.getValue("F4211.DCTO"));
          result.setF5631006_LITM((String)map.getValue("F5631006.LITM"));
          result.setF5631006_STKT(map.getValue("F5631006.STKT").toString());
          result.setF5631006_KITL((String)map.getValue("F5631006.KITL"));
          result.setF5631006_KIT((MathNumeric)map.getValue("F5631006.KIT"));
          result.setF4211_MCU((String)map.getValue("F4211.MCU"));
          result.setF4211_PMPN((String)map.getValue("F4211.PMPN"));
          result.setF4211_ITM((MathNumeric)map.getValue("F4211.ITM"));
          result.setF4211_LITM((String)map.getValue("F4211.LITM"));
          result.setF5631006_UORG((MathNumeric)map.getValue("F5631006.UORG"));
          result.setF5631006_MERL((String)map.getValue("F5631006.MERL"));
          result.setF5631006_DSC1((String)map.getValue("F5631006.DSC1"));
          result.setF5631006_ITM((MathNumeric)map.getValue("F5631006.ITM"));
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
   * Selects records from the F4102 table.
   * <p>Following SQL statement can be produced by this generated code
   * <blockquote><pre><code>
   * SELECT F4102.STKT
   *
   * FROM F4102
   *
   * WHERE F4102.ITM=? AND F4102.MCU=?
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
                                               InternalGetStockingType internalVO) {
    //create return object
    E1MessageList returnMessages = new E1MessageList();

    //specify columns to select
    BSSVDBField[] selectFields =
    { new BSSVDBField("F4102.STKT"), // Character - StockingType
      new BSSVDBField("F4102.SRNR") // Character - Serial No Reqd Y/N
      } ;

    //specify sort order
    BSSVDBSortField[] sortOrder = null;

    //specify condition records must meet to be selected
    BSSVDBWhereField[] whereFields =
    { new BSSVDBWhereField(null, new BSSVDBField("F4102.ITM"),
                           IDBService.EQUALS, internalVO.getF4102_ITM()),
      new BSSVDBWhereField(IDBService.AND, new BSSVDBField("F4102.MCU"),
                           IDBService.EQUALS, internalVO.getF4102_MCU()) };

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
          if(internalVO.getSRNR_Flag().trim().equalsIgnoreCase("Y"))
          internalVO.setF4102_SRNR(map.getValue("F4102.SRNR").toString());
          internalVO.setF4102_STKT(map.getValue("F4102.STKT").toString());
          
        }

        if (resultSet.hasMoreRows()) {
          returnMessages.addMessage(new E1Message(context, "028FIS", ""));
        }

      }
    }
    return returnMessages;
  }

  /**
   * Selects records from the V564801K business view.
   * <p>Following SQL statement can be produced by this generated code
   * <blockquote><pre><code>
   * SELECT F4801.DOCO, F4801.DCTO, F4220.SRL1
   *
   * FROM V564801K
   *
   * WHERE F4801.LITM=? AND F4801T.PMPN=?
   *
   *
   * </code></pre></blockquote>
   * @param context conditionally provides the connection for the database operation and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @param internalVO TODO document input parameters
   * @param maxReturnedRows the maximium number of rows returned from the select operation.
   * @return an E1Message containing the text of any database exceptions that may have occurred
   */
  private static E1MessageList selectFromV564801K(IContext context,
                                                  IConnection connection,
                                                  InternalGetSerial internalVO) {
    //create return object
    E1MessageList returnMessages = new E1MessageList();

    //specify columns to select
    BSSVDBField[] selectFields =
    { new BSSVDBField("F4801.DOCO"), // Numeric - DocumentOrderInvoiceE
      new BSSVDBField("F4801.DCTO"), // String - OrderType
      new BSSVDBField("F4220.SRL1") // String - SerialNumber1
      } ;

    //specify sort order
    BSSVDBSortField[] sortOrder = null;

    //specify condition records must meet to be selected
    BSSVDBWhereField[] whereFields =
    { new BSSVDBWhereField(null, new BSSVDBField("F4801.LITM"),
                           IDBService.EQUALS, internalVO.getF4801_LITM()),
      new BSSVDBWhereField(IDBService.AND, new BSSVDBField("F4801T.PMPN"),
                           IDBService.EQUALS, internalVO.getF4801T_PMPN()) };

    BSSVDBWhereClauseBuilder whereClause =
      new BSSVDBWhereClauseBuilder(context, whereFields);

    BSSVDBResultSet resultSet = null;
    boolean selectDistinct = false;

    try {
      //get dbService from context
      IDBService dbService = context.getDBService();
      //execute db select operation
      resultSet =
          dbService.select(context, connection, "V564801K", IDBService.DB_BSVW,
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
          InternalShowSerial result = new InternalShowSerial();
          result.setF4801_DOCO((MathNumeric)map.getValue("F4801.DOCO"));
          result.setF4801_DCTO((String)map.getValue("F4801.DCTO"));
          result.setF4220_SRL1((String)map.getValue("F4220.SRL1"));
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
