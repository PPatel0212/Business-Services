package be.e1.bssv.J564202.valueobject;

import java.io.Serializable;

import java.util.ArrayList;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalGetSODetailsKey extends ValueObject implements Serializable {
    private ArrayList queryResults = null;
    private InternalGetSODetailsWhereFields queryWhereFields = new InternalGetSODetailsWhereFields();
    private String cSuccessfullyProcessedYN = null;
    
    public void setQueryResults(ArrayList queryResults) {
        this.queryResults = queryResults;
    }
    public ArrayList getQueryResults() {
        return queryResults;
    }
    public InternalShowSODetailsKey getQueryResults(int i) {
        return (InternalShowSODetailsKey)queryResults.get(i);
    }
    public void setQueryWhereFields(InternalGetSODetailsWhereFields queryWhereFields) {
        this.queryWhereFields = queryWhereFields;
    }
    public InternalGetSODetailsWhereFields getQueryWhereFields() {
        return queryWhereFields;
    }

    public void setCSuccessfullyProcessedYN(String cSuccessfullyProcessedYN) {
        this.cSuccessfullyProcessedYN = cSuccessfullyProcessedYN;
    }

    public String getCSuccessfullyProcessedYN() {
        return cSuccessfullyProcessedYN;
    }
}
