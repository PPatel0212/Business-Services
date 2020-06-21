package be.e1.bssv.J563106;


import be.e1.bssv.J563106.valueobject.InternalGetSalesDetails;
import be.e1.bssv.J563106.valueobject.InternalGetSerialNo;
import be.e1.bssv.J563106.valueobject.InternalGetStockingType;
import be.e1.bssv.J563106.valueobject.InternalGetSumBOMDetails;
import be.e1.bssv.J563106.valueobject.InternalShowSalesDetails;
import be.e1.bssv.J563106.valueobject.InternalShowSerialNo;
import be.e1.bssv.J563106.valueobject.InternalShowSumBOM;

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
import oracle.e1.bssvfoundation.util.MathNumeric;


/**
 * TODO: Java Doc for BusinessService
 */
public abstract class BE_GetSumBOMDetailsProcessor extends BusinessService {
  /**
   * TODO: Create Java Doc for: getSUMBOMDetail
   * Method getSUMBOMDetail is used for...?
   * @param context conditionally provides the connection for the database operation and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
   * @return an E1Message containing the text of any errors or warnings that may have occurred
   */
  public static E1MessageList getSUMBOMDetail(IContext context,
                                              IConnection connection,
                                              InternalGetSumBOMDetails internalVO) {

    //Call start internal method, passing the context (which was passed from PublishedBusinessService).
    startInternalMethod(context, "getSUMBOMDetail", internalVO);
    //Create new message list for BusinessService processing.
    E1MessageList messages = new E1MessageList();
    InternalGetSalesDetails getsalesDetails = new InternalGetSalesDetails();

    getsalesDetails.setF4211_DOCO(internalVO.getQueryWhereFields().getF4211_DOCO());
    getsalesDetails.setF4211_DCTO(internalVO.getQueryWhereFields().getF4211_DCTO());
    getsalesDetails.setF4211_MCU(internalVO.getQueryWhereFields().getF4211_MCU());
    getsalesDetails.setF4211_PMPN(internalVO.getQueryWhereFields().getF4211_PMPN());
    getsalesDetails.setF4211_LITM(internalVO.getQueryWhereFields().getF4211_LITM());

    //TODO: call method (created by the wizard), which then executes Business Function or Database operation.
    /* messages.addMessages(selectFromV5631007(context, connection,
                                            getsalesDetails)); */
  messages.addMessages(selectFromV5631007_1(context, connection,  getsalesDetails));
    //TODO:  add messages returned from E1 processing to BusinessService message list.
    if (!messages.hasErrors()) {
      // Read all records based on Sales/ Sum BOM Table.
    if(getsalesDetails.getQueryResults()!=null)
      if (getsalesDetails.getQueryResults().size() > 0) {
        ArrayList queryResult = new ArrayList();
        int arrayPosition = 0;
        for (int i = 0; i < getsalesDetails.getQueryResults().size(); i++) {

          InternalGetSerialNo getSerialNo = new InternalGetSerialNo();
          InternalGetStockingType getStockingType =
            new InternalGetStockingType();
          InternalShowSalesDetails showSalesDetails =
            new InternalShowSalesDetails();
          InternalShowSerialNo showSerialNo = new InternalShowSerialNo();
          InternalShowSumBOM showSumBOM = new InternalShowSumBOM();


          showSalesDetails = getsalesDetails.getQueryResults(i);
          //showSumBOM = internalVO.getQueryResults(arrayPosition);

          //Get Stocking Type of F4211.LITM
          // if F4211.LITM = Manufactured Item then do the following
          //if F4211.LITM = F5631006.KITL and F5631006.STKT = "M" then get Work Order Details based on F5631006.LITM and F4211.PMPN

          getStockingType.setCSuppressErrorMessage("1");
          getStockingType.setMnIdentifierShortItem(showSalesDetails.getF4211_ITM());
          getStockingType.setSzCostCenter(showSalesDetails.getF4211_MCU());
          callF4102FetchSingleLtdSelect(context, connection, getStockingType);
          if(getStockingType.getCStockingType()!=null)
          if (getStockingType.getCStockingType().trim().equalsIgnoreCase("M")) {
            // if F4211.LITM = F5631006.KITL determines it's first level of BOM so , send Serial No of Child Item
            // if Child Item (F5631006.LITM) is Manufacture (M), get Serial no of Child Item else for Parent Item
            if (showSalesDetails.getF4211_LITM().trim().equals(showSalesDetails.getF5631006_KITL().trim())){
              if (showSalesDetails.getF5631006_STKT().trim().equalsIgnoreCase("M")) {
                getSerialNo.setF4801_LITM(showSalesDetails.getF5631006_LITM());
              } else {
                getSerialNo.setF4801_LITM(showSalesDetails.getF4211_LITM());
              }

            getSerialNo.setF4801T_PMPN(showSalesDetails.getF4211_PMPN());
            selectFromV564801K(context, connection, getSerialNo);
            if(getSerialNo.getQueryResults()!= null)
            if (getSerialNo.getQueryResults().size() > 0) {
              ArrayList woArrayList = new ArrayList();
              for (int j = 0; j < getSerialNo.getQueryResults().size(); j++) {
               callFetchF4102ItemBranchRecordByBU(context, connection, getStockingType);
                showSerialNo.setF4102_SRNR(getStockingType.getCSerialNoRequiredYN());
                showSerialNo = getSerialNo.getQueryResults(j);
                woArrayList.add(showSerialNo);
              }
              showSalesDetails.setQueryWOResults(woArrayList);
            }

          }
          }
          /* showSumBOM.setF4211_DCTO(showSalesDetails.getF4211_DCTO());
          showSumBOM.setF4211_DOCO(showSalesDetails.getF4211_DOCO());
          showSumBOM.setF4211_LITM(showSalesDetails.getF4211_LITM());
          showSumBOM.setF4211_MCU(showSalesDetails.getF4211_MCU());
          showSumBOM.setF4211_PMPN(showSalesDetails.getF4211_PMPN());
          showSumBOM.setF5631006_KITL(showSalesDetails.getF5631006_KITL());
          showSumBOM.setF5631006_LITM(showSalesDetails.getF5631006_LITM());

          if (showSalesDetails.getQueryWOResults().size() > 0) {
            for (int k = 0; k < showSalesDetails.getQueryWOResults().size();
                 k++) {
              showSumBOM.setF4801_DCTO(showSalesDetails.getQueryWOResults(k).getF4801_DCTO());
              showSumBOM.setF4801_DOCO(showSalesDetails.getQueryWOResults(k).getF4801_DOCO());
              showSumBOM.setF4220_SRL1(showSalesDetails.getQueryWOResults(k).getF4220_SRL1());
            }
          } */

          queryResult.add(showSalesDetails);
        }
        internalVO.setQueryResults(queryResult);
        //Call finish internal method passing context.
        finishInternalMethod(context, "getSUMBOMDetail");

      }
    }
    //Call finish internal method passing context.
    return messages;
  }

  /**
   * Selects records from the V5631007 business view.
   * <p>Following SQL statement can be produced by this generated code
   * <blockquote><pre><code>
   * SELECT F5631006.LITM, F4211.DOCO, F4211.DCTO, F5631006.STKT, F5631006.KITL, F5631006.KIT, F4211.MCU, F4211.PMPN, F4211.ITM, F4211.LITM
   *
   * FROM V5631007
   *
   * WHERE F4211.DOCO=? AND F4211.DCTO=? AND F4211.MCU=? AND F4211.LITM=? AND F4211.PMPN=?
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
                                                  InternalGetSalesDetails internalVO) {
    //create return object
      E1MessageList returnMessages = new E1MessageList();

    //specify columns to select
    BSSVDBField[] selectFields =
    { 
      new BSSVDBField("F4211.DOCO"), // Numeric - DocumentOrderInvoiceE
      new BSSVDBField("F4211.DCTO"), // String - OrderType
      new BSSVDBField("F4211.MCU"), // String - CostCenter
      new BSSVDBField("F4211.PMPN"), // String - ProductionNumber
      new BSSVDBField("F4211.ITM"), // Numeric - IdentifierShortItem
      new BSSVDBField("F4211.LITM"), // String - Identifier2ndItem
      
      new BSSVDBField("F5631006.STKT"), // Character - StockingType
      new BSSVDBField("F5631006.KITL"), // String - ItemNumber2ndKit
      new BSSVDBField("F5631006.KIT"), //  Numeric - ItemNumberShortKit
      new BSSVDBField("F5631006.LITM"), // String - Identifier2ndItem
      new BSSVDBField("F5631006.ITM"), //  String - ItemNumberShort
      new BSSVDBField("F5631006.DSC1"), // String - Description1
      new BSSVDBField("F5631006.MERL"), // String - ItemRevision
      new BSSVDBField("F5631006.UORG") //  String - Quantity
      } ;

    //specify sort order
    BSSVDBSortField[] sortOrder = null;

    //specify condition records must meet - assume inputs are optional
    ArrayList whereFieldsList = new ArrayList();
    if (internalVO.getF4211_DOCO() != null) {
      whereFieldsList.add(new BSSVDBWhereField(null,
                                               new BSSVDBField("F4211.DOCO"),
                                               IDBService.EQUALS,
                                               internalVO.getF4211_DOCO()));
    }
    if (internalVO.getF4211_DCTO() != null) {
      whereFieldsList.add(new BSSVDBWhereField(IDBService.AND,
                                               new BSSVDBField("F4211.DCTO"),
                                               IDBService.EQUALS,
                                               internalVO.getF4211_DCTO()));
    }
    if (internalVO.getF4211_MCU() != null) {
      whereFieldsList.add(new BSSVDBWhereField(IDBService.AND,
                                               new BSSVDBField("F4211.MCU"),
                                               IDBService.EQUALS,
                                               internalVO.getF4211_MCU()));
    }
    if (internalVO.getF4211_LITM() != null) {
      whereFieldsList.add(new BSSVDBWhereField(IDBService.AND,
                                               new BSSVDBField("F4211.LITM"),
                                               IDBService.EQUALS,
                                               internalVO.getF4211_LITM()));
    }
    if (internalVO.getF4211_PMPN() != null) {
      whereFieldsList.add(new BSSVDBWhereField(IDBService.AND,
                                               new BSSVDBField("F4211.PMPN"),
                                               IDBService.EQUALS,
                                               internalVO.getF4211_PMPN()));
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
          InternalShowSalesDetails result = new InternalShowSalesDetails();
          
          result.setF4211_DOCO((MathNumeric)map.getValue("F4211.DOCO"));
          result.setF4211_DCTO((String)map.getValue("F4211.DCTO"));
          result.setF4211_MCU((String)map.getValue("F4211.MCU"));
          result.setF4211_PMPN((String)map.getValue("F4211.PMPN"));
          result.setF4211_ITM((MathNumeric)map.getValue("F4211.ITM"));
          result.setF4211_LITM((String)map.getValue("F4211.LITM"));
          
          result.setF5631006_STKT((String)map.getValue("F5631006.STKT"));
          result.setF5631006_KITL((String)map.getValue("F5631006.KITL"));
          result.setF5631006_KIT((MathNumeric)map.getValue("F5631006.KIT"));
          result.setF5631006_LITM((String)map.getValue("F5631006.LITM"));
          result.setF5631006_ITM((MathNumeric)map.getValue("F5631006.ITM"));
          result.setF5631006_DSC1((String)map.getValue("F5631006.DSC1"));
          result.setF5631006_MERL((String)map.getValue("F5631006_MERL"));
          result.setF5631006_UORG((MathNumeric)map.getValue("F5631006.UORG"));
        
          
          
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
   * Calls the F4102FetchSingleLtdSelect(B4902390) business function which has the D4902390A datastructure.
   * @param context conditionally provides the connection for the business function call and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @param TODO document input parameters
   * @return A list of messages if there were application errors, warnings, or informational
   * messages. Returns null if there were no messages.
   */
  private static E1MessageList callF4102FetchSingleLtdSelect(IContext context,
                                                             IConnection connection,
                                                             InternalGetStockingType internalVO) {
    BSFNParameters bsfnParams = new BSFNParameters();

    // map input parameters from input value object
    bsfnParams.setValue("cSuppressErrorMessage",
                        internalVO.getCSuppressErrorMessage());
    bsfnParams.setValue("mnIdentifierShortItem",
                        internalVO.getMnIdentifierShortItem());
    bsfnParams.setValue("szCostCenter", internalVO.getSzCostCenter());

    try {
      //get bsfnService from context
      IBSFNService bsfnService = context.getBSFNService();

      //execute business function
      bsfnService.execute(context, connection, "F4102FetchSingleLtdSelect",
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
    internalVO.setCStockingType(bsfnParams.getValue("cStockingType").toString());

    //return any errors, warnings, or informational messages to the caller
    return bsfnParams.getE1MessageList();
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
                                                  InternalGetSerialNo internalVO) {
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
          InternalShowSerialNo result = new InternalShowSerialNo();
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


  /**
   * Calls the FetchF4102ItemBranchRecordByBU(N4901670) business function which has the D4901670 datastructure.
   * @param context conditionally provides the connection for the business function call and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @param TODO document input parameters
   * @return A list of messages if there were application errors, warnings, or informational
   * messages. Returns null if there were no messages.
   */
  private static E1MessageList callFetchF4102ItemBranchRecordByBU(IContext context, IConnection connection, InternalGetStockingType internalVO) {
    BSFNParameters bsfnParams = new BSFNParameters();

    // map input parameters from input value object
    bsfnParams.setValue("mnIdentifierShortItem", internalVO.getMnIdentifierShortItem());
    bsfnParams.setValue("szCostCenter", internalVO.getSzCostCenter());

    try {
      //get bsfnService from context
      IBSFNService bsfnService = context.getBSFNService();

      //execute business function
      bsfnService.execute(context, connection, "FetchF4102ItemBranchRecordByBU", bsfnParams);
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
    internalVO.setCSerialNoRequiredYN(bsfnParams.getValue("cSerialNumberRequired").toString());

    //return any errors, warnings, or informational messages to the caller
    return bsfnParams.getE1MessageList();
  }

  /**
   * Selects records from the V5631007 business view.
   * <p>Following SQL statement can be produced by this generated code
   * <blockquote><pre><code>
   * SELECT F5631006.LITM, F5631006.MCU, F5631006.STKT, F5631006.KITL, F5631006.KIT, F4211.MCU, F4211.PMPN, F4211.ITM, F4211.LITM, F5631006.UORG, F5631006.MERL, F5631006.DSC1, F5631006.ITM
   *
   * FROM V5631007
   *
   * WHERE F4211.DOCO=? AND F4211.DCTO=? AND F4211.PMPN=? AND F4211.MCU=? AND F4211.LITM=?
   *
   *
   * </code></pre></blockquote>
   * @param context conditionally provides the connection for the database operation and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @param internalVO TODO document input parameters
   * @param maxReturnedRows the maximium number of rows returned from the select operation.
   * @return an E1Message containing the text of any database exceptions that may have occurred
   */
  private static E1MessageList selectFromV5631007_1(IContext context, IConnection connection, InternalGetSalesDetails internalVO
  ) {
    //create return object
    E1MessageList returnMessages = new E1MessageList();

    //specify columns to select
    BSSVDBField[] selectFields =
    {new BSSVDBField("F5631006.LITM"), // String - Identifier2ndItem
         new BSSVDBField("F5631006.MCU"), // String - CostCenter
         new BSSVDBField("F5631006.STKT"), // Character - StockingType
         new BSSVDBField("F5631006.KITL"), // String - ItemNumber2ndKit
         new BSSVDBField("F5631006.KIT"), // Numeric - ItemNumberShortKit
         new BSSVDBField("F4211.MCU"), // String - CostCenter
         new BSSVDBField("F4211.PMPN"), // String - ProductionNumber
         new BSSVDBField("F4211.ITM"), // Numeric - IdentifierShortItem
         new BSSVDBField("F4211.LITM"), // String - Identifier2ndItem
         new BSSVDBField("F4211.DOCO"), // Numeric - OrderNumber
         new BSSVDBField("F4211.DCTO"), // String - OrderType
         new BSSVDBField("F5631006.UORG"), // Numeric - UnitsTransactionQty
         new BSSVDBField("F5631006.MERL"), // String - MeRevisionLevel
         new BSSVDBField("F5631006.DSC1"), // String - DescriptionLine1
         new BSSVDBField("F5631006.ITM") // Numeric - IdentifierShortItem
         } ;

    //specify sort order
    BSSVDBSortField[] sortOrder = null;

    //specify condition records must meet - assume inputs are optional
    ArrayList whereFieldsList = new ArrayList();
    if (internalVO.getF4211_DOCO() != null) {
      whereFieldsList.add(new BSSVDBWhereField(null, new BSSVDBField("F4211.DOCO"), IDBService.EQUALS, internalVO.getF4211_DOCO()));
    }
    if (internalVO.getF4211_DCTO() != null) {
      whereFieldsList.add(new BSSVDBWhereField(IDBService.AND, new BSSVDBField("F4211.DCTO"), IDBService.EQUALS, internalVO.getF4211_DCTO()));
    }
    if (internalVO.getF4211_PMPN() != null) {
      whereFieldsList.add(new BSSVDBWhereField(IDBService.AND, new BSSVDBField("F4211.PMPN"), IDBService.EQUALS, internalVO.getF4211_PMPN()));
    }
    if (internalVO.getF4211_MCU() != null) {
      whereFieldsList.add(new BSSVDBWhereField(IDBService.AND, new BSSVDBField("F4211.MCU"), IDBService.EQUALS, internalVO.getF4211_MCU()));
    }
    if (internalVO.getF4211_LITM() != null) {
      whereFieldsList.add(new BSSVDBWhereField(IDBService.AND, new BSSVDBField("F4211.LITM"), IDBService.EQUALS, internalVO.getF4211_LITM()));
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
      resultSet = dbService.select(context, connection, "V5631007", IDBService.DB_BSVW, selectDistinct,
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
          InternalShowSalesDetails result = new InternalShowSalesDetails();
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
          result.setF4211_DOCO((MathNumeric)map.getValue("F4211.DOCO"));
          result.setF4211_DCTO((String)map.getValue("F4211.DCTO"));
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
