package be.e1.bssv.JP564304;

import be.e1.bssv.JP564304.valueobject.GetF43121;
import be.e1.bssv.JP564304.valueobject.ShowF43121;

import java.rmi.Remote;
import java.rmi.RemoteException;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import oracle.e1.bssvfoundation.exception.BusinessServiceException;

@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@WebService
public interface BE_PurchaseOrderReceiverManagerPortType extends Remote {
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public ShowF43121 getPurchaseOrderReceiver(GetF43121 vo) throws BusinessServiceException,
                                                                    RemoteException;
}
