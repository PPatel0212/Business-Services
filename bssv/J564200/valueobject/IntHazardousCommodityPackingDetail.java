package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.HazardousCommodityPackingDetail;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntHazardousCommodityPackingDetail extends ValueObject implements Serializable
{
  private String cargoAircraftOnly = null;
  private String packingInstructions = null;

  public void setCargoAircraftOnly(String cargoAircraftOnly)
  {
    this.cargoAircraftOnly = cargoAircraftOnly;
  }

  public String getCargoAircraftOnly()
  {
    return cargoAircraftOnly;
  }

  public void setPackingInstructions(String packingInstructions)
  {
    this.packingInstructions = packingInstructions;
  }

  public String getPackingInstructions()
  {
    return packingInstructions;
  }
  
  public void copyToHazardousCommodityPackingDetail(HazardousCommodityPackingDetail outData)
  {
    if(outData != null)
    {
      outData.setCargoAircraftOnly(false);
      if(this.cargoAircraftOnly.compareToIgnoreCase("Y") == 0)
        outData.setCargoAircraftOnly(true);
      outData.setPackingInstructions(this.packingInstructions);
    }
  }
}
