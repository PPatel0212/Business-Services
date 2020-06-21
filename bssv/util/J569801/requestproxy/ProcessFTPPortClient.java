package be.e1.bssv.util.J569801.requestproxy;

import be.e1.bssv.util.J569801.com.beaerospace.ftpservice.ftpservice.processftp.Process;
import be.e1.bssv.util.J569801.com.beaerospace.ftpservice.ftpservice.processftp.ProcessResponse;

import java.net.InetSocketAddress;
import java.net.Proxy;

import java.rmi.RemoteException;

import java.security.cert.X509Certificate;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import javax.xml.rpc.Stub;

import weblogic.wsee.async.AsyncPreCallContext;
import weblogic.wsee.connection.transport.http.HttpTransportInfo;
import weblogic.wsee.security.bst.ClientBSTCredentialProvider;
import weblogic.wsee.security.unt.ClientUNTCredentialProvider;

import weblogic.xml.crypto.wss.WSSecurityContext;
import weblogic.xml.crypto.wss.provider.CredentialProvider;

@Generated("Oracle JDeveloper")
public class ProcessFTPPortClient {
    private ProcessFTP _port;
    private List<CredentialProvider> _credProviders;

    @Generated("Oracle JDeveloper")
    public ProcessFTPPortClient() throws Exception {
        Processftp_Client_Ep service = new Processftp_Client_Ep_Impl();
        _port = service.getProcessFTP_Pt();
    }

    public static void main(String[] args) {
        try {
            ProcessFTPPortClient client = new ProcessFTPPortClient();
            client.setPortCredentialProviderList();
            // add your code here

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Generated("Oracle JDeveloper")
    public ProcessFTP getPort() {
        return _port;
    }

    @Generated("Oracle JDeveloper")
    public String getEndpoint() {
        return (String) ((Stub) getPort())._getProperty(Stub.ENDPOINT_ADDRESS_PROPERTY);
    }

    @Generated("Oracle JDeveloper")
    public void setEndpoint(String endpoint) {
        ((Stub) getPort())._setProperty(Stub.ENDPOINT_ADDRESS_PROPERTY, endpoint);
    }

    @Generated("Oracle JDeveloper")
    public List<CredentialProvider> getCredentialProviderList() {
        if (_credProviders == null)
            _credProviders = new ArrayList<CredentialProvider>();

        return _credProviders;
    }

    @Generated("Oracle JDeveloper")
    public void addCredentialProvider(CredentialProvider cp) {
        getCredentialProviderList().add(cp);
    }

    @Generated("Oracle JDeveloper")
    public void setPortCredentialProviderList() {
        ((Stub) getPort())._setProperty(WSSecurityContext.CREDENTIAL_PROVIDER_LIST, getCredentialProviderList());
    }

    @Generated("Oracle JDeveloper")
    public void addUNTCredentialProvider(String username, String password) {
        CredentialProvider cp =
            new ClientUNTCredentialProvider(username.getBytes(), password.getBytes());
        addCredentialProvider(cp);
    }

    @Generated("Oracle JDeveloper")
    public void addBSTCredentialProvider(String clientKeyStore,
                                         String clientKeyStorePass,
                                         String clientKeyAlias,
                                         String clientKeyPass,
                                         X509Certificate serverCert) throws Exception {
        CredentialProvider cp =
            new ClientBSTCredentialProvider(clientKeyStore, clientKeyStorePass, clientKeyAlias, clientKeyPass, "JKS", serverCert);
        addCredentialProvider(cp);
    }

    @Generated("Oracle JDeveloper")
    public void setProxyServerInfo(String proxyHost, int proxyPort,
                                   String username, String password) {
        Proxy p = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxyHost, proxyPort));
        HttpTransportInfo info = new HttpTransportInfo();
        info.setProxy(p);

        ((Stub) getPort())._setProperty("weblogic.wsee.connection.transportinfo", info);

        if (username != null)
            ((Stub) getPort())._setProperty("weblogic.webservice.client.proxyusername", username);

        if (password != null)
            ((Stub) getPort())._setProperty("weblogic.webservice.client.proxypassword", password);
    }

    @Generated("Oracle JDeveloper")
    public boolean getMaintainSession() {
        return ((Boolean) ((Stub) getPort())._getProperty(Stub.SESSION_MAINTAIN_PROPERTY)).booleanValue();
    }

    @Generated("Oracle JDeveloper")
    public void setMaintainSession(boolean maintainSession) {
        ((Stub) getPort())._setProperty(Stub.SESSION_MAINTAIN_PROPERTY, Boolean.valueOf(maintainSession));
    }

    @Generated("Oracle JDeveloper")
    public ProcessResponse process(Process payload) throws RemoteException {
        return getPort().process(payload);
    }

    @Generated("Oracle JDeveloper")
    public void processAsync(AsyncPreCallContext apc,
                             Process payload) throws RemoteException {
        getPort().processAsync(apc, payload);
    }
}
