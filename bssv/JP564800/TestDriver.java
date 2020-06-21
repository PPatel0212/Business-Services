package be.e1.bssv.JP564800;

import be.e1.bssv.J564800.valueobject.WOMPSTag_D5648007;
import be.e1.bssv.JP564800.valueobject.ProcessWOReply;
import be.e1.bssv.JP564800.valueobject.ProcessWORequest;

import be.e1.bssv.JP564800.valueobject.ProcessWOTagReply;
import be.e1.bssv.JP564800.valueobject.ProcessWOTagRequest;

import java.math.BigDecimal;

import java.util.Calendar;
import java.util.Date;

public class TestDriver 
{
    public static void main(String[] args) 
    {
      try
      {    
        ProcessWORequest request = new ProcessWORequest();
             
        //Do a work order create
        request.setWorkOrderBranch("2740001");
          request.setWorkOrderStatus("40");   
        //Do a work order change
        request.setWorkOrderNumber(46942);
        request.setTransactionType("WM");
          request.setWorkOrderType("WO");
          request.setUserId("SCHANDOC");
        request.setMrpMessageID(new BigDecimal(1000000));
          
          BE_WorkOrderManager mgr = new BE_WorkOrderManager();
        
        ProcessWOReply reply = mgr.ProcessWorkOrder(request);
        
        //Do a routing update
      }
      catch(Exception exp)
      {
        System.out.println("Some problem occured.");    
      }
    }
}
