package be.e1.bssv.JP564208.valueobject;


import be.e1.bssv.J564208.valueobject.InternalGetSalesDetailLine;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.MessageValueObject;


/**
 * TODO: Java Doc comments for Value Object here
 */
public class ShowTSOSalesOrderDetailLine extends MessageValueObject implements Serializable {
 
 private TSOSalesOrderDetailLines[] salesOrderLine;
  /**
   * TODO: Default public constructor for instantiating: ShowTSOSalesOrderDetailLine
   */
  public ShowTSOSalesOrderDetailLine() {
  }

  public ShowTSOSalesOrderDetailLine(InternalGetSalesDetailLine internalVO) {
    if(internalVO.getQueryResults()!=null)
      if(internalVO.getQueryResults().size()>0){
        this.salesOrderLine = new TSOSalesOrderDetailLines[internalVO.getQueryResults().size()];
    for (int i = 0; i < internalVO.getQueryResults().size(); i++) {
      TSOSalesOrderDetailLines salesOrderLine = new TSOSalesOrderDetailLines(internalVO.getQueryResults(i));
     this.setSalesOrderLine(i, salesOrderLine); 
    }
      }
  }
  public void setSalesOrderLine(TSOSalesOrderDetailLines[] salesOrderLine) {
    this.salesOrderLine = salesOrderLine;
  }
  public void setSalesOrderLine(int i,TSOSalesOrderDetailLines salesOrderLine) {
    this.salesOrderLine[i] = salesOrderLine;
  }
  public TSOSalesOrderDetailLines[] getSalesOrderLine() {
    return salesOrderLine;
  }
  public TSOSalesOrderDetailLines[] getSalesOrderLine(int i) {
    if(i>0 && i<this.salesOrderLine.length)
    return salesOrderLine; 
    return null;
  }
}
