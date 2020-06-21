package be.e1.bssv.JP560001.valueobject;



/**
 * TODO: Java Doc comments for Value Object here
 */
public class ECMDocumentIDList  {

  private ECMDocumenIDtInformation ecmDocumentIDInformation[];
  
  /**
   * TODO: Default public constructor for instantiating: ECMDocumentIDList
   */
  public ECMDocumentIDList() {
  }

  public void setEcmDocumentIDInformation(ECMDocumenIDtInformation[] ecmDocumentIDInformation) {
   
   this.ecmDocumentIDInformation = ecmDocumentIDInformation;
    
  }

  public ECMDocumenIDtInformation[] getEcmDocumentIDInformation() {
    return ecmDocumentIDInformation;
  }
}
