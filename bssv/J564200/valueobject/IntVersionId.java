package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.becloseshipments.CloseShipmentReply;

import be.e1.bssv.J564200.com.beone.fedex.becloseshipments.CloseShipmentRequest;

import java.io.Serializable;

import java.math.BigInteger;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class IntVersionId
    extends ValueObject
    implements Serializable
{
    private Integer intermediate = null;
    private Integer major = null;
    private Integer minor = null;
    private String serviceId = null;

    public void setIntermediate(Integer intermediate)
    {
        this.intermediate = intermediate;
    }

    public Integer getIntermediate()
    {
        return intermediate;
    }

    public void setMajor(Integer major)
    {
        this.major = major;
    }

    public Integer getMajor()
    {
        return major;
    }

    public void setMinor(Integer minor)
    {
        this.minor = minor;
    }

    public Integer getMinor()
    {
        return minor;
    }

    public void setServiceId(String serviceId)
    {
        this.serviceId = serviceId;
    }

    public String getServiceId()
    {
        return serviceId;
    }

    public void copyToVersionId(be.e1.bssv.J564200.com.beone.fedex.beuploadimage.VersionId outData)
    {
        if (outData != null)
        {
            outData.setIntermediate(this.intermediate);
            outData.setMajor(this.major);
            outData.setMinor(this.minor);
            outData.setServiceId(this.serviceId);
        }
    }

    public void copyToVersionId(be.e1.bssv.J564200.com.beone.fedex.beshipments.VersionId outData)
    {
        if (outData != null)
        {
            outData.setIntermediate(this.intermediate);
            outData.setMajor(this.major);
            outData.setMinor(this.minor);
            outData.setServiceId(this.serviceId);
        }
    }

    public void copyToVersionId(CloseShipmentRequest.Version outData)
    {
        if (outData != null)
        {
            outData.setServiceId(this.serviceId);
            outData.setIntermediate(this.intermediate.toString());
            outData.setMajor(this.major.toString());
            outData.setMinor(this.minor.toString());
        }
    }

    public static IntVersionId createFromVersionId(be.e1.bssv.J564200.com.beone.fedex.beuploadimage.VersionId inData)
    {
        IntVersionId iVersion = null;
        if (inData != null)
        {
            iVersion = new IntVersionId();
            iVersion.setServiceId(inData.getServiceId());
            iVersion.setIntermediate(inData.getIntermediate());
            iVersion.setMajor(inData.getMajor());
            iVersion.setMinor(inData.getMinor());
        }
        return iVersion;
    }

    public static IntVersionId createFromVersionId(be.e1.bssv.J564200.com.beone.fedex.beshipments.VersionId inData)
    {
        IntVersionId iVersion = null;
        if (inData != null)
        {
            iVersion = new IntVersionId();
            iVersion.setServiceId(inData.getServiceId());
            iVersion.setIntermediate(inData.getIntermediate());
            iVersion.setMajor(inData.getMajor());
            iVersion.setMinor(inData.getMinor());
        }
        return iVersion;
    }

    public static IntVersionId createFromVersionId(CloseShipmentReply.Version inData)
    {
        IntVersionId iVersion = null;
        if (inData != null)
        {
            iVersion = new IntVersionId();
            iVersion.setServiceId(inData.getServiceId());

            BigInteger num = inData.getIntermediate();
            if (num != null)
            {
                iVersion.setIntermediate(num.intValue());
            }

            num = inData.getMajor();
            if (num != null)
            {
                iVersion.setMajor(num.intValue());
            }

            num = inData.getMajor();
            if (num != null)
            {
                iVersion.setMinor(num.intValue());
            }
        }
        return iVersion;
    }
}
