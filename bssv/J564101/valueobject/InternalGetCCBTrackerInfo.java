package be.e1.bssv.J564101.valueobject;



import java.io.Serializable;

import java.util.ArrayList;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalGetCCBTrackerInfo extends ValueObject implements Serializable {
  private ArrayList queryResults = null;
  private InternalGetCCBTrackerInfoWhereFields queryWhereFields = new InternalGetCCBTrackerInfoWhereFields();
  
  public InternalGetCCBTrackerInfo (){ 
  }
  
  public void setQueryWhereFields(InternalGetCCBTrackerInfoWhereFields queryWhereFields) {
          this.queryWhereFields = queryWhereFields;
      }

      public InternalGetCCBTrackerInfoWhereFields getQueryWhereFields() {
          return queryWhereFields;
      }

      public void setQueryResults(ArrayList queryResults) {
          this.queryResults = queryResults;
      }

      public ArrayList getQueryResults() {
          return queryResults;
      }
      public InternalShowCCBTrackerInfo getQueryResults(int i) {
          return (InternalShowCCBTrackerInfo) queryResults.get(i);
      }
  

  }
