package be.e1.bssv.JP564101;

import be.e1.bssv.JP564101.valueobject.GetCCBTrackerInformation;
import be.e1.bssv.JP564101.valueobject.ShowCCBTrackerInformation;


public class TestCCBTracker {
  public static void main(String[] args) {

    ShowCCBTrackerInformation res = new ShowCCBTrackerInformation();
    GetCCBTrackerInformation req = new GetCCBTrackerInformation();
    
    //req.setItemNumber("FG0001");
    req.setItemNumber("087835");
    req.setItemRevision("A");
    req.setCNNumber("RK14APR-4");
  BE_CCBTrackerInformationManager mgr = new BE_CCBTrackerInformationManager();
  
  try {
    res = mgr.ccbTrackerInformation(req);
    System.out.println(res);
   // System.out.println(res.getSalesOrderHeader(1).getDateDueMPS().getTime().toString());

  } catch (Exception exp) {
    System.out.println(exp.getMessage());
  }
  }
}
