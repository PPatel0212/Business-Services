package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomDocumentDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.DocTabContent;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.LabelPrintingOrientationType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.LabelRotationType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentFormat;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntCustomDocumentDetail extends ValueObject implements Serializable
{
  private IntShippingDocumentFormat format = null;
  private IntLabelPrintingOrientationType labelPrintingOrientation = null;
  private IntLabelRotationType labelRotation = null;
  private String specificationId = null;
  private String customDocumentIdentifier = null;
  private IntDocTabContent docTabContent = null;

  public void setFormat(IntShippingDocumentFormat format)
  {
    this.format = format;
  }

  public IntShippingDocumentFormat getFormat()
  {
    return format;
  }

  public void setLabelPrintingOrientation(IntLabelPrintingOrientationType labelPrintingOrientation)
  {
    this.labelPrintingOrientation = labelPrintingOrientation;
  }

  public IntLabelPrintingOrientationType getLabelPrintingOrientation()
  {
    return labelPrintingOrientation;
  }

  public void setLabelRotation(IntLabelRotationType labelRotation)
  {
    this.labelRotation = labelRotation;
  }

  public IntLabelRotationType getLabelRotation()
  {
    return labelRotation;
  }

  public void setSpecificationId(String specificationId)
  {
    this.specificationId = specificationId;
  }

  public String getSpecificationId()
  {
    return specificationId;
  }

  public void setCustomDocumentIdentifier(String customDocumentIdentifier)
  {
    this.customDocumentIdentifier = customDocumentIdentifier;
  }

  public String getCustomDocumentIdentifier()
  {
    return customDocumentIdentifier;
  }

  public void setDocTabContent(IntDocTabContent docTabContent)
  {
    this.docTabContent = docTabContent;
  }

  public IntDocTabContent getDocTabContent()
  {
    return docTabContent;
  }
  
  public void copyToCustomDocumentDetail(CustomDocumentDetail outData)
  {
    if(outData != null)
    {
      outData.setCustomDocumentIdentifier(this.customDocumentIdentifier);
      outData.setSpecificationId(this.specificationId);
      
      if(this.docTabContent != null)
      {
        DocTabContent dtc = new DocTabContent();
        this.docTabContent.copyToDocTabContent(dtc);
        outData.setDocTabContent(dtc);
      }
      
      if(this.format != null)
      {
        ShippingDocumentFormat sdf = new ShippingDocumentFormat();
        this.format.copyToShippingDocumentFormat(sdf);
        outData.setFormat(sdf);
      }
      
      if(this.labelPrintingOrientation != null)
      {
        LabelPrintingOrientationType lpot = LabelPrintingOrientationType.fromString(this.labelPrintingOrientation.getValue());
        outData.setLabelPrintingOrientation(lpot);
      }
      
      if(this.labelRotation != null)
      {
        LabelRotationType lrt = LabelRotationType.fromString(this.labelRotation.getValue());
        outData.setLabelRotation(lrt);
      }
    }
  }
}
