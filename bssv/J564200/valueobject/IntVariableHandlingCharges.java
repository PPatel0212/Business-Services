package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.VariableHandlingCharges;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntVariableHandlingCharges extends ValueObject implements Serializable
{
  private IntMoney variableHandlingCharge = null;
  private IntMoney fixedVariableHandlingCharge = null;
  private IntMoney percentVariableHandlingCharge = null;
  private IntMoney totalCustomerCharge = null;

  public void setVariableHandlingCharge(IntMoney variableHandlingCharge)
  {
    this.variableHandlingCharge = variableHandlingCharge;
  }

  public IntMoney getVariableHandlingCharge()
  {
    return variableHandlingCharge;
  }

  public void setFixedVariableHandlingCharge(IntMoney fixedVariableHandlingCharge)
  {
    this.fixedVariableHandlingCharge = fixedVariableHandlingCharge;
  }

  public IntMoney getFixedVariableHandlingCharge()
  {
    return fixedVariableHandlingCharge;
  }

  public void setPercentVariableHandlingCharge(IntMoney percentVariableHandlingCharge)
  {
    this.percentVariableHandlingCharge = percentVariableHandlingCharge;
  }

  public IntMoney getPercentVariableHandlingCharge()
  {
    return percentVariableHandlingCharge;
  }

  public void setTotalCustomerCharge(IntMoney totalCustomerCharge)
  {
    this.totalCustomerCharge = totalCustomerCharge;
  }

  public IntMoney getTotalCustomerCharge()
  {
    return totalCustomerCharge;
  }
  
  public static IntVariableHandlingCharges createFromVariableHandlingCharges(VariableHandlingCharges inData)
  {
    IntVariableHandlingCharges vhc = new IntVariableHandlingCharges();
    if(inData != null)
    {
      vhc = new IntVariableHandlingCharges();
      
      vhc.fixedVariableHandlingCharge = IntMoney.createFromMoney(inData.getVariableHandlingCharge());
      vhc.percentVariableHandlingCharge = IntMoney.createFromMoney(inData.getPercentVariableHandlingCharge());
      vhc.totalCustomerCharge = IntMoney.createFromMoney(inData.getTotalCustomerCharge());
      vhc.variableHandlingCharge = IntMoney.createFromMoney(inData.getVariableHandlingCharge());
    }
    return vhc;
  }
}
