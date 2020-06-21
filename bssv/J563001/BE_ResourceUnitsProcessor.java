package be.e1.bssv.J563001;

import be.e1.bssv.J563001.valueobject.InternalResourceUnits;

import be.e1.bssv.J563001.valueobject.InternalResourceUnitsData;

import java.util.ArrayList;

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

/**
 * TODO: Java Doc for BusinessService
 */
public abstract class BE_ResourceUnitsProcessor extends BusinessService {
    private static final String DEFAULT_TYPECODE = "CH";
    private static final String DEFAULT_UNITOFMEASURE_UM = "HR";
    private static final String DEFAULT_COSTCENTERTYPE_STYL = "WC";
    private static final MathNumeric DEFAULT_CENTURY_CTRY =
        new MathNumeric(20);
    private static final String STR_BLANK = " ";

    /**
     * TODO: Create Java Doc for: updateResourceUnits
     * Method updateResourceUnits is used for...?
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
     * @return an E1Message containing the text of any errors or warnings that may have occurred
     */
    public static E1MessageList updateResourceUnits(IContext context,
                                                    IConnection connection,
                                                    InternalResourceUnits internalVO) {

        //Call start internal method, passing the context (which was passed from PublishedBusinessService).
        startInternalMethod(context, "updateResourceUnits", internalVO);
        //Create new message list for BusinessService processing.
        E1MessageList messages = new E1MessageList();
        E1MessageList bsfnMessages = new E1MessageList();

        //TODO: call method (created by the wizard), which then executes Business Function or Database operation.
        ArrayList internalResourceUnitsData = new ArrayList();
        for (int i = 0; i < internalVO.getInternalResourceUnitsData().size();
             i++) {
            bsfnMessages =
                    callGetHoursFromDay(context, connection, internalVO.getInternalResourceUnitsData(i));

            messages.addMessages(bsfnMessages);
            internalResourceUnitsData.add(internalVO.getInternalResourceUnitsData(i));
        } //end - loop
        internalVO.setInternalResourceUnitsData(internalResourceUnitsData);
        //TODO:  add messages returned from E1 processing to BusinessService message list.

        //Call finish internal method passing context.
        finishInternalMethod(context, "updateResourceUnits");

        //Call finish internal method passing context.
        return messages;
    }

    /**
     * Calls the GetHoursFromDay(N5630003) business function which has the D5630003 datastructure.
     * @param context conditionally provides the connection for the business function call and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param TODO document input parameters
     * @return A list of messages if there were application errors, warnings, or informational
     * messages. Returns null if there were no messages.
     */
    private static E1MessageList callGetHoursFromDay(IContext context,
                                                     IConnection connection,
                                                     InternalResourceUnitsData internalVO) {
        BSFNParameters bsfnParams = new BSFNParameters();

        // map input parameters from input value object
        bsfnParams.setValue("szTypeCode_TP", DEFAULT_TYPECODE);
        bsfnParams.setValue("szWorkCenter_MCU",
                            internalVO.getSzWorkCenter_MCU());
        bsfnParams.setValue("szBranch_MMCU",
                            internalVO.getSzBranchPlant_MMCU());
        bsfnParams.setValue("cShift_SHFT", internalVO.getCShiftCode_SHFT());
        bsfnParams.setValue("jdDate_UPMJ", internalVO.getJdDate_UPMJ());
        bsfnParams.setValue("mnHours_RU01", internalVO.getMnHours_RU01());
        bsfnParams.setValue("cErrorCode_ERRC",
                            internalVO.getCErrorCode_ERRC());
        bsfnParams.setValue("szCostCenterType_STYL",
                            DEFAULT_COSTCENTERTYPE_STYL);
        bsfnParams.setValue("szUnitOfMeasure_UM", DEFAULT_UNITOFMEASURE_UM);
        bsfnParams.setValue("mnCentury_CTRY", DEFAULT_CENTURY_CTRY);
        bsfnParams.setValue("szDataItem", STR_BLANK);
        bsfnParams.setValue("szDescriptionAlpha", STR_BLANK);

        try {
            //get bsfnService from context
            IBSFNService bsfnService = context.getBSFNService();

            //execute business function
            bsfnService.execute(context, connection, "GetHoursFromDay",
                                bsfnParams);
        } catch (BSFNServiceInvalidArgException invalidArgEx) {
            //Create error message for Invalid Argument exception and return it in ErrorList
            E1MessageList returnMessages = new E1MessageList();
            returnMessages.addMessage(new E1Message(context, "018FIS",
                                                    invalidArgEx.getMessage()));
            return returnMessages;
        } catch (BSFNServiceSystemException systemEx) {
            //Create error message for System exception and return it in ErrorList
            E1MessageList returnMessages = new E1MessageList();
            returnMessages.addMessage(new E1Message(context, "019FIS",
                                                    systemEx.getMessage()));
            return returnMessages;
        }


        //map output parameters to output value object
        internalVO.setCErrorCode_ERRC(bsfnParams.getValue("cErrorCode_ERRC").toString());
        internalVO.setSzDataItem((String)bsfnParams.getValue("szDataItem"));
        internalVO.setSzDescriptionAlpha((String)bsfnParams.getValue("szDescriptionAlpha"));

        //Create error message for BSFN internal failures and return it in ErrorList
        if (internalVO.getCErrorCode_ERRC().equals("1")) {
            E1MessageList returnMessages = new E1MessageList();
            String errorMessage =
                " Branch: " + internalVO.getSzBranchPlant_MMCU() +
                " Work Center: " + internalVO.getSzWorkCenter_MCU() + 
                " Shift: " + internalVO.getCShiftCode_SHFT() + 
                " Date: " + internalVO.getJdDate_UPMJ().toString() +
                " Error: " + internalVO.getSzDataItem() + " - " + internalVO.getSzDescriptionAlpha();

            returnMessages.addMessage(new E1Message(context, "018FIS",
                                                    errorMessage));
            return returnMessages;
        }

        //return any errors, warnings, or informational messages to the caller
        return bsfnParams.getE1MessageList();
    }
}
