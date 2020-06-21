package be.e1.bssv.JP564305;

import be.e1.bssv.JP564305.valueobject.POLineItemRevisionReply;
import be.e1.bssv.JP564305.valueobject.POLineItemRevisionRequest;

public class TestDriver
{
  public static void main(String[] args)
  {
      try 
      {
        POLineItemRevisionRequest req = new POLineItemRevisionRequest();
        req.setOrderNumber(4975);
        req.setOrderType("OP");
        req.setOrderCompany("00274");
                  
        MRPOneManager mgr = new MRPOneManager();
          POLineItemRevisionReply rep = mgr.CreatePOLineRevisedItem(req);
      }
      catch(Exception exp) 
      {
          System.out.println("Some Exception Occured");
          System.out.println(exp.getMessage());
      }
  }
}
