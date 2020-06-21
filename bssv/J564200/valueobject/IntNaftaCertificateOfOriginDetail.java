package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.Contact;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.CustomerImageUsage;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.DateRange;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.NaftaCertificateOfOriginDetail;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.NaftaImporterSpecificationType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.NaftaProducer;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.NaftaProducerSpecificationType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.ShippingDocumentFormat;

import java.io.Serializable;

import java.util.Date;

import oracle.e1.bssvfoundation.base.ValueObject;

public class IntNaftaCertificateOfOriginDetail extends ValueObject implements Serializable
{
  private IntShippingDocumentFormat format = null;
  private IntDateRange blanketPeriod = null;
  private IntNaftaImporterSpecificationType importerSpecification = null;
  private IntContact signatureContact = null;
  private IntNaftaProducerSpecificationType producerSpecification = null;
  private IntNaftaProducer[] producers = null;
  private IntCustomerImageUsage[] customerImageUsages = null;

  public void setFormat(IntShippingDocumentFormat format)
  {
    this.format = format;
  }

  public IntShippingDocumentFormat getFormat()
  {
    return format;
  }

  public void setImporterSpecification(IntNaftaImporterSpecificationType importerSpecification)
  {
    this.importerSpecification = importerSpecification;
  }

  public IntNaftaImporterSpecificationType getImporterSpecification()
  {
    return importerSpecification;
  }

  public void setSignatureContact(IntContact signatureContact)
  {
    this.signatureContact = signatureContact;
  }

  public IntContact getSignatureContact()
  {
    return signatureContact;
  }

  public void setProducerSpecification(IntNaftaProducerSpecificationType producerSpecification)
  {
    this.producerSpecification = producerSpecification;
  }

  public IntNaftaProducerSpecificationType getProducerSpecification()
  {
    return producerSpecification;
  }

  public void setProducers(IntNaftaProducer[] producers)
  {
    this.producers = producers;
  }

  public IntNaftaProducer[] getProducers()
  {
    return producers;
  }

  public void setCustomerImageUsages(IntCustomerImageUsage[] customerImageUsages)
  {
    this.customerImageUsages = customerImageUsages;
  }

  public IntCustomerImageUsage[] getCustomerImageUsages()
  {
    return customerImageUsages;
  }

  public void setBlanketPeriod(IntDateRange blanketPeriod)
  {
    this.blanketPeriod = blanketPeriod;
  }

  public IntDateRange getBlanketPeriod()
  {
    return blanketPeriod;
  }
  
  public void copyToNaftaCertificateOfOriginDetail(NaftaCertificateOfOriginDetail outData)
  {
    if(outData != null)
    {
      if(this.customerImageUsages != null)
      {
        CustomerImageUsage[] ciuArr = new CustomerImageUsage[this.customerImageUsages.length];
        for(int x=0; x<this.customerImageUsages.length; x++)
        {
          ciuArr[x] = new CustomerImageUsage();
          this.customerImageUsages[x].copyToCustomerImageUsage(ciuArr[x]);
        }
        outData.setCustomerImageUsages(ciuArr);
      }
      
      if(this.blanketPeriod != null)
      {
        DateRange dr = new DateRange();
        this.blanketPeriod.copyToDateRange(dr);
        outData.setBlanketPeriod(dr);
      }
      
      if(this.format != null)
      {
        ShippingDocumentFormat sdf = new ShippingDocumentFormat();
        this.format.copyToShippingDocumentFormat(sdf);
        outData.setFormat(sdf);
      }
      
      if(this.importerSpecification != null)
      {
        NaftaImporterSpecificationType nist = NaftaImporterSpecificationType.fromString(this.importerSpecification.getValue());
        outData.setImporterSpecification(nist);
      }
      
      if(this.producers != null)
      {
        NaftaProducer[] npArr = new NaftaProducer[this.producers.length];
        for(int x=0; x<this.producers.length; x++)
        {
          npArr[x] = new NaftaProducer();
          this.producers[x].copyToNaftaProducer(npArr[x]);
        }
        outData.setProducers(npArr);
      }
      
      if(this.producerSpecification != null)
      {
        NaftaProducerSpecificationType npst = NaftaProducerSpecificationType.fromString(this.producerSpecification.getValue());
        outData.setProducerSpecification(npst);
      }
      
      if(this.signatureContact != null)
      {
        Contact ct = new Contact();
        this.signatureContact.copyToContact(ct);
        outData.setSignatureContact(ct);
      }
    }
  }
  
}
