package be.e1.bssv.JP560001;


import be.e1.bssv.JP560001.valueobject.ECMDocumentIDInformation;
import be.e1.bssv.JP560001.valueobject.ECMDocumentIDList;
import be.e1.bssv.JP560001.valueobject.GetECMDocumentIDInformation;
import be.e1.bssv.JP560001.valueobject.ShowECMDocumentIDInformation;

public class TestClassECMDocumentID {
  public static void main(String[] args) {

    ShowECMDocumentIDInformation res = new ShowECMDocumentIDInformation();
    GetECMDocumentIDInformation req = new GetECMDocumentIDInformation();
    req.setECMDocumentIDInformation(new ECMDocumentIDInformation[25]);
      /* ECMDocumentIDInformation aa = new ECMDocumentIDInformation();
      aa.setSzDataValue("EONE05");
      aa.setSzFieldName("CPS05");
      ECMDocumentIDInformation bb = new ECMDocumentIDInformation();
      bb.setSzDataValue("EONE06");
      bb.setSzFieldName("CPS06"); */
for(int i = 0; i< 25; i++) {
    
    ECMDocumentIDInformation documentID = new ECMDocumentIDInformation();
    documentID.setSzDataValue("Data" + i);
    documentID.setSzFieldName("Field" + i);
    req.setECMDocumentIDInformation(i, documentID);
}


    req.setBarcodeID("JDE000157945");
    req.setMode("A");
       /*  req.setECMDocumentIDInformation(0, aa);
      req.setECMDocumentIDInformation(1, bb); */
      
    BE_ECMDocumentIDInformationManager mgr =
      new BE_ECMDocumentIDInformationManager();

    try {
      res = mgr.ecmDocumentIDInformationManager(req);
      System.out.println(res);
           

        } catch (Exception exp) {
      System.out.println(exp.getMessage());
    }
  }
}
