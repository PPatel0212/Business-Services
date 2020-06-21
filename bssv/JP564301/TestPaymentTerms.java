package be.e1.bssv.JP564301;

import be.e1.bssv.JP564301.valueobject.PaymentTermsReply;
import be.e1.bssv.JP564301.valueobject.PaymentTermsRequest;

public class TestPaymentTerms {
    
    public static void main(String[] args){
        
        PaymentTermsRequest req = new PaymentTermsRequest();
        req.setPaymentTermsCode("");
        
        PaymentTermsManager mgr = new PaymentTermsManager();
        PaymentTermsReply reply = new PaymentTermsReply();
        try{
            reply = mgr.getPaymentTerms(req);
        }catch(Exception exp){
            System.out.println(exp.toString());
        }
        System.out.println(reply.getDescriptionPaymentTerms());
        
    }
    
}
