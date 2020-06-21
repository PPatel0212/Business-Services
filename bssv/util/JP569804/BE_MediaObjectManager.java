package be.e1.bssv.util.JP569804;

import be.e1.bssv.util.J569804.BE_MOProcess;
import be.e1.bssv.util.J569804.valueobject.InternalMOValueObject;
import be.e1.bssv.util.J569804.valueobject.MOItem_Internal;
import be.e1.bssv.util.JP569804.valueobject.MOItem_Publish;
import be.e1.bssv.util.JP569804.valueobject.SelectMOReply;
import be.e1.bssv.util.JP569804.valueobject.SelectMORequest;

import java.util.ArrayList;

import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.PublishedBusinessService;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BusinessServiceException;
import oracle.e1.bssvfoundation.util.E1MessageList;

/**
 * TODO: Java Doc for PublishedBusinessService
 */
public class BE_MediaObjectManager extends PublishedBusinessService
{
  /**
   * TODO: PublishedBusinessService Public Constructor
   */
  public BE_MediaObjectManager()
  {
  }

  /**
   * Published method for getMediaRecord TODO: Document method
   * Acts as wrapper method, passing null context and null connection,
   * will call protected getMediaRecord
   * @param vo the value object representing input data for TODO:complete javadoc
   * @return confirmVO the response data from the business process TODO:complete javadoc
   * @throws BusinessServiceException
   */
  public SelectMOReply getMediaRecord(SelectMORequest vo) throws BusinessServiceException
  {
    return getMediaRecord(null,null,vo);
  }

  /**
   * Protected method for BE_MediaObjectManager PublishedBusinessService. getMediaRecord will call make calls to BusinessService classes
   * for completing business process.
   * TODO: Comment parameters
   * @param vo the value object representing input data for TODO:complete javadoc
   * @param context conditionally provides the connection for the database operation and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @return response value object is the data returned from the business process TODO:complete javadoc
   * @throws BusinessServiceException
   */
  protected SelectMOReply getMediaRecord(IContext context, IConnection connection, SelectMORequest vo) throws BusinessServiceException
  {
    //perform all work within try block, finally will clean up any connections.
    try
    {
      //Call start published method, passing context of null
      //will return context object so BSFN or DB operation can be called later.
      //Context will be used to indicate default transaction boundary, as well as access
      //to formatting and logging operations.
      context = startPublishedMethod(context, "getMediaRecord", vo);

      //Create new PublishedBusinessService messages object for holding errors and warnings that occur during processing.
      E1MessageList messages = new E1MessageList();
      
      //TODO: Create a new internal value object.
      InternalMOValueObject internalVO = new InternalMOValueObject();
      internalVO.setDownloadMediaObject(vo.isDownloadMediaObject());
      internalVO.setSzMoKey(vo.getSzMediaObjectKey());
      internalVO.setSzMoName(vo.getSzMoName());
      internalVO.setMoItems(convertMOItemPublish(vo.getMoItems()));

      //TODO: Call BusinessService passing context, connection and internal VO
      messages.addMessages(BE_MOProcess.InternalSelectMO(context, connection, internalVO));

      //PublishedBusinessService will send either warnings in the Confirm Value Object or throw a BusinessServiceException.
      //If messages contains errors, throw the exception

      if (messages.hasErrors())
      {
        //Get the string representation of all the messages.
        String error = messages.getMessagesAsString();
        //Throw new BusinessServiceException
        throw new BusinessServiceException(error, context);
      }

      //Exception was not thrown, so create the confirm VO from internal VO
      SelectMOReply confirmVO = new SelectMOReply(internalVO);
      confirmVO.setE1MessageList(messages);
      finishPublishedMethod(context, "getMediaRecord");
      //return outVO, filled with return values and messages
      return confirmVO;
    }
    finally
    {
      //Call close to clean up all remaining connections and resources.
      close(context, "getMediaRecord");
    }
  }
  
  /**
   * Published method for addMediaRecord TODO: Document method
   * Acts as wrapper method, passing null context and null connection,
   * will call protected getMediaRecord
   * @param vo the value object representing input data for TODO:complete javadoc
   * @return confirmVO the response data from the business process TODO:complete javadoc
   * @throws BusinessServiceException
   */
  public SelectMOReply addMediaRecord(SelectMORequest vo) throws BusinessServiceException
  {
    return addMediaRecord(null,null,vo);
  }

  /**
   * Protected method for BE_MediaObjectManager PublishedBusinessService. 
   * addMediaRecord will call make calls to BusinessService classes for completing business process.
   * TODO: Comment parameters
   * @param vo the value object representing input data for TODO:complete javadoc
   * @param context conditionally provides the connection for the database operation and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @return response value object is the data returned from the business process TODO:complete javadoc
   * @throws BusinessServiceException
   */
  protected SelectMOReply addMediaRecord(IContext context, IConnection connection, SelectMORequest vo) throws BusinessServiceException
  {
    //perform all work within try block, finally will clean up any connections.
    try
    {
      //Call start published method, passing context of null
      //will return context object so BSFN or DB operation can be called later.
      //Context will be used to indicate default transaction boundary, as well as access
      //to formatting and logging operations.
      context = startPublishedMethod(context, "addMediaRecord", vo, IConnection.AUTO);

      //Create new PublishedBusinessService messages object for holding errors and warnings that occur during processing.
      E1MessageList messages = new E1MessageList();
      
      //TODO: Create a new internal value object.
      InternalMOValueObject internalVO = new InternalMOValueObject();
      internalVO.setDownloadMediaObject(vo.isDownloadMediaObject());
      internalVO.setSzMoKey(vo.getSzMediaObjectKey());
      internalVO.setSzMoName(vo.getSzMoName());
      internalVO.setMoItems(convertMOItemPublish(vo.getMoItems()));

      //TODO: Call BusinessService passing context, connection and internal VO
      messages.addMessages(BE_MOProcess.InternalInsertMO(context, connection, internalVO));

      //PublishedBusinessService will send either warnings in the Confirm Value Object or throw a BusinessServiceException.
      //If messages contains errors, throw the exception

      if (messages.hasErrors())
      {
        //Get the string representation of all the messages.
        String error = messages.getMessagesAsString();
        //Throw new BusinessServiceException
        throw new BusinessServiceException(error, context);
      }

      //Exception was not thrown, so create the confirm VO from internal VO
      SelectMOReply confirmVO = new SelectMOReply(internalVO);
      confirmVO.setE1MessageList(messages);
      finishPublishedMethod(context, "addMediaRecord");
      //return outVO, filled with return values and messages
      return confirmVO;
    }
    finally
    {
      //Call close to clean up all remaining connections and resources.
      close(context, "addMediaRecord");
    }
  }
  
  /**
   * Published method for deleteMediaRecord TODO: Document method
   * Acts as wrapper method, passing null context and null connection,
   * will call protected getMediaRecord
   * @param vo the value object representing input data for TODO:complete javadoc
   * @return confirmVO the response data from the business process TODO:complete javadoc
   * @throws BusinessServiceException
   */
  public SelectMOReply deleteMediaRecord(SelectMORequest vo) throws BusinessServiceException
  {
    return deleteMediaRecord(null,null,vo);
  }

  /**
   * Protected method for BE_MediaObjectManager PublishedBusinessService. 
   * deleteMediaRecord will call make calls to BusinessService classes for completing business process.
   * TODO: Comment parameters
   * @param vo the value object representing input data for TODO:complete javadoc
   * @param context conditionally provides the connection for the database operation and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @return response value object is the data returned from the business process TODO:complete javadoc
   * @throws BusinessServiceException
   */
  protected SelectMOReply deleteMediaRecord(IContext context, IConnection connection, SelectMORequest vo) throws BusinessServiceException
  {
    //perform all work within try block, finally will clean up any connections.
    try
    {
      //Call start published method, passing context of null
      //will return context object so BSFN or DB operation can be called later.
      //Context will be used to indicate default transaction boundary, as well as access
      //to formatting and logging operations.
      context = startPublishedMethod(context, "deleteMediaRecord", vo);

      //Create new PublishedBusinessService messages object for holding errors and warnings that occur during processing.
      E1MessageList messages = new E1MessageList();
      
      //TODO: Create a new internal value object.
      InternalMOValueObject internalVO = new InternalMOValueObject();
      internalVO.setDownloadMediaObject(vo.isDownloadMediaObject());
      internalVO.setSzMoKey(vo.getSzMediaObjectKey());
      internalVO.setSzMoName(vo.getSzMoName());
      internalVO.setMoItems(convertMOItemPublish(vo.getMoItems()));

      //TODO: Call BusinessService passing context, connection and internal VO
      messages.addMessages(BE_MOProcess.InternalDeleteMO(context, connection, internalVO));

      //PublishedBusinessService will send either warnings in the Confirm Value Object or throw a BusinessServiceException.
      //If messages contains errors, throw the exception

      if (messages.hasErrors())
      {
        //Get the string representation of all the messages.
        String error = messages.getMessagesAsString();
        //Throw new BusinessServiceException
        throw new BusinessServiceException(error, context);
      }

      //Exception was not thrown, so create the confirm VO from internal VO
      SelectMOReply confirmVO = new SelectMOReply(internalVO);
      confirmVO.setE1MessageList(messages);
      finishPublishedMethod(context, "deleteMediaRecord");
      //return outVO, filled with return values and messages
      return confirmVO;
    }
    finally
    {
      //Call close to clean up all remaining connections and resources.
      close(context, "deleteMediaRecord");
    }
  }

  static public MOItem_Internal[] convertMOItemPublish(MOItem_Publish[] pubArray)
  { 
    MOItem_Internal[] retVal = null;
    if(pubArray != null)
    {
      if(pubArray.length > 0)
      {
        retVal = new MOItem_Internal[pubArray.length];
        for(int idx=0; idx<pubArray.length; idx++)
        {
          retVal[idx] = new MOItem_Internal();
          retVal[idx].setMoSeqNo(pubArray[idx].getMoSeqNo());
          retVal[idx].setSzItemName(pubArray[idx].getSzItemName());
          retVal[idx].setSzMoType(pubArray[idx].getSzMoType());
          retVal[idx].setSzData(pubArray[idx].getSzData());
        }   
      }
    }
    return retVal;
  }
  
  static public MOItem_Publish[] convertMOItemInternal(MOItem_Internal[] intArray)
  {
    MOItem_Publish[] retVal = null;
    if(intArray != null)
    {
      if(intArray.length > 0)
      {
        retVal = new MOItem_Publish[intArray.length];
        for(int idx=0; idx<intArray.length; idx++)
        {
          retVal[idx] = new MOItem_Publish();
          retVal[idx].setMoSeqNo(intArray[idx].getMoSeqNo());
          retVal[idx].setSzItemName(intArray[idx].getSzItemName());
          retVal[idx].setSzMoType(intArray[idx].getSzMoType());
          retVal[idx].setSzData(intArray[idx].getSzData());
        }
      }
    }
    return retVal;
  }
}
