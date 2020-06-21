package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.Address;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntAddress extends ValueObject implements Serializable
{
  private String[] streetLines = null;
  private String city = null;
  private String stateOrProvinceCode = null;
  private String postalCode = null;
  private String urbanizationCode = null;
  private String countryCode = null;
  private String countryName = null;
  private String residential = null;

  public void setStreetLines(String[] streetLines)
  {
    this.streetLines = streetLines;
  }

  public String[] getStreetLines()
  {
    return streetLines;
  }

  public void setCity(String city)
  {
    this.city = city;
  }

  public String getCity()
  {
    return city;
  }

  public void setStateOrProvinceCode(String stateOrProvinceCode)
  {
    this.stateOrProvinceCode = stateOrProvinceCode;
  }

  public String getStateOrProvinceCode()
  {
    return stateOrProvinceCode;
  }

  public void setPostalCode(String postalCode)
  {
    this.postalCode = postalCode;
  }

  public String getPostalCode()
  {
    return postalCode;
  }

  public void setUrbanizationCode(String urbanizationCode)
  {
    this.urbanizationCode = urbanizationCode;
  }

  public String getUrbanizationCode()
  {
    return urbanizationCode;
  }

  public void setCountryCode(String countryCode)
  {
    this.countryCode = countryCode;
  }

  public String getCountryCode()
  {
    return countryCode;
  }

  public void setCountryName(String countryName)
  {
    this.countryName = countryName;
  }

  public String getCountryName()
  {
    return countryName;
  }

  public void setResidential(String residential)
  {
    this.residential = residential;
  }

  public String getResidential()
  {
    return residential;
  }
  
  public void copyToAddress(Address outData)
  {
    if(outData != null)
    {
      outData.setStreetLines(this.streetLines);
      outData.setCity(this.city);
      outData.setStateOrProvinceCode(this.stateOrProvinceCode);
      outData.setPostalCode(this.postalCode);
      outData.setUrbanizationCode(this.urbanizationCode);
      outData.setCountryCode(this.countryCode);
      outData.setCountryName(this.countryName);
      
      outData.setResidential(false);
      if(this.residential != null)
      {                                
        if(this.residential.compareToIgnoreCase("Y") == 0)
          outData.setResidential(true);
      }
    }
  }
  
  public static IntAddress createFromAddress(Address inData)
  {
    IntAddress addy = null;
    if(inData != null)
    {
      addy = new IntAddress();
      
      addy.setCity(inData.getCity());
      addy.setCountryCode(inData.getCountryCode());
      addy.setCountryName(inData.getCountryName());
      addy.setPostalCode(inData.getPostalCode());
      addy.setStateOrProvinceCode(inData.getStateOrProvinceCode());
      addy.setUrbanizationCode(inData.getUrbanizationCode());
      
      addy.setResidential("N");
      if(inData.getResidential() == true)
      {
        addy.setResidential("Y");
      }
      
      String[] lineArr = inData.getStreetLines();
      if(lineArr != null)
      {
        String[] iLineArr = new String[lineArr.length];
        for(int x=0; x<lineArr.length; x++)
        {
          iLineArr[x] = lineArr[x];
        }
        addy.setStreetLines(iLineArr);
      }
    }
    return addy;
  }
}
