package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.DangerousGoodsDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.ShipmentConfigurationData;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntShipmentConfigurationData extends ValueObject implements Serializable
{
  private IntDangerousGoodsDetail[] dangerousGoodsPackageConfigurations = null;

  public void setDangerousGoodsPackageConfigurations(IntDangerousGoodsDetail[] dangerousGoodsPackageConfigurations)
  {
    this.dangerousGoodsPackageConfigurations = dangerousGoodsPackageConfigurations;
  }

  public IntDangerousGoodsDetail[] getDangerousGoodsPackageConfigurations()
  {
    return dangerousGoodsPackageConfigurations;
  }
  
  public void copyToShipmentConfigurationData(ShipmentConfigurationData outData)
  {
    if(outData != null)
    {
      if(this.dangerousGoodsPackageConfigurations != null)
      {
        DangerousGoodsDetail[] scdArr = new DangerousGoodsDetail[this.dangerousGoodsPackageConfigurations.length];
        for(int x=0; x<this.dangerousGoodsPackageConfigurations.length; x++)
        {
          scdArr[x] = new DangerousGoodsDetail();
          this.dangerousGoodsPackageConfigurations[x].copyToDangerousGoodsDetail(scdArr[x]);
        }
        outData.setDangerousGoodsPackageConfigurations(scdArr);
      }
    }
  }
}
