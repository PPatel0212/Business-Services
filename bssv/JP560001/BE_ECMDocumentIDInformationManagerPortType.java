package be.e1.bssv.JP560001;

import be.e1.bssv.JP560001.valueobject.GetECMDocumentIDInformation;
import be.e1.bssv.JP560001.valueobject.ShowECMDocumentIDInformation;

import java.rmi.Remote;
import java.rmi.RemoteException;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import oracle.e1.bssvfoundation.exception.BusinessServiceException;

@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@WebService
public interface BE_ECMDocumentIDInformationManagerPortType extends Remote {
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public ShowECMDocumentIDInformation ecmDocumentIDInformationManager(GetECMDocumentIDInformation vo) throws BusinessServiceException,
                                                                                                               RemoteException;
}
