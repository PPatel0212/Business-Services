package be.e1.bssv.JP564205;


import be.e1.bssv.JP564205.valueobject.GetTSOSalesOrderLines;

import java.math.BigDecimal;

import oracle.e1.bssvfoundation.base.TestBusinessService;

public class TestBE_TSO_SalesLinesManager {
    public static void main(String[] args) {
        //TestBE_TSO_SalesLinesManager testBE_TSO_SalesLinesManager = new TestBE_TSO_SalesLinesManager();
        try{
            TestBusinessService.startTest();

            GetTSOSalesOrderLines inputVO = new GetTSOSalesOrderLines();
            
            inputVO.setBranch_Plant("M30");
            inputVO.setSo_No(150);
            inputVO.setSo_Type("SO");
            inputVO.setSo_Line_No(new BigDecimal("0.00"));
            
            BE_TSO_SalesLinesManager callObj = new BE_TSO_SalesLinesManager();
            callObj.GetTSOSalesLinesDetails(inputVO);
        }catch(Exception e){
            e.printStackTrace();
         }finally{
                TestBusinessService.finishTest();
        }
    }
}
