package be.e1.bssv.util;

import oracle.e1.bssvfoundation.base.TestBusinessService;
import oracle.e1.bssvfoundation.connection.IConnection;

public class TestMOInternal
{
  public static void main(String[] args)
  {
    TestBusinessService.startTest();
    String testFile = "C:\\E910_1\\DV910\\java\\source\\be\\e1\\bssv\\util\\J569804\\valueobject\\InternalMOValueObject.xml";
    String testClass = "be.e1.bssv.util.J569804.BE_MOProcess";
    String testFunction = "InternalSelectMO";

    String testFile2 = "C:\\E910_1\\DV910\\java\\source\\be\\e1\\bssv\\util\\J569804\\valueobject\\MONotifyRequest.xml";
    String testClass2 = "be.e1.bssv.util.J569804.BE_MONotify";
    String testFunction2 = "InternalMediaObjectNotify_B5698003";

    try
    {
      int bSSVWithXMLFile = TestBusinessService.callBSSVWithXMLFile(testClass, testFunction, testFile, IConnection.AUTO);
      int bSSVWithXMLFile2 = TestBusinessService.callBSSVWithXMLFile(testClass2, testFunction2, testFile2, IConnection.AUTO);    
    }
    finally
    {
      TestBusinessService.finishTest();
    }
  }
}
