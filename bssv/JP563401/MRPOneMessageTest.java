package be.e1.bssv.JP563401;

import be.e1.bssv.JP563401.valueobject.GetMessageCancellationRequest;

import be.e1.bssv.JP563401.valueobject.ShowMessageCancellationReply;

import java.math.BigDecimal;

import oracle.e1.bssvfoundation.base.TestBusinessService;
import oracle.e1.bssvfoundation.exception.BusinessServiceException;

public  class MRPOneMessageTest {
    public MRPOneMessageTest() {
            }
    public static void testMRPOneClass() throws BusinessServiceException {
        
        BE_MRPOneMessageManager mgr = new BE_MRPOneMessageManager();
        GetMessageCancellationRequest vo = new GetMessageCancellationRequest();
        vo.setProgramID("JP563401");
        
        BigDecimal ukid = new BigDecimal("10000000001");

        vo.setUniqueKeyIDInternal(ukid);
        vo.setModeProcessing("P");
        ShowMessageCancellationReply showvo = mgr.getMRPOneMessage(vo);
        System.out.println(showvo.getErroMessage().toString());
        System.out.println(showvo.getErrorCode().toString());
       
    }
    public static void main(String[] args) throws BusinessServiceException{
        try {
        TestBusinessService.startTest();
        testMRPOneClass();
      
    }
    finally {
   TestBusinessService.finishTest();
    }
    }
           
}