
package be.e1.bssv.J564200.CloseShipmentProxy;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlSeeAlso;

import be.e1.bssv.J564200.com.beone.fedex.becloseshipments.CloseShipmentReply;
import be.e1.bssv.J564200.com.beone.fedex.becloseshipments.CloseShipmentRequest;
import be.e1.bssv.J564200.com.beone.fedex.becloseshipments.ObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8-b13937
 * Generated source version: 2.2
 *
 */
@WebService(name = "closeFedExShipment",
            targetNamespace = "http://xmlns.oracle.com/FedExShipServices/FedExShipments/closeFedExShipment")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso(
    {
        ObjectFactory.class
    })
public interface CloseFedExShipment
{


    /**
     *
     * @param payload
     * @return
     *     returns be.e1.bssv.J564200.com.beone.fedex.becloseshipments.CloseShipmentReply
     */
    @WebMethod(action = "close")
    @WebResult(name = "CloseShipmentReply", targetNamespace = "http://www.beav.com/be/closeshipment",
               partName = "payload")
    public CloseShipmentReply close(@WebParam(name = "CloseShipmentRequest",
                                              targetNamespace = "http://www.beav.com/be/closeshipment",
                                              partName = "payload") CloseShipmentRequest payload);

}
