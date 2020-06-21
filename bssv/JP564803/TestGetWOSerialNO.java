package be.e1.bssv.JP564803;

import be.e1.bssv.JP564803.valueobject.GetWorkOrderSerialNo;
import be.e1.bssv.JP564803.valueobject.ShowWorkOrderSerialNo;

public class TestGetWOSerialNO {
  public static void main(String[] args) {
    
     ShowWorkOrderSerialNo res = new ShowWorkOrderSerialNo();
      GetWorkOrderSerialNo req = new GetWorkOrderSerialNo();
      
   
    req.setProductionNumber("Q3PRODTEST");
   
  BE_FindWorkOrderSerialNo mgr = new BE_FindWorkOrderSerialNo();
  
  try {
    res = mgr.FindWorkOrderSerialNo(req);
    System.out.println(res);
    
  }catch(Exception exp){
    System.out.println(exp.getMessage());
  }
}
}

