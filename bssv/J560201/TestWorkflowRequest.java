package be.e1.bssv.J560201;

import oracle.e1.bssvfoundation.base.TestBusinessService;
import oracle.e1.bssvfoundation.connection.IConnection;

public class TestWorkflowRequest
{
  public static void main(String[] args)
  {
    try
    {
      String testClass = "be.e1.bssv.J560201.BE_WorkflowRequest";
      String testFunc = "InternalWorkflowRequest_B5602000";
      String inputFile = "C:\\E910_1\\DV910\\java\\source\\be\\e1\\bssv\\J560201\\valueobject\\WrkFlowReq_D5602000F.xml";
      //String inputFile = "C:\\E910_1\\DV910\\java\\source\\be\\e1\\bssv\\J560201\\valueobject\\RequestXml_B5602000_25.xml";
      
      TestBusinessService.startTest();
      TestBusinessService.callBSSVWithXMLFile(testClass, testFunc, inputFile, IConnection.AUTO);
    }
    finally
    {
      TestBusinessService.finishTest();
    }
  }
}
