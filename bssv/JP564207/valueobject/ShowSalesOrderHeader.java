package be.e1.bssv.JP564207.valueobject;

import be.e1.bssv.J564207.valueobject.InternalGetSalesOrderHeader;


import java.io.Serializable;

import oracle.e1.bssvfoundation.base.MessageValueObject;


/**
 * TODO: Java Doc comments for Value Object here
 */
public class ShowSalesOrderHeader extends MessageValueObject implements Serializable {
    /**
     * Array of WorkOrder Serial No arrays returned from query.
     */
    private SalesOrderHeader salesOrderHeader[];

    /**
     * TODO: Default public constructor for instantiating: ShowWorkOrderSerialNo
     */
    public ShowSalesOrderHeader() {
    }

    public ShowSalesOrderHeader(InternalGetSalesOrderHeader internalVO) {
        if (internalVO.getQueryResults() != null) {

            this.salesOrderHeader =
                    new SalesOrderHeader[internalVO.getQueryResults().size()];
            for (int i = 0; i < internalVO.getQueryResults().size(); i++) {

                SalesOrderHeader soHeader =
                    new SalesOrderHeader(internalVO.getQueryResults(i));

                this.setSalesOrderHeader(i, soHeader);
            }
        
        }

    }

    public void setSalesOrderHeader(SalesOrderHeader[] salesOrderHeader) {
        this.salesOrderHeader = salesOrderHeader;
    }

    public SalesOrderHeader[] getSalesOrderHeader() {
        return salesOrderHeader;
    }

    public void setSalesOrderHeader(int i, SalesOrderHeader salesOrderHeader) {
        this.salesOrderHeader[i] = salesOrderHeader;
    }

    public SalesOrderHeader getSalesOrderHeader(int i) {
        return salesOrderHeader[i];
    }

}

