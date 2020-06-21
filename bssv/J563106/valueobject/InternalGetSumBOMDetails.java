package be.e1.bssv.J563106.valueobject;

import java.io.Serializable;

import java.util.ArrayList;

import oracle.e1.bssvfoundation.base.ValueObject;


/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalGetSumBOMDetails extends ValueObject implements Serializable {
  private ArrayList queryResults = null;

  private InternalGetSumBOMDetailsWhereFields queryWhereFields =
    new InternalGetSumBOMDetailsWhereFields();


  public InternalGetSumBOMDetails() {

  }

  public void setQueryResults(ArrayList queryResults) {
    this.queryResults = queryResults;
  }

  public ArrayList getQueryResults() {
    return queryResults;
  }

  public void setQueryWhereFields(InternalGetSumBOMDetailsWhereFields queryWhereFields) {
    this.queryWhereFields = queryWhereFields;
  }

  public InternalGetSumBOMDetailsWhereFields getQueryWhereFields() {
    return queryWhereFields;
  }



  public InternalShowSumBOM setQueryResults(int i) {
    return (InternalShowSumBOM)queryResults.get(i);
  }
  public InternalShowSalesDetails getQueryResultsSalesDetail(int i) {
    return (InternalShowSalesDetails)queryResults.get(i);
  }

 
}

