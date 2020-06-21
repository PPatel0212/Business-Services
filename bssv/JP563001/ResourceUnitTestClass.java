package be.e1.bssv.JP563001;

import be.e1.bssv.JP563001.valueobject.ResourceUnits;
import be.e1.bssv.JP563001.valueobject.ResourceUnitsData;
import be.e1.bssv.JP563001.valueobject.ShowResourceUnits;

import java.math.BigDecimal;
import java.util.Calendar;

import oracle.e1.bssvfoundation.base.TestBusinessService;
import oracle.e1.bssvfoundation.exception.BusinessServiceException;

public class ResourceUnitTestClass {
    public ResourceUnitTestClass() {

    }

    public static void testresourceunitClass() throws BusinessServiceException {
        BE_ResourceUnitsManager mgr = new BE_ResourceUnitsManager();

        ResourceUnits vo = new ResourceUnits();

        ResourceUnitsData arrdata[] = new ResourceUnitsData[2];
        ResourceUnitsData arrdata1 = new ResourceUnitsData();
        ResourceUnitsData arrdata2 = new ResourceUnitsData();
        arrdata1.setBranch("M30");
        arrdata1.setBusinessUnit("R-C1");
        arrdata1.setShiftCode("1");
        arrdata1.setUnitResource01(new BigDecimal(3));
        Calendar calx = Calendar.getInstance();
        calx.set(2003, 02, 03);
        arrdata1.setDateUpdated(calx);
        arrdata[0] = arrdata1;

        arrdata2.setBranch("R-C1");
        arrdata2.setBusinessUnit("M30");
        arrdata2.setShiftCode("2");
        arrdata2.setUnitResource01(new BigDecimal(3));
        Calendar caly = Calendar.getInstance();
        caly.set(2003, 02, 03);
        arrdata2.setDateUpdated(caly);
        arrdata[1] = arrdata2;
        vo.setResourceUnitsData(arrdata);

        ShowResourceUnits showvo = mgr.updateResourceUnits(vo);
        System.out.println(showvo.toString());

    }

    public static void main(String[] args) throws BusinessServiceException {
        try {
            TestBusinessService.startTest();

            testresourceunitClass();
        } finally {
            TestBusinessService.finishTest();
        }
    }
}
