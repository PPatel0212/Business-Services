package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.CompletedHazardousPackageDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.ValidatedHazardousContainer;

import java.io.Serializable;

import java.math.BigDecimal;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

public class IntCompletedHazardousPackageDetail extends ValueObject implements Serializable
{
  private String referenceId = null;
  private IntDangerousGoodsAccessibilityType accessibility = null;
  private String cargoAircraftOnly = null;
  private IntHazardousCommodityRegulationType regulation = null;
  private MathNumeric radioactiveTransportIndex = null;
  private IntRadioactiveLabelType labelType = null;
  private IntValidatedHazardousContainer[] containers = null;

  public void setReferenceId(String referenceId)
  {
    this.referenceId = referenceId;
  }

  public String getReferenceId()
  {
    return referenceId;
  }

  public void setAccessibility(IntDangerousGoodsAccessibilityType accessibility)
  {
    this.accessibility = accessibility;
  }

  public IntDangerousGoodsAccessibilityType getAccessibility()
  {
    return accessibility;
  }

  public void setCargoAircraftOnly(String cargoAircraftOnly)
  {
    this.cargoAircraftOnly = cargoAircraftOnly;
  }

  public String getCargoAircraftOnly()
  {
    return cargoAircraftOnly;
  }

  public void setRegulation(IntHazardousCommodityRegulationType regulation)
  {
    this.regulation = regulation;
  }

  public IntHazardousCommodityRegulationType getRegulation()
  {
    return regulation;
  }

  public void setRadioactiveTransportIndex(MathNumeric radioactiveTransportIndex)
  {
    this.radioactiveTransportIndex = radioactiveTransportIndex;
  }

  public MathNumeric getRadioactiveTransportIndex()
  {
    return radioactiveTransportIndex;
  }

  public void setLabelType(IntRadioactiveLabelType labelType)
  {
    this.labelType = labelType;
  }

  public IntRadioactiveLabelType getLabelType()
  {
    return labelType;
  }

  public void setContainers(IntValidatedHazardousContainer[] containers)
  {
    this.containers = containers;
  }

  public IntValidatedHazardousContainer[] getContainers()
  {
    return containers;
  }
  
  public static IntCompletedHazardousPackageDetail createFromCompletedHazardousPackageDetail(CompletedHazardousPackageDetail inData)
  {
    IntCompletedHazardousPackageDetail chpd = null;
    if(inData != null)
    {
      chpd = new IntCompletedHazardousPackageDetail();
      
      chpd.accessibility = IntDangerousGoodsAccessibilityType.createFromDangerousGoodsAccessibilityType(inData.getAccessibility());
      
      chpd.setCargoAircraftOnly("N");
      if(inData.getCargoAircraftOnly() != null && inData.getCargoAircraftOnly() == true)
        chpd.setCargoAircraftOnly("Y");
      
      ValidatedHazardousContainer[] vhcArr = inData.getContainers();
      if(vhcArr != null)
      {
        IntValidatedHazardousContainer[] iVhcArr = new IntValidatedHazardousContainer[vhcArr.length];
        for(int x=0; x<vhcArr.length; x++)
        {
          iVhcArr[x] = IntValidatedHazardousContainer.createFromValidatedHazardousContainer(vhcArr[x]);
        }
        chpd.setContainers(iVhcArr);
      }
      
      chpd.labelType = IntRadioactiveLabelType.createFromRadioactiveLabelType(inData.getLabelType());
      
      BigDecimal val = inData.getRadioactiveTransportIndex();
      if(val != null)
      {
        chpd.setRadioactiveTransportIndex(new MathNumeric(val));
      }
      
      chpd.setReferenceId(inData.getReferenceId());
      chpd.regulation = IntHazardousCommodityRegulationType.createFromHazardousCommodityRegulationType(inData.getRegulation());
    }
    return chpd;
  }
}
