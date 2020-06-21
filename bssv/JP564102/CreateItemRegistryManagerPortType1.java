package be.e1.bssv.JP564102;

import be.e1.bssv.JP564102.valueobject.InputVOCreateItemReg;
import be.e1.bssv.JP564102.valueobject.ReturnVOCreateItemReg;

import java.rmi.Remote;
import java.rmi.RemoteException;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import oracle.e1.bssvfoundation.exception.BusinessServiceException;

@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@WebService
public interface CreateItemRegistryManagerPortType1 extends Remote {
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public ReturnVOCreateItemReg CreateItemRegPubMethod(InputVOCreateItemReg vo) throws BusinessServiceException,
                                                                                        RemoteException;
}
