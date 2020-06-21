package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.PriorityAlertDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.PriorityAlertEnhancementType;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class IntPriorityAlertDetail
  extends ValueObject
  implements Serializable
{
  private IntPriorityAlertEnhancementType[] enhancementTypes = null;
  private String[] content = null;

  public void setEnhancementTypes(IntPriorityAlertEnhancementType[] enhancementTypes)
  {
    this.enhancementTypes = enhancementTypes;
  }

  public IntPriorityAlertEnhancementType[] getEnhancementTypes()
  {
    return enhancementTypes;
  }
  
  public void setContent(String[] content)
  {
    this.content = content;
  }

  public String[] getContent()
  {
    return content;
  }
  
  public void copyToPriorityAlertDetail(PriorityAlertDetail outData)
  {
    if(outData != null)
    {
      if(this.content != null)  
        outData.setContent(this.content);
      if(this.enhancementTypes != null)
      {
        PriorityAlertEnhancementType[] tmpArr = new PriorityAlertEnhancementType[this.enhancementTypes.length];
        if(tmpArr != null)
        {
          int idx = 0;
          for(IntPriorityAlertEnhancementType tmpData : this.enhancementTypes)
          {
            tmpArr[idx++] = PriorityAlertEnhancementType.fromValue(tmpData.getValue());
          }
          outData.setEnhancementTypes(tmpArr);
        }
      }
    }
  }
}
