package be.e1.bssv.util.JP560200;

import be.e1.bssv.util.J560200.BE_GetEmailAddress;
import be.e1.bssv.util.J560200.BE_SendEmail;
import be.e1.bssv.util.J560200.valueobject.GetEmailAddress_D5601000A;
import be.e1.bssv.util.J560200.valueobject.SendEmail_D5602000A;
import be.e1.bssv.util.JP560200.valueobject.GetEmailReply;
import be.e1.bssv.util.JP560200.valueobject.GetEmailRequest;
import be.e1.bssv.util.JP560200.valueobject.SendEmailReply;
import be.e1.bssv.util.JP560200.valueobject.SendEmailRequest;


import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.PublishedBusinessService;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BusinessServiceException;
import oracle.e1.bssvfoundation.util.E1MessageList;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc for PublishedBusinessService
 */
public class BE_EmailManager extends PublishedBusinessService 
{
    /**
     * TODO: PublishedBusinessService Public Constructor
     */
    public BE_EmailManager() 
    {
    }

    /**
     * Published method for SendEmail TODO: Document method
     * Acts as wrapper method, passing null context and null connection,
     * will call protected SendEmail
     * @param vo the value object representing input data for TODO:complete javadoc
     * @return confirmVO the response data from the business process TODO:complete javadoc
     * @throws BusinessServiceException
     */
    public SendEmailReply SendEmail(SendEmailRequest vo) throws BusinessServiceException 
    {
        return SendEmail(null,null,vo);
    }
    
    public GetEmailReply GetEmailAddress(GetEmailRequest vo) throws BusinessServiceException 
    {
      return GetEmailAddress(null,null,vo);
    }

    /**
     * Protected method for BE_EmailManager PublishedBusinessService. SendEmail will call make calls to BusinessService classes
     * for completing business process.
     * TODO: Comment parameters
     * @param vo the value object representing input data for TODO:complete javadoc
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @return response value object is the data returned from the business process TODO:complete javadoc
     * @throws BusinessServiceException
     */
    protected SendEmailReply SendEmail(IContext context, IConnection connection, SendEmailRequest vo) throws BusinessServiceException 
    {
        //perform all work within try block, finally will clean up any connections.
        try 
        {
            //Call start published method, passing context of null
            //will return context object so BSFN or DB operation can be called later.
            //Context will be used to indicate default transaction boundary, as well as access
            //to formatting and logging operations.
            context = startPublishedMethod(context, "SendEmail", vo);

            //Create new PublishedBusinessService messages object for holding errors and warnings that occur during processing.
            E1MessageList messages = new E1MessageList();
            //TODO: Create a new internal value object.
            SendEmail_D5602000A internalVO = new SendEmail_D5602000A();
            internalVO.setSzEmailAddressTo(vo.getEmailAddressTo());
            internalVO.setSzEmailAddressCc(vo.getEmailAddressCc());
            internalVO.setSzEmailAddressBcc(vo.getEmailAddressBcc());
            internalVO.setSzSubject(vo.getSubject());
            internalVO.setSzEmailMessage(vo.getEmailMessage());
            
            //TODO: Call BusinessService passing context, connection and internal VO
            messages.addMessages(BE_SendEmail.InternalSendEmail_B560200(context, connection, internalVO));
            
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
            SendEmailReply confirmVO = new SendEmailReply(internalVO);
            confirmVO.setE1MessageList(messages);
            finishPublishedMethod(context, "SendEmail");
            //return outVO, filled with return values and messages
            return confirmVO;
        } 
        finally 
        {
            //Call close to clean up all remaining connections and resources.
            close(context, "SendEmail");
        }
    }
    
    protected GetEmailReply GetEmailAddress(IContext context, IConnection connection, GetEmailRequest vo) throws BusinessServiceException 
    {
      //perform all work within try block, finally will clean up any connections.
      try 
      {
          //Call start published method, passing context of null
          //will return context object so BSFN or DB operation can be called later.
          //Context will be used to indicate default transaction boundary, as well as access
          //to formatting and logging operations.
          context = startPublishedMethod(context, "GetEmailAddress", vo);

          //Create new PublishedBusinessService messages object for holding errors and warnings that occur during processing.
          E1MessageList messages = new E1MessageList();
          //TODO: Create a new internal value object.
          GetEmailAddress_D5601000A internalVO = new GetEmailAddress_D5601000A();
          internalVO.setSzAddressSearchType(vo.getAddressSearchType());
          internalVO.setCAddressTypeCode(vo.getTypeCode());
          internalVO.setSzAddressFunctionCode(vo.getFunctionCode());
          internalVO.setSzAddressBranch(vo.getBusinessUnit());
          internalVO.setCCharacterParm(vo.getev01());
          internalVO.setSzParameter01(vo.getParm01());
          internalVO.setSzParameter02(vo.getParm02());
          internalVO.setSzParameter03(vo.getParm03());
          internalVO.setMnAddressNumber(new MathNumeric(vo.getAddressNumber()));
          
     
                            
          //TODO: Call BusinessService passing context, connection and internal VO
          messages.addMessages(BE_GetEmailAddress.InternalGetEmailAddress_N5601000(context, connection, internalVO));
                   
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
          GetEmailReply confirmVO = new GetEmailReply(internalVO);
          confirmVO.setE1MessageList(messages);
          finishPublishedMethod(context, "GetEmailAddress");
          //return outVO, filled with return values and messages
          return confirmVO;
      } 
      finally 
      {
          //Call close to clean up all remaining connections and resources.
          close(context, "GetEmailAddress");
      }
  }
}
