package be.e1.bssv.J564200;

import oracle.e1.bssvfoundation.base.TestBusinessService;
import oracle.e1.bssvfoundation.connection.IConnection;
import be.e1.bssv.J564200.BE_FedexManager;

public class TestDriver
{
  public static void main(String [] args)
  {
    String testFile = "C:\\E910_1\\DV910\\java\\source\\be\\e1\\bssv\\J564200\\valueobject\\FedexShipProcess_B5642000.xml";
    //String testFile = "C:\\E910_1\\DV910\\java\\source\\be\\e1\\bssv\\J564200\\valueobject\\ProcessShipment_D5642000A.xml";
    String testClass = "be.e1.bssv.J564200.BE_FedexManager";
    String testFunction = "InternalProcessShipment_B5642000";
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
