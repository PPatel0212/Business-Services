package be.e1.bssv.J564200.DeleteShipmentProxy;

/**
 * Generated class, do not edit.
 *
 * This service class was generated by weblogic
 * webservice stub gen on Tue May 20 15:01:04 EDT 2014 */

public class Deletefedexshipment_Client_Ep_Impl     extends weblogic.wsee.jaxrpc.ServiceImpl
     implements be.e1.bssv.J564200.DeleteShipmentProxy.Deletefedexshipment_Client_Ep {

  public Deletefedexshipment_Client_Ep_Impl() throws javax.xml.rpc.ServiceException {
    this("be/e1/bssv/J564200/DeleteShipmentProxy/Deletefedexshipment_Client_Ep_saved_wsdl.wsdl", null);
  }
  
  public Deletefedexshipment_Client_Ep_Impl(String wsdlurl) throws javax.xml.rpc.ServiceException {
    this(wsdlurl, null);
  }
  
  public Deletefedexshipment_Client_Ep_Impl(String wsdlurl, weblogic.wsee.connection.transport.TransportInfo transportInfo) throws javax.xml.rpc.ServiceException {
    super(wsdlurl,
          new javax.xml.namespace.QName("http://xmlns.oracle.com/FedExShipServices/FedExShipments/deleteFedExShipment", "deletefedexshipment_client_ep"),
          "be/e1/bssv/J564200/DeleteShipmentProxy/Deletefedexshipment_Client_Ep_internaldd.xml", transportInfo);
  }
  
  //***********************************
  // Port Name: DeleteFedExShipment_Pt 
  // Port Type: DeleteFedExShipment 
  //***********************************

  be.e1.bssv.J564200.DeleteShipmentProxy.DeleteFedExShipment mvar_DeleteFedExShipment_Pt;

  /**
   * returns DeleteFedExShipment_Pt port in this service 
   */
  public be.e1.bssv.J564200.DeleteShipmentProxy.DeleteFedExShipment getDeleteFedExShipment_Pt() 
    throws javax.xml.rpc.ServiceException
  {

    if (mvar_DeleteFedExShipment_Pt == null) {
      mvar_DeleteFedExShipment_Pt =
        new be.e1.bssv.J564200.DeleteShipmentProxy.DeleteFedExShipment_Stub(_getPort("deleteFedExShipment_pt"), this);
    }

    if (transportInfo != null && 
        transportInfo instanceof weblogic.wsee.connection.transport.http.HttpTransportInfo) {
      ((javax.xml.rpc.Stub)mvar_DeleteFedExShipment_Pt)._setProperty(
        "weblogic.wsee.connection.transportinfo", 
        (weblogic.wsee.connection.transport.http.HttpTransportInfo)transportInfo);
    }
    
    return mvar_DeleteFedExShipment_Pt;
  }

  /**
   * @Deprecated  Use getDeleteFedExShipment_Pt(byte[] username, byte[] password)
   */
  public be.e1.bssv.J564200.DeleteShipmentProxy.DeleteFedExShipment getDeleteFedExShipment_Pt(String username, String password) 
    throws javax.xml.rpc.ServiceException
  {
    if (username != null & password != null) {
      weblogic.wsee.connection.transport.http.HttpTransportInfo httpInfo = 
        new weblogic.wsee.connection.transport.http.HttpTransportInfo();
      httpInfo.setUsername(username.getBytes());
      httpInfo.setPassword(password.getBytes());
      transportInfo = httpInfo;
    }
    return getDeleteFedExShipment_Pt();
  }

  public be.e1.bssv.J564200.DeleteShipmentProxy.DeleteFedExShipment getDeleteFedExShipment_Pt(byte[] username, byte[] password) 
    throws javax.xml.rpc.ServiceException
  {
    if (username != null & password != null) {
      weblogic.wsee.connection.transport.http.HttpTransportInfo httpInfo = 
        new weblogic.wsee.connection.transport.http.HttpTransportInfo();
      httpInfo.setUsername(username);
      httpInfo.setPassword(password);
      transportInfo = httpInfo;
    }
    return getDeleteFedExShipment_Pt();
  }
  
      public be.e1.bssv.J564200.DeleteShipmentProxy.DeleteFedExShipment getDeleteFedExShipment_Pt(
    java.io.InputStream policyInputStream) 
    throws javax.xml.rpc.ServiceException
  {
    _loadPolicy("deleteFedExShipment_pt", policyInputStream, true, true);
    return getDeleteFedExShipment_Pt();
  }

  public be.e1.bssv.J564200.DeleteShipmentProxy.DeleteFedExShipment getDeleteFedExShipment_Pt(
    java.io.InputStream policyInputStream, 
    boolean inbound, 
    boolean outbound) 
    throws javax.xml.rpc.ServiceException
  {
    _loadPolicy("deleteFedExShipment_pt", policyInputStream, inbound, outbound);
    return getDeleteFedExShipment_Pt();
  }
 
  public be.e1.bssv.J564200.DeleteShipmentProxy.DeleteFedExShipment getDeleteFedExShipment_Pt(
    java.io.InputStream[] inboundPolicies, 
    java.io.InputStream[] outboundPolicies) 
    throws javax.xml.rpc.ServiceException
  {
    _loadPolicy("deleteFedExShipment_pt", null, inboundPolicies, outboundPolicies);
    return getDeleteFedExShipment_Pt();
  }
  
  public be.e1.bssv.J564200.DeleteShipmentProxy.DeleteFedExShipment getDeleteFedExShipment_Pt(
    java.util.Set<java.io.InputStream> inboundPolicies, 
    java.util.Set<java.io.InputStream> outboundPolicies) 
    throws javax.xml.rpc.ServiceException
  {
    _loadPolicy("deleteFedExShipment_pt", null, inboundPolicies, outboundPolicies);
    return getDeleteFedExShipment_Pt();
  }
  
  public be.e1.bssv.J564200.DeleteShipmentProxy.DeleteFedExShipment getDeleteFedExShipment_Pt(
    String operationName,
    java.io.InputStream[] inboundPolicies, 
    java.io.InputStream[] outboundPolicies) 
    throws javax.xml.rpc.ServiceException
  {
    _loadPolicy("deleteFedExShipment_pt", operationName, inboundPolicies, outboundPolicies);
    return getDeleteFedExShipment_Pt();
  }
  
  public be.e1.bssv.J564200.DeleteShipmentProxy.DeleteFedExShipment getDeleteFedExShipment_Pt(
    String operationName,
    java.util.Set<java.io.InputStream> inboundPolicies, 
    java.util.Set<java.io.InputStream> outboundPolicies) 
    throws javax.xml.rpc.ServiceException
  {
    _loadPolicy("deleteFedExShipment_pt", operationName, inboundPolicies, outboundPolicies);
    return getDeleteFedExShipment_Pt();
  }
    
}