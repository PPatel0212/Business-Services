package be.e1.bssv.JP563107;

import be.e1.bssv.JP563107.valueobject.GetSumBOMDetails;
import be.e1.bssv.JP563107.valueobject.ShowSumBOMDetails;

public class BE_TestClassSUMBOMDetails {
  public static void main(String[] args) {
   GetSumBOMDetails req = new GetSumBOMDetails();
   ShowSumBOMDetails res = new ShowSumBOMDetails();
  
  req.setDocumentOrderInvoiceE(8038);
  req.setOrderType("SO");
  
  BE_GetSumBOMDetailsManager mgr = new BE_GetSumBOMDetailsManager();
  
  try {
    res = mgr.getSumBOMDetails(req);
    System.out.println(res);
  }
    catch (Exception exp) {
          System.out.println(exp.getMessage());
        }
  }
}
