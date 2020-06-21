package be.e1.bssv.JP560001.valueobject;


import be.e1.bssv.J560001.valueobject.InternalGetECMDocumentInformation;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.MessageValueObject;




/**
 * TODO: Java Doc comments for Value Object here
 */
public class ShowECMDocumentIDInformation extends MessageValueObject implements Serializable {

  /**
   * Array of WorkOrder Serial No arrays returned from query.
   */

  private String errorCode;
  private String errorDescription;
    private String sessionID;
  private ECMDocumentIDList ecmDocumentIDList = new ECMDocumentIDList();

  /**
  /**
   * TODO: Default public constructor for instantiating: ShowECMDocumentIDInformation
   */
  public ShowECMDocumentIDInformation() {
  }

  public ShowECMDocumentIDInformation(InternalGetECMDocumentInformation internalVO) {
   
    
     ECMDocumenIDtInformation ecmDocumentIDInformation[];
    if (internalVO.getQueryResults() != null) {

      ecmDocumentIDInformation =
          new ECMDocumenIDtInformation[internalVO.getQueryResults().size()];
      for (int i = 0; i < internalVO.getQueryResults().size(); i++) {

        ECMDocumenIDtInformation ecmDocInfo =
          new ECMDocumenIDtInformation(internalVO.getQueryResults(i));


        ecmDocumentIDInformation[i] =  ecmDocInfo;
      }
     
     
     
      ecmDocumentIDList.setEcmDocumentIDInformation(ecmDocumentIDInformation);
      
    }
  }

  

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
  }

  public String getErrorDescription() {
    return errorDescription;
  }

  public void setEcmDocumentIDList(ECMDocumentIDList ecmDocumentIDList) {
    this.ecmDocumentIDList = ecmDocumentIDList;
  }

  public ECMDocumentIDList getEcmDocumentIDList() {
    return ecmDocumentIDList;
  }

    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }

    public String getSessionID() {
        return sessionID;
    }
}
