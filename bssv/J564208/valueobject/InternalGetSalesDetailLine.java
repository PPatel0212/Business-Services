package be.e1.bssv.J564208.valueobject;


import java.io.Serializable;

import java.util.ArrayList;

import oracle.e1.bssvfoundation.base.ValueObject;


/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalGetSalesDetailLine extends ValueObject implements Serializable {

  InternalGetSalesDetailLineWhereFields queryWhereFields =
    new InternalGetSalesDetailLineWhereFields();
  private ArrayList queryResults;

  public void setQueryResults(ArrayList queryResults) {
    if (queryResults != null)
      this.queryResults = queryResults;

  }

  public ArrayList getQueryResults() {
    return queryResults;
  }

  public InternalShowSalesDetailLine getQueryResults(int i) {
    if (this.getQueryResults() != null && this.getQueryResults().size() > 0) {
      return (InternalShowSalesDetailLine)queryResults.get(i);
    } else {
      return null;
    }
  }

  public void setQueryWhereFields(InternalGetSalesDetailLineWhereFields queryWhereFields) {
    if (queryWhereFields == null) {
      this.queryWhereFields = new InternalGetSalesDetailLineWhereFields();
    } else {
      this.queryWhereFields = queryWhereFields;
    }
  }

  public InternalGetSalesDetailLineWhereFields getQueryWhereFields() {
    return queryWhereFields;
  }

}
