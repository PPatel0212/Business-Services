package be.e1.bssv.J564803.valueobject;

import java.io.Serializable;

import java.util.ArrayList;

import oracle.e1.bssvfoundation.base.ValueObject;


/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalGetWorkOrderSerialNo extends ValueObject implements Serializable {
 
  private ArrayList queryResults = null;
  private InternalGetWorkOrderSerialNoWhereFields queryWhereFields = new InternalGetWorkOrderSerialNoWhereFields();
  
  public InternalGetWorkOrderSerialNo (){
    
  }
  
  public void setQueryWhereFields(InternalGetWorkOrderSerialNoWhereFields queryWhereFields) {
          this.queryWhereFields = queryWhereFields;
      }

      public InternalGetWorkOrderSerialNoWhereFields getQueryWhereFields() {
          return queryWhereFields;
      }

      public void setQueryResults(ArrayList queryResults) {
          this.queryResults = queryResults;
      }

      public ArrayList getQueryResults() {
          return queryResults;
      }
      public InternalShowWorkOrderSerialNo getQueryResults(int i) {
          return (InternalShowWorkOrderSerialNo) queryResults.get(i);
      }
 
 
}
