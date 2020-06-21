package be.e1.bssv.JP564803;

import be.e1.bssv.JP564803.valueobject.GetWorkOrderSerialNo;
import be.e1.bssv.JP564803.valueobject.ShowWorkOrderSerialNo;

import java.rmi.Remote;
import java.rmi.RemoteException;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import oracle.e1.bssvfoundation.exception.BusinessServiceException;

@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@WebService
public interface BE_FindWorkOrderSerialNoPortType extends Remote {
  @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
  public ShowWorkOrderSerialNo FindWorkOrderSerialNo(GetWorkOrderSerialNo vo) throws BusinessServiceException,
                                                                                     RemoteException;
}
