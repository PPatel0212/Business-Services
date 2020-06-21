package be.e1.bssv.JP564205.valueobject;

import be.e1.bssv.J564205.valueobject.InternalVOTSOSalesLines;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class ShowTSOSalesOrderLines extends ValueObject implements Serializable {
   
    private ShowSalesAndWorkOrderLine[] SalesOrderDetailVO = null;                    
    
    /**
     * TODO: Default public constructor for instantiating: ShowTSOSalesOrderLines
     */
    public ShowTSOSalesOrderLines() {
    }
    
    public ShowTSOSalesOrderLines(InternalVOTSOSalesLines internalVO) {
        
        if(internalVO.getTSOSalesLinesVO() != null && internalVO.getTSOSalesLinesVO().length > 0){
        
            ShowSalesAndWorkOrderLine[] PubSalesLineArray = new ShowSalesAndWorkOrderLine[internalVO.getTSOSalesLinesVO().length];
        
            for(int i = 0; i < internalVO.getTSOSalesLinesVO().length; i++){
                PubSalesLineArray[i].setBranchPlant(internalVO.getTSOSalesLinesVO()[i].getF4211_MCU());
                PubSalesLineArray[i].setSo_No(internalVO.getTSOSalesLinesVO()[i].getF4211_DOCO().intValue());
                PubSalesLineArray[i].setSo_Line_No(internalVO.getTSOSalesLinesVO()[i].getF4211_LNID().bigDecimalValue());
                PubSalesLineArray[i].setSo_Line_Typ(internalVO.getTSOSalesLinesVO()[i].getF4211_LNTY());
                PubSalesLineArray[i].setShort_Part_No(internalVO.getTSOSalesLinesVO()[i].getF4211_ITM().intValue());
                PubSalesLineArray[i].setCustomer_PO_No(internalVO.getTSOSalesLinesVO()[i].getF4201_VR01());
                PubSalesLineArray[i].setPart_No(internalVO.getTSOSalesLinesVO()[i].getF4211_LITM());
                PubSalesLineArray[i].setPart_Dsc(internalVO.getTSOSalesLinesVO()[i].getF4211_DSC1());
                PubSalesLineArray[i].setPart_Revision(internalVO.getTSOSalesLinesVO()[i].getF4211_MERL());
                PubSalesLineArray[i].setShipSetNumber(internalVO.getTSOSalesLinesVO()[i].getF564211_Z56SSN());
                PubSalesLineArray[i].setModel(internalVO.getTSOSalesLinesVO()[i].getF4211_SRP3_Desc());
                PubSalesLineArray[i].setModel_Code(internalVO.getTSOSalesLinesVO()[i].getF4211_SRP3());
                PubSalesLineArray[i].setLine_Qty(internalVO.getTSOSalesLinesVO()[i].getF564803_Z56SCAP().bigDecimalValue());
                PubSalesLineArray[i].setPax_Count(internalVO.getTSOSalesLinesVO()[i].getPaxCount().bigDecimalValue());
                
                if(internalVO.getTSOSalesLinesVO()[i].getRelatedWODetail() != null  && internalVO.getTSOSalesLinesVO()[i].getRelatedWODetail().length > 0){
                    ShowWorkOrderLine[] PubWOLinesArray = new ShowWorkOrderLine[internalVO.getTSOSalesLinesVO()[i].getRelatedWODetail().length];
                    
                    for(int j = 0; j < internalVO.getTSOSalesLinesVO()[i].getRelatedWODetail().length; j++){
                        PubWOLinesArray[j].setProduction_Number(internalVO.getTSOSalesLinesVO()[i].getF4211_PMPN());
                        PubWOLinesArray[j].setSerial_Number(internalVO.getTSOSalesLinesVO()[i].getRelatedWODetail()[j].getF4220_SRL1());
                        PubWOLinesArray[j].setWork_Order_No(internalVO.getTSOSalesLinesVO()[i].getRelatedWODetail()[j].getF4801_DOCO().intValue());
                        PubWOLinesArray[j].setWork_Order_Type(internalVO.getTSOSalesLinesVO()[i].getRelatedWODetail()[j].getF4801_DCTO());
                    }
                    
                    PubSalesLineArray[i].setWorkOrderVO(PubWOLinesArray);
                    
                    PubWOLinesArray = null;
                }
            }
        
             this.setSalesOrderDetailVO(PubSalesLineArray);
        }
    }

    public void setSalesOrderDetailVO(ShowSalesAndWorkOrderLine[] SalesOrderDetailVO) {
        this.SalesOrderDetailVO = SalesOrderDetailVO;
    }

    public ShowSalesAndWorkOrderLine[] getSalesOrderDetailVO() {
        return SalesOrderDetailVO;
    }
}
