package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.CodAddTransportationChargesDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.CodCollectionType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.CodDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.CodReturnReferenceIndicatorType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.ContactAndAddress;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.Party;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.TrackingId;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntCodDetail extends ValueObject implements Serializable
{
  private IntMoney codCollectionAmount = null;
  private IntCodAddTransportationChargesDetail addTransportationChargesDetail = null;
  private IntCodCollectionType collectionType = null;
  private IntParty codRecipient = null;
  private IntContactAndAddress financialInstitutionContactAndAddress = null;
  private String remitToName = null;
  private IntCodReturnReferenceIndicatorType referenceIndicator = null;
  private IntTrackingId returnTrackingId = null;

  public void setCodCollectionAmount(IntMoney codCollectionAmount)
  {
    this.codCollectionAmount = codCollectionAmount;
  }

  public IntMoney getCodCollectionAmount()
  {
    return codCollectionAmount;
  }

  public void setAddTransportationChargesDetail(IntCodAddTransportationChargesDetail addTransportationChargesDetail)
  {
    this.addTransportationChargesDetail = addTransportationChargesDetail;
  }

  public IntCodAddTransportationChargesDetail getAddTransportationChargesDetail()
  {
    return addTransportationChargesDetail;
  }

  public void setCollectionType(IntCodCollectionType collectionType)
  {
    this.collectionType = collectionType;
  }

  public IntCodCollectionType getCollectionType()
  {
    return collectionType;
  }

  public void setCodRecipient(IntParty codRecipient)
  {
    this.codRecipient = codRecipient;
  }

  public IntParty getCodRecipient()
  {
    return codRecipient;
  }

  public void setFinancialInstitutionContactAndAddress(IntContactAndAddress financialInstitutionContactAndAddress)
  {
    this.financialInstitutionContactAndAddress = financialInstitutionContactAndAddress;
  }

  public IntContactAndAddress getFinancialInstitutionContactAndAddress()
  {
    return financialInstitutionContactAndAddress;
  }

  public void setRemitToName(String remitToName)
  {
    this.remitToName = remitToName;
  }

  public String getRemitToName()
  {
    return remitToName;
  }

  public void setReferenceIndicator(IntCodReturnReferenceIndicatorType referenceIndicator)
  {
    this.referenceIndicator = referenceIndicator;
  }

  public IntCodReturnReferenceIndicatorType getReferenceIndicator()
  {
    return referenceIndicator;
  }

  public void setReturnTrackingId(IntTrackingId returnTrackingId)
  {
    this.returnTrackingId = returnTrackingId;
  }

  public IntTrackingId getReturnTrackingId()
  {
    return returnTrackingId;
  }
  
  public void copyToCodDetail(CodDetail outData)
  {
    if(this.addTransportationChargesDetail != null)
    {
      CodAddTransportationChargesDetail charges = new CodAddTransportationChargesDetail();
      this.addTransportationChargesDetail.copyToCodAddTransportationChargesDetail(charges);
      outData.setAddTransportationChargesDetail(charges);
    }
    
    if(this.codRecipient != null)
    {
      Party pty = new Party();
      this.codRecipient.copyToParty(pty);
      outData.setCodRecipient(pty);
    }
    
    if(this.collectionType != null)
    {
      CodCollectionType colType = CodCollectionType.fromString(this.collectionType.getValue());
      outData.setCollectionType(colType);
    }
    
    if(this.financialInstitutionContactAndAddress != null)
    {
      ContactAndAddress cta = new ContactAndAddress();
      this.financialInstitutionContactAndAddress.copyToContactAndAddress(cta);
      outData.setFinancialInstitutionContactAndAddress(cta);
    }
    
    if(this.referenceIndicator != null)
    {
      CodReturnReferenceIndicatorType indicatorType = CodReturnReferenceIndicatorType.fromString(this.referenceIndicator.getValue());
      outData.setReferenceIndicator(indicatorType);
    }
    
    outData.setRemitToName(this.remitToName);
    
    if(this.returnTrackingId != null)
    {
      TrackingId id = new TrackingId();
      outData.setReturnTrackingId(id);
    }
  }
}
