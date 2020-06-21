package be.e1.bssv.JP564207;

import be.e1.bssv.JP564207.valueobject.GetSalesOrderHeader;
import be.e1.bssv.JP564207.valueobject.ShowSalesOrderHeader;


public class BE_TestClassSalesHeader {
  public static void main(String[] args) {

    ShowSalesOrderHeader res = new ShowSalesOrderHeader();
    GetSalesOrderHeader req = new GetSalesOrderHeader();
    //req.setCostCenter("BH30");
    //req.setIdentifier2ndItem("45681667DR04");
req.setSoOrderNumber(12000027);
  //  req.setProductionNumber("UA7378003-003");

    BE_SalesOrderHeader mgr = new BE_SalesOrderHeader();

    try {
      res = mgr.SalesOrderHeader(req);
      System.out.println(res);
      System.out.println(res.getSalesOrderHeader(1).getDateDueMPS().getTime().toString());

    } catch (Exception exp) {
      System.out.println(exp.getMessage());
    }
  }
}
