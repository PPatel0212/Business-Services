package be.e1.bssv.JP56RC01;

import be.e1.bssv.JP56RC01.valueobject.GetCheckandRetrieveItemRevInformation;
import be.e1.bssv.JP56RC01.valueobject.ShowCheckandRetrieveItemRevInformation;

import java.rmi.Remote;
import java.rmi.RemoteException;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import oracle.e1.bssvfoundation.exception.BusinessServiceException;

@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@WebService
public interface BE_CheckAndRetrieveItemRevQueryManagerPortType extends Remote {
  @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
  public ShowCheckandRetrieveItemRevInformation getCheckAndRetrieveItemRevQueryManager(GetCheckandRetrieveItemRevInformation vo) throws BusinessServiceException,
                                                                                                                                        RemoteException;
}
