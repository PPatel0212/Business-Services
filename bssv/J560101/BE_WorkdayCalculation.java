package be.e1.bssv.J560101;

import be.e1.bssv.J560101.valueobject.WorkdayCalculation_D5601006;

import be.e1.bssv.J560202.valueobject.WorkflowAck_D5602000G;

import oracle.e1.bssvfoundation.base.BSFNParameters;
import oracle.e1.bssvfoundation.base.BusinessService;
import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.services.IBSFNService;
import oracle.e1.bssvfoundation.util.E1Message;
import oracle.e1.bssvfoundation.util.E1MessageList;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc for BusinessService
 */
public  class BE_WorkdayCalculation extends BusinessService {
    /**
     * TODO: Create Java Doc for: InternalWorkdayCalc_N5601006
     * Method InternalWorkdayCalc_N5601006 is used for...?
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
     * @return an E1Message containing the text of any errors or warnings that may have occurred
     */
    public static E1MessageList InternalWorkdayCalc_N5601006(IContext context, IConnection connection,
                                                             WorkdayCalculation_D5601006 internalVO) {

        //Call start internal method, passing the context (which was passed from PublishedBusinessService).
        startInternalMethod(context, "InternalWorkdayCalc_N5601006", internalVO);
        //Create new message list for BusinessService processing.
        E1MessageList messages = new E1MessageList();

        //TODO: call method (created by the wizard), which then executes Business Function or Database operation.
       // messages.addMessages(jdeWorkflowAcknowledgement(context, connection, internalVO));
        messages.addMessages(jdeWorkdayCalculation(context, connection, internalVO));
        //TODO:  add messages returned from E1 processing to BusinessService message list.

        
        //Call finish internal method passing context.
        finishInternalMethod(context, "InternalWorkdayCalc_N5601006");

        //Call finish internal method passing context.
        return messages;
    }
    
    private static E1MessageList jdeWorkdayCalculation(IContext context, IConnection connection, WorkdayCalculation_D5601006 internalVO)
    {
      BSFNParameters bsfnParams = new BSFNParameters();
      E1MessageList messages = new E1MessageList();
      
      /* Copy the values to bsfn parameters */
      bsfnParams.setValue("szBranchPlant", internalVO.getSzBranchPlant());
      bsfnParams.setValue("mnBranchPlantOffset", internalVO.getMnBranchPlantOffset());
      
      
      /* Call the jde business function */
      try
      {
        /* Execute the bsfn service */
        IBSFNService bsfnService = context.getBSFNService();
        bsfnService.execute(context, connection, "WorkDaysCalculation", bsfnParams);
        
        /* Copy data back to value object */
        
        internalVO.setMnCalculatedBranchPlantOffset((MathNumeric)bsfnParams.getValue("mnCalculatedBranchPlantOffset"));
        internalVO.setSzErrorId((String)bsfnParams.getValue("szErrorId"));
       internalVO.setSzErrorDescription((String)bsfnParams.getValue("szErrorDescription"));
                                                                
      }
      catch(Exception exp)
      {
          E1Message msg = new E1Message(context, "$E0272", "Invaild Value Passed");
          messages.addMessage(msg);
      }
      messages.addMessages(bsfnParams.getE1MessageList());
      
      //internalVO.setMnCalculatedBranchPlantOffset((MathNumeric)bsfnParams.getValue("mnCalculatedBranchPlantOffset"));
     // internalVO.setSzErrorId((String)bsfnParams.getValue("szErrorId").toString());
      //return bsfnParams.getE1MessageList();
      return messages;
    }
}
