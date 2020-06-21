package be.e1.bssv.JP560001;


import be.e1.bssv.J560001.BE_GetECMDocumentInformation;
import be.e1.bssv.J560001.valueobject.InternalGetECMDocumentInformation;
import be.e1.bssv.JP560001.valueobject.GetECMDocumentIDInformation;
import be.e1.bssv.JP560001.valueobject.ShowECMDocumentIDInformation;



import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.PublishedBusinessService;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BusinessServiceException;
import oracle.e1.bssvfoundation.util.E1MessageList;



/**
 * TODO: Java Doc for PublishedBusinessService
 */
public class BE_ECMDocumentIDInformationManager extends PublishedBusinessService {
    /**
     * TODO: PublishedBusinessService Public Constructor
     */
    public BE_ECMDocumentIDInformationManager() {
    }

    /**
     * Published method for ecmDocumentIDInformationManager TODO: Document method
     * Acts as wrapper method, passing null context and null connection,
     * will call protected ecmDocumentIDInformationManager
     * @param vo the value object representing input data for TODO:complete javadoc
     * @return confirmVO the response data from the business process TODO:complete javadoc
     * @throws BusinessServiceException
     */
    public ShowECMDocumentIDInformation ecmDocumentIDInformationManager(GetECMDocumentIDInformation vo) throws BusinessServiceException {
        return ecmDocumentIDInformationManager(null, null, vo);
    }

    /**
     * Protected method for BE_ECMDocumentIDInformationManager PublishedBusinessService. ecmDocumentIDInformationManager will call make calls to BusinessService classes
     * for completing business process.
     * TODO: Comment parameters
     * @param vo the value object representing input data for TODO:complete javadoc
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @return response value object is the data returned from the business process TODO:complete javadoc
     * @throws BusinessServiceException
     */
    protected ShowECMDocumentIDInformation ecmDocumentIDInformationManager(IContext context,
                                                                           IConnection connection,
                                                                           GetECMDocumentIDInformation vo) throws BusinessServiceException {
        //perform all work within try block, finally will clean up any connections.
        try {
            //Call start published method, passing context of null
            //will return context object so BSFN or DB operation can be called later.
            //Context will be used to indicate default transaction boundary, as well as access
            //to formatting and logging operations.
            context =
                    startPublishedMethod(context, "ecmDocumentIDInformationManager",
                                         vo, IConnection.AUTO);

            //Create new PublishedBusinessService messages object for holding errors and warnings that occur during processing.
            E1MessageList messages = new E1MessageList();
            //TODO: Create a new internal value object.
            InternalGetECMDocumentInformation internalVO =
                new InternalGetECMDocumentInformation();


            //TODO: Call BusinessService passing context, connection and internal VO
            messages.addMessages(vo.mapFromPublished(context, internalVO));

            //TODO: Add messages returned from BusinessService to message list for PublishedBusinessService.
            if ((internalVO.getQueryWhereFields().getF5600028_SESSID() !=
                 null && internalVO.getQueryWhereFields().getMode() != null) ||
                internalVO.getQueryWhereFields().getMode().equalsIgnoreCase("A")) {
                messages.addMessages(BE_GetECMDocumentInformation.getECMDocumentInformation(context,
                                                                                            connection,
                                                                                            internalVO));
                //PublishedBusinessService will send either warnings in the Confirm Value Object or throw a BusinessServiceException.
                //If messages contains errors, throw the exception

                if (messages.hasErrors()) {
                    //Get the string representation of all the messages.
                    String error = messages.getMessagesAsString();
                    //Throw new BusinessServiceException
                    throw new BusinessServiceException(error, context);
                }
            }
            //Exception was not thrown, so create the confirm VO from internal VO
            ShowECMDocumentIDInformation confirmVO =
                new ShowECMDocumentIDInformation(internalVO);

            if (internalVO.getQueryWhereFields().getF5600028_SESSID() == "" ||
                internalVO.getQueryWhereFields().getMode() == "") {
                confirmVO.setErrorCode("1");
                confirmVO.setErrorDescription("Invalid Barcode ID or Mode");
            } else {
                if (internalVO.getQueryWhereFields().getMode().equalsIgnoreCase("D") &&
                    internalVO.getQueryResults(0).getErroCode().equals("1")) {
                    confirmVO.setErrorCode("1");
                    confirmVO.setErrorDescription("No record found for given Barcode ID");
                }
                if (internalVO.getQueryWhereFields().getMode().equalsIgnoreCase("I") &&
                    internalVO.getQueryResults() == null) {
                    confirmVO.setErrorCode("1");
                    confirmVO.setErrorDescription("No record found for given Barcode ID");
                }

                if (internalVO.getQueryWhereFields().getMode().equalsIgnoreCase("A")) {
                    if (internalVO.getQueryResults(0).getErroCode().equals("1")) {
                        confirmVO.setErrorCode("1");
                        confirmVO.setErrorDescription("Record Already Exist for Given Barcode ID");
                    } else {
                        confirmVO.setSessionID(internalVO.getQueryResults(0).getF5600028_SESSID());
                    }
                }
            }

            confirmVO.setE1MessageList(messages);
            finishPublishedMethod(context, "ecmDocumentIDInformationManager");
            //return outVO, filled with return values and messages
            return confirmVO;
        } finally {
            //Call close to clean up all remaining connections and resources.
            close(context, "ecmDocumentIDInformationManager");
        }
    }
}
