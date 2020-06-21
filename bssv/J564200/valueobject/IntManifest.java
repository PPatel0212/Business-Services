package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.becloseshipments.CloseShipmentReply;

import java.io.Serializable;

import java.util.jar.Manifest;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class IntManifest
    extends ValueObject
    implements Serializable
{
    private String filename = null;
    private String file = null;

    public void setFilename(String filename)
    {
        this.filename = filename;
    }

    public String getFilename()
    {
        return filename;
    }

    public void setFile(String file)
    {
        this.file = file;
    }

    public String getFile()
    {
        return file;
    }

    public static IntManifest createFromManifest(CloseShipmentReply.GroundCloseReply.Manifest inData)
    {
        IntManifest iman = null;
        if (inData != null)
        {
            iman = new IntManifest();
            iman.setFile(inData.getFile());
            iman.setFilename(inData.getFilename());
        }
        return iman;
    }
}
