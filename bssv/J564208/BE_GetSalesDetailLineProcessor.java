package be.e1.bssv.J564208;

import be.e1.bssv.J564208.valueobject.InternalGetSRP3Desc;
import be.e1.bssv.J564208.valueobject.InternalGetSalesDetailLine;

import be.e1.bssv.J564208.valueobject.InternalGetUoMConversion;
import be.e1.bssv.J564208.valueobject.InternalGetWorkOrderDetail;
import be.e1.bssv.J564208.valueobject.InternalMPSWOHeaderTagFile;
import be.e1.bssv.J564208.valueobject.InternalShowSalesDetailLine;

import be.e1.bssv.J564208.valueobject.InternalShowWorkOrderDetail;

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
public abstract class BE_GetSalesDetailLineProcessor extends BusinessService {
  /**
   * TODO: Create Java Doc for: getSalesDetailLine
   * Method getSalesDetailLine is used for...?
   * @param context conditionally provides the connection for the database operation and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
   * @return an E1Message containing the text of any errors or warnings that may have occurred
   */
  public static E1MessageList getSalesDetailLine(IContext context, IConnection connection, InternalGetSalesDetailLine internalVO) {

    //Call start internal method, passing the context (which was passed from PublishedBusinessService).
    startInternalMethod(context, "getSalesDetailLine", internalVO);
    //Create new message list for BusinessService processing.
    E1MessageList messages = new E1MessageList();

    //TODO: call method (created by the wizard), which then executes Business Function or Database operation.
      messages.addMessages(selectFromV564201F(context, connection, internalVO));
      // Start getting other fields like SRP3 Desc, F564803.Z56SCAP, Work Order Details
      if(!messages.hasErrors())
        if(internalVO.getQueryResults()!=null)
          if(internalVO.getQueryResults().size()>0){
            ArrayList querySalesDetailLine = new ArrayList();
            for(int i=0; i<internalVO.getQueryResults().size();i++) {

              InternalShowSalesDetailLine salesDetailLine = new InternalShowSalesDetailLine();
              InternalGetSRP3Desc getSRP3Description = new InternalGetSRP3Desc();
              InternalGetWorkOrderDetail getWODetails = new InternalGetWorkOrderDetail();
              InternalShowWorkOrderDetail showWODetail = new InternalShowWorkOrderDetail();
              InternalGetUoMConversion getUoMConversion = new InternalGetUoMConversion();

              salesDetailLine = internalVO.getQueryResults(i);

              // Get SRP3 Description
              getSRP3Description.setCSuppressErrorMessage("1");
              getSRP3Description.setSzDataDictionaryItem("SRP3");
              getSRP3Description.setSzUserDefinedCode(salesDetailLine.getF4211_SRP3());
              callGetUDC(context, connection, getSRP3Description);
              salesDetailLine.setF4211_SRP3_DSC1(getSRP3Description.getSzDescription001());

              // Get Qty in PX UoM.
              getUoMConversion.setSzBranchPlant(salesDetailLine.getF4211_MCU());
              getUoMConversion.setMnShortItemNumber(salesDetailLine.getF4211_ITM());
              getUoMConversion.setSzFromUnitOfMeasure(salesDetailLine.getF4211_UOM());
              getUoMConversion.setMnQuantityToConvert(salesDetailLine.getF4211_UORG());
              getUoMConversion.setSzToUnitOfMeasure("PX");
              getUoMConversion.setCSuppressErrorMessage("1");
              callGetItemUoMConvShell(context, connection, getUoMConversion);
              salesDetailLine.setPAX_UORG(getUoMConversion.getMnQuantityConvertedFromtoTo());

              // Get WO Detials and Serial No based on Item No and PNS
              getWODetails.setF4801_ITM(salesDetailLine.getF4211_ITM());
              getWODetails.setF4801T_PMPN(salesDetailLine.getF4211_PMPN());
              selectFromV564801K(context, connection, getWODetails);
              if(getWODetails.getQueryResults()!=null)
                if(getWODetails.getQueryResults().size()>0){
                  ArrayList woArrayList = new ArrayList();
                  for (int j = 0; j < getWODetails.getQueryResults().size(); j++) {
                    InternalMPSWOHeaderTagFile mpsWOHeaderTag = new InternalMPSWOHeaderTagFile();
                    showWODetail = getWODetails.getQueryResults(j);
                   // Get G564803.Z56SCAP
                    mpsWOHeaderTag.setF564803_DOCO(showWODetail.getF4801_DOCO());
                    selectFromF564803(context, connection, mpsWOHeaderTag);
                    showWODetail.setF564803_Z56SCAP(mpsWOHeaderTag.getF564803_Z56SCAP());
                    woArrayList.add(showWODetail);
                  }
                  salesDetailLine.setInternalGetWODetails(woArrayList);
                }
              querySalesDetailLine.add(salesDetailLine);
            }
            internalVO.setQueryResults(querySalesDetailLine);     
          }
    //TODO:  add messages returned from E1 processing to BusinessService message list.

    //Call finish internal method passing context.
    finishInternalMethod(context, "getSalesDetailLine");

    //Call finish internal method passing context.
    return messages;
  }

  /**
   * Selects records from the V564201F business view.
   * <p>Following SQL statement can be produced by this generated code
   * <blockquote><pre><code>
   * SELECT F4211.DOCO, F4211.DCTO, F4211.LNID, F4211.MCU, F4211.ITM, F4211.LITM, F4211.DSC1, F4211.LNTY, F4211.PMPN, F564211.Z56SSN, F4211.MERL, F564201.Z56RET, F4201.VR01, F4211.SRP3, F4211.UOM, F4211.UORG, F4211.PNS
   *
   * FROM V564201F
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
  private static E1MessageList selectFromV564201F(IContext context, IConnection connection, InternalGetSalesDetailLine internalVO) {
    //create return object
    E1MessageList returnMessages = new E1MessageList();

    //specify columns to select
    BSSVDBField[] selectFields =
    {new BSSVDBField("F4211.DOCO"), // Numeric - DocumentOrderInvoiceE
         new BSSVDBField("F4211.DCTO"), // String - OrderType
         new BSSVDBField("F4211.LNID"), // Numeric - LineNumber
         new BSSVDBField("F4211.MCU"), // String - CostCenter
         new BSSVDBField("F4211.ITM"), // Numeric - IdentifierShortItem
         new BSSVDBField("F4211.LITM"), // String - Identifier2ndItem
         new BSSVDBField("F4211.DSC1"), // String - DescriptionLine1
         new BSSVDBField("F4211.LNTY"), // String - LineType
         new BSSVDBField("F4211.PMPN"), // String - ProductionNumber
         new BSSVDBField("F564211.Z56SSN"), // String - 56ShipSetNumber
         new BSSVDBField("F4211.MERL"), // String - MeRevisionLevel
         new BSSVDBField("F564201.Z56RET"), // String - 56RetroCode
         new BSSVDBField("F4201.VR01"), // String - Reference1
         new BSSVDBField("F4211.SRP3"), // String - SalesReportingCode3
         new BSSVDBField("F4211.UOM"), // String - UnitOfMeasureAsInput
         new BSSVDBField("F4211.UORG"), // Numeric - UnitsTransactionQty
         new BSSVDBField("F4211.PNS"), // Numeric - ProductionNumberShort
         new BSSVDBField("F4211.NXTR") //String - SalesOrderNextStatus
         } ;

    //specify sort order
    BSSVDBSortField[] sortOrder = null;

    //specify condition records must meet - assume inputs are optional
    ArrayList whereFieldsList = new ArrayList();
    if (internalVO.getQueryWhereFields().getF4211_DOCO() != null) {
      whereFieldsList.add(new BSSVDBWhereField(null, new BSSVDBField("F4211.DOCO"), IDBService.EQUALS, internalVO.getQueryWhereFields().getF4211_DOCO()));
    }
    if (internalVO.getQueryWhereFields().getF4211_DCTO() != null) {
      whereFieldsList.add(new BSSVDBWhereField(IDBService.AND, new BSSVDBField("F4211.DCTO"), IDBService.EQUALS, internalVO.getQueryWhereFields().getF4211_DCTO()));
    }
    if (internalVO.getQueryWhereFields().getF4211_PMPN() != null) {
      whereFieldsList.add(new BSSVDBWhereField(IDBService.AND, new BSSVDBField("F4211.PMPN"), IDBService.EQUALS, internalVO.getQueryWhereFields().getF4211_PMPN()));
    }
    if (internalVO.getQueryWhereFields().getF4211_MCU() != null) {
      whereFieldsList.add(new BSSVDBWhereField(IDBService.AND, new BSSVDBField("F4211.MCU"), IDBService.EQUALS, internalVO.getQueryWhereFields().getF4211_MCU()));
    }
    if (internalVO.getQueryWhereFields().getF4211_LITM() != null) {
      whereFieldsList.add(new BSSVDBWhereField(IDBService.AND, new BSSVDBField("F4211.LITM"), IDBService.EQUALS, internalVO.getQueryWhereFields().getF4211_LITM()));
    }

    // Changes PATELB 11/20/2013 as per discussion with Patrick , will send order only with LNTY = S 
    // and  LTTR != 980
        whereFieldsList.add(new BSSVDBWhereField(IDBService.AND,
                                                 new BSSVDBField("F4211.LTTR"),
                                                 IDBService.NOT_EQUAL, "980"));
        
        whereFieldsList.add(new BSSVDBWhereField(IDBService.AND,
                                                 new BSSVDBField("F4211.LNTY"),
                                                 IDBService.EQUALS, "S"));
        // Changes PATELB End

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
      resultSet = dbService.select(context, connection, "V564201F", IDBService.DB_BSVW, selectDistinct,
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
          InternalShowSalesDetailLine result = new InternalShowSalesDetailLine();
          result.setF4211_DOCO((MathNumeric)map.getValue("F4211.DOCO"));
          result.setF4211_DCTO((String)map.getValue("F4211.DCTO"));
          result.setF4211_LNID((MathNumeric)map.getValue("F4211.LNID"));
          result.setF4211_MCU((String)map.getValue("F4211.MCU"));
          result.setF4211_ITM((MathNumeric)map.getValue("F4211.ITM"));
          result.setF4211_LITM((String)map.getValue("F4211.LITM"));
          result.setF4211_DSC1((String)map.getValue("F4211.DSC1"));
          result.setF4211_LNTY((String)map.getValue("F4211.LNTY"));
          result.setF4211_PMPN((String)map.getValue("F4211.PMPN"));
          result.setF564211_Z56SSN((String)map.getValue("F564211.Z56SSN"));
          result.setF4211_MERL((String)map.getValue("F4211.MERL"));
          result.setF564201_Z56RET((String)map.getValue("F564201.Z56RET"));
          result.setF4201_VR01((String)map.getValue("F4201.VR01"));
          result.setF4211_SRP3((String)map.getValue("F4211.SRP3"));
          result.setF4211_UOM((String)map.getValue("F4211.UOM"));
          result.setF4211_UORG((MathNumeric)map.getValue("F4211.UORG"));
          result.setF4211_PNS((MathNumeric)map.getValue("F4211.PNS"));
          result.setF4211_NXTR((String)map.getValue("F4211.NXTR"));
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
   * Calls the GetUDC(X0005) business function which has the D0005 datastructure.
   * @param context conditionally provides the connection for the business function call and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @param TODO document input parameters
   * @return A list of messages if there were application errors, warnings, or informational
   * messages. Returns null if there were no messages.
   */
  private static E1MessageList callGetUDC(IContext context, IConnection connection, InternalGetSRP3Desc internalVO) {
    BSFNParameters bsfnParams = new BSFNParameters();

    // map input parameters from input value object
    bsfnParams.setValue("szDataDictionaryItem", internalVO.getSzDataDictionaryItem());
    bsfnParams.setValue("szUserDefinedCode", internalVO.getSzUserDefinedCode());
    bsfnParams.setValue("cSuppressErrorMessage", internalVO.getCSuppressErrorMessage());

    try {
      //get bsfnService from context
      IBSFNService bsfnService = context.getBSFNService();

      //execute business function
      bsfnService.execute(context, connection, "GetUDC", bsfnParams);
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
    internalVO.setSzDescription001((String)bsfnParams.getValue("szDescription001"));

    //return any errors, warnings, or informational messages to the caller
    return bsfnParams.getE1MessageList();
  }

  /**
   * Calls the GetItemUoMConvShell(B4002640) business function which has the D4000520 datastructure.
   * @param context conditionally provides the connection for the business function call and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @param TODO document input parameters
   * @return A list of messages if there were application errors, warnings, or informational
   * messages. Returns null if there were no messages.
   */
  private static E1MessageList callGetItemUoMConvShell(IContext context, IConnection connection, InternalGetUoMConversion internalVO) {
    BSFNParameters bsfnParams = new BSFNParameters();

    // map input parameters from input value object
    bsfnParams.setValue("szBranchPlant", internalVO.getSzBranchPlant());
    bsfnParams.setValue("szFromUnitOfMeasure", internalVO.getSzFromUnitOfMeasure());
    bsfnParams.setValue("szToUnitOfMeasure", internalVO.getSzToUnitOfMeasure());
    bsfnParams.setValue("mnQuantityToConvert", internalVO.getMnQuantityToConvert());
    bsfnParams.setValue("cSuppressErrorMsg", internalVO.getCSuppressErrorMessage());
    bsfnParams.setValue("mnShortItemNumber", internalVO.getMnShortItemNumber());

    try {
      //get bsfnService from context
      IBSFNService bsfnService = context.getBSFNService();

      //execute business function
      bsfnService.execute(context, connection, "GetItemUoMConversionFactor", bsfnParams);
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
    internalVO.setMnQuantityConvertedFromtoTo((MathNumeric)bsfnParams.getValue("mnQuantityConvertedFromtoTo"));

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
   * WHERE F4801.ITM=? AND F4801T.PMPN=?
   *
   *
   * </code></pre></blockquote>
   * @param context conditionally provides the connection for the database operation and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @param internalVO TODO document input parameters
   * @param maxReturnedRows the maximium number of rows returned from the select operation.
   * @return an E1Message containing the text of any database exceptions that may have occurred
   */
  private static E1MessageList selectFromV564801K(IContext context, IConnection connection, InternalGetWorkOrderDetail internalVO) {
    //create return object
    E1MessageList returnMessages = new E1MessageList();

    //specify columns to select
    BSSVDBField[] selectFields =
    {new BSSVDBField("F4801.DOCO"), // Numeric - DocumentOrderInvoiceE
         new BSSVDBField("F4801.DCTO"), // String - OrderType
         new BSSVDBField("F4220.SRL1") // String - SerialNumber1
         } ;

    //specify sort order
    BSSVDBSortField[] sortOrder = null;

    //specify condition records must meet to be selected
    BSSVDBWhereField[] whereFields =
    {new BSSVDBWhereField(null, new BSSVDBField("F4801.ITM"), IDBService.EQUALS, internalVO.getF4801_ITM()),
         new BSSVDBWhereField(IDBService.AND, new BSSVDBField("F4801T.PMPN"), IDBService.EQUALS, internalVO.getF4801T_PMPN())};

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
          InternalShowWorkOrderDetail result = new InternalShowWorkOrderDetail();
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
   * Selects records from the F564803 table.
   * <p>Following SQL statement can be produced by this generated code
   * <blockquote><pre><code>
   * SELECT F564803.Z56SCAP
   *
   * FROM F564803
   *
   * WHERE F564803.DOCO=?
   *
   *
   * </code></pre></blockquote>
   * @param context conditionally provides the connection for the database operation and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @param internalVO TODO document input parameters
   * @param maxReturnedRows the maximium number of rows returned from the select operation.
   * @return an E1Message containing the text of any database exceptions that may have occurred
   */
  private static E1MessageList selectFromF564803(IContext context, IConnection connection, InternalMPSWOHeaderTagFile internalVO) {
    //create return object
    E1MessageList returnMessages = new E1MessageList();

    //specify columns to select
    BSSVDBField[] selectFields =
    {new BSSVDBField("F564803.Z56SCAP") // Numeric - LineCellCapacityPerDay
         } ;

    //specify sort order
    BSSVDBSortField[] sortOrder = null;

    //specify condition records must meet to be selected
    BSSVDBWhereField[] whereFields =
    {new BSSVDBWhereField(null, new BSSVDBField("F564803.DOCO"), IDBService.EQUALS, internalVO.getF564803_DOCO())};

    BSSVDBWhereClauseBuilder whereClause =
      new BSSVDBWhereClauseBuilder(context, whereFields);

    BSSVDBResultSet resultSet = null;
    boolean selectDistinct = false;

    try {
      //get dbService from context
      IDBService dbService = context.getDBService();
      //execute db select operation
      resultSet = dbService.select(context, connection, "F564803", IDBService.DB_TABLE, selectDistinct,
                 IDBService.DB_FETCH_ALL, selectFields, sortOrder, whereClause);
    } catch (DBServiceException e) {
      //TODO take some action in response to the database exception
      returnMessages.addMessage(new E1Message(context, "005FIS", e.getMessage()));
    }

    //process the results of the select
    if (resultSet != null) {
      BSSVDBFieldMap[] fieldMap = resultSet.getFieldMap();
      if (fieldMap != null && fieldMap.length > 0) {     
          BSSVDBFieldMap map = fieldMap[0];
          internalVO.setF564803_Z56SCAP((MathNumeric)map.getValue("F564803.Z56SCAP"));
        }
        if (resultSet.hasMoreRows()) {
          returnMessages.addMessage(new E1Message(context, "028FIS", ""));
      }
    }
    return returnMessages;
  }
}
