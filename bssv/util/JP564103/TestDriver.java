package be.e1.bssv.util.JP564103;

import be.e1.bssv.util.JP564103.valueobject.LaunchR5641042Reply;
import be.e1.bssv.util.JP564103.valueobject.LaunchR5641042Request;

public class TestDriver
{
  public static void main(String[] args)
  {
    try
    {
      LaunchR5641042Request request = new LaunchR5641042Request();
      request.setReportName("R5641042");
      request.setReportVersion("BDEN0001");
      request.setTransactionID(1000);
      request.setCRunAsynchronousYN("1");
      
      BE_PLMReportsManager ubeMgr = new BE_PLMReportsManager();
      LaunchR5641042Reply reply = ubeMgr.LaunchR5641042(request);
      
      System.out.println("Error Flag is: " + reply.getErrorCode());
      System.out.println("Error Message is: " + reply.getErrorDescription());
    }
    catch(Exception exp)
    {
      System.out.println("Exception occured: " + exp.getMessage());
    }
  }
}
