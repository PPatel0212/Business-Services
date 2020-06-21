package be.e1.bssv.JP560010;

import be.e1.bssv.JP560010.valueobject.ShowNextItemNumber;

import java.rmi.Remote;
import java.rmi.RemoteException;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import oracle.e1.bssvfoundation.exception.BusinessServiceException;

@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@WebService
public interface BE_NextItemNumberManagerPortType extends Remote {
  @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
  public ShowNextItemNumber nextItemNumberManager(ShowNextItemNumber vo) throws BusinessServiceException,
                                                                                RemoteException;
}
