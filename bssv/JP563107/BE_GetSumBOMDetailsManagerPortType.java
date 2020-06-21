package be.e1.bssv.JP563107;

import be.e1.bssv.JP563107.valueobject.GetSumBOMDetails;
import be.e1.bssv.JP563107.valueobject.ShowSumBOMDetails;

import java.rmi.Remote;
import java.rmi.RemoteException;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import oracle.e1.bssvfoundation.exception.BusinessServiceException;

@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@WebService
public interface BE_GetSumBOMDetailsManagerPortType extends Remote {
  @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
  public ShowSumBOMDetails getSumBOMDetails(GetSumBOMDetails vo) throws BusinessServiceException,
                                                                        RemoteException;
}
