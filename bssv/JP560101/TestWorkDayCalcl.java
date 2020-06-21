package be.e1.bssv.JP560101;

import be.e1.bssv.JP560101.valueobject.WorkDayReply;
import be.e1.bssv.JP560101.valueobject.WorkDayRequest;
import be.e1.bssv.JP560202.BE_AckWorkflowManager;
import be.e1.bssv.JP560202.valueobject.WorkflowAckReply;
import be.e1.bssv.JP560202.valueobject.WorkflowAckRequest;

import oracle.e1.bssvfoundation.exception.BusinessServiceException;

public class TestWorkDayCalcl {
    public static void main(String[] args) {
        WorkDayRequest request = new WorkDayRequest();
        request.setOffsetNumber(6);
        request.setBranchPlant("2620001");
        
        try
        {
          
          BE_WorkDayCalculationManager wrkMgr=new BE_WorkDayCalculationManager();
          WorkDayReply reply=wrkMgr.CalculateWorday(request);
          System.out.print("The calculated offset no is: ");
          System.out.println(reply.getCalculatedBranchPlantOffset());
          //System.out.println(reply.getErrorID());
          
        }
        catch(BusinessServiceException exp)
        {
          System.out.println("ERROR: Exception thrown");
        }
    }
}
