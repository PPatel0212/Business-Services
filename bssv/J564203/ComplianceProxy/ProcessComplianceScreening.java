package be.e1.bssv.J564203.ComplianceProxy;

/**
 * Generated interface, do not edit.
 *
 * This stub interface was generated by weblogic
 * webservice stub gen on Sat Sep 07 17:25:44 EDT 2013  
 */

public interface ProcessComplianceScreening extends java.rmi.Remote {
     
  /**
   * Operation Name : {http://xmlns.oracle.com/KewillComplianceManager/ComplianceScreening/processComplianceScreening}process   */

  public be.e1.bssv.J564203.com.beav.kewill.compliancescreening.CompiantScreeningResponse process(be.e1.bssv.J564203.com.beav.kewill.compliancescreening.CompliantScreeningRequest payload) throws java.rmi.RemoteException;
    public void processAsync(weblogic.wsee.async.AsyncPreCallContext apc, be.e1.bssv.J564203.com.beav.kewill.compliancescreening.CompliantScreeningRequest payload) throws java.rmi.RemoteException ;
  
}