package be.e1.bssv.util.JP560200;

import be.e1.bssv.util.JP560200.valueobject.GetEmailReply;
import be.e1.bssv.util.JP560200.valueobject.GetEmailRequest;

public class TestGetEmail
{
  public static void main(String[] args)
  {
    GetEmailRequest req = new GetEmailRequest();
    req.setAddressSearchType("AN8");
    req.setAddressNumber(new Integer(4242));
    GetEmailReply rep = new GetEmailReply();
    try
    {
    BE_EmailManager mgr=new BE_EmailManager();
     rep=mgr.GetEmailAddress(req);
      System.out.println(rep.getEmailAddress());
    }
    catch(Exception exp)
    {
      System.out.println(exp.getMessage());
    }
  }
}
