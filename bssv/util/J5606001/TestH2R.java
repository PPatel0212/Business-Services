package be.e1.bssv.util.J5606001;

import oracle.e1.bssvfoundation.base.TestBusinessService;
import oracle.e1.bssvfoundation.connection.IConnection;

public class TestH2R {
        public static void main(String[] args)
        {
          try
          {
            String testClass = "be.e1.bssv.util.J5606001.Internal_ProcessTimeTrac";
            String testFunction = "ProcessTimeTrac";
            String testFile = "C:\\E910_1\\DV910\\java\\source\\be\\e1\\bssv\\util\\J5606001\\valueobject\\InternalProcessTimetrac_D564072A.xml";
            
            TestBusinessService.startTest();
            TestBusinessService.callBSSVWithXMLFile(testClass, testFunction, testFile, IConnection.AUTO);
          }
          finally
          {
            TestBusinessService.finishTest();
          }
        }

}
