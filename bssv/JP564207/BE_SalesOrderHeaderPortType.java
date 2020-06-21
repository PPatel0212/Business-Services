package be.e1.bssv.JP564207;

import be.e1.bssv.JP564207.valueobject.GetSalesOrderHeader;
import be.e1.bssv.JP564207.valueobject.ShowSalesOrderHeader;

import java.rmi.Remote;
import java.rmi.RemoteException;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import oracle.e1.bssvfoundation.exception.BusinessServiceException;

@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@WebService
public interface BE_SalesOrderHeaderPortType extends Remote {
  @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
  public ShowSalesOrderHeader SalesOrderHeader(GetSalesOrderHeader vo) throws BusinessServiceException,
                                                                              RemoteException;
}
