package be.e1.bssv.util.JP56CS01;

import be.e1.bssv.util.JP56CS01.valueobject.CompliancePartyReply;
import be.e1.bssv.util.JP56CS01.valueobject.CompliancePartyRequest;

public class TestDriver
{
  public static void main(String[] args)
  {
    try
    {
      CompliancePartyRequest req = new CompliancePartyRequest();
      req.setAddressNumber(162184);
      req.setAddressType("2");
      
      CompliancePartyManager cpm = new CompliancePartyManager();
      if(cpm != null)
      {
        CompliancePartyReply cpr = cpm.getComplianceParty(req);
        System.out.println(cpr.getAddressLine());
        System.out.println(cpr.getCity());
        System.out.println(cpr.getState());
      }
    }
    catch(Exception exp)
    {
      System.out.println("Some exception occured");
    }
  }
}
