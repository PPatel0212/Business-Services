package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.FreightBaseCharge;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntFreightBaseCharge extends ValueObject implements Serializable
{
  private IntFreightClassType freightClass = null;
  private IntFreightClassType ratedAsClass = null;
  private String nmfcCode = null;
  private String description = null;
  private IntWeight weight = null;
  private IntMoney chargeRate = null;
  private IntFreightChargeBasisType chargeBasis = null;
  private IntMoney extendedAmount = null;

  public void setFreightClass(IntFreightClassType freightClass)
  {
    this.freightClass = freightClass;
  }

  public IntFreightClassType getFreightClass()
  {
    return freightClass;
  }

  public void setRatedAsClass(IntFreightClassType ratedAsClass)
  {
    this.ratedAsClass = ratedAsClass;
  }

  public IntFreightClassType getRatedAsClass()
  {
    return ratedAsClass;
  }

  public void setNmfcCode(String nmfcCode)
  {
    this.nmfcCode = nmfcCode;
  }

  public String getNmfcCode()
  {
    return nmfcCode;
  }

  public void setDescription(String description)
  {
    this.description = description;
  }

  public String getDescription()
  {
    return description;
  }

  public void setWeight(IntWeight weight)
  {
    this.weight = weight;
  }

  public IntWeight getWeight()
  {
    return weight;
  }

  public void setChargeRate(IntMoney chargeRate)
  {
    this.chargeRate = chargeRate;
  }

  public IntMoney getChargeRate()
  {
    return chargeRate;
  }

  public void setChargeBasis(IntFreightChargeBasisType chargeBasis)
  {
    this.chargeBasis = chargeBasis;
  }

  public IntFreightChargeBasisType getChargeBasis()
  {
    return chargeBasis;
  }

  public void setExtendedAmount(IntMoney extendedAmount)
  {
    this.extendedAmount = extendedAmount;
  }

  public IntMoney getExtendedAmount()
  {
    return extendedAmount;
  }
  
  public static IntFreightBaseCharge createFromFreightBaseCharge(FreightBaseCharge inData)
  {
    IntFreightBaseCharge fbc = null;
    if(inData != null)
    {
      fbc = new IntFreightBaseCharge();
      fbc.chargeBasis = IntFreightChargeBasisType.createFromFreightChargeBasisType(inData.getChargeBasis());
      fbc.chargeRate = IntMoney.createFromMoney(inData.getChargeRate());
      fbc.setDescription(inData.getDescription());
      fbc.extendedAmount = IntMoney.createFromMoney(inData.getExtendedAmount());
      fbc.freightClass = IntFreightClassType.createFromFreightClassType(inData.getFreightClass());
      fbc.setNmfcCode(inData.getNmfcCode());
      fbc.ratedAsClass = IntFreightClassType.createFromFreightClassType(inData.getRatedAsClass());
      fbc.weight = IntWeight.createFromWeight(inData.getWeight());
    }
    return fbc;
  }
}
