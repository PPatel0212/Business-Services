package be.e1.bssv.util.J564103;

import oracle.e1.bssvfoundation.base.TestBusinessService;
import oracle.e1.bssvfoundation.connection.IConnection;

public class TestDriver
{
  public static void main(String[] args)
  {
    String testClass = "be.e1.bssv.util.J564103.PLMReportsLauncher";
    String testFunction = "InternalLaunchR5641042";
    String testFile = "C:\\E910_1\\DV910\\java\\source\\be\\e1\\bssv\\util\\J564103\\valueobject\\DSR5641042.xml";
    
    try
    {
      TestBusinessService.startTest();
      TestBusinessService.callBSSVWithXMLFile(testClass, testFunction, testFile, IConnection.AUTO);
    }
    finally
    {
      TestBusinessService.finishTest();
    }
  }
}
