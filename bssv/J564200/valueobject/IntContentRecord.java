package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.ContentRecord;

import java.io.Serializable;

import java.math.BigInteger;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class IntContentRecord extends ValueObject implements Serializable
{
    String partNumber = null;
    String itemNumber = null;
    Integer receivedQuantity = null;
    String description = null;

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getItemNumber() {
        return itemNumber;
    }

    public void setReceivedQuantity(Integer receivedQuantity) {
        this.receivedQuantity = receivedQuantity;
    }

    public Integer getReceivedQuantity() {
        return receivedQuantity;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    
    public void copyToContentRecord(ContentRecord outData)
    {
      if(outData != null)
      {
          outData.setPartNumber(this.partNumber);
          outData.setItemNumber(this.itemNumber);
          outData.setDescription(this.description);
          outData.setReceivedQuantity(BigInteger.valueOf(this.receivedQuantity));
      }
    }
}
