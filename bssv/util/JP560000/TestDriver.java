package be.e1.bssv.util.JP560000;

import be.e1.bssv.util.JP560000.valueobject.F4211DataReplyA;
import be.e1.bssv.util.JP560000.valueobject.F4211DataRequestA;
import be.e1.bssv.util.JP560000.valueobject.F4311DataReply;

import be.e1.bssv.util.JP560000.valueobject.F4311DataRequest;

import java.math.BigDecimal;

public class TestDriver 
{
  public static void main(String[] args)
  {
    /*F4211DataRequestA request = new F4211DataRequestA();
    request.setOrderCompany("00274");
    request.setOrderNumber(10000953);
    request.setOrderType("S1");
    request.setOrderLine(new BigDecimal(1.000));
    
    try
    {
      DataEnrichmentManager dem = new DataEnrichmentManager();
      F4211DataReplyA reply = dem.BE_F4211SupplementalDataA(request);

        System.out.println("---------- Output Data ---------");
        System.out.println(reply.getAircraftTypeSeries());
        System.out.println(reply.getAircraftTypeName());
        System.out.println(reply.getDetailCustomerPO());
        System.out.println(reply.getCarrierName());
        System.out.println(reply.getSpecialInstructions());
    }
    catch(Exception exp)
    {
      System.out.println("Some exception occured.");
      System.out.println(exp.getMessage());
    }*/
      
    F4311DataRequest request = new F4311DataRequest();
   
    request.setOrderCompanyPO("00274"); 
    //request.setOrderNumberPO(469462);
    request.setOrderNumberPO(123456);
    request.setOrderTypePO("OT");
    request.setOrderLinePO(new BigDecimal(1.000));
    request.setOrderSuffixPO("000");
    
    try
    {
      DataEnrichmentManager dem = new DataEnrichmentManager();
      F4311DataReply reply = dem.BE_F4311SupplementalData(request);

        System.out.println("---------- Output Data ---------");
        System.out.println(reply.getBuyerNumberPO());
        System.out.println(reply.getRelatedOrderNumber());
        System.out.println(reply.getBuyerName());
    }
    catch(Exception exp)
    {
      System.out.println("Some exception occured.");
      System.out.println(exp.getMessage());
    }
  }
}
