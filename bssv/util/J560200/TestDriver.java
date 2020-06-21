package be.e1.bssv.util.J560200;

import oracle.e1.bssvfoundation.base.TestBusinessService;
import oracle.e1.bssvfoundation.connection.IConnection;

public class TestDriver 
{
    public static void main(String[] args) 
    {
        try
        {
          TestBusinessService.startTest();
          //String testFile1 = "C:\\E910_1\\DV910\\java\\source\\be\\e1\\bssv\\util\\J560200\\valueobject\\SendEmail_D5602000A.xml";
          String testFile2 = "C:\\E910_1\\DV910\\java\\source\\be\\e1\\bssv\\util\\J560200\\valueobject\\GetEmailAddress_D5601000A.xml";
          //TestBusinessService.callBSSVWithXMLFile("be.e1.bssv.util.J560200.BE_SendEmail", "InternalSendEmail_B560200", testFile1, IConnection.AUTO);
          TestBusinessService.callBSSVWithXMLFile("be.e1.bssv.util.J560200.BE_GetEmailAddress", "InternalGetEmailAddress_N5601000", testFile2, IConnection.AUTO);
        }
        finally 
        {
            TestBusinessService.finishTest();
        }
    }
}
