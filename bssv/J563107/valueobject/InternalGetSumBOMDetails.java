package be.e1.bssv.J563107.valueobject;

import java.io.Serializable;

import java.util.ArrayList;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalGetSumBOMDetails extends ValueObject implements Serializable {

   private ArrayList queryResults; 

  private  InternalGetSumBOMDetailsWhereFields queryWhereFields =
    new InternalGetSumBOMDetailsWhereFields();

  public void setQueryResults(ArrayList queryResults) {
   if(queryResults!=null)
    this.queryResults = queryResults;
   
  }

  public ArrayList getQueryResults() {
    return queryResults;
  }

  public InternalShowSumBOMDetails getQueryResults(int i) {
    if(this.getQueryResults()!=null && this.getQueryResults().size()>0){
    return (InternalShowSumBOMDetails)queryResults.get(i);
    }
    else {
      return null;
    }
  }

  public void setQueryWhereFields(InternalGetSumBOMDetailsWhereFields queryWhereFields) {
   if(queryWhereFields == null)
   {
   this.queryWhereFields = new InternalGetSumBOMDetailsWhereFields();
   }
   else{
    this.queryWhereFields = queryWhereFields;
   }
  }

  public InternalGetSumBOMDetailsWhereFields getQueryWhereFields() {
    return queryWhereFields;
  }

}
