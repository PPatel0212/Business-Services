package be.e1.bssv.util.JP560118;

import be.e1.bssv.util.JP560118.valueobject.GetABSDataReply;
import be.e1.bssv.util.JP560118.valueobject.GetABSDataRequest;
import be.e1.bssv.util.JP560118.valueobject.UpdateABSReply;
import be.e1.bssv.util.JP560118.valueobject.UpdateABSRequest;

import java.math.BigDecimal;

public class TestUpdateABSRequestNumber {
    public static void main(String[] args) {

        GetABSDataRequest get = new GetABSDataRequest();
        /*get.setRequestNumber("BARTKOSC14092200000264");*/
        get.setAddressNumber(new Integer(35805));
        /*get.setLineNumber(new BigDecimal(1.0));*/
        
        /*UpdateABSRequest req = new UpdateABSRequest();
        req.setRequestNumber("BARTKOSC14092200000264");
        req.setLineNumber(new BigDecimal(1.0));
        
        UpdateABSReply reply = new UpdateABSReply();*/
        GetABSDataReply reply = new GetABSDataReply();
        
        
        BE_ABSDataManager mgr = new BE_ABSDataManager();
        
        
        try{
            /*reply = mgr.getABSData(get);*/
          reply = mgr.getABSData(get);
            
            System.out.println(+reply.getAddressNumber());
            System.out.println(reply.getBackordersAllowed());
            System.out.println(reply.getCheckCreditLevel());
            System.out.println(reply.getItemRestrictions());
          
        }catch(Exception exp){
            System.out.println(exp.getMessage());
        }


    }
}
