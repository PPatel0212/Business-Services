package be.e1.bssv.J564203;

import be.e1.bssv.J564203.ComplianceProxy.ProcessComplianceScreeningPortClient;
import be.e1.bssv.J564203.com.beav.kewill.compliancescreening.Administration;
import be.e1.bssv.J564203.com.beav.kewill.compliancescreening.Attribute_Element;
import be.e1.bssv.J564203.com.beav.kewill.compliancescreening.Attribute_Element1;
import be.e1.bssv.J564203.com.beav.kewill.compliancescreening.Classification_Element;
import be.e1.bssv.J564203.com.beav.kewill.compliancescreening.Classification_Element1;
import be.e1.bssv.J564203.com.beav.kewill.compliancescreening.Classifier_Element;
import be.e1.bssv.J564203.com.beav.kewill.compliancescreening.Classifier_Element1;
import be.e1.bssv.J564203.com.beav.kewill.compliancescreening.CompiantScreeningResponse;
import be.e1.bssv.J564203.com.beav.kewill.compliancescreening.CompliantScreeningRequest;
import be.e1.bssv.J564203.com.beav.kewill.compliancescreening.CountryOfOrigin;
import be.e1.bssv.J564203.com.beav.kewill.compliancescreening.Country_Element;
import be.e1.bssv.J564203.com.beav.kewill.compliancescreening.Country_Element1;
import be.e1.bssv.J564203.com.beav.kewill.compliancescreening.DeniedParties;
import be.e1.bssv.J564203.com.beav.kewill.compliancescreening.Descriptor_Element;
import be.e1.bssv.J564203.com.beav.kewill.compliancescreening.Descriptor_Element1;
import be.e1.bssv.J564203.com.beav.kewill.compliancescreening.EmbargoResponse;
import be.e1.bssv.J564203.com.beav.kewill.compliancescreening.EndUserParty;
import be.e1.bssv.J564203.com.beav.kewill.compliancescreening.LicenseException;
import be.e1.bssv.J564203.com.beav.kewill.compliancescreening.LicenseRequired;
import be.e1.bssv.J564203.com.beav.kewill.compliancescreening.LicenseResponse;
import be.e1.bssv.J564203.com.beav.kewill.compliancescreening.Parameters;
import be.e1.bssv.J564203.com.beav.kewill.compliancescreening.PartyResponse;
import be.e1.bssv.J564203.com.beav.kewill.compliancescreening.Party_Element;
import be.e1.bssv.J564203.com.beav.kewill.compliancescreening.Party_Element1;
import be.e1.bssv.J564203.com.beav.kewill.compliancescreening.Product;
import be.e1.bssv.J564203.com.beav.kewill.compliancescreening.ServiceResponse;
import be.e1.bssv.J564203.com.beav.kewill.compliancescreening.ShipFromCountry;
import be.e1.bssv.J564203.com.beav.kewill.compliancescreening.ShipToCountry;
import be.e1.bssv.J564203.com.beav.kewill.compliancescreening.TransactionLine;
import be.e1.bssv.J564203.com.beav.kewill.compliancescreening.TransactionRequest;
import be.e1.bssv.J564203.valueobject.InternalAdjustHolds;
import be.e1.bssv.J564203.valueobject.InternalAdmin;
import be.e1.bssv.J564203.valueobject.InternalAttribute;
import be.e1.bssv.J564203.valueobject.InternalClassification;
import be.e1.bssv.J564203.valueobject.InternalClassify;
import be.e1.bssv.J564203.valueobject.InternalComplianceRequest;

import be.e1.bssv.J564203.valueobject.InternalCountry;
import be.e1.bssv.J564203.valueobject.InternalDescriptor;
import be.e1.bssv.J564203.valueobject.InternalEndUserParty;
import be.e1.bssv.J564203.valueobject.InternalLogDeniedParties;
import be.e1.bssv.J564203.valueobject.InternalLogEmbargoes;
import be.e1.bssv.J564203.valueobject.InternalLogLicenseExceptions;
import be.e1.bssv.J564203.valueobject.InternalNonCompliantOrders;
import be.e1.bssv.J564203.valueobject.InternalParameters;
import be.e1.bssv.J564203.valueobject.InternalParty;
import be.e1.bssv.J564203.valueobject.InternalProduct;
import be.e1.bssv.J564203.valueobject.InternalShipFromCountry;
import be.e1.bssv.J564203.valueobject.InternalShipToCountry;
import be.e1.bssv.J564203.valueobject.InternalTransaction;

import be.e1.bssv.J564203.valueobject.InternalTransactionLine;

import be.e1.bssv.J564203.valueobject.InternalTransactionParty;

import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.text.ParsePosition;

import java.util.Calendar;

import java.util.Date;

import oracle.e1.bssvfoundation.base.BSFNParameters;
import oracle.e1.bssvfoundation.base.BusinessService;
import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BSFNServiceInvalidArgException;
import oracle.e1.bssvfoundation.exception.BSFNServiceSystemException;
import oracle.e1.bssvfoundation.services.IBSFNService;
import oracle.e1.bssvfoundation.util.E1Message;
import oracle.e1.bssvfoundation.util.E1MessageList;

import oracle.e1.bssvfoundation.util.MathNumeric;
import oracle.e1.bssvfoundation.util.SoftCodingRecordAccess;

import org.w3c.dom.Element;

/**
 * TODO: Java Doc for BusinessService
 */
public abstract class BE_ComplianceScreening
  extends BusinessService
{
  /**
   * TODO: Create Java Doc for: InternalProcessCompliance
   * Method InternalProcessCompliance is used for...?
   * @param context conditionally provides the connection for the database operation and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
   * @return an E1Message containing the text of any errors or warnings that may have occurred
   */
  public static E1MessageList InternalProcessCompliance(IContext context,
                                                        IConnection connection,
                                                        InternalComplianceRequest internalVO) {
    //Call start internal method, passing the context (which was passed from PublishedBusinessService).
    startInternalMethod(context, "InternalProcessCompliance", internalVO);
    //Create new message list for BusinessService processing.
    E1MessageList messages = new E1MessageList();

    CompliantScreeningRequest csRequest = new CompliantScreeningRequest();
    CopyInternalRequestToPublished(internalVO, csRequest);

    try
    {
      ProcessComplianceScreeningPortClient compliancePortClient = new ProcessComplianceScreeningPortClient();
      initPortWithSoftCoding(context, compliancePortClient, messages);
      CompiantScreeningResponse csResponse = compliancePortClient.process(csRequest);

      //Process response message
      InternalAdmin iAdmin = internalVO.getAdmin();
      if(iAdmin != null)
      {
        //BigInteger statusCode = csResponse.getStatusCode();
        InternalAdjustHolds iAdjust = iAdmin.getOrderKeys();

        //Create logging structure
        InternalNonCompliantOrders iNonCompOrders = new InternalNonCompliantOrders();
        iNonCompOrders.setMnOrderNumber(iAdjust.getMnOrderNumber());
        iNonCompOrders.setSzOrderCompany(iAdjust.getSzOrderCompany());
        iNonCompOrders.setSzOrderType(iAdjust.getSzOrderType());
        iNonCompOrders.setCProcessedFlag("N");

        iAdjust.setCDenialFlagYN("N");
        ServiceResponse srvResp = csResponse.getServiceResponse();
        if(srvResp != null)
        {
            //obtain various response arrays
            EmbargoResponse[] embargoArr = srvResp.getEmbargoResponse();
            PartyResponse[] partyArr = srvResp.getPartyResponse();
            LicenseResponse[] licenseArr = srvResp.getLicenseResponse();

            if(embargoArr != null || partyArr != null)
            {
                iAdjust.setCDenialFlagYN("Y");
            }
            else
            {
                if(licenseArr != null)
                {
                    /* Check to see if any invalid license exists */
                    for(int idx=0; idx<licenseArr.length; idx++)
                    {
                        LicenseRequired licReq = licenseArr[idx].getLicenseRequired();
                        if(licReq != null)
                        {
                            if(licReq.getValue().equals("Y"))
                            {
                                iAdjust.setCDenialFlagYN("Y");
                                idx = licenseArr.length;
                            }
                        }
                    }
                }
            }

            //Log errors
            if(iAdjust.getCDenialFlagYN().equals("Y"))
            {
                //write screening denials from Kewill
                iNonCompOrders.setSzStatusMessage("Non-Compliant Order");
                callBE_LogNonCompliantOrders(context, connection, iNonCompOrders);
            }
            else 
            {
                //write Kewill/FMW exceptions.
                int status = csResponse.getStatusCode().intValue();
                //Write XC holds on kewill exceptions
                if(status == 1)
                {
                    iNonCompOrders.setSzStatusMessage(csResponse.getStatusMessage());
                    iAdjust.setCDenialFlagYN("Y");
                    //write screening denials from Kewill
                    callBE_LogNonCompliantOrders(context, connection, iNonCompOrders);                    
                }
            }

            //process embargoes
            if(embargoArr != null)
            {
                for(int idx=0; idx<embargoArr.length; idx++)
                {
                    InternalLogEmbargoes iLogEmbargo = new InternalLogEmbargoes();
                    iLogEmbargo.setMnTransactionID(iNonCompOrders.getMnTransactionID());
                    iLogEmbargo.setSzCountry(embargoArr[idx].getCountry());
                    iLogEmbargo.setSzUserDefinedKey(embargoArr[idx].getUserDefined());
                    iLogEmbargo.setSzEmbargoMessage(embargoArr[idx].getEmbargo());
                    //write embargoes
                    if(iAdjust.getCDenialFlagYN().equals("Y"))
                    {
                        callBE_LogEmbargoes(context, connection, iLogEmbargo);
                    }
                }
            }

            //process Licenses
            if(licenseArr != null)
            {
                boolean writeFlag = false;
                for(int idx=0; idx<licenseArr.length; idx++)
                {
                    InternalLogLicenseExceptions iLogLicense = new InternalLogLicenseExceptions();
                    iLogLicense.setMnTransactionID(iNonCompOrders.getMnTransactionID());
                    iLogLicense.setSzLicenseExceptionType(licenseArr[idx].getExceptionType());
                    iLogLicense.setSzUserDefinedKey(licenseArr[idx].getUserDefined());

                    LicenseRequired licReq = licenseArr[idx].getLicenseRequired();
                    if(licReq != null)
                    {
                        iLogLicense.setSzLicenseType(licReq.getType());
                        iLogLicense.setSzLicenseValue(licReq.getValue());
                        iLogLicense.setSzLicenseControlReason(licReq.getControlReason());
                        writeFlag = false;
                        if(licReq.getValue().equals("Y"))
                            writeFlag = true;
                    }

                    LicenseException licExp = licenseArr[idx].getLicenseException();
                    if(licExp != null)
                    {
                        iLogLicense.setSzLicenseExceptionType(licExp.getType());
                        iLogLicense.setSzLicenseExceptionValue(licExp.getValue());
                    }
                    //write license exceptions
                    if(writeFlag && iAdjust.getCDenialFlagYN().equals("Y"))
                    {
                        callBE_LogLicenseExceptions(context, connection, iLogLicense);
                    }
                }
            }

            //process log parties
            if(partyArr != null)
            {
                for(int idx=0; idx<partyArr.length; idx++)
                {
                    InternalLogDeniedParties iDeniedParty = new InternalLogDeniedParties();
                    iDeniedParty.setMnTransactionID(iNonCompOrders.getMnTransactionID());
                    iDeniedParty.setSzUserDefinedKey(partyArr[idx].getUserDefined());
                    iDeniedParty.setSzRedFlagWords(partyArr[idx].getRedFlagWords());

                    DeniedParties[] deniedPartyArr = partyArr[idx].getDeniedParties();
                    if(deniedPartyArr != null)
                    {
                        for(int idx2=0; idx2<deniedPartyArr.length; idx2++)
                        {
                            iDeniedParty.setSzDeniedPartyId(deniedPartyArr[idx2].getId());
                            iDeniedParty.setSzDeniedPartyType(deniedPartyArr[idx2].getType());
                            iDeniedParty.setSzDeniedPartyName(deniedPartyArr[idx2].getName());
                            iDeniedParty.setSzDeniedPartyAddress(deniedPartyArr[idx2].getAddress());
                            iDeniedParty.setSzDeniedPartyCity(deniedPartyArr[idx2].getCity());
                            iDeniedParty.setSzDeniedPartyCountry(deniedPartyArr[idx2].getCountryCode());
                            iDeniedParty.setSzDenialReason(deniedPartyArr[idx2].getDenialType());
                            iDeniedParty.setSzAgency(deniedPartyArr[idx2].getAgency());
                            iDeniedParty.setSzDeniedPartyList(deniedPartyArr[idx2].getList());
                            iDeniedParty.setSzCitation(deniedPartyArr[idx2].getCitation());

                            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
                            Date tmpDate = dateFormat.parse(deniedPartyArr[idx2].getCitationDate(), new ParsePosition(0));
                            iDeniedParty.setJdCitationDate(tmpDate);
                            tmpDate = dateFormat.parse(deniedPartyArr[idx2].getDenialEffectiveDate(), new ParsePosition(0));
                            iDeniedParty.setJdDenialEffectiveStart(tmpDate);
                            tmpDate = dateFormat.parse(deniedPartyArr[idx2].getDenialEffectiveUntil(), new ParsePosition(0));
                            iDeniedParty.setJdDenialEffectiveEnd(tmpDate);

                            iDeniedParty.setSzExportDenialProgram(deniedPartyArr[idx2].getDenialProgram());
                            iDeniedParty.setSzDeniedListCountry(deniedPartyArr[idx2].getListCountry());
                            iDeniedParty.setSzVesselCallSign(deniedPartyArr[idx2].getVesselCallSign());
                            iDeniedParty.setSzVesselType(deniedPartyArr[idx2].getVesselType());
                            iDeniedParty.setSzVesselTonnage(deniedPartyArr[idx2].getVesselTonnage());
                            iDeniedParty.setSzVesselGRT(deniedPartyArr[idx2].getVesselGRT());
                            iDeniedParty.setSzVesselFlag(deniedPartyArr[idx2].getVesselFlag());
                            iDeniedParty.setSzVesselOwner(deniedPartyArr[idx2].getVesselOwner());
                            iDeniedParty.setSzComments(deniedPartyArr[idx2].getComments());

                            tmpDate = dateFormat.parse(deniedPartyArr[idx2].getDateAdded(), new ParsePosition(0));
                            iDeniedParty.setJdDateAdded(tmpDate);

                            iDeniedParty.setSzControllingAgency(deniedPartyArr[idx2].getControllingAgency());
                            iDeniedParty.setSzDeniedPartyWords(deniedPartyArr[idx2].getWords());

                            //write denial parties
                            if(iAdjust.getCDenialFlagYN().equals("Y"))
                            {
                                callBE_LogDeniedParties(context, connection, iDeniedParty);
                            }
                        }
                    }
                }
            }
        }
        //Process order holds
        callBE_AdjustExportComplianceHolds(context, connection, iAdjust);
      }
    }
    catch (Exception exp)
    {
      System.out.println("Some exception occurred");
      messages.addMessage(new E1Message(context, "$E5600", exp.getMessage()));
    }

    //Call finish internal method passing context.
    finishInternalMethod(context, "InternalProcessCompliance");

    //Call finish internal method passing context.
    return messages;
  }

    private static E1MessageList initPortWithSoftCoding(IContext context,
                                                     ProcessComplianceScreeningPortClient portClient,
                                                     E1MessageList msgList)
  {
    final String softCodingKey = "J564203";
    try
    {
      Element softCodingRecord =
        SoftCodingRecordAccess.getSoftCodingRecord(context, softCodingKey);
      if (softCodingRecord != null)
      {
        String serviceUrl =
          SoftCodingRecordAccess.getSoftcodingRecordFieldvalue(context,
                                                               "endpoint",
                                                               softCodingRecord);
        if (serviceUrl != null)
        {
          portClient.setEndpoint(serviceUrl);
        }
      }
    }
    catch (Exception exp)
    {
      context.getBSSVLogger().app(context, "WEB_SERVICE_CALL",
                                  "Invalid Softcoding Record", null, exp);
      System.out.println("Error: Invalid softcoding record");
      E1Message e1Msg =
        new E1Message(context, "004FIS", "Invalid Softcoding Record");
      msgList.addMessage(e1Msg);
    }
    return msgList;
  }

  static private void CopyInternalRequestToPublished(InternalComplianceRequest internalReqVO,
                                                     CompliantScreeningRequest publishReqVO)
  {
    //Create administration node
    InternalAdmin iAdmin = internalReqVO.getAdmin();
    Administration admin = new Administration();
    admin.setComments(iAdmin.getComments());
    admin.setIncludedRequest(iAdmin.getIncludedRequest());
    admin.setOutputFormat(iAdmin.getOutputFormat());
    Calendar cal = Calendar.getInstance();
    cal.setTime(iAdmin.getRequestDate());
    admin.setRequestDate(cal);
    admin.setSubscriberId(iAdmin.getSubscriberId());
    admin.setSubscriberPassword(iAdmin.getSubscriberPassword());
    admin.setTicket(iAdmin.getTicket());

    //Create the transaction node
    InternalTransaction iTxn = internalReqVO.getTransaction();
    TransactionRequest txn = new TransactionRequest();
    txn.setComments(iTxn.getComments());
    txn.setDateFormat(iTxn.getDateFormat());
    txn.setDeploymentMode(iTxn.getDeployMode());
    txn.setEmbargoScreening(iTxn.getEmbargoScreening());
    txn.setLanguage(iTxn.getLanguage());
    txn.setLicenseScreening(iTxn.getLicenseScreening());
    txn.setPartyScreening(iTxn.getPartyScreening());
    txn.setTicket(iTxn.getTicket());
    txn.setType(iTxn.getType());
    txn.setUserDefined(iTxn.getUserDefined());
    txn.setVersion(iTxn.getVersion());

    // create classifier
    InternalClassify[] iClassArr = iTxn.getClassifier();
    if (iClassArr != null)
    {
      int size = iClassArr.length;
      if (size > 0)
      {
        Classifier_Element[] classEltArr = new Classifier_Element[size];
        for (int x = 0; x < size; x++)
        {
          //Load Classification_Element member of the Classifier_Element
          InternalClassification iClassification =
            iClassArr[x].getClassification();
          Classification_Element classificationElt =
            new Classification_Element();
          classificationElt.setLabel(iClassification.getLabel());
          classificationElt.setType(iClassification.getType());
          //Load the rest of the Classifier_Element
          classEltArr[x] = new Classifier_Element();
          classEltArr[x].setClassification(classificationElt);
          classEltArr[x].setLabel(iClassArr[x].getLabel());
          classEltArr[x].setType(iClassArr[x].getType());
        }
        //set the Classifier_Element array for transaction request
        txn.setClassifier(classEltArr);
      }
    }

    //process descriptor
    InternalDescriptor[] iDescrArr = iTxn.getDescriptor();
    if (iDescrArr != null)
    {
      int size = iDescrArr.length;
      if (size > 0)
      {
        Descriptor_Element[] descrEltArr = new Descriptor_Element[size];
        for (int x = 0; x < size; x++)
        {
          descrEltArr[x] = new Descriptor_Element();
          //set descriptor type
          descrEltArr[x].setType(iDescrArr[x].getType());
          //set descriptor attributes
          InternalAttribute[] iAttrArr = iDescrArr[x].getAttribute();
          if (iAttrArr != null)
          {
            int arrSize = iAttrArr.length;
            if (arrSize > 0)
            {
              Attribute_Element[] attrEltArr =
                new Attribute_Element[arrSize];
              for (int y = 0; y < arrSize; y++)
              {
                attrEltArr[y] = new Attribute_Element();
                attrEltArr[y].setType(iAttrArr[y].getType());
                attrEltArr[y].setValue(iAttrArr[y].getValue());
              }
              descrEltArr[x].setAttribute(attrEltArr);
            }
          }
        }
        //set the descriptors on transaction node
        txn.setDescriptor(descrEltArr);
      }
    }

    //process parameters
    InternalParameters iParms = iTxn.getParameters();
    Parameters parms = new Parameters();
    parms.setCountryMatch(iParms.getCountryMatch());
    parms.setExactMatch(iParms.getExactMatch());
    parms.setRedflag(iParms.getRedFlag());
    parms.setThreshold(iParms.getThreshold());
    txn.setParameters(parms);

    //process party
    InternalParty[] iPartyArr = iTxn.getParty();
    if (iPartyArr != null)
    {
      int size = iPartyArr.length;
      if (size > 0)
      {
        Party_Element[] partyEltArr = new Party_Element[size];
        for (int x = 0; x < size; x++)
        {
          partyEltArr[x] = new Party_Element();

          partyEltArr[x].setId(iPartyArr[x].getId());
          partyEltArr[x].setType(iPartyArr[x].getType());
          partyEltArr[x].setName(iPartyArr[x].getName());
          partyEltArr[x].setContact(iPartyArr[x].getContact());
          partyEltArr[x].setAddresses(iPartyArr[x].getAddresses());
          partyEltArr[x].setCity(iPartyArr[x].getCity());
          partyEltArr[x].setSubDivision(iPartyArr[x].getState());
          partyEltArr[x].setPostalCode(iPartyArr[x].getPostalCode());
          partyEltArr[x].setEmail(iPartyArr[x].getEmail());
          partyEltArr[x].setPhone(iPartyArr[x].getPhone());
          partyEltArr[x].setFax(iPartyArr[x].getFax());
          partyEltArr[x].setEndUserType(iPartyArr[x].getEndUserType());
          partyEltArr[x].setUserDefined(iPartyArr[x].getUserDefined());

          // process country
          InternalCountry iCountry = iPartyArr[x].getCountry();
          Country_Element countryElt = new Country_Element();
          countryElt.setCode(iCountry.getCode());
          countryElt.setDomain(iCountry.getDomain());
          countryElt.setSchema(iCountry.getSchema());
          partyEltArr[x].setCountry(countryElt);

          // process endUserParty
          InternalEndUserParty iEndUserParty =
            iPartyArr[x].getEndUserParty();
          EndUserParty endUserParty = new EndUserParty();
          endUserParty.setEndUser(iEndUserParty.getEndUser());
          endUserParty.setEndUserCertificate(iEndUserParty.getEndUserCertificate());
          endUserParty.setMilitary(iEndUserParty.getMilitary());
          endUserParty.setNonUSGovernment(iEndUserParty.getNonUSGovernment());

          //process descriptor
          InternalDescriptor[] iDescArr = iEndUserParty.getDescriptor();
          if (iDescArr != null)
          {
            int arrSize1 = iDescArr.length;
            if (size > 0)
            {
              Descriptor_Element1[] descEltArr =
                new Descriptor_Element1[arrSize1];
              for (int idx1 = 0; idx1 < arrSize1; idx1++)
              {
                descEltArr[idx1] = new Descriptor_Element1();
                descEltArr[idx1].setType(iDescArr[idx1].getType());
                //process attributes
                InternalAttribute[] iAttrArr =
                  iDescArr[idx1].getAttribute();
                if (iAttrArr != null)
                {
                  int arrSize2 = iAttrArr.length;
                  if (arrSize2 > 0)
                  {
                    Attribute_Element1[] attrEltArr =
                      new Attribute_Element1[arrSize2];
                    for (int idx2 = 0; idx2 < arrSize2; idx2++)
                    {
                      attrEltArr[idx2] = new Attribute_Element1();
                      attrEltArr[idx2].setType(iAttrArr[idx2].getType());
                      attrEltArr[idx2].setValue(iAttrArr[idx2].getValue());
                    }
                    //add attribute array to descriptor elements
                    descEltArr[idx1].setAttribute(attrEltArr);
                  }
                }
              }
              //add descriptor array to endUserParty
              endUserParty.setDescriptor(descEltArr);
            }
          }
          //Add endUserParty to party array
          partyEltArr[x].setEndUserParty(endUserParty);
        }
        //add party array to transaction
        txn.setParty(partyEltArr);
      }
    }

    //set the request date
    if (iTxn.getRequestDate() != null)
    {
      txn.setRequestDate(iTxn.getRequestDate().toString());
    }

    //set the ship from country
    InternalShipFromCountry iShipFromCtry = iTxn.getShipFromCountry();
    InternalCountry iCountry = iShipFromCtry.getShipFrom();
    ShipFromCountry shipFromCtry = new ShipFromCountry();
    shipFromCtry.setCode(iCountry.getCode());
    shipFromCtry.setDomain(iCountry.getDomain());
    shipFromCtry.setSchema(iCountry.getSchema());
    txn.setShipFromCountry(shipFromCtry);

    //set the ship to country
    InternalShipToCountry iShipToCtry = iTxn.getShipToCountry();
    iCountry = iShipToCtry.getShipTo();
    ShipToCountry shipToCtry = new ShipToCountry();
    shipToCtry.setCode(iCountry.getCode());
    shipToCtry.setDomain(iCountry.getDomain());
    shipToCtry.setSchema(iCountry.getSchema());
    txn.setShipToCountry(shipToCtry);

    //set the transaction date
    Calendar txnDate = Calendar.getInstance();
    txnDate.setTime(iTxn.getTransactionDate());
    txn.setTransactionDate(txnDate);

    //set the transaction line data
    InternalTransactionLine[] iTxnLineArr = iTxn.getTransactionLine();
    if (iTxnLineArr != null)
    {
      int size = iTxnLineArr.length;
      if (size > 0)
      {
        TransactionLine[] txnLineArr = new TransactionLine[size];
        for (int idx1 = 0; idx1 < size; idx1++)
        {
          txnLineArr[idx1] = new TransactionLine();
          //process user-defined in transaction line
          txnLineArr[idx1].setUserDefined(iTxnLineArr[idx1].getUserDefined());
          InternalTransactionParty iParty = iTxnLineArr[idx1].getParty();
          Party_Element1 partyElt = new Party_Element1();

          if (iParty != null)
          {
            //process party in transaction line
            partyElt.setAddresses(iParty.getAddresses());
            partyElt.setCity(iParty.getCity());
            partyElt.setContact(iParty.getContact());
            partyElt.setEmail(iParty.getEmail());
            partyElt.setEndUseType(iParty.getEndUserType());
            partyElt.setEndUserParty(iParty.getEndUserParty());
            partyElt.setFax(iParty.getFax());
            partyElt.setId(iParty.getId());
            partyElt.setName(iParty.getName());
            partyElt.setPhone(iParty.getPhone());
            partyElt.setPostalCode(iParty.getPostalCode());
            partyElt.setSubDivision(iParty.getState());
            partyElt.setType(iParty.getType());
            partyElt.setUserDefined(iParty.getUserDefined());

            // process country
            iCountry = iParty.getCountry();
            Country_Element1 countryElt = new Country_Element1();
            countryElt.setCode(iCountry.getCode());
            countryElt.setDomain(iCountry.getDomain());
            countryElt.setSchema(iCountry.getSchema());
            partyElt.setCountry(countryElt);

            //add the partyElt to TransactionLine
            txnLineArr[idx1].setParty(partyElt);
          }
          //process product node from transaction line
          InternalProduct iProduct = iTxnLineArr[idx1].getProduct();
          if(iProduct != null)
          {
            Product product = new Product();
            product.setProductId(iProduct.getProductId());
            product.setEncryption(iProduct.getEncryption());
            product.setEndUseType(iProduct.getEndUseType());
            product.setLicenseException(iProduct.getLicenseException());
            product.setValue(iProduct.getValue());

            // process country of origin for product
            iCountry = iProduct.getCountryOrigin();
            CountryOfOrigin countryOfOrigin = new CountryOfOrigin();
            countryOfOrigin.setCode(iCountry.getCode());
            countryOfOrigin.setDomain(iCountry.getDomain());
            countryOfOrigin.setSchema(iCountry.getSchema());
            product.setCountryOfOrigin(countryOfOrigin);

            //process product classifier
            InternalClassify iClassify = iProduct.getClassifier();
            if(iClassify != null)
            {
              Classifier_Element1 classifyElt = new Classifier_Element1();
              classifyElt.setLabel(iClassify.getLabel());
              classifyElt.setType(iClassify.getType());

              //process classification
              InternalClassification iClassification = iClassify.getClassification();
              if(iClassification != null)
              {
                Classification_Element1 classificationElt = new Classification_Element1();
                classificationElt.setLabel(iClassification.getLabel());
                classificationElt.setType(iClassification.getType());
                //add classification element into classifier
                classifyElt.setClassification(classificationElt);
              }
              //add classifier to product
              product.setClassifier(classifyElt);
            }
            //add product to transaction line
            txnLineArr[idx1].setProduct(product);
          }
        }

        //add the transaction lines to main transaction
        txn.setTransactionLine(txnLineArr);
      }
    }

    //Load the published object
    publishReqVO.setAdministration(admin);
    publishReqVO.setTransactionRequest(txn);
  }


  /**
   * Calls the BE_AdjustExportComplianceHolds(N5642014) business function which has the D5642014C datastructure.
   * @param context conditionally provides the connection for the business function call and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @param TODO document input parameters
   * @return A list of messages if there were application errors, warnings, or informational
   * messages. Returns null if there were no messages.
   */
  private static E1MessageList callBE_AdjustExportComplianceHolds(IContext context, IConnection connection, InternalAdjustHolds internalVO)
  {
    BSFNParameters bsfnParams = new BSFNParameters();

    // map input parameters from input value object
    bsfnParams.setValue("szOrderCompany", internalVO.getSzOrderCompany());
    bsfnParams.setValue("mnOrderNumber", internalVO.getMnOrderNumber());
    bsfnParams.setValue("szOrderType", internalVO.getSzOrderType());
    bsfnParams.setValue("cDenialFlagYN", internalVO.getCDenialFlagYN());

    try
    {
      //get bsfnService from context
      IBSFNService bsfnService = context.getBSFNService();

      //execute business function
      bsfnService.execute(context, connection, "BE_AdjustExportComplianceHolds", bsfnParams);
    }
    catch (BSFNServiceInvalidArgException invalidArgEx)
    {
      //Create error message for Invalid Argument exception and return it in ErrorList
      E1MessageList returnMessages = new E1MessageList();
      returnMessages.addMessage(new E1Message(context, "018FIS", invalidArgEx.getMessage()));
      return returnMessages;
    }
    catch (BSFNServiceSystemException systemEx)
    {
      //Create error message for System exception and return it in ErrorList
      E1MessageList returnMessages = new E1MessageList();
      returnMessages.addMessage(new E1Message(context, "019FIS", systemEx.getMessage()));
      return returnMessages;
    }
    //map output parameters to output value object
    
    //return any errors, warnings, or informational messages to the caller
    return bsfnParams.getE1MessageList();
  }

    /**
     * Calls the BE_LogNonCompliantOrders(N5642014) business function which has the D5642014D datastructure.
     * @param context conditionally provides the connection for the business function call and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param TODO document input parameters
     * @return A list of messages if there were application errors, warnings, or informational
     * messages. Returns null if there were no messages.
     */
    private static E1MessageList callBE_LogNonCompliantOrders(IContext context, IConnection connection, InternalNonCompliantOrders internalVO) {
        BSFNParameters bsfnParams = new BSFNParameters();

        // map input parameters from input value object
        bsfnParams.setValue("mnTransactionID", internalVO.getMnTransactionID());
        bsfnParams.setValue("szOrderCompany", internalVO.getSzOrderCompany());
        bsfnParams.setValue("mnOrderNumber", internalVO.getMnOrderNumber());
        bsfnParams.setValue("szOrderType", internalVO.getSzOrderType());
        bsfnParams.setValue("szStatusMessage", internalVO.getSzStatusMessage());
        bsfnParams.setValue("cProcessedFlag", internalVO.getCProcessedFlag());

        try {
            //get bsfnService from context
            IBSFNService bsfnService = context.getBSFNService();

            //execute business function
            bsfnService.execute(context, connection, "BE_LogNonCompliantOrders", bsfnParams);
        } catch (BSFNServiceInvalidArgException invalidArgEx) {
            //Create error message for Invalid Argument exception and return it in ErrorList
            E1MessageList returnMessages = new E1MessageList();
            returnMessages.addMessage(new E1Message(context, "018FIS", invalidArgEx.getMessage()));
            return returnMessages;
        }
        catch (BSFNServiceSystemException systemEx) {
            //Create error message for System exception and return it in ErrorList
            E1MessageList returnMessages = new E1MessageList();
            returnMessages.addMessage(new E1Message(context, "019FIS", systemEx.getMessage()));
            return returnMessages;
        }
        //map output parameters to output value object
        internalVO.setMnTransactionID((MathNumeric)bsfnParams.getValue("mnTransactionID"));
        //return any errors, warnings, or informational messages to the caller
        return bsfnParams.getE1MessageList();
    }

    /**
     * Calls the BE_LogEmbargoes(N5642014) business function which has the D5642014E datastructure.
     * @param context conditionally provides the connection for the business function call and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param TODO document input parameters
     * @return A list of messages if there were application errors, warnings, or informational
     * messages. Returns null if there were no messages.
     */
    private static E1MessageList callBE_LogEmbargoes(IContext context, IConnection connection, InternalLogEmbargoes internalVO) {
        BSFNParameters bsfnParams = new BSFNParameters();

        // map input parameters from input value object
        bsfnParams.setValue("mnTransactionID", internalVO.getMnTransactionID());
        bsfnParams.setValue("szUserDefinedKey", internalVO.getSzUserDefinedKey());
        bsfnParams.setValue("szCountry", internalVO.getSzCountry());
        bsfnParams.setValue("szEmbargoMessage", internalVO.getSzEmbargoMessage());

        try {
            //get bsfnService from context
            IBSFNService bsfnService = context.getBSFNService();

            //execute business function
            bsfnService.execute(context, connection, "BE_LogEmbargoes", bsfnParams);
        } catch (BSFNServiceInvalidArgException invalidArgEx) {
            //Create error message for Invalid Argument exception and return it in ErrorList
            E1MessageList returnMessages = new E1MessageList();
            returnMessages.addMessage(new E1Message(context, "018FIS", invalidArgEx.getMessage()));
            return returnMessages;
        }
        catch (BSFNServiceSystemException systemEx) {
            //Create error message for System exception and return it in ErrorList
            E1MessageList returnMessages = new E1MessageList();
            returnMessages.addMessage(new E1Message(context, "019FIS", systemEx.getMessage()));
            return returnMessages;
        }
        //map output parameters to output value object

        //return any errors, warnings, or informational messages to the caller
        return bsfnParams.getE1MessageList();
    }

    /**
     * Calls the BE_LogLicenseExceptions(N5642014) business function which has the D5642014F datastructure.
     * @param context conditionally provides the connection for the business function call and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param TODO document input parameters
     * @return A list of messages if there were application errors, warnings, or informational
     * messages. Returns null if there were no messages.
     */
    private static E1MessageList callBE_LogLicenseExceptions(IContext context, IConnection connection, InternalLogLicenseExceptions internalVO) {
        BSFNParameters bsfnParams = new BSFNParameters();

        // map input parameters from input value object
        bsfnParams.setValue("mnTransactionID", internalVO.getMnTransactionID());
        bsfnParams.setValue("szUserDefinedKey", internalVO.getSzUserDefinedKey());
        bsfnParams.setValue("szComplianceExceptionType", internalVO.getSzExceptionType());
        bsfnParams.setValue("szLicenseRequiredType", internalVO.getSzLicenseType());
        bsfnParams.setValue("szLicenseRequiredValue", internalVO.getSzLicenseValue());
        bsfnParams.setValue("szLicenseRequiredControl", internalVO.getSzLicenseControlReason());
        bsfnParams.setValue("szLicenseExceptionType", internalVO.getSzLicenseExceptionType());
        bsfnParams.setValue("szLicenseExceptionValue", internalVO.getSzLicenseExceptionValue());

        try {
            //get bsfnService from context
            IBSFNService bsfnService = context.getBSFNService();

            //execute business function
            bsfnService.execute(context, connection, "BE_LogLicenseExceptions", bsfnParams);
        } catch (BSFNServiceInvalidArgException invalidArgEx) {
            //Create error message for Invalid Argument exception and return it in ErrorList
            E1MessageList returnMessages = new E1MessageList();
            returnMessages.addMessage(new E1Message(context, "018FIS", invalidArgEx.getMessage()));
            return returnMessages;
        }
        catch (BSFNServiceSystemException systemEx) {
            //Create error message for System exception and return it in ErrorList
            E1MessageList returnMessages = new E1MessageList();
            returnMessages.addMessage(new E1Message(context, "019FIS", systemEx.getMessage()));
            return returnMessages;
        }
        //map output parameters to output value object
        //return any errors, warnings, or informational messages to the caller
        return bsfnParams.getE1MessageList();
    }

    /**
     * Calls the BE_LogDeniedParties(N5642014) business function which has the D5642014G datastructure.
     * @param context conditionally provides the connection for the business function call and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param TODO document input parameters
     * @return A list of messages if there were application errors, warnings, or informational
     * messages. Returns null if there were no messages.
     */
    private static E1MessageList callBE_LogDeniedParties(IContext context, IConnection connection, InternalLogDeniedParties internalVO) {
        BSFNParameters bsfnParams = new BSFNParameters();

        // map input parameters from input value object
        bsfnParams.setValue("mnTransactionID", internalVO.getMnTransactionID());
        bsfnParams.setValue("szUserDefined", internalVO.getSzUserDefinedKey());
        bsfnParams.setValue("szRedFlagWords", internalVO.getSzRedFlagWords());
        bsfnParams.setValue("szDeniedPartyId", internalVO.getSzDeniedPartyId());
        bsfnParams.setValue("szDeniedPartyType", internalVO.getSzDeniedPartyType());
        bsfnParams.setValue("szDeniedPartyName", internalVO.getSzDeniedPartyName());
        bsfnParams.setValue("szDeniedPartyAddress", internalVO.getSzDeniedPartyAddress());
        bsfnParams.setValue("szDeniedPartyCity", internalVO.getSzDeniedPartyCity());
        bsfnParams.setValue("szDeniedPartyCountry", internalVO.getSzDeniedPartyCountry());
        bsfnParams.setValue("szDenialReason", internalVO.getSzDenialReason());
        bsfnParams.setValue("szAgency", internalVO.getSzAgency());
        bsfnParams.setValue("szDeniedPartyList", internalVO.getSzDeniedPartyList());
        bsfnParams.setValue("szCitation", internalVO.getSzCitation());
        bsfnParams.setValue("jdCitationDate", internalVO.getJdCitationDate());
        bsfnParams.setValue("jdDenialEffectiveStart", internalVO.getJdDenialEffectiveStart());
        bsfnParams.setValue("jdDenialEffectiveEnd", internalVO.getJdDenialEffectiveEnd());
        bsfnParams.setValue("szExportDenialProgram", internalVO.getSzExportDenialProgram());
        bsfnParams.setValue("szDeniedPartyListProgram", internalVO.getSzDeniedPartyListProgram());
        bsfnParams.setValue("szDeniedListCountry", internalVO.getSzDeniedListCountry());
        bsfnParams.setValue("szVesselCallSign", internalVO.getSzVesselCallSign());
        bsfnParams.setValue("szVesselType", internalVO.getSzVesselType());
        bsfnParams.setValue("szVesselTonnage", internalVO.getSzVesselTonnage());
        bsfnParams.setValue("szVesselGRT", internalVO.getSzVesselGRT());
        bsfnParams.setValue("szVesselFlag", internalVO.getSzVesselFlag());
        bsfnParams.setValue("szVesselOwner", internalVO.getSzVesselOwner());
        bsfnParams.setValue("szComments", internalVO.getSzComments());
        bsfnParams.setValue("jdDateAdded", internalVO.getJdDateAdded());
        bsfnParams.setValue("szControllingAgency", internalVO.getSzControllingAgency());
        bsfnParams.setValue("szDeniedPartyWords", internalVO.getSzDeniedPartyWords());

        try {
            //get bsfnService from context
            IBSFNService bsfnService = context.getBSFNService();

            //execute business function
            bsfnService.execute(context, connection, "BE_LogDeniedParties", bsfnParams);
        } catch (BSFNServiceInvalidArgException invalidArgEx) {
            //Create error message for Invalid Argument exception and return it in ErrorList
            E1MessageList returnMessages = new E1MessageList();
            returnMessages.addMessage(new E1Message(context, "018FIS", invalidArgEx.getMessage()));
            return returnMessages;
        }
        catch (BSFNServiceSystemException systemEx) {
            //Create error message for System exception and return it in ErrorList
            E1MessageList returnMessages = new E1MessageList();
            returnMessages.addMessage(new E1Message(context, "019FIS", systemEx.getMessage()));
            return returnMessages;
        }


        //map output parameters to output value object

        //return any errors, warnings, or informational messages to the caller
        return bsfnParams.getE1MessageList();
    }
}
