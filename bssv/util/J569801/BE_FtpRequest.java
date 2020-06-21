package be.e1.bssv.util.J569801;

import be.e1.bssv.util.J569801.valueobject.FtpRequest;
import be.e1.bssv.util.J569801.valueobject.FtpRequestEx;

import be.e1.bssv.util.J569801.proxy.ProcessFTPFilesPortClient;

import be.e1.bssv.util.J569801.requestproxy.ProcessFTPPortClient;

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
public abstract class BE_FtpRequest extends BusinessService
{
  public static E1MessageList InternalTransferFile_B5698001(IContext context, IConnection connection, FtpRequest internalVO)
  {
    //Call start internal method, passing the context (which was passed from PublishedBusinessService).
    startInternalMethod(context, "InternalTransferFile_B5698001", internalVO);
    //Create new message list for BusinessService processing.
    E1MessageList messages = new E1MessageList();

    be.e1.bssv.util.J569801.com.oracle.xmlns.ftpmanager.ftpmanager.ftpfilemanager.Process inputVO = new be.e1.bssv.util.J569801.com.oracle.xmlns.ftpmanager.ftpmanager.ftpfilemanager.Process();
    
    inputVO.setDeleteFlag(internalVO.getCDeleteSourceYN());
    
    inputVO.setFromHost(internalVO.getSzSourceHost());
    inputVO.setFromDir(internalVO.getSzSourcePath());
    inputVO.setFromFile(internalVO.getSzSourceFile());
    
    inputVO.setToHost(internalVO.getSzDestinationHost());
    inputVO.setToDir(internalVO.getSzDestinationPath());
    inputVO.setToFile(internalVO.getSzDestinationFile());
    
    try
    {
      ProcessFTPFilesPortClient ftpClient = new ProcessFTPFilesPortClient();
      String serviceUrl = initPortWithSoftCoding(context, "J569801A", messages);
      ftpClient.setEndpoint(serviceUrl);
      be.e1.bssv.util.J569801.com.oracle.xmlns.ftpmanager.ftpmanager.ftpfilemanager.ProcessResponse outputVO = ftpClient.process(inputVO);
      
      internalVO.setCErrorFlag(outputVO.getStatus().toString());
      internalVO.setSzErrorMessage(outputVO.getResult());
    }
    catch(Exception exp)
    {
      internalVO.setCErrorFlag("1");
      internalVO.setSzErrorMessage("Call to web-service proxy failed.");
    }

    //Call finish internal method passing context.
    finishInternalMethod(context, "InternalTransferFile_B5698001");

    //Call finish internal method passing context.
    return messages;
  }
  
  public static E1MessageList InternalTransferFileEx_B5698001(IContext context, IConnection connection, FtpRequestEx internalVO)
  {
    //Call start internal method, passing the context (which was passed from PublishedBusinessService).
    startInternalMethod(context, "InternalTransferFileEx_B5698001", internalVO);
    //Create new message list for BusinessService processing.
    E1MessageList messages = new E1MessageList();

    be.e1.bssv.util.J569801.com.beaerospace.ftpservice.ftpservice.processftp.Process inputVO = new be.e1.bssv.util.J569801.com.beaerospace.ftpservice.ftpservice.processftp.Process();
    
    inputVO.setDeleteFlag(internalVO.getCDeleteSourceYN());
    inputVO.setJobId(internalVO.getMnJobid().longValue());    
    inputVO.setCipherKey(internalVO.getSzCipherKey());
    inputVO.setCipherMode(internalVO.getNCipherMode().intValue());
    inputVO.setSyncCall(internalVO.getSzAsynchFlag());

    inputVO.setFromHost(internalVO.getSzSourceHost());
    inputVO.setFromDir(internalVO.getSzSourcePath());
    inputVO.setFromFile(internalVO.getSzSourceFile());
    
    inputVO.setToHost(internalVO.getSzDestinationHost());
    inputVO.setToDir(internalVO.getSzDestinationPath());
    inputVO.setToFile(internalVO.getSzDestinationFile());
    
    try
    {
      ProcessFTPPortClient ftpClientEx = new ProcessFTPPortClient();
      String serviceUrl = initPortWithSoftCoding(context, "J569801B", messages);
      ftpClientEx.setEndpoint(serviceUrl);
      be.e1.bssv.util.J569801.com.beaerospace.ftpservice.ftpservice.processftp.ProcessResponse outputVO = ftpClientEx.process(inputVO);
      
      internalVO.setSzCompositeId(outputVO.getCompositeId());
      internalVO.setSzErrorMessage(outputVO.getErrResponse());
      internalVO.setCErrorFlag(outputVO.getStatus());
    }
    catch(Exception exp)
    {
      internalVO.setCErrorFlag("1");
      internalVO.setSzErrorMessage("Call to web-service proxy failed.");
    }

    //Call finish internal method passing context.
    finishInternalMethod(context, "InternalTransferFileEx_B5698001");

    //Call finish internal method passing context.
    return messages;
  }

  public static String initPortWithSoftCoding(IContext context, String softCodeKey, E1MessageList msgList) throws Exception
  {
    String serviceUrl = null;
    try
    {
      Element softCodingValue = SoftCodingRecordAccess.getSoftCodingRecord(context, softCodeKey);
      if(softCodingValue != null)
      {
        serviceUrl = SoftCodingRecordAccess.getSoftcodingRecordFieldvalue(context, "endpoint", softCodingValue);
      }
    }
    catch(Exception exp)
    {
      context.getBSSVLogger().app(context, "WEB_SERVICE_CALL", "Invalid Softcoding Record", null, exp);
      E1Message e1Msg = new E1Message(context, "004FIS", "Invalid Softcoding Record");
      msgList.addMessage(e1Msg);
    }
    return serviceUrl;
  }
}
