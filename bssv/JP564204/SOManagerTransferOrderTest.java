package be.e1.bssv.JP564204;


//import be.e1.bssv.JP564204.BE_SOManagerTransferOrderInterface;
import be.e1.bssv.JP564204.valueobject.GetTransferOrderDetails;
import be.e1.bssv.JP564204.valueobject.SetTransferOrderResponse;
import oracle.e1.bssvfoundation.base.TestBusinessService;
import oracle.e1.bssvfoundation.exception.BusinessServiceException;

public class SOManagerTransferOrderTest {
    public SOManagerTransferOrderTest() {
        super();
    }
    public static void testGetTransferOrderDetails() throws BusinessServiceException {
          BE_SOManagerTransferOrderInterface mgr = new BE_SOManagerTransferOrderInterface();
            GetTransferOrderDetails vo = new GetTransferOrderDetails();
            vo.setCompanyKeyOrderNo("00001"); 
            vo.setShipConsolidationFlag("B");
            vo.setProductionNumber("4444");
            vo.setProductionNumberShort(new Integer(12345));
            vo.setSzP4210Version_VERS("ZJDE0001");
            vo.setOrderType("SO");
            vo.setDocumentOrderInvoiceE(new Integer(6808));
            vo.setCacheActionCode("CH");
                       
             SetTransferOrderResponse showVO = mgr.validateSOandUpdateTagFiles(vo);
            
            //  SetPickSlipPrintRequest vo = new SetPickSlipPrintRequest();
              //vo.setPickSlipNumber(new Integer(12356666));
              //SetPickSlipPrintResponse showVO = mgr.setPickSlipPrintResponse(vo);
             System.out.println(showVO.toString());
        }
    public static void main(String[] args) throws BusinessServiceException{
        try{  
                 //call required prior to starting test from application (main())
                 TestBusinessService.startTest();     
                testGetTransferOrderDetails();
             }
             finally{
                 //call required after completing test from application (main())
                 TestBusinessService.finishTest();
             }
        
    }
   
}
