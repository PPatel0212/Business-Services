package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.OperationalInstruction;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntOperationalInstruction extends ValueObject implements Serializable
{
  private Integer number = null;
  private String content =null;

  public void setNumber(Integer number)
  {
    this.number = number;
  }

  public Integer getNumber()
  {
    return number;
  }

  public void setContent(String content)
  {
    this.content = content;
  }

  public String getContent()
  {
    return content;
  }
  
  public static IntOperationalInstruction createFromOperationalInstruction(OperationalInstruction inData)
  {
    IntOperationalInstruction opIns = null;
    if(inData != null)
    {
      opIns = new IntOperationalInstruction();
      opIns.setContent(inData.getContent());
      opIns.setNumber(inData.getNumber());
    }
    return opIns;
  }
}
