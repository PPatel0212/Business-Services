package be.e1.bssv.JP56E002;

import be.e1.bssv.JP56E002.valueobject.B5643512Reply;
import be.e1.bssv.JP56E002.valueobject.B5643512Request;

public class TestB5643512UBE {
    public static void main(String[] args) {
        B5643512Request req = new B5643512Request();
        req.setDocumentCompany("00274");
        req.setDocumentType("OV");
        req.setDocumentVoucherInvoiceetc(new Integer(4594));
        req.setPrinterName("kam_test");
        req.setVersionHistory("BDEN0003");
        
        B5643512Reply reply = new B5643512Reply();
        
        try{
            B5643512Manager mgr = new B5643512Manager();
            reply = mgr.processB5643512UBE(req);
            System.out.println(reply.getPrinterName());
            
            
        }catch(Exception exp){
            System.out.println(exp.getMessage());
        }
        
        
        
        
    }
}
