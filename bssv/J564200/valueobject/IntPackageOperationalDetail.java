package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.OperationalInstruction;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.PackageOperationalDetail;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntPackageOperationalDetail extends ValueObject implements Serializable
{
  private String astraHandlingText = null;
  private IntOperationalInstruction[] operationalInstructions = null;
  private IntPackageBarcodes barcodes = null;

  public void setAstraHandlingText(String astraHandlingText)
  {
    this.astraHandlingText = astraHandlingText;
  }

  public String getAstraHandlingText()
  {
    return astraHandlingText;
  }

  public void setBarcodes(IntPackageBarcodes barcodes)
  {
    this.barcodes = barcodes;
  }

  public IntPackageBarcodes getBarcodes()
  {
    return barcodes;
  }

  public void setOperationalInstructions(IntOperationalInstruction[] operationalInstructions)
  {
    this.operationalInstructions = operationalInstructions;
  }

  public IntOperationalInstruction[] getOperationalInstructions()
  {
    return operationalInstructions;
  }
  
  public static IntPackageOperationalDetail createFromPackageOperationalDetail(PackageOperationalDetail inData)
  {
    IntPackageOperationalDetail pod = null;
    if(inData != null)
    {
      pod = new IntPackageOperationalDetail();
      
      pod.setAstraHandlingText(inData.getAstraHandlingText());
      pod.barcodes = IntPackageBarcodes.createFromPackageBarcodes(inData.getBarcodes());
      
      OperationalInstruction[] opInsArr = inData.getOperationalInstructions();
      if(opInsArr != null)
      {
        IntOperationalInstruction[] iOpInsArr = new IntOperationalInstruction[opInsArr.length];
        for(int x=0; x<opInsArr.length; x++)
        {
          iOpInsArr[x] = IntOperationalInstruction.createFromOperationalInstruction(opInsArr[x]);
        }
        pod.setOperationalInstructions(iOpInsArr);
      }
    }
    return pod;
  }
}
