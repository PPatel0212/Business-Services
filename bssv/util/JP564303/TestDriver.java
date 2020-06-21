package be.e1.bssv.util.JP564303;

import be.e1.bssv.util.JP564303.valueobject.POReply;
import be.e1.bssv.util.JP564303.valueobject.PORequest;

public class TestDriver 
{
  public static void main(String[] args)
  {
    PORequest poReq = new PORequest();
    
    poReq.setBiLinkFlag("1");
    poReq.setOrderNumber(5593);
    poReq.setOrderType("OP");
    poReq.setReportName("R5543500");
    poReq.setReportVersion("BSP");
    poReq.setOrderCompanyOrderNumber("00200");
    poReq.setOrderSuffix("000");
    
    try
    {
      BE_RunPOManager mgr = new BE_RunPOManager();
      POReply poRep = mgr.runPO(poReq);
      
      System.out.println(poRep.getErrorCode());
    }
    catch(Exception exp)
    {
      System.out.println("Exception Occured");
      System.out.println(exp.getMessage());
    }
  }
}
