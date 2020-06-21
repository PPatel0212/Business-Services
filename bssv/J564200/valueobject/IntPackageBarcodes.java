package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.BinaryBarcode;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.PackageBarcodes;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.StringBarcode;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntPackageBarcodes extends ValueObject implements Serializable
{
  private IntBinaryBarcode[] BinaryBarcodes = null;
  private IntStringBarcode[] StringBarcodes = null;

  public void setBinaryBarcodes(IntBinaryBarcode[] BinaryBarcodes)
  {
    this.BinaryBarcodes = BinaryBarcodes;
  }

  public IntBinaryBarcode[] getBinaryBarcodes()
  {
    return BinaryBarcodes;
  }

  public void setStringBarcodes(IntStringBarcode[] StringBarcodes)
  {
    this.StringBarcodes = StringBarcodes;
  }

  public IntStringBarcode[] getStringBarcodes()
  {
    return StringBarcodes;
  }
  
  public static IntPackageBarcodes createFromPackageBarcodes(PackageBarcodes inData)
  {
    IntPackageBarcodes packBarCode = null;
    if(inData != null)
    {
      packBarCode = new IntPackageBarcodes();
      
      BinaryBarcode[] bbArr = inData.getBinaryBarcodes();
      if(bbArr != null)
      {
        IntBinaryBarcode[] iBbArr = new IntBinaryBarcode[bbArr.length];
        for(int x=0; x<bbArr.length; x++)
        {
          iBbArr[x] = IntBinaryBarcode.createFromBinaryBarcode(bbArr[x]);
        }
        packBarCode.setBinaryBarcodes(iBbArr);
      }
      
      StringBarcode[] sbArr = inData.getStringBarcodes();
      if(sbArr != null)
      {
        IntStringBarcode[] iSbArr = new IntStringBarcode[sbArr.length];
        for(int x=0; x<iSbArr.length; x++)
        {
          iSbArr[x] = IntStringBarcode.createFromStringBarcode(sbArr[x]);
        }
        packBarCode.setStringBarcodes(iSbArr);
      }
    }
    return packBarCode;
  }
}
