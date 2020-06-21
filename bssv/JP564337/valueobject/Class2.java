package be.e1.bssv.JP564337.valueobject;

import be.e1.bssv.JP564337.ProcessBSPCatchUpAPIPublished;
import be.e1.bssv.JP564337.valueobject.LaunchBSPCatchUpAPIReply;
import be.e1.bssv.JP564337.valueobject.LaunchBSPCatchUpAPIRequest;

import java.util.Date;

import oracle.e1.bssvfoundation.base.BSFNParameters;
import oracle.e1.bssvfoundation.base.BusinessService;
import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BSFNServiceInvalidArgException;
import oracle.e1.bssvfoundation.exception.BSFNServiceSystemException;
import oracle.e1.bssvfoundation.services.IBSFNService;
import oracle.e1.bssvfoundation.util.E1Message;
import oracle.e1.bssvfoundation.util.E1MessageList;
import oracle.e1.bssvfoundation.util.MathNumeric;

public class Class2 {
  public static void main(String[] args) {
    
    try{
      LaunchBSPCatchUpAPIRequest request = new LaunchBSPCatchUpAPIRequest();
      request.setAddressNumber(36442);
      ProcessBSPCatchUpAPIPublished process = new ProcessBSPCatchUpAPIPublished();
      LaunchBSPCatchUpAPIReply reply = process.ProcessBSPCatchUpAPILaunch(request);
          
      
    }
    catch(Exception exp)
    {
      System.out.println("Some problem occured.");    
    }
   
  }
}