package be.e1.bssv.JP564101;

import be.e1.bssv.JP564101.valueobject.GetCCBTrackerInformation;
import be.e1.bssv.JP564101.valueobject.ShowCCBTrackerInformation;

import java.rmi.Remote;
import java.rmi.RemoteException;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import oracle.e1.bssvfoundation.exception.BusinessServiceException;

@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@WebService
public interface BE_CCBTrackerInformationManagerPortType extends Remote {
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public ShowCCBTrackerInformation ccbTrackerInformation(GetCCBTrackerInformation vo) throws BusinessServiceException,
                                                                                               RemoteException;
}
