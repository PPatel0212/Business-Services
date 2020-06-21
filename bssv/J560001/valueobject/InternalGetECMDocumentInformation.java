package be.e1.bssv.J560001.valueobject;


import java.io.Serializable;

import java.util.ArrayList;

import oracle.e1.bssvfoundation.base.ValueObject;


/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalGetECMDocumentInformation extends ValueObject implements Serializable {

    private ArrayList queryResults = null;
    private InternalGetECMDocumentInformationWhereFields queryWhereFields =
        new InternalGetECMDocumentInformationWhereFields();
    private ArrayList internalECMDocumentIDInformation = null;


    public void setQueryResults(ArrayList queryResults) {
        this.queryResults = queryResults;
    }

    public ArrayList getQueryResults() {
        return queryResults;
    }

    public void setQueryWhereFields(InternalGetECMDocumentInformationWhereFields queryWhereFields) {
        this.queryWhereFields = queryWhereFields;
    }

    public InternalGetECMDocumentInformationWhereFields getQueryWhereFields() {
        return queryWhereFields;
    }

    public InternalShowECMDocumentInformation getQueryResults(int i) {
        return (InternalShowECMDocumentInformation)queryResults.get(i);
    }

    public void setInternalECMDocumentIDInformation(ArrayList internalECMDocumentIDInformation) {
        this.internalECMDocumentIDInformation =
                internalECMDocumentIDInformation;
    }

    public ArrayList getInternalECMDocumentIDInformation() {
        return internalECMDocumentIDInformation;
    }

    public InternalECMDocumentIDInformation getInternalECMDocumentIDInformation(int i) {
        return (InternalECMDocumentIDInformation)internalECMDocumentIDInformation.get(i);
    }
}
