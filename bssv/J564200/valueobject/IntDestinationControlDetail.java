package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.DestinationControlDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.DestinationControlStatementType;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntDestinationControlDetail extends ValueObject implements Serializable
{
  private IntDestinationControlStatementType[] statementTypes = null;
  private String destinationCountries = null;
  private String endUser = null;

  public void setStatementTypes(IntDestinationControlStatementType[] statementTypes)
  {
    this.statementTypes = statementTypes;
  }

  public IntDestinationControlStatementType[] getStatementTypes()
  {
    return statementTypes;
  }

  public void setDestinationCountries(String destinationCountries)
  {
    this.destinationCountries = destinationCountries;
  }

  public String getDestinationCountries()
  {
    return destinationCountries;
  }

  public void setEndUser(String endUser)
  {
    this.endUser = endUser;
  }

  public String getEndUser()
  {
    return endUser;
  }
  
  public void copyToDestinationControlDetail(DestinationControlDetail outData)
  {
    if(outData != null)
    {
      outData.setDestinationCountries(this.destinationCountries);
      outData.setEndUser(this.endUser);
      if(this.statementTypes != null)
      {
        DestinationControlStatementType[] dcstArr = new DestinationControlStatementType[this.statementTypes.length];
        for(int x=0; x<this.statementTypes.length; x++)
        {
          dcstArr[x] = DestinationControlStatementType.fromString(this.statementTypes[x].getValue()); 
        }
        outData.setStatementTypes(dcstArr);
      }
    }
  }
}
