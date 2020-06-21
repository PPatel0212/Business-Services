package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.BarcodeSymbologyType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.DocTabContentBarcoded;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.DocTabZoneSpecification;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntDocTabContentBarcoded extends ValueObject implements Serializable
{
  private IntBarcodeSymbologyType symbology = null;
  private IntDocTabZoneSpecification specification = null;

  public void setSymbology(IntBarcodeSymbologyType symbology)
  {
    this.symbology = symbology;
  }

  public IntBarcodeSymbologyType getSymbology()
  {
    return symbology;
  }

  public void setSpecification(IntDocTabZoneSpecification specification)
  {
    this.specification = specification;
  }

  public IntDocTabZoneSpecification getSpecification()
  {
    return specification;
  }
  
  public void copyToDocTabContentBarcoded(DocTabContentBarcoded outData)
  {
    if(outData != null)
    {
      if(this.specification != null)
      {
        DocTabZoneSpecification spec = new DocTabZoneSpecification();
        this.specification.copyToDocTabZoneSpecification(spec);
        outData.setSpecification(spec);
      }
      
      if(this.symbology != null)
      {
        BarcodeSymbologyType bst = BarcodeSymbologyType.fromString(this.symbology.getValue());
        outData.setSymbology(bst);
      }
    }
  }
}
