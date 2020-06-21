package be.e1.bssv.JP560001.valueobject;

import be.e1.bssv.J560001.valueobject.InternalECMDocumentIDInformation;
import be.e1.bssv.J560001.valueobject.InternalGetECMDocumentInformation;

import be.e1.bssv.J560001.valueobject.InternalGetECMDocumentInformationWhereFields;

import java.io.Serializable;

import java.util.ArrayList;

import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.E1MessageList;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class GetECMDocumentIDInformation extends ValueObject implements Serializable {
    /**
     * Session ID
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: SESSID <br>
     * EnterpriseOne field length:  32 <br>
     */
    private String barcodeID = null;

    /**
     * Future Use String 1
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: S1FU <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String mode = null;

    private ECMDocumentIDInformation eCMDocumentIDInformation[];

    public E1MessageList mapFromPublished(IContext context,
                                          InternalGetECMDocumentInformation vo) {

        E1MessageList messages = new E1MessageList();
        ArrayList internalGetECMDocumentInformation = new ArrayList();
        if (this.getECMDocumentIDInformation() != null) {
            for (int i = 0; i < this.getECMDocumentIDInformation().length;
                 i++) {
                // Map fields only when they have value
                if ((this.getECMDocumentIDInformation(i).getSzDataValue()) != null 
                    && (this.getECMDocumentIDInformation(i).getSzDataValue()).trim().length() > 0){
                InternalECMDocumentIDInformation internalECMDocumentIDInformation =
                    new InternalECMDocumentIDInformation();
                internalECMDocumentIDInformation.setSzDataValue(this.getECMDocumentIDInformation(i).getSzDataValue());
                internalECMDocumentIDInformation.setSzFieldName(this.getECMDocumentIDInformation(i).getSzFieldName());
                internalGetECMDocumentInformation.add(internalECMDocumentIDInformation);
                    }
            }
            vo.setInternalECMDocumentIDInformation(internalGetECMDocumentInformation);
        }

        InternalGetECMDocumentInformationWhereFields queryWhereFields =
            vo.getQueryWhereFields();
        queryWhereFields.setF5600028_SESSID(this.getBarcodeID());
        queryWhereFields.setMode(this.getMode());
        vo.setQueryWhereFields(queryWhereFields);
        return messages;

    }

    /**
     * TODO: Default public constructor for instantiating: GetECMDocumentIDInformation
     */
    public GetECMDocumentIDInformation() {
    }


    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getMode() {
        return mode;
    }


    public void setBarcodeID(String barcodeID) {
        this.barcodeID = barcodeID;
    }

    public String getBarcodeID() {
        return barcodeID;
    }

    public void setECMDocumentIDInformation(ECMDocumentIDInformation[] eCMDocumentIDInformation) {
        this.eCMDocumentIDInformation = eCMDocumentIDInformation;
    }

    public void setECMDocumentIDInformation(int i,
                                            ECMDocumentIDInformation eCMDocumentIDInformation) {
        this.eCMDocumentIDInformation[i] = eCMDocumentIDInformation;
    }

    public ECMDocumentIDInformation[] getECMDocumentIDInformation() {
        return eCMDocumentIDInformation;
    }

    public ECMDocumentIDInformation getECMDocumentIDInformation(int i) {
        return eCMDocumentIDInformation[i];
    }
}
