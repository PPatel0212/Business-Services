package be.e1.bssv.JP564208;


import be.e1.bssv.JP564208.valueobject.GetTSOSalesOrderDetailLine;
import be.e1.bssv.JP564208.valueobject.ShowTSOSalesOrderDetailLine;

public class TestTSOSalesDetailLine {
  public static void main(String[] args) {
   GetTSOSalesOrderDetailLine req = new GetTSOSalesOrderDetailLine();
   ShowTSOSalesOrderDetailLine res = new ShowTSOSalesOrderDetailLine();
  
  req.setDocumentOrderInvoiceE(26209571);
  req.setOrderType("SO");
  
  BE_TSOSalesOrderDetailLineManager mgr = new BE_TSOSalesOrderDetailLineManager();
  
  try {
    
    res = mgr.tsoSalesOrderDetailLine(req);
    System.out.println(res);
  }
    catch (Exception exp) {
          System.out.println(exp.getMessage());
        }
  }
}
