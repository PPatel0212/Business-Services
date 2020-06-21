package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.becloseshipments.CloseShipmentReply;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class IntGroundCloseReply
    extends ValueObject
    implements Serializable
{
    private String codReport = null;
    private String hazMatCertificate = null;
    private String multiweightReport = null;
    private IntManifest manifest = null;

    public void setCodReport(String codReport)
    {
        this.codReport = codReport;
    }

    public String getCodReport()
    {
        return codReport;
    }

    public void setHazMatCertificate(String hazMatCertificate)
    {
        this.hazMatCertificate = hazMatCertificate;
    }

    public String getHazMatCertificate()
    {
        return hazMatCertificate;
    }

    public void setMultiweightReport(String multiweightReport)
    {
        this.multiweightReport = multiweightReport;
    }

    public String getMultiweightReport()
    {
        return multiweightReport;
    }

    public void setManifest(IntManifest manifest)
    {
        this.manifest = manifest;
    }

    public IntManifest getManifest()
    {
        return manifest;
    }

    public static IntGroundCloseReply createFromGroundCloseReply(CloseShipmentReply.GroundCloseReply inData)
    {
        IntGroundCloseReply igcr = null;
        if (inData != null)
        {
            igcr = new IntGroundCloseReply();
            igcr.setCodReport(inData.getCodReport());
            igcr.setHazMatCertificate(inData.getHazMatCertificate());
            igcr.setMultiweightReport(inData.getMultiweightReport());
            igcr.setManifest(IntManifest.createFromManifest(inData.getManifest()));
        }
        return igcr;
    }
}
