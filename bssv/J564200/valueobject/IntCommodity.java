package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.Commodity;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.EdtExciseCondition;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.Measure;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.Money;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.NaftaCommodityDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.Weight;

import java.io.Serializable;

import java.math.BigInteger;

import java.util.Calendar;
import java.util.Date;

import oracle.e1.bssvfoundation.base.ValueObject;

public class IntCommodity extends ValueObject implements Serializable
{
  private String name = null;
  private String description = null;
  private String countryOfManufacture = null;
  private String harmonizedCode = null;
  private String quantityUnits = null;
  private String exportLicenseNumber = null;
  private String ciMarksAndNumbers = null;
  private String partNumber = null;
  private IntWeight weight = null;
  private Integer numberOfPieces = null;
  private Integer quantity = null;
  private IntMeasure[] additionalMeasures = null; 
  private IntMoney unitPrice = null;
  private IntMoney customsValue = null;
  private IntEdtExciseCondition[] exciseConditions = null;
  private Date exportLicenseExpirationDate = null;
  private IntNaftaCommodityDetail naftaDetail = null;

  public void setName(String name)
  {
    this.name = name;
  }

  public String getName()
  {
    return name;
  }

  public void setDescription(String description)
  {
    this.description = description;
  }

  public String getDescription()
  {
    return description;
  }

  public void setCountryOfManufacture(String countryOfManufacture)
  {
    this.countryOfManufacture = countryOfManufacture;
  }

  public String getCountryOfManufacture()
  {
    return countryOfManufacture;
  }

  public void setHarmonizedCode(String harmonizedCode)
  {
    this.harmonizedCode = harmonizedCode;
  }

  public String getHarmonizedCode()
  {
    return harmonizedCode;
  }

  public void setQuantityUnits(String quantityUnits)
  {
    this.quantityUnits = quantityUnits;
  }

  public String getQuantityUnits()
  {
    return quantityUnits;
  }

  public void setExportLicenseNumber(String exportLicenseNumber)
  {
    this.exportLicenseNumber = exportLicenseNumber;
  }

  public String getExportLicenseNumber()
  {
    return exportLicenseNumber;
  }

  public void setCiMarksAndNumbers(String ciMarksAndNumbers)
  {
    this.ciMarksAndNumbers = ciMarksAndNumbers;
  }

  public String getCiMarksAndNumbers()
  {
    return ciMarksAndNumbers;
  }

  public void setPartNumber(String partNumber)
  {
    this.partNumber = partNumber;
  }

  public String getPartNumber()
  {
    return partNumber;
  }

  public void setWeight(IntWeight weight)
  {
    this.weight = weight;
  }

  public IntWeight getWeight()
  {
    return weight;
  }

  public void setNumberOfPieces(Integer numberOfPieces)
  {
    this.numberOfPieces = numberOfPieces;
  }

  public Integer getNumberOfPieces()
  {
    return numberOfPieces;
  }

  public void setQuantity(Integer quantity)
  {
    this.quantity = quantity;
  }

  public Integer getQuantity()
  {
    return quantity;
  }

  public void setAdditionalMeasures(IntMeasure[] additionalMeasures)
  {
    this.additionalMeasures = additionalMeasures;
  }

  public IntMeasure[] getAdditionalMeasures()
  {
    return additionalMeasures;
  }

  public void setUnitPrice(IntMoney unitPrice)
  {
    this.unitPrice = unitPrice;
  }

  public IntMoney getUnitPrice()
  {
    return unitPrice;
  }

  public void setCustomsValue(IntMoney customsValue)
  {
    this.customsValue = customsValue;
  }

  public IntMoney getCustomsValue()
  {
    return customsValue;
  }

  public void setExciseConditions(IntEdtExciseCondition[] exciseConditions)
  {
    this.exciseConditions = exciseConditions;
  }

  public IntEdtExciseCondition[] getExciseConditions()
  {
    return exciseConditions;
  }

  public void setExportLicenseExpirationDate(Date exportLicenseExpirationDate)
  {
    this.exportLicenseExpirationDate = exportLicenseExpirationDate;
  }

  public Date getExportLicenseExpirationDate()
  {
    return exportLicenseExpirationDate;
  }

  public void setNaftaDetail(IntNaftaCommodityDetail naftaDetail)
  {
    this.naftaDetail = naftaDetail;
  }

  public IntNaftaCommodityDetail getNaftaDetail()
  {
    return naftaDetail;
  }
  
  public void copyToCommodity(Commodity outData)
  {
    if(outData != null)
    {
      if(this.additionalMeasures != null)
      {
        Measure[] measureArr = new Measure[this.additionalMeasures.length];
        for(int x=0; x<this.additionalMeasures.length; x++)
        {
          measureArr[x] = new Measure();
          this.additionalMeasures[x].copyToMeasure(measureArr[x]);
        }
        outData.setAdditionalMeasures(measureArr);
      }
      
      outData.setCIMarksAndNumbers(this.ciMarksAndNumbers);
      outData.setCountryOfManufacture(this.countryOfManufacture);
      outData.setDescription(this.description);
      outData.setExportLicenseNumber(this.exportLicenseNumber);
      outData.setHarmonizedCode(this.harmonizedCode);
      outData.setName(this.name);
      outData.setPartNumber(this.partNumber);
      outData.setQuantityUnits(this.quantityUnits);
      
      if(this.customsValue != null)
      {
        Money mny = new Money();
        this.customsValue.copyToMoney(mny);
        outData.setCustomsValue(mny);
      }
      
      if(this.exciseConditions != null)
      {
        EdtExciseCondition[] exciseArr = new EdtExciseCondition[this.exciseConditions.length];
        for(int x=0; x<this.exciseConditions.length; x++)
        {
          exciseArr[x] = new EdtExciseCondition();
          this.exciseConditions[x].copyToEdtExciseCondition(exciseArr[x]);
        }
        outData.setExciseConditions(exciseArr);
      }
      
      if(this.exportLicenseExpirationDate != null)
      {
        Calendar cal = Calendar.getInstance();
        cal.setTime(this.exportLicenseExpirationDate);
        outData.setExportLicenseExpirationDate(cal);
      }
      
      if(this.naftaDetail != null)
      {
        NaftaCommodityDetail ncd = new NaftaCommodityDetail();
        this.naftaDetail.copyToNaftaCommodityDetail(ncd);
        outData.setNaftaDetail(ncd);
      }
      
      if(this.numberOfPieces != null)
      {
        outData.setNumberOfPieces(BigInteger.valueOf(this.numberOfPieces.intValue()));
      }
      
      if(this.quantity != null)
      {
        outData.setQuantity(BigInteger.valueOf(this.quantity.intValue()));
      }
      
      if(this.unitPrice != null)
      {
        Money mny = new Money();
        this.unitPrice.copyToMoney(mny);
        outData.setUnitPrice(mny);
      }
      
      if(this.weight != null)
      {
        Weight wgt = new Weight();
        this.weight.copyToWeight(wgt);
        outData.setWeight(wgt);
      }
    }
  }
}
