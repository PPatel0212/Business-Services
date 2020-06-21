package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomsRoleType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.NaftaLowValueStatementDetail;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntNaftaLowValueStatementDetail extends ValueObject implements Serializable
{
  private IntCustomsRoleType role = null;

  public void setRole(IntCustomsRoleType role)
  {
    this.role = role;
  }

  public IntCustomsRoleType getRole()
  {
    return role;
  }
  
  public void copyToNaftaLowValueStatementDetail(NaftaLowValueStatementDetail outData)
  {
    if(outData != null)
    {
      if(this.role != null)
      {
        CustomsRoleType crt = CustomsRoleType.fromString(this.role.getValue());
        outData.setRole(crt);
      }
    }
  }
}
