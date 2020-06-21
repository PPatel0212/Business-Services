package be.e1.bssv.J564102;

import be.e1.bssv.JP564102.CreateItemRegistryManager;
import be.e1.bssv.JP564102.valueobject.InputVOCreateItemReg;

import be.e1.bssv.JP564102.valueobject.ReturnVOCreateItemReg;

import oracle.e1.bssvfoundation.base.TestBusinessService;
import oracle.e1.bssvfoundation.exception.BusinessServiceException;


public class CretateItemRegTestClass {
    public CretateItemRegTestClass() {
        super();
    }

    public static void testCreateItemReg() throws BusinessServiceException {
        //instantiate the CreateItemRegistryManager class
        //CretateItemRegTestClass cretateItemRegTestClass = new CretateItemRegTestClass();
        CreateItemRegistryManager CreateItemRegistryManager = new CreateItemRegistryManager();
        //Instantiate and/or declare the needed data structures 
        InputVOCreateItemReg inputVO= new InputVOCreateItemReg();
        ReturnVOCreateItemReg returnVO;
        
        inputVO.setItemGroup("REG");
        inputVO.setDescription("description001");
        inputVO.setDescriptionLine2("descriptionLine2_001");
        inputVO.setNdItemNumber("RKTS10MAR-5");
        inputVO.setItemID("PLMitemID");
        inputVO.setNameRemark("TeamCenter");
        inputVO.setShortItemNumber(66666);
        inputVO.setSourceSystem("TEAMCENTER");
        returnVO = CreateItemRegistryManager.CreateItemRegPubMethod(inputVO);
        //Print Output
        System.out.println("Error Desc: "+returnVO.getLargeString());
        System.out.println("ErrorID: "+returnVO.getDataItem());
    }
    
    public static void main(String[] args) throws BusinessServiceException {
        
        try {
            TestBusinessService.startTest();
            testCreateItemReg();
        }
        finally {
            TestBusinessService.finishTest();
    }
}
}