package be.e1.bssv.JP564102;

import be.e1.bssv.JP564102.valueobject.InputVOCreateItemReg;
import be.e1.bssv.JP564102.valueobject.ReturnVOCreateItemReg;

public class CreateItemRegTest {
    public static void main(String[] args) {
        
        ReturnVOCreateItemReg res = new ReturnVOCreateItemReg();
        InputVOCreateItemReg req = new InputVOCreateItemReg();
        
        req.setNdItemNumber("RK12MAY-11");
        req.setItemGroup("REG");
        req.setDescription("Test create");
        req.setDescriptionLine2("DSC2 Test");
        req.setItemType("nope");
        req.setSourceSystem("teamcenter");
        
        CreateItemRegistryManager mgr = new CreateItemRegistryManager();
        try {
          res = mgr.CreateItemRegPubMethod(req);
          System.out.println(res);
      
        } catch (Exception exp) {
          System.out.println(exp.getMessage());
        }
                
    }
}
