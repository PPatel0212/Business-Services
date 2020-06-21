package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.B13AFilingOptionType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.DestinationControlDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.ExportDetail;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntExportDetail extends ValueObject implements Serializable
{
  private IntB13AFilingOptionType b13AFilingOption = null;
  private String exportComplianceStatement = null;
  private String permitNumber = null;
  private IntDestinationControlDetail destinationControlDetail = null;

  public void setB13AFilingOption(IntB13AFilingOptionType b13AFilingOption)
  {
    this.b13AFilingOption = b13AFilingOption;
  }

  public IntB13AFilingOptionType getB13AFilingOption()
  {
    return b13AFilingOption;
  }

  public void setExportComplianceStatement(String exportComplianceStatement)
  {
    this.exportComplianceStatement = exportComplianceStatement;
  }

  public String getExportComplianceStatement()
  {
    return exportComplianceStatement;
  }

  public void setPermitNumber(String permitNumber)
  {
    this.permitNumber = permitNumber;
  }

  public String getPermitNumber()
  {
    return permitNumber;
  }

  public void setDestinationControlDetail(IntDestinationControlDetail destinationControlDetail)
  {
    this.destinationControlDetail = destinationControlDetail;
  }

  public IntDestinationControlDetail getDestinationControlDetail()
  {
    return destinationControlDetail;
  }
  
  public void copyToExportDetail(ExportDetail outData)
  {
    if(outData != null)
    {
      if(this.b13AFilingOption != null)
      {
        B13AFilingOptionType optType = B13AFilingOptionType.fromString(this.b13AFilingOption.getValue());
        outData.setB13AFilingOption(optType);
      }
      
      if(this.destinationControlDetail != null)
      {
        DestinationControlDetail dcd = new DestinationControlDetail();
        this.destinationControlDetail.copyToDestinationControlDetail(dcd);
        outData.setDestinationControlDetail(dcd);
      }
      
      outData.setExportComplianceStatement(this.exportComplianceStatement);
      outData.setPermitNumber(this.permitNumber);
    }
  }
}
