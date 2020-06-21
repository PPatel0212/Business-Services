package be.e1.bssv.J564200.valueobject;

import java.io.Serializable;

import java.math.BigInteger;
import be.e1.bssv.J564200.com.beone.fedex.becloseshipments.CloseShipmentReply;
import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class IntStatus
    extends ValueObject
    implements Serializable
{
    private Integer code = null;
    private String message = null;

    public void setCode(Integer code)
    {
        this.code = code;
    }

    public Integer getCode()
    {
        return code;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public String getMessage()
    {
        return message;
    }

    public static IntStatus createFromStatus(CloseShipmentReply.Status inData)
    {
        IntStatus iStts = null;
        if (inData != null)
        {
            iStts = new IntStatus();
            iStts.setMessage(inData.getMessage());

            BigInteger num = inData.getCode();
            if (num != null)
            {
                iStts.setCode(new Integer(num.intValue()));
            }
        }
        return iStts;
    }
}
