package be.e1.bssv.util.J569801;

import oracle.e1.bssvfoundation.base.TestBusinessService;
import oracle.e1.bssvfoundation.connection.IConnection;

public class TestFtpRequest
{
  public static void main(String[] args)
  {
    try
    {
      String testClass = "be.e1.bssv.util.J569801.BE_FtpRequest";
      String testFunction = "InternalTransferFile_B5698001";
      String testFile = "C:\\E910_1\\DV910\\java\\source\\be\\e1\\bssv\\util\\J569801\\valueobject\\B5698001_FtpRequest.xml";
      
      TestBusinessService.startTest();
      TestBusinessService.callBSSVWithXMLFile(testClass, testFunction, testFile, IConnection.AUTO);
    }
    finally
    {
      TestBusinessService.finishTest();
    }
  }
}
