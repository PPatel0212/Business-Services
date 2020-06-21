package be.e1.bssv.J564201;

import be.e1.bssv.J564201.valueobject.SOHeaderQuery;
import be.e1.bssv.J564201.valueobject.SOHeaderResult;

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
public abstract class EcommerceSOInfo extends BusinessService
{
  /**
   * TODO: Create Java Doc for: InternalGetCustomerOrders
   * Method InternalGetCustomerOrders is used for...?
   * @param context conditionally provides the connection for the database operation and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
   * @return an E1Message containing the text of any errors or warnings that may have occurred
   */
  public static E1MessageList InternalGetCustomerOrders(IContext context, IConnection connection, SOHeaderQuery internalVO)
  {

    //Call start internal method, passing the context (which was passed from PublishedBusinessService).
    startInternalMethod(context, "InternalGetCustomerOrders", internalVO);
    //Create new message list for BusinessService processing.
    E1MessageList messages = new E1MessageList();

    messages.addMessages(selectFromF4201(context, connection, internalVO));

    //Call finish internal method passing context.
    finishInternalMethod(context, "InternalGetCustomerOrders");

    //Call finish internal method passing context.
    return messages;
  }
  
  /**
     * Selects records from the F4201 table.
     * <p>Following SQL statement can be produced by this generated code
     * <blockquote><pre><code>
     * SELECT F4201.KCOO, F4201.DOCO, F4201.DCTO
     *
     * FROM F4201
     *
     * WHERE F4201.SHAN=? AND F4201.TRDJ>=? AND F4201.TRDJ<=?
     *
     *
     * </code></pre></blockquote>
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param internalVO TODO document input parameters
     * @return an E1Message containing the text of any database exceptions that may have occurred
     */
    private static E1MessageList selectFromF4201(IContext context, IConnection connection, SOHeaderQuery internalVO) {
    //create return object
    E1MessageList returnMessages = new E1MessageList();

    //specify columns to select
    BSSVDBField[] selectFields =
    {
      new BSSVDBField("F4201.KCOO"), // String - CompanyKeyOrderNo
      new BSSVDBField("F4201.DOCO"), // Numeric - DocumentOrderInvoiceE
      new BSSVDBField("F4201.DCTO"), // String - OrderType
      new BSSVDBField("F4201.TRDJ"), // Date - TransactionDate
      new BSSVDBField("F4201.TKBY")
    };

    //specify sort order
    BSSVDBSortField[] sortOrder = null;

    //specify condition records must meet to be selected

    BSSVDBWhereField[] whereFields =
      {
        new BSSVDBWhereField(null, new BSSVDBField("F4201.SHAN"), IDBService.EQUALS, internalVO.getCustomerNumber()),
        new BSSVDBWhereField(IDBService.AND, new BSSVDBField("F4201.TRDJ"), IDBService.GREATER_THAN_OR_EQUAL_TO, internalVO.getFromDate()),
        new BSSVDBWhereField(IDBService.AND, new BSSVDBField("F4201.TRDJ"), IDBService.LESS_THAN_OR_EQUAL_TO, internalVO.getThroughDate())
        
      };      
         

    BSSVDBWhereClauseBuilder whereClause = new BSSVDBWhereClauseBuilder(context, whereFields);
    BSSVDBResultSet resultSet = null;
    boolean selectDistinct = false;

    try
    {
      //get dbService from context
      IDBService dbService = context.getDBService();
      //execute db select operation
      resultSet = dbService.select(context, connection, "F4201", IDBService.DB_TABLE, selectDistinct,
                                   IDBService.DB_FETCH_ALL, selectFields, sortOrder, whereClause);
    }
    catch (DBServiceException e)
    {
      internalVO.setCErrorFlag("1");
      internalVO.setSzErrorMessage("Problems executing SQL SELECT on F4201");
      returnMessages.addMessage(new E1Message(context, "005FIS", e.getMessage()));
    }

    //process the results of the select
    if (resultSet != null)
    {
      BSSVDBFieldMap[] fieldMap = resultSet.getFieldMap();
      if (fieldMap != null && fieldMap.length > 0)
      {
        ArrayList queryResults = new ArrayList();
        for (int i = 0; i < fieldMap.length; i++)
        {
          BSSVDBFieldMap map = fieldMap[i];
          SOHeaderResult result = new SOHeaderResult();
          result.setF4201_KCOO((String)map.getValue("F4201.KCOO"));
          result.setF4201_DOCO((MathNumeric)map.getValue("F4201.DOCO"));
          result.setF4201_DCTO((String)map.getValue("F4201.DCTO"));
          result.setF4201_TRDJ((Date)map.getValue("F4201.TRDJ"));
          result.setF4201_TORG((String)map.getValue("F4201.TKBY"));
          /** Call function to get Order Status and Order Total*/
          callBE_GetValuesForSalesOrder(context, connection, result);
          int pass =0;
          if(internalVO.getOrderStatus() != null && internalVO.getOrderStatus().length() > 0) 
          {
             String status = (String)(result.getOrderOpenClosed());
             status = status.replaceAll("\\s+","");
             if(internalVO.getOrderStatus().equals(status))
             {
               //First Condition Passed - defaulted to "0"
             }
             else
             {
                pass=1;
             }
                                                    
           }
            
           if(internalVO.getTransactionOriginator() != null && internalVO.getTransactionOriginator().length() > 0 && pass==0)
            {
                String takenBy = (String)(map.getValue("F4201.TKBY"));
                takenBy = takenBy.replaceAll("\\s+","");
                if(internalVO.getTransactionOriginator().equals(takenBy))
                {
                    queryResults.add(result);
                }
            }
            else
            {
             if(pass==0)
             {
               queryResults.add(result);
             }
                
            }
          //queryResults.add(result);
        }

        if (resultSet.hasMoreRows())
        {
          returnMessages.addMessage(new E1Message(context, "028FIS", ""));
        }

        //map results to internal vo
        internalVO.setQueryResults(queryResults);
      }
    }
    return returnMessages;
  }

    /**
     * Calls the BE_GetValuesForSalesOrder(N564201) business function which has the D564201 datastructure.
     * @param context conditionally provides the connection for the business function call and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param TODO document input parameters
     * @return A list of messages if there were application errors, warnings, or informational
     * messages. Returns null if there were no messages.
     */
    private static E1MessageList callBE_GetValuesForSalesOrder(IContext context, IConnection connection, SOHeaderResult intVO ) {
        BSFNParameters bsfnParams = new BSFNParameters();

        // map input parameters from input value object
        bsfnParams.setValue("szCompanyKeyOrderNo_KCOO", intVO.getF4201_KCOO());
        bsfnParams.setValue("szOrderType_DCTO", intVO.getF4201_DCTO());
        bsfnParams.setValue("mnDocumentOrderInvoice_DOCO", intVO.getF4201_DOCO());
        bsfnParams.setValue("szOrderStatusCheck_NXTR", "570");
        bsfnParams.setValue("szOrderTotalCalculation_LTTR", "980");

        try {
            //get bsfnService from context
            IBSFNService bsfnService = context.getBSFNService();

            //execute business function
            bsfnService.execute(context, connection, "BE_GetValuesForSalesOrder", bsfnParams);
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
        intVO.setOrderStatus((String)bsfnParams.getValue("szOrderStatus_DSC1"));
        intVO.setOrderTotal((MathNumeric)bsfnParams.getValue("mnOrderTotal_AEXP")); 
        intVO.setF4211_VR01((String)bsfnParams.getValue("szReference1"));
        intVO.setOrderOpenClosed((String)bsfnParams.getValue("szOpenClosed_DSC1"));
        
        //return any errors, warnings, or informational messages to the caller
        return bsfnParams.getE1MessageList();
    }
}
