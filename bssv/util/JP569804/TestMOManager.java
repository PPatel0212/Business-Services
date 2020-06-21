package be.e1.bssv.util.JP569804;

import be.e1.bssv.util.J569804.valueobject.MOItem_Internal;
import be.e1.bssv.util.JP569804.valueobject.MOItem_Publish;
import be.e1.bssv.util.JP569804.valueobject.SelectMOReply;
import be.e1.bssv.util.JP569804.valueobject.SelectMORequest;

import javax.activation.DataHandler;

public class TestMOManager
{
  public static void main(String[] args)
  {
    /* Create a new media object entry */
    SelectMORequest request = new SelectMORequest();
    request.setDownloadMediaObject(false);
    request.setSzMediaObjectKey("2401|SO|00200|1.000");
    request.setSzMoName("GT4211A");

    //String testStr = "Another hello world from business service";
    String testStr = "This is line 2 for hello world";
    DataHandler moData = new DataHandler(testStr, "application/rtf");
    MOItem_Publish moLineInfo[] = new MOItem_Publish[1];
    moLineInfo[0] = new MOItem_Publish();
    //moLineInfo[0].setMoSeqNo(3);
    moLineInfo[0].setSzMoType("TEXT");
    moLineInfo[0].setSzItemName("Casely");
    moLineInfo[0].setSzData(moData);
    request.setMoItems(moLineInfo);
    
    processMediaRequest(1, request);
    
    /* Read the newly created entry to verify it exists */
    //processMediaRequest(2, request);
    
    /* Delete the newly created entry */
    //moLineInfo[0].setMoSeqNo(1);
    //processMediaRequest(3, request);
  }
  
  public static void processMediaRequest(int actionCode, SelectMORequest request)
  {
    try
    {
      BE_MediaObjectManager moAccess = new BE_MediaObjectManager();
      SelectMOReply reply = new SelectMOReply();
      
      switch(actionCode)
      {
        case 1:
          reply = moAccess.addMediaRecord(request);
          break;
        case 2:
          reply = moAccess.getMediaRecord(request);
          break;
        case 3:
          reply = moAccess.deleteMediaRecord(request);
          break;
      }
      
      System.out.println("Media Object Name: " + reply.getSzMediaObjectName());
      System.out.println("Media Object Key: " + reply.getSzMediaObjectKey());
      MOItem_Publish pubItms[] = reply.getMoItems();
      
      if(pubItms != null)
      {
        for(int idx=0; idx<pubItms.length; idx++)
        {
          System.out.println("Item Name: " + pubItms[idx].getSzItemName());
          System.out.println("Item Sequence: " + pubItms[idx].getMoSeqNo());
          System.out.println("Item Type: " + pubItms[idx].getSzMoType());
          System.out.println("Item Data: ");
          pubItms[idx].getSzData().writeTo(System.out);
        }
      }
      else
      {
        System.out.println("No Item Information exists");
      }
    }
    catch(Exception exp)
    {
      System.out.println("Error: Exception occured: " + exp.getMessage());
    }    
  }
}
