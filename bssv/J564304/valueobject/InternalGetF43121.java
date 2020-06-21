package be.e1.bssv.J564304.valueobject;
import java.util.ArrayList;
import oracle.e1.bssvfoundation.base.ValueObject;


public class InternalGetF43121 extends ValueObject {
    private ArrayList queryResult = null;
    private InternalGetF43121WhereFields internalGetF43121WhereFields = new InternalGetF43121WhereFields();
    
        public InternalGetF43121() {}


    public void setQueryResult(ArrayList queryResult) {
        this.queryResult = queryResult;
    }

    public ArrayList getQueryResult() {
        return queryResult;
    }

    public void setInternalGetF43121WhereFields(InternalGetF43121WhereFields internalGetF43121WhereFields) {
        this.internalGetF43121WhereFields = internalGetF43121WhereFields;
    }

    public InternalGetF43121WhereFields getInternalGetF43121WhereFields() {
        return internalGetF43121WhereFields;
    }
    public InternalShowF43121Field getQueryResult(int i){
        return (InternalShowF43121Field)queryResult.get(i);
    }
}
