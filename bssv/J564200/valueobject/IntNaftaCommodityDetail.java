package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.DateRange;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.NaftaCommodityDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.NaftaNetCostMethodCode;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.NaftaPreferenceCriterionCode;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.NaftaProducerDeterminationCode;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntNaftaCommodityDetail extends ValueObject implements Serializable
{
  private IntNaftaPreferenceCriterionCode preferenceCriterion = null;
  private IntNaftaProducerDeterminationCode producerDetermination = null;
  private String producerId = null;
  private IntNaftaNetCostMethodCode netCostMethod = null;
  private IntDateRange netCostDateRange = null;

  public void setPreferenceCriterion(IntNaftaPreferenceCriterionCode preferenceCriterion)
  {
    this.preferenceCriterion = preferenceCriterion;
  }

  public IntNaftaPreferenceCriterionCode getPreferenceCriterion()
  {
    return preferenceCriterion;
  }

  public void setProducerDetermination(IntNaftaProducerDeterminationCode producerDetermination)
  {
    this.producerDetermination = producerDetermination;
  }

  public IntNaftaProducerDeterminationCode getProducerDetermination()
  {
    return producerDetermination;
  }

  public void setProducerId(String producerId)
  {
    this.producerId = producerId;
  }

  public String getProducerId()
  {
    return producerId;
  }

  public void setNetCostMethod(IntNaftaNetCostMethodCode netCostMethod)
  {
    this.netCostMethod = netCostMethod;
  }

  public IntNaftaNetCostMethodCode getNetCostMethod()
  {
    return netCostMethod;
  }

  public void setNetCostDateRange(IntDateRange netCostDateRange)
  {
    this.netCostDateRange = netCostDateRange;
  }

  public IntDateRange getNetCostDateRange()
  {
    return netCostDateRange;
  }
  
  public void copyToNaftaCommodityDetail(NaftaCommodityDetail outData)
  {
    if(outData != null)
    {
      if(this.netCostDateRange != null)
      {
        DateRange drange = new DateRange();
        this.netCostDateRange.copyToDateRange(drange);
        outData.setNetCostDateRange(drange);
      }
      
      if(this.netCostMethod != null)
      {
        NaftaNetCostMethodCode methodCode = NaftaNetCostMethodCode.fromString(this.netCostMethod.getValue());
        outData.setNetCostMethod(methodCode);
      }
      
      if(this.preferenceCriterion != null)
      {
        NaftaPreferenceCriterionCode prefCode = NaftaPreferenceCriterionCode.fromString(this.preferenceCriterion.getValue());
        outData.setPreferenceCriterion(prefCode);
      }
      
      if(this.producerDetermination != null)
      {
        NaftaProducerDeterminationCode prodCode = NaftaProducerDeterminationCode.fromString(this.producerDetermination.getValue());
        outData.setProducerDetermination(prodCode);
      }
      
      outData.setProducerId(this.producerId);
    }
  }
}
