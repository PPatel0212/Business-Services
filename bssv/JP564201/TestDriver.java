package be.e1.bssv.JP564201;

import be.e1.bssv.JP564201.valueobject.CustomerOrdersReply;
import be.e1.bssv.JP564201.valueobject.CustomerOrdersRequest;

import be.e1.bssv.JP564201.valueobject.OrderData;

import java.util.Calendar;
import java.util.Date;

public class TestDriver
{
  public static void printCal(Calendar cal)
  {
    int year = cal.get(Calendar.YEAR);
    int month = cal.get(Calendar.MONTH);
    int day = cal.get(Calendar.DAY_OF_MONTH);
    int hour = cal.get(Calendar.HOUR_OF_DAY);
    int minute = cal.get(Calendar.MINUTE);
    int second = cal.get(Calendar.SECOND);
    
    System.out.printf("%4d/%02d/%02d %02d:%02d:%02d\n", year, month+1, day, hour, minute, second);
  }
  
  public static void main(String[] args)
  {
    Calendar beginDate = Calendar.getInstance();
    beginDate.set(2013, 0, 1);
    System.out.println("Begin Date:");
    printCal(beginDate);
    
    Calendar endDate = Calendar.getInstance();
    endDate.set(2014, 12, 1);
    System.out.println("End Date: ");
    printCal(endDate);
    
    CustomerOrdersRequest request = new CustomerOrdersRequest();
    request.setCustomerShipToNumber(new Integer(137259));
    request.setBeginTransactionDate(beginDate);
    request.setEndTransactionDate(endDate);
    //request.setTransactionOriginator("ECOM");
    request.setOrderStatus("Open");
    
    try
    {
      EcommerceOrderProcessor orderProcessor = new EcommerceOrderProcessor();
      CustomerOrdersReply reply = orderProcessor.getCustomerOrders(request);
      
      if(reply.getCErrorFlag()== null)
      {
        OrderData orders[] = reply.getOrderInfo();
        for(int x=0; x<orders.length; x++)
        {
          System.out.println(orders[x].getOrderNumber()); 
          System.out.println(orders[x].getCustomerPO()); 
        }
      }
    }
    catch(Exception exp)
    {
      System.out.println(exp.getMessage());
    }
  }
}
