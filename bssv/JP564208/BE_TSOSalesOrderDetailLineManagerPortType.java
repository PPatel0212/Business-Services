package be.e1.bssv.JP564208;

import be.e1.bssv.JP564208.valueobject.GetTSOSalesOrderDetailLine;
import be.e1.bssv.JP564208.valueobject.ShowTSOSalesOrderDetailLine;

import java.rmi.Remote;
import java.rmi.RemoteException;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import oracle.e1.bssvfoundation.exception.BusinessServiceException;

@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@WebService
public interface BE_TSOSalesOrderDetailLineManagerPortType extends Remote {
  @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
  public ShowTSOSalesOrderDetailLine tsoSalesOrderDetailLine(GetTSOSalesOrderDetailLine vo) throws BusinessServiceException,
                                                                                                   RemoteException;
}
