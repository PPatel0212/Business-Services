package be.e1.bssv.J564207.valueobject;


import java.io.Serializable;

import java.util.ArrayList;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalGetSalesOrderHeader extends ValueObject implements Serializable {
    private ArrayList queryResults = null;
    private InternalGetSalesOrderHeaderWhereFields queryWhereFields = new InternalGetSalesOrderHeaderWhereFields();
    
    public InternalGetSalesOrderHeader (){
      
    }
    
    public void setQueryWhereFields(InternalGetSalesOrderHeaderWhereFields queryWhereFields) {
            this.queryWhereFields = queryWhereFields;
        }

        public InternalGetSalesOrderHeaderWhereFields getQueryWhereFields() {
            return queryWhereFields;
        }

        public void setQueryResults(ArrayList queryResults) {
            this.queryResults = queryResults;
        }

        public ArrayList getQueryResults() {
            return queryResults;
        }
        public InternalShowSalesOrderHeader getQueryResults(int i) {
            return (InternalShowSalesOrderHeader) queryResults.get(i);
        }
   

}
