package be.e1.bssv.util.J569806;

import be.e1.bssv.util.J569806.FtpListing.ProcessFileListingPortClient;
import be.e1.bssv.util.J569806.com.beav.fmw.filelisting.FileList;
import be.e1.bssv.util.J569806.com.beav.fmw.filelisting.FileListingReply;
import be.e1.bssv.util.J569806.com.beav.fmw.filelisting.FileListingRequest;
import be.e1.bssv.util.J569806.valueobject.FileInfo;
import be.e1.bssv.util.J569806.valueobject.FileListing_D5698001E;

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
public abstract class BE_FtpFileListing extends BusinessService {
    /**
     * TODO: Create Java Doc for: listServerFiles
     * Method listServerFiles is used for...?
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
     * @return an E1Message containing the text of any errors or warnings that may have occurred
     */
    public static E1MessageList listServerFiles(IContext context, IConnection connection, FileListing_D5698001E internalVO) {

        //Call start internal method, passing the context (which was passed from PublishedBusinessService).
        startInternalMethod(context, "listServerFiles", internalVO);
        //Create new message list for BusinessService processing.
        E1MessageList messages = new E1MessageList();

        try 
        {
            FileListingRequest req = new FileListingRequest();
            req.setHostJNDI(internalVO.getSzSourceHost());
            req.setDirectory(internalVO.getSzSourceDirectory());
            req.setSearchPattern(internalVO.getSzSearchPattern());
            
            String searchFlag = internalVO.getSzRecursiveSearch();
            if(searchFlag != null) {
                if(searchFlag.compareTo("Y") == 0) {
                    req.setRecursive(true);
                }
                else {
                    req.setRecursive(false);
                }
            }
            
            ProcessFileListingPortClient portClient = new ProcessFileListingPortClient();
            initPortWithSoftCoding(context, portClient, messages);
            FileListingReply rep = portClient.process(req);
            processFileListingReply(internalVO, rep);
        }
        catch(Exception exp) 
        {
            E1Message msg = new E1Message(context, "007FIS", "Call to webservice proxy failed");
            messages.addMessage(msg);
            internalVO.setSzStatusCode("1");
            internalVO.setSzStatusMessage("Call to webservice proxy failed");
        }

        //Call finish internal method passing context.
        finishInternalMethod(context, "listServerFiles");

        //Call finish internal method passing context.
        return messages;
    }
    
    public static E1MessageList initPortWithSoftCoding(IContext context, ProcessFileListingPortClient portClient, E1MessageList msgList)
    {
      final String softCodingKey = "J569806";
      try
      {
        Element softCodingRecord = SoftCodingRecordAccess.getSoftCodingRecord(context, softCodingKey);
        if(softCodingRecord != null)
        {
          String serviceUrl = SoftCodingRecordAccess.getSoftcodingRecordFieldvalue(context, "endpoint", softCodingRecord);
          if(serviceUrl != null)
          {
            portClient.setEndpoint(serviceUrl);
          }
        }
      }
      catch(Exception exp)
      {
        context.getBSSVLogger().app(context, "WEB_SERVICE_CALL", "Invalid Softcoding Record", null, exp);
        System.out.println("Error: Invalid softcoding record");
        E1Message e1Msg = new E1Message(context, "004FIS", "Invalid Softcoding Record");
        msgList.addMessage(e1Msg);      
      }
      return msgList;
    }
    
    private static void processFileListingReply(FileListing_D5698001E internalVO, FileListingReply resp) 
    {
        BigInteger statusCode = resp.getStatusCode();
        if(statusCode != null)
            internalVO.setSzStatusCode(statusCode.toString());
        resp.setStatusMessage(resp.getStatusMessage());
        
        FileList[] fListArr = resp.getFileList();
        if(fListArr != null && fListArr.length > 0)
        {
            FileInfo[] infoArr = new FileInfo[fListArr.length];
            for(int x=0; x<fListArr.length; x++)
            {
                infoArr[x] = new FileInfo();
                infoArr[x].setSzFileName(fListArr[x].getFileName());
                infoArr[x].setSzDirectoryName(fListArr[x].getDirectoryName());
            }
            internalVO.setFileList(infoArr);
        }
    }
}
