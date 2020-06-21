package be.e1.bssv.util.JP560000;

import be.e1.bssv.util.J560000.DataEnrichmentMgr;
import be.e1.bssv.util.J560000.valueobject.SupDataF4211A_D564211B;
import be.e1.bssv.util.J560000.valueobject.SupDataF4211_D5600007C;
import be.e1.bssv.util.J560000.valueobject.SupDataF4311_D5600007B;
import be.e1.bssv.util.JP560000.valueobject.F4211DataReply;
import be.e1.bssv.util.JP560000.valueobject.F4211DataReplyA;
import be.e1.bssv.util.JP560000.valueobject.F4211DataRequest;

import be.e1.bssv.util.JP560000.valueobject.F4211DataRequestA;
import be.e1.bssv.util.JP560000.valueobject.F4311DataReply;

import be.e1.bssv.util.JP560000.valueobject.F4311DataRequest;

import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.PublishedBusinessService;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BusinessServiceException;
import oracle.e1.bssvfoundation.util.E1MessageList;

/**
 * TODO: Java Doc for PublishedBusinessService
 */
public class DataEnrichmentManager extends PublishedBusinessService
{
  /**
   * TODO: PublishedBusinessService Public Constructor
   */
  public DataEnrichmentManager()
  {
  }

  public F4211DataReply BE_F4211SupplementalData(F4211DataRequest vo) throws BusinessServiceException
  {
    return BE_F4211SupplementalData(null,null,vo);
  }

    public F4211DataReplyA BE_F4211SupplementalDataA(F4211DataRequestA vo) throws BusinessServiceException
    {
        return BE_F4211SupplementalDataA(null, null, vo);
    }

  public F4311DataReply BE_F4311SupplementalData(F4311DataRequest vo) throws BusinessServiceException
  {
    return BE_F4311SupplementalData(null,null,vo);
  }

  protected F4211DataReplyA BE_F4211SupplementalDataA(IContext context, IConnection connection, F4211DataRequestA vo)
    throws BusinessServiceException
  {
    //perform all work within try block, finally will clean up any connections.
    try
    {
      context = startPublishedMethod(context, "BE_F4211SupplementalDataA", vo);
      //Create new PublishedBusinessService messages object for holding errors and warnings that occur during processing.
      E1MessageList messages = new E1MessageList();
      
      SupDataF4211A_D564211B internalVO = new SupDataF4211A_D564211B(vo);
      messages.addMessages(DataEnrichmentMgr.InternalF4211SupDataA(context, connection, internalVO));

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
      F4211DataReplyA confirmVO = new F4211DataReplyA();
        internalVO.copyToF4211DataReplyA(confirmVO);
      confirmVO.setE1MessageList(messages);
      finishPublishedMethod(context, "BE_F4211SupplementalDataA");
      //return outVO, filled with return values and messages
      return confirmVO;
    }
    finally
    {
      //Call close to clean up all remaining connections and resources.
      close(context, "BE_F4211SupplementalDataA");
    }
  }

    protected F4211DataReply BE_F4211SupplementalData(IContext context, IConnection connection, F4211DataRequest vo)
      throws BusinessServiceException
    {
      //perform all work within try block, finally will clean up any connections.
      try
      {
        context = startPublishedMethod(context, "BE_F4211SupplementalData", vo);
        //Create new PublishedBusinessService messages object for holding errors and warnings that occur during processing.
        E1MessageList messages = new E1MessageList();
        
        SupDataF4211_D5600007C internalVO = new SupDataF4211_D5600007C();
        vo.copyToInternalValueObject(internalVO);
        messages.addMessages(DataEnrichmentMgr.InternalF4211SupData(context, connection, internalVO));

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
        F4211DataReply confirmVO = new F4211DataReply(internalVO);
        confirmVO.setE1MessageList(messages);
        finishPublishedMethod(context, "BE_F4211SupplementalData");
        //return outVO, filled with return values and messages
        return confirmVO;
      }
      finally
      {
        //Call close to clean up all remaining connections and resources.
        close(context, "BE_F4211SupplementalData");
      }
    }

  protected F4311DataReply BE_F4311SupplementalData(IContext context, IConnection connection, F4311DataRequest vo)
    throws BusinessServiceException
  {
      F4311DataReply confirmVO = null;
    //perform all work within try block, finally will clean up any connections.
    try
    {
      context = startPublishedMethod(context, "BE_F4311SupplementalData", vo);
      //Create new PublishedBusinessService messages object for holding errors and warnings that occur during processing.
      E1MessageList messages = new E1MessageList();
     
      SupDataF4311_D5600007B internalVO = new SupDataF4311_D5600007B();
      vo.copyToInternalValueObject(internalVO);
      messages.addMessages(DataEnrichmentMgr.InternalF4311SupData(context, connection, internalVO));

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
      confirmVO = new F4311DataReply(internalVO);
      confirmVO.setE1MessageList(messages);
      finishPublishedMethod(context, "BE_F4311SupplementalData");
    }
    finally
    {
      //Call close to clean up all remaining connections and resources.
      close(context, "BE_F4311SupplementalData");
    }
      //return outVO, filled with return values and messages
      return confirmVO;
  }
}
