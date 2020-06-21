package be.e1.bssv.J564202.valueobject;

import java.io.Serializable;

import java.util.ArrayList;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalUpdateSODetailsTag extends ValueObject implements Serializable {
    private InternalUpdateSODetailsTagWhereFields updateWhereFields = new InternalUpdateSODetailsTagWhereFields();
    private InternalUpdateSODetailsTagUpdateFields updateFields = new InternalUpdateSODetailsTagUpdateFields();

    public void setUpdateWhereFields(InternalUpdateSODetailsTagWhereFields updateWhereFields) {
        this.updateWhereFields = updateWhereFields;
    }

    public InternalUpdateSODetailsTagWhereFields getUpdateWhereFields() {
        return updateWhereFields;
    }

    public void setUpdateFields(InternalUpdateSODetailsTagUpdateFields updateFields) {
        this.updateFields = updateFields;
    }

    public InternalUpdateSODetailsTagUpdateFields getUpdateFields() {
        return updateFields;
    }
}
