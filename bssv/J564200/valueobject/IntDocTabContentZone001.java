package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.DocTabContentZone001;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.DocTabZoneSpecification;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntDocTabContentZone001 extends ValueObject implements Serializable
{
  private IntDocTabZoneSpecification[] docTabZoneSpecifications = null;

  public void setDocTabZoneSpecifications(IntDocTabZoneSpecification[] docTabZoneSpecifications)
  {
    this.docTabZoneSpecifications = docTabZoneSpecifications;
  }

  public IntDocTabZoneSpecification[] getDocTabZoneSpecifications()
  {
    return docTabZoneSpecifications;
  }
  
  public void copyToDocTabContentZone001(DocTabContentZone001 outData)
  {
    if(outData != null && this.docTabZoneSpecifications != null)
    {
      DocTabZoneSpecification[] tabZoneArr = new DocTabZoneSpecification[this.docTabZoneSpecifications.length];
      for(int x=0; x<this.docTabZoneSpecifications.length; x++)
      {
        tabZoneArr[x] = new DocTabZoneSpecification();
        this.docTabZoneSpecifications[x].copyToDocTabZoneSpecification(tabZoneArr[x]);
      }
      outData.setDocTabZoneSpecifications(tabZoneArr);
    }
  }
}
