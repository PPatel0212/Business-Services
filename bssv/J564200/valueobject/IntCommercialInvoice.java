package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.CommercialInvoice;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomerReference;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.Money;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.PurposeOfShipmentType;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.TaxesOrMiscellaneousChargeType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.TermsOfSaleType;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntCommercialInvoice extends ValueObject implements Serializable
{
  private String[] comments = null;
  private IntMoney freightCharge = null;
  private IntMoney taxesOrMiscellaneousCharge = null;
  private IntTaxesOrMiscellaneousChargeType taxesOrMiscellaneousChargeType = null;
  private IntMoney packingCosts = null;
  private IntMoney handlingCosts = null;
  private String specialInstructions = null;
  private String declarationStatement = null;
  private String paymentTerms = null;
  private IntPurposeOfShipmentType purpose = null;
  private IntCustomerReference[] customerReferences = null;
  private String originatorName = null;
  private IntTermsOfSaleType termsOfSale = null;

  public void setComments(String[] comments)
  {
    this.comments = comments;
  }

  public String[] getComments()
  {
    return comments;
  }

  public void setFreightCharge(IntMoney freightCharge)
  {
    this.freightCharge = freightCharge;
  }

  public IntMoney getFreightCharge()
  {
    return freightCharge;
  }

  public void setTaxesOrMiscellaneousCharge(IntMoney taxesOrMiscellaneousCharge)
  {
    this.taxesOrMiscellaneousCharge = taxesOrMiscellaneousCharge;
  }

  public IntMoney getTaxesOrMiscellaneousCharge()
  {
    return taxesOrMiscellaneousCharge;
  }

  public void setTaxesOrMiscellaneousChargeType(IntTaxesOrMiscellaneousChargeType taxesOrMiscellaneousChargeType)
  {
    this.taxesOrMiscellaneousChargeType = taxesOrMiscellaneousChargeType;
  }

  public IntTaxesOrMiscellaneousChargeType getTaxesOrMiscellaneousChargeType()
  {
    return taxesOrMiscellaneousChargeType;
  }

  public void setPackingCosts(IntMoney packingCosts)
  {
    this.packingCosts = packingCosts;
  }

  public IntMoney getPackingCosts()
  {
    return packingCosts;
  }

  public void setHandlingCosts(IntMoney handlingCosts)
  {
    this.handlingCosts = handlingCosts;
  }

  public IntMoney getHandlingCosts()
  {
    return handlingCosts;
  }

  public void setSpecialInstructions(String specialInstructions)
  {
    this.specialInstructions = specialInstructions;
  }

  public String getSpecialInstructions()
  {
    return specialInstructions;
  }

  public void setDeclarationStatement(String declarationStatement)
  {
    this.declarationStatement = declarationStatement;
  }

  public String getDeclarationStatement()
  {
    return declarationStatement;
  }

  public void setPaymentTerms(String paymentTerms)
  {
    this.paymentTerms = paymentTerms;
  }

  public String getPaymentTerms()
  {
    return paymentTerms;
  }

  public void setPurpose(IntPurposeOfShipmentType purpose)
  {
    this.purpose = purpose;
  }

  public IntPurposeOfShipmentType getPurpose()
  {
    return purpose;
  }

  public void setCustomerReferences(IntCustomerReference[] customerReferences)
  {
    this.customerReferences = customerReferences;
  }

  public IntCustomerReference[] getCustomerReferences()
  {
    return customerReferences;
  }

  public void setOriginatorName(String originatorName)
  {
    this.originatorName = originatorName;
  }

  public String getOriginatorName()
  {
    return originatorName;
  }

  public void setTermsOfSale(IntTermsOfSaleType termsOfSale)
  {
    this.termsOfSale = termsOfSale;
  }

  public IntTermsOfSaleType getTermsOfSale()
  {
    return termsOfSale;
  }
  
  public void copyToCommercialInvoice(CommercialInvoice outData)
  {
    if(outData != null)
    {
      outData.setComments(this.comments);
      outData.setDeclarationStatement(this.declarationStatement);
      outData.setOriginatorName(this.originatorName);
      outData.setPaymentTerms(this.paymentTerms);
      outData.setSpecialInstructions(this.specialInstructions);
      
      Money mny = null;
      if(this.freightCharge != null)
      {
        mny = new Money();
        this.freightCharge.copyToMoney(mny);
        outData.setFreightCharge(mny);
      }
      
      if(this.taxesOrMiscellaneousCharge != null)
      {
        mny = new Money();
        this.taxesOrMiscellaneousCharge.copyToMoney(mny);
        outData.setTaxesOrMiscellaneousCharge(mny);
      }
      
      if(this.packingCosts != null)
      {
        mny = new Money();
        this.packingCosts.copyToMoney(mny);
        outData.setPackingCosts(mny);
      }
      
      if(this.handlingCosts != null)
      {
        mny = new Money();
        this.handlingCosts.copyToMoney(mny);
        outData.setHandlingCosts(mny);
      }
      
      if(this.taxesOrMiscellaneousChargeType != null)
      {
        TaxesOrMiscellaneousChargeType tmct = TaxesOrMiscellaneousChargeType.fromString(this.taxesOrMiscellaneousChargeType.getValue());
        outData.setTaxesOrMiscellaneousChargeType(tmct);
      }
      
      if(this.purpose != null)
      {
        PurposeOfShipmentType post = PurposeOfShipmentType.fromString(this.purpose.getValue());
        outData.setPurpose(post);
      }
      
      if(this.termsOfSale != null)
      {
        TermsOfSaleType tost = TermsOfSaleType.fromString(this.termsOfSale.getValue());
        outData.setTermsOfSale(tost);
      }
      
      if(this.customerReferences != null)
      {
        CustomerReference[] custRefArr = new CustomerReference[this.customerReferences.length];
        for(int x=0; x<this.customerReferences.length; x++)
        {
          custRefArr[x] = new CustomerReference();
          this.customerReferences[x].copyToCustomerReference(custRefArr[x]);
        }
        outData.setCustomerReferences(custRefArr);
      }
    }
  }
}
