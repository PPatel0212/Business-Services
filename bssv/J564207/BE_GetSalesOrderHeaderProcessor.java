package be.e1.bssv.J564207;

import be.e1.bssv.J564207.valueobject.InternalGetAlphaName;
import be.e1.bssv.J564207.valueobject.InternalGetSOHeaderField;

import be.e1.bssv.J564207.valueobject.InternalGetSalesOrderHeader;

import be.e1.bssv.J564207.valueobject.InternalGetUDC;
import be.e1.bssv.J564207.valueobject.InternalGetUOMConversion;
import be.e1.bssv.J564207.valueobject.InternalShowSalesOrderHeader;

import java.math.BigDecimal;

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
import oracle.e1.bssvfoundation.services.BSSVDBSortDirection;
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
public abstract class BE_GetSalesOrderHeaderProcessor extends BusinessService {
  /**
   * TODO: Create Java Doc for: GetSalesOrderHeaderProcessor
   * Method GetSalesOrderHeaderProcessor is used for...?
   * @param context conditionally provides the connection for the database operation and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
   * @return an E1Message containing the text of any errors or warnings that may have occurred
   */
  public static E1MessageList GetSalesOrderHeaderProcessor(IContext context,
                                                           IConnection connection,
                                                           InternalGetSalesOrderHeader internalVO) {

    //Call start internal method, passing the context (which was passed from PublishedBusinessService).
    startInternalMethod(context, "GetSalesOrderHeaderProcessor", internalVO);
    //Create new message list for BusinessService processing.
    E1MessageList messages = new E1MessageList();

    MathNumeric previousOrderNo = new MathNumeric(0);
    String previousOrderType = null;
    String previousOrderCompany = null;

    
    

    //TODO: call method (created by the wizard), which then executes Business Function or Database operation.
    E1MessageList dbMessage =
      selectFromV564211M(context, connection, internalVO);
    //TODO:  add messages returned from E1 processing to BusinessService message list.
    messages.addMessages(dbMessage);

    if (internalVO.getQueryResults() != null &&
        internalVO.getQueryResults().size() > 0) {
      ArrayList queryResult = new ArrayList();

      for (int i = 0; i < internalVO.getQueryResults().size(); i++) {

        InternalGetUDC getUDC = new InternalGetUDC();
        InternalGetAlphaName getAlphaName = new InternalGetAlphaName();
        InternalGetUOMConversion getUOMConversion =
          new InternalGetUOMConversion();
        InternalShowSalesOrderHeader showSOHeader =
          new InternalShowSalesOrderHeader();

        InternalGetSOHeaderField soHeaderFile = new InternalGetSOHeaderField();

        showSOHeader = internalVO.getQueryResults(i);

        if (!showSOHeader.getF4211_DCTO().trim().equalsIgnoreCase(previousOrderType) ||
            !showSOHeader.getF4211_DOCO().equals(previousOrderNo) ||
            !showSOHeader.getF4211_KCOO().equals(previousOrderCompany)) {
          previousOrderType = showSOHeader.getF4211_DCTO();
          previousOrderNo = showSOHeader.getF4211_DOCO();
          previousOrderCompany = showSOHeader.getF4211_KCOO();
          BigDecimal paxQty = new BigDecimal(0); 
          MathNumeric lineID = new MathNumeric(0);
          /* Get Model Descrption from SRP3 */
          if (showSOHeader.getF4211_SRP3().trim().length() > 0) {
            getUDC.setSzDataDictionaryItem("SRP3");
            getUDC.setSzUserDefinedCode(showSOHeader.getF4211_SRP3());


            E1MessageList modelError = callGetUDC(context, connection, getUDC);

            showSOHeader.setModel_Desc(getUDC.getSzDescription001());
          }

          if (showSOHeader.getF564201_Z56ACTS().trim().length() > 0) {
            /* Get Aircraft Type Descrption from Z56ACTS */
            getUDC.setSzDataDictionaryItem("Z56ACTS");
            getUDC.setSzUserDefinedCode(showSOHeader.getF564201_Z56ACTS().trim());

            E1MessageList aircraftTypeError =
              callGetUDC(context, connection, getUDC);

            showSOHeader.setAircraftType_Desc(getUDC.getSzDescription001());
            
          }
          /*Reilly Edit 05072015 - Address Book Description Change from AN8 to F564201.Z56OPC OR F4211.SHAN*/
          if (showSOHeader.getF564201_Z56OPC().trim().length() > 0) {
            /*Get UDC Value from Z56OPC 01|20*/
            getUDC.setSzDataDictionaryItem("Z56OPC");
            getUDC.setSzUserDefinedCode(showSOHeader.getF564201_Z56OPC().trim());
            
            E1MessageList operatorCodeError =
              callGetUDC(context, connection, getUDC);

            showSOHeader.setOperatorDesc(getUDC.getSzDescription001());
            
          }
          if (showSOHeader.getF4211_SHAN().toString().length() > 0) {
              /* Get Alpha Name */
              getAlphaName.setMnAddressNumber(showSOHeader.getF4211_SHAN());
              E1MessageList alphaNameError =
                callGetAddressBookDescriptionA7(context, connection,
                                                getAlphaName);

              showSOHeader.setCustomer_desc(getAlphaName.getSzAddressBookDescription());
          }
          /*Reilly Edit 05072015 - Address Book Description - END */

          for (int j = 0; j < internalVO.getQueryResults().size(); j++) {
            InternalShowSalesOrderHeader showSOHeaderPaxQty =
              new InternalShowSalesOrderHeader();

            InternalShowSalesOrderHeader showSOHeaderPreviousPaxQty =
              new InternalShowSalesOrderHeader();
            showSOHeaderPaxQty = internalVO.getQueryResults(j);
            
             if(showSOHeaderPaxQty.getF4211_DCTO().equalsIgnoreCase(showSOHeader.getF4211_DCTO()) && 
              showSOHeaderPaxQty.getF4211_KCOO().equalsIgnoreCase(showSOHeader.getF4211_KCOO()) &&
               showSOHeaderPaxQty.getF4211_DOCO().equals(showSOHeader.getF4211_DOCO())&&
            !showSOHeaderPaxQty.getF4211_LNID().equals(lineID)&& 
           !showSOHeaderPaxQty.getF4211_ITM().equals(0) )
             {
              /* Get Quantity Converted to "PX" UoM */
              getUOMConversion.setSzBranchPlant(showSOHeaderPaxQty.getF4211_MCU());
              getUOMConversion.setMnQuantityToConvert(showSOHeaderPaxQty.getF4211_UORG());
              getUOMConversion.setMnShortItemNumber(showSOHeaderPaxQty.getF4211_ITM());
              getUOMConversion.setSzFromUnitOfMeasure(showSOHeaderPaxQty.getF4211_UOM());
              getUOMConversion.setSzToUnitOfMeasure("PX");
              E1MessageList uomConversionError =
                callGetItemUoMConversionFactor(context, connection,
                                               getUOMConversion);
              paxQty =
                  paxQty.add(getUOMConversion.getMnQuantityConvertedFromtoTo().asBigDecimal());
            
             }
          lineID = showSOHeaderPaxQty.getF4211_LNID();
            

          }
          showSOHeader.setF4211_UORG(new MathNumeric(paxQty));

          /*Get F4201.VR02 */
          soHeaderFile.setMnOrderNumber(showSOHeader.getF4211_DOCO());
          soHeaderFile.setSzOrderType(showSOHeader.getF4211_DCTO());
          soHeaderFile.setSzOrderNumberDocumentCompany(showSOHeader.getF4211_KCOO());
          
          E1MessageList soRefrenceError =
            callRetrieveF4201Record(context, connection, soHeaderFile);

          showSOHeader.setSoReference(soHeaderFile.getSzReference2Vendor());

          queryResult.add(showSOHeader);
        }
      }
      internalVO.setQueryResults(queryResult);
    }
    //Call finish internal method passing context.
    finishInternalMethod(context, "GetSalesOrderHeaderProcessor");

    //Call finish internal method passing context.
    return messages;
  }

  /**
   * Selects records from the V564211M business view.
   * <p>Following SQL statement can be produced by this generated code
   * <blockquote><pre><code>
   * SELECT F4211.DOCO, F4211.DCTO, F4211.MCU, F4211.PMPN, F4211.AN8, F564211.Z56ACTS, F564211.Z56TAIL, F564201.Z56MDRQJ, F4211.SRP3, F564201.Z56SSN, F564201.Z56ACTS, F4211.UORG
   *
   * FROM V564211M
   *
   * WHERE F4211.MCU=? AND F564211.Z56ACTS=? AND F4211.AN8=? AND F4211.LNID=? AND F4211.DOCO=? AND F564211.DCTO=? AND F4801.DOCO=? AND F4801.DCTO=? AND F564201.Z56MDRQJ=? AND F564211.Z56TAIL=? AND F4211.SRP3=? AND F4211.LITM=? AND F4211.PMPN=?
   *
   * ORDER BY F4211.DOCO ASC, F4211.DCTO ASC, F4211.LNID ASC
   * </code></pre></blockquote>
   * @param context conditionally provides the connection for the database operation and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @param internalVO TODO document input parameters
   * @param maxReturnedRows the maximium number of rows returned from the select operation.
   * @return an E1Message containing the text of any database exceptions that may have occurred
   */
  private static E1MessageList selectFromV564211M(IContext context,
                                                  IConnection connection,
                                                  InternalGetSalesOrderHeader internalVO) {
    //create return object
    E1MessageList returnMessages = new E1MessageList();

    //specify columns to select
    BSSVDBField[] selectFields =
    { new BSSVDBField("F4211.DOCO"), // Numeric - DocumentOrderInvoiceE
      new BSSVDBField("F4211.DCTO"), // String - OrderType
      new BSSVDBField("F4211.MCU"), // String - CostCenter
      new BSSVDBField("F4211.PMPN"), // String - ProductionNumber
      new BSSVDBField("F4211.AN8"), // Numeric - AddressNumber
      new BSSVDBField("F564211.Z56ACTS"), // String - AircraftTypeSeries
      new BSSVDBField("F564201.Z56TAIL"), // String - 56TailNumber
      new BSSVDBField("F564201.Z56MDRQJ"), // Date - DateDueMPS
      new BSSVDBField("F4211.SRP3"), // String - SalesReportingCode3
      new BSSVDBField("F564201.Z56SSN"), // String - 56ShipSetNumber
      new BSSVDBField("F564201.Z56ACTS"), // String - AircraftTypeSeries
      new BSSVDBField("F4211.UORG"), // Numeric - UnitsTransactionQty
      new BSSVDBField("F4211.ITM"), // Numeric - Short Item number
      new BSSVDBField("F4211.UOM"), // String - Unit of Measure
      new BSSVDBField("F4211.KCOO"),// String - Order Company
      new BSSVDBField("F4211.LNID"), // Numeric - Line Number
      new BSSVDBField("F564201.Z56OPC"), //String - Operator Code
      new BSSVDBField("F4211.SHAN")// Numeric -Ship To Address Number
      } ;

    //specify sort order
    BSSVDBSortField[] sortOrder =
    { new BSSVDBSortField(new BSSVDBField("F4211.DOCO"),
                          BSSVDBSortDirection.ASCENDING),
      new BSSVDBSortField(new BSSVDBField("F4211.DCTO"),
                          BSSVDBSortDirection.ASCENDING),
      new BSSVDBSortField(new BSSVDBField("F4211.LNID"),
                          BSSVDBSortDirection.ASCENDING) };

    //specify condition records must meet - assume inputs are optional
    ArrayList whereFieldsList = new ArrayList();
    if (internalVO.getQueryWhereFields().getF4211_MCU() != null) {
      whereFieldsList.add(new BSSVDBWhereField(null,
                                               new BSSVDBField("F4211.MCU"),
                                               IDBService.EQUALS,
                                               internalVO.getQueryWhereFields().getF4211_MCU()));
    }
    if (internalVO.getQueryWhereFields().getF564211_Z56ACTS() != null) {
      whereFieldsList.add(new BSSVDBWhereField(IDBService.AND,
                                               new BSSVDBField("F564211.Z56ACTS"),
                                               IDBService.EQUALS,
                                               internalVO.getQueryWhereFields().getF564211_Z56ACTS()));
    }
    if (internalVO.getQueryWhereFields().getF4211_AN8() != null) {
      whereFieldsList.add(new BSSVDBWhereField(IDBService.AND,
                                               new BSSVDBField("F4211.AN8"),
                                               IDBService.EQUALS,
                                               internalVO.getQueryWhereFields().getF4211_AN8()));
    }
    if (internalVO.getQueryWhereFields().getF4211_LNID() != null) {
      whereFieldsList.add(new BSSVDBWhereField(IDBService.AND,
                                               new BSSVDBField("F4211.LNID"),
                                               IDBService.EQUALS,
                                               internalVO.getQueryWhereFields().getF4211_LNID()));
    }
    if (internalVO.getQueryWhereFields().getF4211_DOCO() != null) {
      whereFieldsList.add(new BSSVDBWhereField(IDBService.AND,
                                               new BSSVDBField("F4211.DOCO"),
                                               IDBService.EQUALS,
                                               internalVO.getQueryWhereFields().getF4211_DOCO()));
    }
    if (internalVO.getQueryWhereFields().getF4211_DCTO() != null) {
      whereFieldsList.add(new BSSVDBWhereField(IDBService.AND,
                                               new BSSVDBField("F564211.DCTO"),
                                               IDBService.EQUALS,
                                               internalVO.getQueryWhereFields().getF4211_DCTO()));
    }
    if (internalVO.getQueryWhereFields().getF4801_DOCO() != null) {
      whereFieldsList.add(new BSSVDBWhereField(IDBService.AND,
                                               new BSSVDBField("F4801.DOCO"),
                                               IDBService.EQUALS,
                                               internalVO.getQueryWhereFields().getF4801_DOCO()));
    }
    if (internalVO.getQueryWhereFields().getF4801_DCTO() != null) {
      whereFieldsList.add(new BSSVDBWhereField(IDBService.AND,
                                               new BSSVDBField("F4801.DCTO"),
                                               IDBService.EQUALS,
                                               internalVO.getQueryWhereFields().getF4801_DCTO()));
    }
    if (internalVO.getQueryWhereFields().getF564201_Z56MDRQJ() != null) {
      whereFieldsList.add(new BSSVDBWhereField(IDBService.AND,
                                               new BSSVDBField("F564201.Z56MDRQJ"),
                                               IDBService.EQUALS,
                                               internalVO.getQueryWhereFields().getF564201_Z56MDRQJ()));
    }
    if (internalVO.getQueryWhereFields().getF564211_Z56TAIL() != null) {
      whereFieldsList.add(new BSSVDBWhereField(IDBService.AND,
                                               new BSSVDBField("F564211.Z56TAIL"),
                                               IDBService.EQUALS,
                                               internalVO.getQueryWhereFields().getF564211_Z56TAIL()));
    }
    if (internalVO.getQueryWhereFields().getF4211_SRP3() != null) {
      whereFieldsList.add(new BSSVDBWhereField(IDBService.AND,
                                               new BSSVDBField("F4211.SRP3"),
                                               IDBService.EQUALS,
                                               internalVO.getQueryWhereFields().getF4211_SRP3()));
    }
    if (internalVO.getQueryWhereFields().getF4211_LITM() != null) {
      whereFieldsList.add(new BSSVDBWhereField(IDBService.AND,
                                               new BSSVDBField("F4211.LITM"),
                                               IDBService.EQUALS,
                                               internalVO.getQueryWhereFields().getF4211_LITM()));
    }
    if (internalVO.getQueryWhereFields().getF4211_PMPN() != null) {
      whereFieldsList.add(new BSSVDBWhereField(IDBService.AND,
                                               new BSSVDBField("F4211.PMPN"),
                                               IDBService.EQUALS,
                                               internalVO.getQueryWhereFields().getF4211_PMPN()));
    }
// Changes PATELB 11/20/2013 as per discussion with Patrick , will send order only with LNTY = S 
// and  NXTR < 570
    whereFieldsList.add(new BSSVDBWhereField(IDBService.AND,
                                             new BSSVDBField("F4211.NXTR"),
                                             IDBService.LESS_THAN, "570"));
    
    whereFieldsList.add(new BSSVDBWhereField(IDBService.AND,
                                             new BSSVDBField("F4211.LNTY"),
                                             IDBService.EQUALS, "S"));
  
    whereFieldsList.add(new BSSVDBWhereField(IDBService.AND,
                                             new BSSVDBField("F4211.PNS"),
                                             IDBService.GREATER_THAN, "0"));
    // Changes PATELB End
    
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
          dbService.select(context, connection, "V564211M", IDBService.DB_BSVW,
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
          InternalShowSalesOrderHeader result =
            new InternalShowSalesOrderHeader();
          result.setF4211_DOCO((MathNumeric)map.getValue("F4211.DOCO"));
          result.setF4211_DCTO((String)map.getValue("F4211.DCTO"));
          result.setF4211_MCU((String)map.getValue("F4211.MCU"));
          result.setF4211_PMPN((String)map.getValue("F4211.PMPN"));
          result.setF4211_AN8((MathNumeric)map.getValue("F4211.AN8"));
          result.setF564211_Z56ACTS((String)map.getValue("F564211.Z56ACTS"));
          result.setF564201_Z56TAIL((String)map.getValue("F564201.Z56TAIL"));
          result.setF564201_Z56MDRQJ((Date)map.getValue("F564201.Z56MDRQJ"));
          result.setF4211_SRP3((String)map.getValue("F4211.SRP3"));
          result.setF564201_Z56SSN((String)map.getValue("F564201.Z56SSN"));
          result.setF564201_Z56ACTS((String)map.getValue("F564201.Z56ACTS"));
          result.setF4211_UORG((MathNumeric)map.getValue("F4211.UORG"));
          result.setF4211_ITM((MathNumeric)map.getValue("F4211.ITM"));
          result.setF4211_UOM((String)map.getValue("F4211.UOM"));
          result.setF4211_KCOO((String)map.getValue("F4211.KCOO"));
          result.setF4211_LNID((MathNumeric)map.getValue("F4211.LNID"));
          result.setF4211_SHAN((MathNumeric)map.getValue("F4211.SHAN"));
          result.setF564201_Z56OPC((String)map.getValue("F564201.Z56OPC"));
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
  private static E1MessageList callGetUDC(IContext context,
                                          IConnection connection,
                                          InternalGetUDC internalVO) {
    BSFNParameters bsfnParams = new BSFNParameters();

    // map input parameters from input value object
    bsfnParams.setValue("szDataDictionaryItem",
                        internalVO.getSzDataDictionaryItem());
    bsfnParams.setValue("szUserDefinedCode",
                        internalVO.getSzUserDefinedCode());
    bsfnParams.setValue("cSuppressErrorMessage", "Y");
    try {
      //get bsfnService from context
      IBSFNService bsfnService = context.getBSFNService();

      //execute business function
      bsfnService.execute(context, connection, "GetUDC", bsfnParams);
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
    internalVO.setSzDescription001((String)bsfnParams.getValue("szDescription001"));

    //return any errors, warnings, or informational messages to the caller
    return bsfnParams.getE1MessageList();
  }

  /**
   * Calls the GetAddressBookDescriptionA7(GETABDA7) business function which has the D0100080 datastructure.
   * @param context conditionally provides the connection for the business function call and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @param TODO document input parameters
   * @return A list of messages if there were application errors, warnings, or informational
   * messages. Returns null if there were no messages.
   */
  private static E1MessageList callGetAddressBookDescriptionA7(IContext context,
                                                               IConnection connection,
                                                               InternalGetAlphaName internalVO) {
    BSFNParameters bsfnParams = new BSFNParameters();

    // map input parameters from input value object
    bsfnParams.setValue("mnAddressNumber", internalVO.getMnAddressNumber());

    try {
      //get bsfnService from context
      IBSFNService bsfnService = context.getBSFNService();

      //execute business function
      bsfnService.execute(context, connection, "GetAddressBookDescriptionA7",
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
    internalVO.setSzAddressBookDescription((String)bsfnParams.getValue("szAddressBookDescription"));

    //return any errors, warnings, or informational messages to the caller
    return bsfnParams.getE1MessageList();
  }

  /**
   * Calls the GetItemUoMConversionFactor(B4000520) business function which has the D4000520 datastructure.
   * @param context conditionally provides the connection for the business function call and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @param TODO document input parameters
   * @return A list of messages if there were application errors, warnings, or informational
   * messages. Returns null if there were no messages.
   */
  private static E1MessageList callGetItemUoMConversionFactor(IContext context,
                                                              IConnection connection,
                                                              InternalGetUOMConversion internalVO) {
    BSFNParameters bsfnParams = new BSFNParameters();

    // map input parameters from input value object
    bsfnParams.setValue("szFromUnitOfMeasure",
                        internalVO.getSzFromUnitOfMeasure());
    bsfnParams.setValue("szToUnitOfMeasure",
                        internalVO.getSzToUnitOfMeasure());
    bsfnParams.setValue("mnQuantityToConvert",
                        internalVO.getMnQuantityToConvert());
    bsfnParams.setValue("mnShortItemNumber",
                        internalVO.getMnShortItemNumber());
    bsfnParams.setValue("szBranchPlant", internalVO.getSzBranchPlant());
    try {
      //get bsfnService from context
      IBSFNService bsfnService = context.getBSFNService();

      //execute business function
      bsfnService.execute(context, connection, "GetItemUoMConversionFactor",
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
    internalVO.setMnQuantityConvertedFromtoTo((MathNumeric)bsfnParams.getValue("mnQuantityConvertedFromtoTo"));

    //return any errors, warnings, or informational messages to the caller
    return bsfnParams.getE1MessageList();
  }


  /**
   * Calls the RetrieveF4201Record(B4202030) business function which has the D4202030 datastructure.
   * @param context conditionally provides the connection for the business function call and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @param TODO document input parameters
   * @return A list of messages if there were application errors, warnings, or informational
   * messages. Returns null if there were no messages.
   */
  private static E1MessageList callRetrieveF4201Record(IContext context,
                                                       IConnection connection,
                                                       InternalGetSOHeaderField internalVO) {
    BSFNParameters bsfnParams = new BSFNParameters();

    // map input parameters from input value object
    bsfnParams.setValue("szOrderNumberDocumentCompany",
                        internalVO.getSzOrderNumberDocumentCompany());
    bsfnParams.setValue("mnOrderNumber", internalVO.getMnOrderNumber());
    bsfnParams.setValue("szOrderType", internalVO.getSzOrderType());

    try {
      //get bsfnService from context
      IBSFNService bsfnService = context.getBSFNService();

      //execute business function
      bsfnService.execute(context, connection, "RetrieveF4201Record",
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
    internalVO.setSzReference2Vendor((String)bsfnParams.getValue("szReference2Vendor"));

    //return any errors, warnings, or informational messages to the caller
    return bsfnParams.getE1MessageList();
  }
}
