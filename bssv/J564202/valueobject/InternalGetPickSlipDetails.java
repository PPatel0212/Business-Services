package be.e1.bssv.J564202.valueobject;

import java.io.Serializable;

import java.util.ArrayList;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalGetPickSlipDetails extends ValueObject implements Serializable {
    private ArrayList queryResults = null;
    private InternalGetPickSlipDetailsWhereFields queryWhereFields = new InternalGetPickSlipDetailsWhereFields();

    public void setQueryResults(ArrayList queryResults) {
        this.queryResults = queryResults;
    }

    public ArrayList getQueryResults() {
        return queryResults;
    }

    public void setQueryWhereFields(InternalGetPickSlipDetailsWhereFields queryWhereFields) {
        this.queryWhereFields = queryWhereFields;
    }

    public InternalGetPickSlipDetailsWhereFields getQueryWhereFields() {
        return queryWhereFields;
    }
    public InternalShowPickSlipDetails getQueryResults(int i) {
        return (InternalShowPickSlipDetails)queryResults.get(i);
    }
}