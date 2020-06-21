package be.e1.bssv.util.JP560203;

import be.e1.bssv.util.JP560203.valueobject.AddWorkFlowDetailReply;
import be.e1.bssv.util.JP560203.valueobject.AddWorkFlowDetailRequest;
import be.e1.bssv.util.JP560203.valueobject.AddWorkFlowHeaderReply;
import be.e1.bssv.util.JP560203.valueobject.AddWorkFlowHeaderRequest;
import be.e1.bssv.util.JP560203.valueobject.FormatWorkFlowMessageRequest;
import be.e1.bssv.util.JP560203.valueobject.HumanTaskData;
import be.e1.bssv.util.JP560203.valueobject.HumanTaskReply;
import be.e1.bssv.util.JP560203.valueobject.HumanTaskRequest;
import be.e1.bssv.util.JP560203.valueobject.ProcessWorkFlowMessageReply;
import be.e1.bssv.util.JP560203.valueobject.ProcessWorkFlowMessageRequest;

import be.e1.bssv.util.JP560203.valueobject.UpdateWorkFlowHeaderRequest;

import java.io.PrintStream;

import java.math.BigDecimal;

public class TestWfManager
{
  public static void main(String[] args)
  {
    try
    {
      BE_WorkflowManager Hmgr= new BE_WorkflowManager();
      
      UpdateWorkFlowHeaderRequest updateWHR = new UpdateWorkFlowHeaderRequest();
      updateWHR.setMessageID(11826);
      updateWHR.setCompany("0");
      updateWHR.setDocumentOrderNoInvoiceetc(0);
      updateWHR.setOrderType("0");
      updateWHR.setLineNumber(BigDecimal.ZERO);
      updateWHR.setGenericKey("200");
      updateWHR.setCompositeKeyValues(30);
      updateWHR.setCompany("300");
      
      Hmgr.BE_UpdateWorkflowHeader(updateWHR);
      
/*
      AddWorkFlowHeaderRequest Hreq= new AddWorkFlowHeaderRequest();
      Hreq.setWorkflowType("P2P-W025");
      Hreq.setBusinessUnit("30");
      Hreq.setTransactionOriginator("DOVERB");
      
      AddWorkFlowHeaderReply H2reply = Hmgr.BE_AddWorkflowHeader(Hreq);    
      
      AddWorkFlowDetailRequest Dreq= new AddWorkFlowDetailRequest ();
      Dreq.setMessageID(H2reply.getMessageID());
      Dreq.setXmlTag("emailAddressBuyer");  
      Dreq.setXmlData("barry_dover@beaerospace.com");    
      
      AddWorkFlowDetailReply H3reply = Hmgr.BE_AddWfDetailManager(Dreq);    
      
      FormatWorkFlowMessageRequest Freq= new FormatWorkFlowMessageRequest();
      Freq.setMessageID(H2reply.getMessageID());
      Freq.setDataItem("$E0029");    
      Freq.setParameterDataItem01("20001-test");
      Freq.setElement01("emailSubject");
      
      Hmgr.BE_FormatWorkflowMessage(Freq);
        
      Freq.setDataItem("$E0030");
      Freq.setParameterDataItem01("54321");  
      Freq.setParameterDataItem02("OP");  
      Freq.setParameterDataItem03("20001-test");
      Freq.setElement01("emailBody");
      Hmgr.BE_FormatWorkflowMessage(Freq);
          
      ProcessWorkFlowMessageRequest Req= new ProcessWorkFlowMessageRequest();
      Req.setGroupNumber(new Integer(Hreq.getGroupNumber()));
     
      HumanTaskRequest hreq = new HumanTaskRequest();
      hreq.setWorkflowType("P2S-W005A");
      hreq.setWorkflowBranch("M30");
      hreq.setWorkflowLevel("Level1");
      //hreq.setAlternateKey1("V");
      //hreq.setAlternateKey2(" ");
      //hreq.setAlternateKey3("N");
      //hreq.setAlternateKey4(" ");
      //hreq.setAlternateKey5("N");
      //hreq.setAlternateKey6(" ");
      //hreq.setAlternateKey7(" ");
      
      HumanTaskReply hrep = Hmgr.BE_GetHumanTaskInfo(hreq);
      if(hrep.getErrorFlag() != "1")
      {
        HumanTaskData[] results = hrep.getHumanTaskInfo();
        for(int x=0; x<results.length; x++)
        {
          System.out.println("======================================");
          System.out.println("Primary User: "+ results[x].getUser());
          System.out.println("User Group/Role: "+ results[x].getGroup());
          System.out.println("Escalation Time: "+ results[x].getEscalationTime());
          System.out.println("Escalation Group: "+ results[x].getEscalationGroup());
          System.out.println("Reminder Time: "+ results[x].getReminderTime());
        }
        System.out.println("TOTAL RECORD COUNT: "+ results.length);
      }
*/      
    }
    catch(Exception exp)
    {
      System.out.println(exp.getMessage());
    }
  }
}