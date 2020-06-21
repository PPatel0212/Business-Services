package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.DayOfWeekType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.GroundDeliveryEligibilityType;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.ShipmentOperationalDetail;

import java.io.Serializable;

import java.math.BigInteger;

import java.util.Calendar;
import java.util.Date;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

public class IntShipmentOperationalDetail extends ValueObject implements Serializable
{
  private String ursaPrefixCode = null;
  private String UrsaSuffixCode = null;
  private String originLocationId = null;
  private String originLocationNumber = null;
  private String originServiceArea = null;
  private String destinationLocationId = null;
  private Integer destinationLocationNumber = null;
  private String destinationServiceArea = null;
  private String destinationLocationStateOrProvinceCode = null;
  private Date deliveryDate = null;
  private IntDayOfWeekType deliveryDay = null;
  private MathNumeric publishedDeliveryTime = null;
  private Date commitDate = null;
  private IntDayOfWeekType commitDay = null;
  private IntTransitTimeType transitTime = null;
  private IntTransitTimeType maximumTransitTime = null;
  private IntTransitTimeType customTransitTime = null;
  private String ineligibleForMoneyBackGuarantee = null;
  private IntGroundDeliveryEligibilityType[] deliveryEligibilities = null;
  private String astraPlannedServiceLevel = null;
  private String astraDescription = null;
  private String postalCode = null;
  private String stateOrProvinceCode = null;
  private String countryCode = null;
  private String airportId = null;
  private String serviceCode = null;
  private String scac = null;

  public void setUrsaPrefixCode(String ursaPrefixCode)
  {
    this.ursaPrefixCode = ursaPrefixCode;
  }

  public String getUrsaPrefixCode()
  {
    return ursaPrefixCode;
  }

  public void setUrsaSuffixCode(String UrsaSuffixCode)
  {
    this.UrsaSuffixCode = UrsaSuffixCode;
  }

  public String getUrsaSuffixCode()
  {
    return UrsaSuffixCode;
  }

  public void setOriginLocationId(String originLocationId)
  {
    this.originLocationId = originLocationId;
  }

  public String getOriginLocationId()
  {
    return originLocationId;
  }

  public void setOriginLocationNumber(String originLocationNumber)
  {
    this.originLocationNumber = originLocationNumber;
  }

  public String getOriginLocationNumber()
  {
    return originLocationNumber;
  }

  public void setOriginServiceArea(String originServiceArea)
  {
    this.originServiceArea = originServiceArea;
  }

  public String getOriginServiceArea()
  {
    return originServiceArea;
  }

  public void setDestinationLocationId(String destinationLocationId)
  {
    this.destinationLocationId = destinationLocationId;
  }

  public String getDestinationLocationId()
  {
    return destinationLocationId;
  }

  public void setDestinationServiceArea(String destinationServiceArea)
  {
    this.destinationServiceArea = destinationServiceArea;
  }

  public String getDestinationServiceArea()
  {
    return destinationServiceArea;
  }

  public void setDestinationLocationStateOrProvinceCode(String destinationLocationStateOrProvinceCode)
  {
    this.destinationLocationStateOrProvinceCode = destinationLocationStateOrProvinceCode;
  }

  public String getDestinationLocationStateOrProvinceCode()
  {
    return destinationLocationStateOrProvinceCode;
  }

  public void setDeliveryDate(Date deliveryDate)
  {
    this.deliveryDate = deliveryDate;
  }

  public Date getDeliveryDate()
  {
    return deliveryDate;
  }

  public void setDeliveryDay(IntDayOfWeekType deliveryDay)
  {
    this.deliveryDay = deliveryDay;
  }

  public IntDayOfWeekType getDeliveryDay()
  {
    return deliveryDay;
  }

  public void setPublishedDeliveryTime(MathNumeric publishedDeliveryTime)
  {
    this.publishedDeliveryTime = publishedDeliveryTime;
  }

  public MathNumeric getPublishedDeliveryTime()
  {
    return publishedDeliveryTime;
  }

  public void setCommitDay(IntDayOfWeekType commitDay)
  {
    this.commitDay = commitDay;
  }

  public IntDayOfWeekType getCommitDay()
  {
    return commitDay;
  }

  public void setTransitTime(IntTransitTimeType transitTime)
  {
    this.transitTime = transitTime;
  }

  public IntTransitTimeType getTransitTime()
  {
    return transitTime;
  }

  public void setMaximumTransitTime(IntTransitTimeType maximumTransitTime)
  {
    this.maximumTransitTime = maximumTransitTime;
  }

  public IntTransitTimeType getMaximumTransitTime()
  {
    return maximumTransitTime;
  }

  public void setCustomTransitTime(IntTransitTimeType customTransitTime)
  {
    this.customTransitTime = customTransitTime;
  }

  public IntTransitTimeType getCustomTransitTime()
  {
    return customTransitTime;
  }

  public void setIneligibleForMoneyBackGuarantee(String ineligibleForMoneyBackGuarantee)
  {
    this.ineligibleForMoneyBackGuarantee = ineligibleForMoneyBackGuarantee;
  }

  public String getIneligibleForMoneyBackGuarantee()
  {
    return ineligibleForMoneyBackGuarantee;
  }

  public void setDeliveryEligibilities(IntGroundDeliveryEligibilityType[] deliveryEligibilities)
  {
    this.deliveryEligibilities = deliveryEligibilities;
  }

  public IntGroundDeliveryEligibilityType[] getDeliveryEligibilities()
  {
    return deliveryEligibilities;
  }

  public void setAstraPlannedServiceLevel(String astraPlannedServiceLevel)
  {
    this.astraPlannedServiceLevel = astraPlannedServiceLevel;
  }

  public String getAstraPlannedServiceLevel()
  {
    return astraPlannedServiceLevel;
  }

  public void setAstraDescription(String astraDescription)
  {
    this.astraDescription = astraDescription;
  }

  public String getAstraDescription()
  {
    return astraDescription;
  }

  public void setPostalCode(String postalCode)
  {
    this.postalCode = postalCode;
  }

  public String getPostalCode()
  {
    return postalCode;
  }

  public void setStateOrProvinceCode(String stateOrProvinceCode)
  {
    this.stateOrProvinceCode = stateOrProvinceCode;
  }

  public String getStateOrProvinceCode()
  {
    return stateOrProvinceCode;
  }

  public void setCountryCode(String countryCode)
  {
    this.countryCode = countryCode;
  }

  public String getCountryCode()
  {
    return countryCode;
  }

  public void setAirportId(String airportId)
  {
    this.airportId = airportId;
  }

  public String getAirportId()
  {
    return airportId;
  }

  public void setServiceCode(String serviceCode)
  {
    this.serviceCode = serviceCode;
  }

  public String getServiceCode()
  {
    return serviceCode;
  }

  public void setScac(String scac)
  {
    this.scac = scac;
  }

  public String getScac()
  {
    return scac;
  }

  public void setCommitDate(Date commitDate)
  {
    this.commitDate = commitDate;
  }

  public Date getCommitDate()
  {
    return commitDate;
  }
  
  public static IntShipmentOperationalDetail createFromShipmentOperationalDetail(ShipmentOperationalDetail inData)
  {
    IntShipmentOperationalDetail sod = null;
    if(inData != null)
    {
      sod = new IntShipmentOperationalDetail();
      
      sod.setAirportId(inData.getAirportId());
      sod.setAstraDescription(inData.getAstraDescription());
      sod.setCountryCode(inData.getCountryCode());
      sod.setDestinationLocationId(inData.getDestinationLocationId());
      sod.setDestinationLocationNumber(inData.getDestinationLocationNumber());
      sod.setDestinationLocationStateOrProvinceCode(inData.getDestinationLocationStateOrProvinceCode());
      sod.setDestinationServiceArea(inData.getDestinationServiceArea());
      sod.setUrsaPrefixCode(inData.getUrsaPrefixCode());
      sod.setUrsaSuffixCode(inData.getUrsaSuffixCode());
      
      sod.setIneligibleForMoneyBackGuarantee("N");
      if(inData.getIneligibleForMoneyBackGuarantee() == true)
        sod.setIneligibleForMoneyBackGuarantee("Y");
      
      Calendar cal = inData.getCommitDate();
      if(cal != null)
      {
        sod.commitDate = cal.getTime();
      }
      cal = inData.getDeliveryDate();
      if(cal != null)
      {
        sod.deliveryDate = cal.getTime();
      }
      
      sod.setCommitDay(IntDayOfWeekType.createFromDayOfWeekType(inData.getCommitDay()));
      sod.setDeliveryDay(IntDayOfWeekType.createFromDayOfWeekType(inData.getDeliveryDay()));
      sod.setCustomTransitTime(IntTransitTimeType.createFromTransitTimeType(inData.getTransitTime()));
      sod.setMaximumTransitTime(IntTransitTimeType.createFromTransitTimeType(inData.getMaximumTransitTime()));
      
      GroundDeliveryEligibilityType[] gdetArr = inData.getDeliveryEligibilities();
      if(gdetArr != null)
      {
        IntGroundDeliveryEligibilityType[] iGdetArr = new IntGroundDeliveryEligibilityType[gdetArr.length];
        for(int x=0; x<gdetArr.length; x++)
        {
          iGdetArr[x] = IntGroundDeliveryEligibilityType.createFromGroundDeliveryEligibilityType(gdetArr[x]);
        }
        sod.setDeliveryEligibilities(iGdetArr);
      }
    }
    return sod;
  }

  public void setDestinationLocationNumber(Integer destinationLocationNumber)
  {
    this.destinationLocationNumber = destinationLocationNumber;
  }

  public Integer getDestinationLocationNumber()
  {
    return destinationLocationNumber;
  }
}
