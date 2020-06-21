package be.e1.bssv.J564200.valueobject;

import be.e1.bssv.J564200.com.beone.fedex.beshipments.SignatureOptionDetail;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.SignatureOptionType;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class IntSignatureOptionDetail extends ValueObject implements Serializable
{
    private IntSignatureOptionType optionType = null;
    private String signatureReleaseNumber = null;

    public void setOptionType(IntSignatureOptionType optionType) {
        this.optionType = optionType;
    }

    public IntSignatureOptionType getOptionType() {
        return optionType;
    }

    public void setSignatureReleaseNumber(String signatureReleaseNumber) {
        this.signatureReleaseNumber = signatureReleaseNumber;
    }

    public String getSignatureReleaseNumber() {
        return signatureReleaseNumber;
    }
    
    public void copyToSignatureOptionDetail(SignatureOptionDetail outData)
    {
      if(outData != null)
      {
          outData.setSignatureReleaseNumber(this.signatureReleaseNumber);
          if(this.optionType != null) {
              SignatureOptionType sigOptType = SignatureOptionType.fromString(this.optionType.getValue());
              outData.setOptionType(sigOptType);
          }
      }
    }
}
