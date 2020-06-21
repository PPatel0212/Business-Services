package be.e1.bssv.JP560202;

import be.e1.bssv.JP560202.valueobject.WorkflowAckReply;
import be.e1.bssv.JP560202.valueobject.WorkflowAckRequest;

import oracle.e1.bssvfoundation.exception.BusinessServiceException;

public class TestWorkflowAck
{
  public static void main(String[] args)
  {
    WorkflowAckRequest request = new WorkflowAckRequest();
    request.setMessageId(29);
    request.setResponderComment("Testing Acknowledgements");
    request.setResponderName("Casely Schandorf");
    request.setResponderNumber(59969);
    request.setResponderTitle("Senior Developer");
    request.setWorkflowLineType("ACK");
    request.setWorkflowRouteLevel("1");
    request.setWorkflowStatus("APPROVED");
  
    try
    {
      BE_AckWorkflowManager wrkMgr = new BE_AckWorkflowManager();
      WorkflowAckReply reply = wrkMgr.AcknowledgeWorkflow(request);
      System.out.print("Error Code is: ");
      System.out.println(reply.getErrorCode());
      System.out.print("Error Message is: ");
      System.out.println(reply.getErrorDescription());
    }
    catch(BusinessServiceException exp)
    {
      System.out.println("ERROR: Exception thrown");
    }
  }
}
