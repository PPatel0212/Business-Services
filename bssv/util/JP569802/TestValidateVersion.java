package be.e1.bssv.util.JP569802;

import be.e1.bssv.util.JP569802.valueobject.ValidateVersionReply;
import be.e1.bssv.util.JP569802.valueobject.ValidateVersionRequest;

public class TestValidateVersion {
    public static void main(String[] args) 
    {
       ValidateVersionManager vm = new ValidateVersionManager();
       ValidateVersionRequest req = new ValidateVersionRequest();
       req.setProgramID("R43500");
       req.setVersionHistory("XJDE0001");
       
       try
       {
         ValidateVersionReply rep = vm.BE_ValidateVersion(req);
           System.out.println(rep.getVersionTitle());
       }
       catch(Exception exp)
       {
       System.out.println("error");                        
        }
    }       
}
