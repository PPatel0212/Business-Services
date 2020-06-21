package be.e1.bssv.J564200;

import be.e1.bssv.J564200.CloseShipmentProxy.CloseFedExShipment;
import be.e1.bssv.J564200.CloseShipmentProxy.ClosefedexshipmentClientEp;
import be.e1.bssv.J564200.DeleteShipmentProxy.DeleteFedExShipmentPortClient;
import be.e1.bssv.J564200.DocumentUploadProxy.ProcessFedExUploadImagePortClient;
import be.e1.bssv.J564200.ProcessProxy.FedExShipmentRequestPortClient;
import be.e1.bssv.J564200.com.beone.fedex.becloseshipments.CloseShipmentReply;
import be.e1.bssv.J564200.com.beone.fedex.becloseshipments.CloseShipmentRequest;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.DeleteShipmentRequest;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.ProcessShipmentReply;
import be.e1.bssv.J564200.com.beone.fedex.beshipments.ProcessShipmentRequest;
import be.e1.bssv.J564200.com.beone.fedex.beuploadimage.UploadImagesReply;
import be.e1.bssv.J564200.com.beone.fedex.beuploadimage.UploadImagesRequest;
import be.e1.bssv.J564200.valueobject.IntBssvErrors;
import be.e1.bssv.J564200.valueobject.IntFedexCloseProcess;
import be.e1.bssv.J564200.valueobject.IntFedexDeleteProcess;
import be.e1.bssv.J564200.valueobject.IntFedexDocumentUpload;

import be.e1.bssv.J564200.valueobject.IntFedexShipmentProcess;

import java.net.URL;

import oracle.e1.bssvfoundation.base.BusinessService;
import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.util.E1Message;
import oracle.e1.bssvfoundation.util.E1MessageList;
import oracle.e1.bssvfoundation.util.SoftCodingRecordAccess;

import org.w3c.dom.Element;

/**
 * TODO: Java Doc for BusinessService
 */
public abstract class BE_FedexManager
    extends BusinessService
{
    public static E1MessageList InternalProcessDocumentUpload_B5642000(IContext context, IConnection connection,
                                                                       IntFedexDocumentUpload internalVO)
    {
        //Call start internal method, passing the context (which was passed from PublishedBusinessService).
        startInternalMethod(context, "InternalProcessDocumentUpload_B5642000", internalVO);
        //Create new message list for BusinessService processing.
        E1MessageList messages = new E1MessageList();

        try
        {
            UploadImagesRequest uploadImagesRequest = new UploadImagesRequest();
            internalVO.copyToUploadImagesRequest(uploadImagesRequest);
            ProcessFedExUploadImagePortClient uploadImagePortClient = new ProcessFedExUploadImagePortClient();

            //set the endpoint based on soft coding record
            String serviceUrl = initPortWithSoftCoding(context, messages, "J564200A");
            if (serviceUrl != null)
                uploadImagePortClient.setEndpoint(serviceUrl);

            UploadImagesReply uploadImagesReply = uploadImagePortClient.process(uploadImagesRequest);
            internalVO.loadReplyData(uploadImagesReply);
        }
        catch (Exception exp)
        {
            IntBssvErrors iBssvErrors = internalVO.getError();
            if (iBssvErrors == null)
            {
                iBssvErrors = new IntBssvErrors();
            }
            iBssvErrors.appendErrorMessage("A BSSV exception occured. Technical review required");
            iBssvErrors.appendErrorMessage("There may be problems calling proxy endPoint");
            iBssvErrors.appendErrorMessage(exp.getMessage());
            iBssvErrors.setErrorCode("0000");
            iBssvErrors.setErrorSeverity("ERROR");
            iBssvErrors.setErrorSource("BSSV");
            internalVO.setError(iBssvErrors);
        }

        //Call finish internal method passing context.
        finishInternalMethod(context, "InternalProcessDocumentUpload_B5642000");

        //Call finish internal method passing context.
        return messages;
    }

    public static E1MessageList InternalProcessShipmentRequest_B5642000(IContext context, IConnection connection,
                                                                        IntFedexShipmentProcess internalVO)
    {
        //Call start internal method, passing the context (which was passed from PublishedBusinessService).
        startInternalMethod(context, "InternalProcessShipmentRequest_B5642000", internalVO);
        //Create new message list for BusinessService processing.
        E1MessageList messages = new E1MessageList();

        try
        {
            ProcessShipmentRequest shipRequest = new ProcessShipmentRequest();
            internalVO.copyToProcessShipmentRequest(shipRequest);
            FedExShipmentRequestPortClient shipReqPortClient = new FedExShipmentRequestPortClient();

            //set the endpoint based on soft coding record
            String serviceUrl = initPortWithSoftCoding(context, messages, "J564200");
            if (serviceUrl != null)
                shipReqPortClient.setEndpoint(serviceUrl);

            ProcessShipmentReply shipReply = shipReqPortClient.process(shipRequest);
            internalVO.loadReplyData(shipReply);
        }
        catch (Exception exp)
        {
            IntBssvErrors iBssvErrors = internalVO.getError();
            if (iBssvErrors == null)
            {
                iBssvErrors = new IntBssvErrors();
            }
            iBssvErrors.appendErrorMessage("A BSSV exception occured. Technical review required");
            iBssvErrors.appendErrorMessage("There may be problems calling proxy endPoint");
            iBssvErrors.appendErrorMessage(exp.getMessage());
            iBssvErrors.setErrorCode("0000");
            iBssvErrors.setErrorSeverity("ERROR");
            iBssvErrors.setErrorSource("BSSV");
            internalVO.setError(iBssvErrors);
        }

        //Call finish internal method passing context.
        finishInternalMethod(context, "InternalProcessShipmentRequest_B5642000");

        //Call finish internal method passing context.
        return messages;
    }

    public static E1MessageList InternalProcessCloseRequest_B5642000(IContext context, IConnection connection,
                                                                     IntFedexCloseProcess internalVO)
    {
        //Call start internal method, passing the context (which was passed from PublishedBusinessService).
        startInternalMethod(context, "InternalProcessCloseRequest_B5642000", internalVO);
        //Create new message list for BusinessService processing.
        E1MessageList messages = new E1MessageList();

        try
        {
            CloseShipmentRequest closeRequest = new CloseShipmentRequest();
            internalVO.copyToCloseShipmentRequest(closeRequest);

            //set the endpoint based on soft coding record
            String serviceUrl = initPortWithSoftCoding(context, messages, "J564200B");
            if (serviceUrl != null)
            {
                ClosefedexshipmentClientEp closeEndPoint = new ClosefedexshipmentClientEp(new URL(serviceUrl));
                CloseFedExShipment closePort = closeEndPoint.getCloseFedExShipmentPt();
                CloseShipmentReply closeReply = closePort.close(closeRequest);
                internalVO.loadReplyData(closeReply);
            }
        }
        catch (Exception exp)
        {
            IntBssvErrors iBssvErrors = internalVO.getError();
            if (iBssvErrors == null)
            {
                iBssvErrors = new IntBssvErrors();
            }
            iBssvErrors.appendErrorMessage("A BSSV exception occured. Technical review required");
            iBssvErrors.appendErrorMessage("There may be problems calling proxy endPoint");
            iBssvErrors.appendErrorMessage(exp.getMessage());
            iBssvErrors.setErrorCode("0000");
            iBssvErrors.setErrorSeverity("ERROR");
            iBssvErrors.setErrorSource("BSSV");
            internalVO.setError(iBssvErrors);
        }

        //Call finish internal method passing context.
        finishInternalMethod(context, "InternalProcessCloseRequest_B5642000");

        //Call finish internal method passing context.
        return messages;
    }

    public static E1MessageList InternalProcessDeleteShipment_B5642000(IContext context, IConnection connection,
                                                                       IntFedexDeleteProcess internalVO)
    {
        //Call start internal method, passing the context (which was passed from PublishedBusinessService).
        startInternalMethod(context, "InternalProcessDeleteShipment_B5642000", internalVO);
        //Create new message list for BusinessService processing.
        E1MessageList messages = new E1MessageList();

        try
        {
            DeleteShipmentRequest deleteRequest = new DeleteShipmentRequest();
            internalVO.copyToDeleteShipmentRequest(deleteRequest);
            DeleteFedExShipmentPortClient delPortClient = new DeleteFedExShipmentPortClient();

            //set the endpoint based on soft coding record
            String serviceUrl = initPortWithSoftCoding(context, messages, "J564200C");
            if (serviceUrl != null)
                delPortClient.setEndpoint(serviceUrl);

            internalVO.loadReplyData(delPortClient.delete(deleteRequest));
        }
        catch (Exception exp)
        {
            IntBssvErrors iBssvErrors = internalVO.getError();
            if (iBssvErrors == null)
            {
                iBssvErrors = new IntBssvErrors();
            }
            iBssvErrors.appendErrorMessage("A BSSV exception occured. Technical review required");
            iBssvErrors.appendErrorMessage("There may be problems calling proxy endPoint");
            iBssvErrors.appendErrorMessage(exp.getMessage());
            iBssvErrors.setErrorCode("0000");
            iBssvErrors.setErrorSeverity("ERROR");
            iBssvErrors.setErrorSource("BSSV");
            internalVO.setError(iBssvErrors);
        }

        //Call finish internal method passing context.
        finishInternalMethod(context, "InternalProcessDeleteShipment_B5642000");

        //Call finish internal method passing context.
        return messages;
    }

    public static String initPortWithSoftCoding(IContext context, E1MessageList msgList, String softCodeKey)
        throws Exception
    {
        String serviceUrl = "";
        try
        {
            Element softCodingValue = SoftCodingRecordAccess.getSoftCodingRecord(context, softCodeKey);
            if (softCodingValue != null)
            {
                serviceUrl = SoftCodingRecordAccess.getSoftcodingRecordFieldvalue(context, "endpoint", softCodingValue);
            }
        }
        catch (Exception exp)
        {
            context.getBSSVLogger().app(context, "WEB_SERVICE_CALL", "Invalid Softcoding Record", null, exp);
            E1Message e1Msg = new E1Message(context, "004FIS", "Invalid Softcoding Record");
            msgList.addMessage(e1Msg);
        }
        return serviceUrl;
    }
}
