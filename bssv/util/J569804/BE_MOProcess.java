package be.e1.bssv.util.J569804;

import be.e1.bssv.util.J569804.valueobject.InternalMOValueObject;

import be.e1.bssv.util.J569804.valueobject.MOItem_Internal;

import java.util.ArrayList;
import java.util.Iterator;

import javax.activation.DataHandler;

import oracle.e1.bssvfoundation.base.BSFNParameters;
import oracle.e1.bssvfoundation.base.BusinessService;
import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.MOInfo;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BSFNServiceInvalidArgException;
import oracle.e1.bssvfoundation.exception.BSFNServiceSystemException;
import oracle.e1.bssvfoundation.exception.MOServiceException;
import oracle.e1.bssvfoundation.services.IBSFNService;
import oracle.e1.bssvfoundation.services.IMOService;
import oracle.e1.bssvfoundation.util.E1Message;
import oracle.e1.bssvfoundation.util.E1MessageList;

/**
 * TODO: Java Doc for BusinessService
 */
public abstract class BE_MOProcess extends BusinessService
{
  /**
   * TODO: Create Java Doc for: InternalInsertMO
   * Method InternalInsertMO is used for...?
   * @param context conditionally provides the connection for the database operation and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
   * @return an E1Message containing the text of any errors or warnings that may have occurred
   */
  public static E1MessageList InternalInsertMO(IContext context, IConnection connection, InternalMOValueObject internalVO)
  {
    //Call start internal method, passing the context (which was passed from PublishedBusinessService).
    startInternalMethod(context, "InternalInsertMO", internalVO);

    //Create new message list for BusinessService processing.
    E1MessageList messages = new E1MessageList();

    //TODO: call method (created by the wizard), which then executes Business Function or Database operation.
    messages.addMessages(insertMediaObject(context, connection, internalVO));
    //TODO:  add messages returned from E1 processing to BusinessService message list.

    //Call finish internal method passing context.
    finishInternalMethod(context, "InternalInsertMO");

    //Call finish internal method passing context.
    return messages;
  }

  /**
   * TODO: Create Java Doc for: InternalDeleteMO
   * Method InternalDeleteMO is used for...?
   * @param context conditionally provides the connection for the database operation and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
   * @return an E1Message containing the text of any errors or warnings that may have occurred
   */
  public static E1MessageList InternalDeleteMO(IContext context, IConnection connection, InternalMOValueObject internalVO)
  {
    //Call start internal method, passing the context (which was passed from PublishedBusinessService).
    startInternalMethod(context, "InternalDeleteMO", internalVO);
    //Create new message list for BusinessService processing.
    E1MessageList messages = new E1MessageList();

    //TODO: call method (created by the wizard), which then executes Business Function or Database operation.
    messages.addMessages(deleteMediaObject(context, connection, internalVO));
    //TODO:  add messages returned from E1 processing to BusinessService message list.

    //Call finish internal method passing context.
    finishInternalMethod(context, "InternalDeleteMO");

    //Call finish internal method passing context.
    return messages;
  }

  /**
   * TODO: Create Java Doc for: InternalSelectMO
   * Method InternalSelectMO is used for...?
   * @param context conditionally provides the connection for the database operation and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
   * @return an E1Message containing the text of any errors or warnings that may have occurred
   */
  public static E1MessageList InternalSelectMO(IContext context, IConnection connection, InternalMOValueObject internalVO)
  {

    //Call start internal method, passing the context (which was passed from PublishedBusinessService).
    startInternalMethod(context, "InternalSelectMO", internalVO);
    //Create new message list for BusinessService processing.
    E1MessageList messages = new E1MessageList();

    //TODO: call method (created by the wizard), which then executes Business Function or Database operation.
    messages.addMessages(selectMediaObject(context, connection, internalVO));
    //TODO:  add messages returned from E1 processing to BusinessService message list.


    //Call finish internal method passing context.
    finishInternalMethod(context, "InternalSelectMO");

    //Call finish internal method passing context.
    return messages;
  }

  /**
   * Calls the SELECT media object.
   * @param context conditionally provides the connection for the media object call and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @return A list of messages if there were application errors, warnings, or informational
   * messages. Returns null if there were no messages.
   */
  private static E1MessageList selectMediaObject(IContext context, IConnection connection, InternalMOValueObject internalVO)
  {
    //create return object
    E1MessageList returnMessages = new E1MessageList();

    //specify condition records must meet to be selected
    ArrayList result;

    ArrayList results = new ArrayList();

    MOItem_Internal[] moItems = internalVO.getMoItems();
    if(moItems == null)
    {
      MOInfo moInfo = new MOInfo();
      moInfo.setSzMoName(internalVO.getSzMoName());
      moInfo.setSzMoKey(internalVO.getSzMoKey());
      moInfo.setDownloadMediaObject(internalVO.isDownloadMediaObject());
      try
      {
        //get moService from context
        IMOService moService = context.getMOService();
        //execute mo select operation
        result = moService.select(context, connection, moInfo);
        if (result.size() > 0)
          results.addAll(result);
      }
      catch(MOServiceException me)
      {
        returnMessages.addMessage(new E1Message(context, "007FIS", me.getMessage()));
      }
      catch (Exception e)
      {
        returnMessages.addMessage(new E1Message(context, "007FIS", e.getMessage()));
      }
    }
    else
    {
      for(int i = 0;i<moItems.length;i++)
      {
        MOItem_Internal moItem = moItems[i];
        MOInfo moInfo = new MOInfo();
        moInfo.setSzMoName(internalVO.getSzMoName());
        moInfo.setSzMoKey(internalVO.getSzMoKey());
        moInfo.setDownloadMediaObject(internalVO.isDownloadMediaObject());
        moInfo.setMoSeqNo(moItem.getMoSeqNo());
        moInfo.setSzMoType(moItem.getSzMoType());
        moInfo.setSzItemName(moItem.getSzItemName());
        try
        {
          //get moService from context
          IMOService moService = context.getMOService();
          //execute mo select operation
          result = moService.select(context, connection, moInfo);
          if (result.size() > 0)
            results.addAll(result);
        }
        catch (MOServiceException me)
        {
          //TODO take some action in response to the media object exception
          returnMessages.addMessage(new E1Message(context, "007FIS", me.getMessage()));
        }
        catch (Exception e)
        {
          //TODO take some action in response to the media object exception
          returnMessages.addMessage(new E1Message(context, "007FIS", e.getMessage()));
        }
      }
    }
    
    Iterator iterator = results.iterator();
    MOItem_Internal[] output = new MOItem_Internal[results.size()];
    int i = 0;
    while(iterator.hasNext())
    {
      MOInfo moInfo = (MOInfo)iterator.next();
      MOItem_Internal moItem = new MOItem_Internal();
      moItem.setSzItemName(moInfo.getSzItemName());
      moItem.setSzData((DataHandler)moInfo.getSzData());
      moItem.setMoSeqNo(moInfo.getMoSeqNo());
      moItem.setSzMoType(moInfo.getSzMoType());
      output[i] = moItem;
      i++;
    }
    //map results to internal vo
    internalVO.setMoItems(output);
    return returnMessages;
  }

  /**
   * Calls the DELETE media object.
   * @param context conditionally provides the connection for the media object call and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @return A list of messages if there were application errors, warnings, or informational
   * messages. Returns null if there were no messages.
   */
  private static E1MessageList deleteMediaObject(IContext context, IConnection connection, InternalMOValueObject internalVO)
  {
    //create return object
    E1MessageList returnMessages = new E1MessageList();

    //specify condition records must meet to be deleted
    MOItem_Internal[] moItems = internalVO.getMoItems();
    if(moItems == null)
    {
      MOInfo moInfo = new MOInfo();
      moInfo.setDownloadMediaObject(false);
      moInfo.setSzMoName(internalVO.getSzMoName());
      moInfo.setSzMoKey(internalVO.getSzMoKey());
      try
      {
        //get moService from context
        IMOService moService = context.getMOService();
        //execute mo delete operation
        moService.delete(context, connection, moInfo);
      }
      catch (MOServiceException me)
      {
        //TODO take some action in response to the media object exception
        returnMessages.addMessage(new E1Message(context, "007FIS", me.getMessage()));
      }
      catch (Exception e)
      {
        //TODO take some action in response to the media object exception
        returnMessages.addMessage(new E1Message(context, "007FIS", e.getMessage()));
      }
    }
    else
    {
      for(int i = 0;i<moItems.length;i++)
      {
        MOItem_Internal moItem = moItems[i];
        MOInfo moInfo = new MOInfo();
        moInfo.setSzMoName(internalVO.getSzMoName());
        moInfo.setSzMoKey(internalVO.getSzMoKey());
        moInfo.setMoSeqNo(moItem.getMoSeqNo());
        moInfo.setSzMoType(moItem.getSzMoType());
        try
        {
          //get moService from context
          IMOService moService = context.getMOService();
          //execute mo delete operation
          moService.delete(context, connection, moInfo);
        }
        catch (MOServiceException me)
        {
          //TODO take some action in response to the media object exception
          returnMessages.addMessage(new E1Message(context, "007FIS", me.getMessage()));
        }
        catch (Exception e)
        {
          //TODO take some action in response to the media object exception
          returnMessages.addMessage(new E1Message(context, "007FIS", e.getMessage()));
        }
      }
    }
    return returnMessages;
  }

  /**
   * Calls the INSERT media object.
   * @param context conditionally provides the connection for the media object call and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @return A list of messages if there were application errors, warnings, or informational
   * messages. Returns null if there were no messages.
   */
  private static E1MessageList insertMediaObject(IContext context, IConnection connection, InternalMOValueObject internalVO)
  {
    //create return object
    E1MessageList returnMessages = new E1MessageList();

    //specify condition records must meet to be inserted
    MOItem_Internal[] moItems = internalVO.getMoItems();
    try
    {
      if(moItems == null)
      {
        Exception error = new Exception("Media item data must be specified along with an item name and item type");
        throw error;
      }
    }
    catch(Exception exp)
    {
      returnMessages.addMessage(new E1Message(context, "007FIS", exp.getMessage()));
    }

    for(int i = 0;i<moItems.length;i++)
    {
      MOItem_Internal moItem = moItems[i];
      MOInfo moInfo = new MOInfo();
      moInfo.setSzMoName(internalVO.getSzMoName());
      moInfo.setSzMoKey(internalVO.getSzMoKey());
      String itemName = moItem.getSzItemName();
      moInfo.setSzItemName(itemName);
      moInfo.setSzMoType(moItem.getSzMoType());
      moInfo.setSzData(moItem.getSzData());
      try
      {
        //get moService from context
        IMOService moService = context.getMOService();
        moService.insert(context, connection, moInfo);
        //write back original item name
        moInfo.setSzItemName(itemName);
        returnMessages.addMessages(callBE_UpdateMOItemName(context, connection, moInfo));
        //return the sequence number
        moItems[i].setMoSeqNo(moInfo.getMoSeqNo());
      }
      catch (MOServiceException me)
      {
        //TODO take some action in response to the media object exception
        returnMessages.addMessage(new E1Message(context, "007FIS", me.getMessage()));
      }
      catch (Exception e)
      {
        //TODO take some action in response to the media object exception
        returnMessages.addMessage(new E1Message(context, "007FIS", e.getMessage()));
      }
      
      //load the moItem structure back into internalVO
      internalVO.setMoItems(moItems);
    }
    return returnMessages;
  }

  /**
   * Calls the BE_UpdateMOItemName(B5698003) business function which has the D5698003A datastructure.
   * @param context conditionally provides the connection for the business function call and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @param TODO document input parameters
   * @return A list of messages if there were application errors, warnings, or informational
   * messages. Returns null if there were no messages.
   */
  private static E1MessageList callBE_UpdateMOItemName(IContext context, IConnection connection, MOInfo mediaInfo)
  {
    BSFNParameters bsfnParams = new BSFNParameters();

    bsfnParams.setValue("szMOName", mediaInfo.getSzMoName());
    bsfnParams.setValue("szMOKey", mediaInfo.getSzMoKey());
    bsfnParams.setValue("nMOSequenceNumber", mediaInfo.getMoSeqNo());
    bsfnParams.setValue("szMOItemName", mediaInfo.getSzItemName());

    try
    {
      IBSFNService bsfnService = context.getBSFNService();
      bsfnService.execute(context, connection, "BE_UpdateMOItemName", bsfnParams);
    }
    catch (BSFNServiceInvalidArgException invalidArgEx)
    {
      E1MessageList returnMessages = new E1MessageList();
      returnMessages.addMessage(new E1Message(context, "018FIS", invalidArgEx.getMessage()));
      return returnMessages;
    }
    catch (BSFNServiceSystemException systemEx)
    {
      E1MessageList returnMessages = new E1MessageList();
      returnMessages.addMessage(new E1Message(context, "019FIS", systemEx.getMessage()));
      return returnMessages;
    }
    return bsfnParams.getE1MessageList();
  }
}
