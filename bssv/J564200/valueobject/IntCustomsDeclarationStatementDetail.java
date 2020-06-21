package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomsDeclarationStatementDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomsDeclarationStatementType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.NaftaLowValueStatementDetail;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntCustomsDeclarationStatementDetail extends ValueObject implements Serializable
{
  private IntCustomsDeclarationStatementType[] types = null;
  private IntNaftaLowValueStatementDetail naftaLowValueStatementDetail = null;

  public void setTypes(IntCustomsDeclarationStatementType[] types)
  {
    this.types = types;
  }

  public IntCustomsDeclarationStatementType[] getTypes()
  {
    return types;
  }

  public void setNaftaLowValueStatementDetail(IntNaftaLowValueStatementDetail naftaLowValueStatementDetail)
  {
    this.naftaLowValueStatementDetail = naftaLowValueStatementDetail;
  }

  public IntNaftaLowValueStatementDetail getNaftaLowValueStatementDetail()
  {
    return naftaLowValueStatementDetail;
  }
  
  public void copyToCustomsDeclarationStatementDetail(CustomsDeclarationStatementDetail outData)
  {
    if(outData != null)
    {
      if(this.naftaLowValueStatementDetail != null)
      {
        NaftaLowValueStatementDetail stmtDetail = new NaftaLowValueStatementDetail();
        this.naftaLowValueStatementDetail.copyToNaftaLowValueStatementDetail(stmtDetail);
        outData.setNaftaLowValueStatementDetail(stmtDetail);
      }
      
      if(this.types != null)
      {
        CustomsDeclarationStatementType[] cdstArr = new CustomsDeclarationStatementType[this.types.length];
        for(int x=0; x<this.types.length; x++)
        {
          cdstArr[x] = CustomsDeclarationStatementType.fromString(this.types[x].getValue());
        }
        outData.setTypes(cdstArr);
      }
    }
  }
}
