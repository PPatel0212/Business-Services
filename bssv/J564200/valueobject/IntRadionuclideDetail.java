package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.PhysicalFormType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.RadionuclideDetail;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

public class IntRadionuclideDetail extends ValueObject implements Serializable
{
  private String radionuclide = null;
  private String chemicalForm = null;
  private String exceptedPackagingIsReportableQuantity = null;
  private IntRadionuclideActivity activity = null;
  private IntPhysicalFormType physicalForm = null;

  public void setRadionuclide(String radionuclide)
  {
    this.radionuclide = radionuclide;
  }

  public String getRadionuclide()
  {
    return radionuclide;
  }

  public void setChemicalForm(String chemicalForm)
  {
    this.chemicalForm = chemicalForm;
  }

  public String getChemicalForm()
  {
    return chemicalForm;
  }

  public void setExceptedPackagingIsReportableQuantity(String exceptedPackagingIsReportableQuantity)
  {
    this.exceptedPackagingIsReportableQuantity = exceptedPackagingIsReportableQuantity;
  }

  public String getExceptedPackagingIsReportableQuantity()
  {
    return exceptedPackagingIsReportableQuantity;
  }

  public void setActivity(IntRadionuclideActivity activity)
  {
    this.activity = activity;
  }

  public IntRadionuclideActivity getActivity()
  {
    return activity;
  }

  public void setPhysicalForm(IntPhysicalFormType physicalForm)
  {
    this.physicalForm = physicalForm;
  }

  public IntPhysicalFormType getPhysicalForm()
  {
    return physicalForm;
  }
  
  public void copyToRadionuclideDetail(RadionuclideDetail outData)
  {
    if(outData != null)
    {
      outData.setRadionuclide(this.radionuclide);
      outData.setChemicalForm(this.chemicalForm);
      
      outData.setExceptedPackagingIsReportableQuantity(false);
      if(this.exceptedPackagingIsReportableQuantity != null)
      {
        if(this.exceptedPackagingIsReportableQuantity.compareToIgnoreCase("Y") == 0)
          outData.setExceptedPackagingIsReportableQuantity(true);
      }
      
      if(this.physicalForm != null)
      {
        PhysicalFormType pft = PhysicalFormType.fromString(this.physicalForm.getValue());
        outData.setPhysicalForm(pft);
      }
    }
  }
}
