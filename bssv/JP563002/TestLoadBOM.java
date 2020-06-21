package be.e1.bssv.JP563002;

import be.e1.bssv.JP563002.valueobject.LoadBOMChild;
import be.e1.bssv.JP563002.valueobject.LoadBOMParent;

import be.e1.bssv.JP563002.valueobject.ConfirmLoadItemBOM;

import java.math.BigDecimal;

import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BusinessServiceException;
import oracle.e1.bssvfoundation.util.E1MessageList;

public class TestLoadBOM {
    public TestLoadBOM() {
        super();
    }

    public static void main(String[] args) {
        
        LoadBOMParent vo = new LoadBOMParent();
        vo.setItemNumber2ndKit("220TEST");
        vo.setCostCenterAlt("40");
        vo.setReportWriterType("UPB");
        
        LoadBOMChild childArr[] = new LoadBOMChild[3];
        LoadBOMChild childArr1 = new LoadBOMChild();
        childArr1.setIdentifier2ndItem("3008");
        childArr1.setQtyRequiredStandard(new BigDecimal(1));
        childArr[0] = childArr1;
        
        LoadBOMChild childArr2 = new LoadBOMChild();
        childArr2.setIdentifier2ndItem("2035");
        childArr2.setQtyRequiredStandard(new BigDecimal(1));
        childArr[1] = childArr2;
        
        LoadBOMChild childArr3 = new LoadBOMChild();
        childArr3.setIdentifier2ndItem("2023");
        childArr3.setQtyRequiredStandard(new BigDecimal(1));
        childArr[2] = childArr3;
        vo.setChild(childArr);
        
        IContext context = null;
        IConnection connection = null;
        ConfirmLoadItemBOM s = null;
        BE_LoadItemBOMManager bom =  new BE_LoadItemBOMManager();
        E1MessageList el;
        try {
        s = bom.loadBOM(context, connection, vo);
        } catch (BusinessServiceException e) {
        e.printStackTrace(System.out);
        }
        finally {
        System.out.println(s.toString());
        }
    }
}