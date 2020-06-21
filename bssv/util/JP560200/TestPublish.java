package be.e1.bssv.util.JP560200;

import be.e1.bssv.util.JP560200.valueobject.SendEmailReply;
import be.e1.bssv.util.JP560200.valueobject.SendEmailRequest;

public class TestPublish 
{
    public static void main(String[] args) 
    {
        SendEmailRequest req = new SendEmailRequest();
        req.setEmailAddressTo("casely_schandorf@beaerospace.com");
        req.setEmailAddressCc("casely_schandorf@beaerospace.com");
        req.setEmailAddressBcc("casely_schandorf@beaerospace.com");
        req.setSubject("Hello World");
        req.setEmailMessage("Yet another dumb hello world !!");
        
        SendEmailReply resp = new SendEmailReply();
        
        try 
        {
            BE_EmailManager mgr = new BE_EmailManager();
            resp = mgr.SendEmail(req);
            System.out.println(resp.getErrorCode());
            System.out.println(resp.getErrorMessage());
        }
        catch(Exception exp) 
        {    
            System.out.println(exp.getMessage());
        }
    }
}
