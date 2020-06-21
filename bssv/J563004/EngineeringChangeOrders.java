package be.e1.bssv.J563004;

import be.e1.bssv.J563004.valueobject.ECONotify;

import be.e1.bssv.J563004.valueobject.LineDetails;
import be.e1.bssv.J563004.com.beav.e1.ecnnotification.ECNNotification;

import be.e1.bssv.J563004.com.beav.e1.ecnnotification.ECNNotificationResponse;
import be.e1.bssv.J563004.com.beav.e1.ecnnotification.ErrorMessages;

import be.e1.bssv.J563004.ecoproxy.ProcessECNNotification;
import be.e1.bssv.J563004.ecoproxy.ProcessECNNotificationPortClient;

import java.math.BigInteger;

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
public abstract class EngineeringChangeOrders extends BusinessService 
{
    /**
     * TODO: Create Java Doc for: InternalECONotification
     * Method InternalECONotification is used for...?
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
     * @return an E1Message containing the text of any errors or warnings that may have occurred
     */
    public static E1MessageList InternalECONotification(IContext context,
                                                        IConnection connection,
                                                        ECONotify internalVO) {

        //Call start internal method, passing the context (which was passed from PublishedBusinessService).
        startInternalMethod(context, "InternalECONotification", internalVO);
        //Create new message list for BusinessService processing.
        E1MessageList messages = new E1MessageList();

        ECNNotification ecmNotify = new ECNNotification();
        ecmNotify.setTransactionId(BigInteger.valueOf(internalVO.getMnTxnId().intValue()));
        ecmNotify.setChangeId(internalVO.getSzChangeId());
        ecmNotify.setPlmSystem(internalVO.getSzPlmSystem());
        ecmNotify.setTransactionType(internalVO.getSzTxnType());
        ecmNotify.setSiteId(internalVO.getSzSiteId());
        ecmNotify.setErrorCount(BigInteger.valueOf(internalVO.getMnErrorCount().intValue()));

        LineDetails[] detailArr = internalVO.getDetailLines();
        if (detailArr != null) {
            if (detailArr.length > 0) {
                ErrorMessages[] errArr = new ErrorMessages[detailArr.length];
                for (int x = 0; x < detailArr.length; x++) {
                    errArr[x] = new ErrorMessages();
                    errArr[x].setKeyIdentifier(detailArr[x].getSzMsgKey());
                    errArr[x].setMessage(detailArr[x].getSzMsgData());
                }
                ecmNotify.setErrorMessages(errArr);
            }
        }

        try {
            ProcessECNNotificationPortClient ecnPortClient = new ProcessECNNotificationPortClient();
            initPortWithSoftCoding(context, ecnPortClient, messages);
            ECNNotificationResponse ecnResponse =
                ecnPortClient.process(ecmNotify);
            if (ecnResponse != null) {
                if (ecnResponse.getStatusCode() != null) {
                    if (ecnResponse.getStatusCode().intValue() > 0)
                        internalVO.setCBssvError("1");
                    internalVO.setSzBssvErrorMsg(ecnResponse.getStatusMessage());
                }
            }
        } catch (Exception exp) {
            internalVO.setCBssvError("1");
            internalVO.setSzBssvErrorMsg(exp.getMessage());
        }
        //Call finish internal method passing context.
        finishInternalMethod(context, "InternalECONotification");

        //Call finish internal method passing context.
        return messages;
    }

    private static E1MessageList initPortWithSoftCoding(IContext context, ProcessECNNotificationPortClient portClient, E1MessageList msgList) {
        final String softCodingKey = "J563004";
        try {
            Element softCodingRecord =
                SoftCodingRecordAccess.getSoftCodingRecord(context,
                                                           softCodingKey);
            if (softCodingRecord != null) {
                String serviceUrl =
                    SoftCodingRecordAccess.getSoftcodingRecordFieldvalue(context,
                                                                         "endpoint",
                                                                         softCodingRecord);
                if (serviceUrl != null) {
                    portClient.setEndpoint(serviceUrl);
                }
            }
        } catch (Exception exp) {
            context.getBSSVLogger().app(context, "WEB_SERVICE_CALL",
                                        "Invalid Softcoding Record", null,
                                        exp);
            System.out.println("Error: Invalid softcoding record");
            E1Message e1Msg =
                new E1Message(context, "004FIS", "Invalid Softcoding Record");
            msgList.addMessage(e1Msg);
        }
        return msgList;
    }
}
