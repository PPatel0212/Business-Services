package oracle.e1.bssv.J570101;

import java.util.ArrayList;
import java.util.Date;

import oracle.e1.bssv.J570101.valueobject.GetACN;
import oracle.e1.bssv.J570101.valueobject.InternalGetACN;
import oracle.e1.bssv.J570101.valueobject.ShowACN;
//import oracle.e1.bssv.J574901.valueobject.InternalAddF55PSH01;
//import oracle.e1.bssv.J574901.valueobject.ShowF55PSH01;
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
public abstract class GetACNProcessor extends BusinessService {
    /**
     * TODO: Create Java Doc for: GetACN
     * Method GetACN is used for...?
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
     * @return an E1Message containing the text of any errors or warnings that may have occurred
     */
    public static E1MessageList AddACNInfo(IContext context, IConnection connection, GetACN internalVO) {

        //Call start internal method, passing the context (which was passed from PublishedBusinessService).
        startInternalMethod(context, "AddACNInfo", internalVO);
        //Create new message list for BusinessService processing.
        E1MessageList messages = new E1MessageList();

        //TODO: call method (created by the wizard), which then executes Business Function or Database operation.
       // callACNInterface(context, connection, internalVO);
        //TODO:  add messages returned from E1 processing to BusinessService message list.
        if (internalVO.getInternalACN()!= null) {
            
            ShowACN showInternalACN = new ShowACN();
            ArrayList showInternalACNlist = new ArrayList();
            

            for (int detailRecords = 0; detailRecords < internalVO.getInternalACN().size(); detailRecords ++)
            {
                InternalGetACN internalAddACN = internalVO.getInternalACN(detailRecords);
                
                messages.addMessages(callACNInterface(context, connection, internalAddACN));
               // MathNumeric mnUniqueId = internalICCodeVO.getMnUniqueId();
                if (!messages.hasErrors()) {
                    
                  // InternalAddF55PSH01 InternalF55PSH01 = new InternalAddF55PSH01();

                  //  messages.addMessages(selectFromF5741Z1(context, connection, mnUniqueId, showInternalICCodeVO));
                   showInternalACNlist.add(internalAddACN);

                  //  if (!messages.hasErrors()) {

                    //   messages.addMessages("Success");
                        
                   // }

                }
                
            }
            showInternalACN.setShowInternalACN(showInternalACNlist);
            internalVO.setShowACN(showInternalACN);   
        }


        //TODO:  add messages returned from E1 processing to BusinessService message list.

        // insertToF55PSH01(context, connection, internalVO);
        //TODO:  add messages returned from E1 processing to BusinessService message list.


     

        //Call finish internal method passing context.
        finishInternalMethod(context, "AddACNInfo");

        //Call finish internal method passing context.
        return messages;
    }

    /**
     * Calls the ACNInterface(N5701001) business function which has the D5741001A datastructure.
     * @param context conditionally provides the connection for the business function call and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @param TODO document input parameters
     * @return A list of messages if there were application errors, warnings, or informational
     * messages. Returns null if there were no messages.
     */
    private static E1MessageList callACNInterface(IContext context, IConnection connection, InternalGetACN internalVO) {
        BSFNParameters bsfnParams = new BSFNParameters();
        E1MessageList returnMessages = new E1MessageList();
        // map input parameters from input value object
        bsfnParams.setValue("RECTYPE", internalVO.getRECTYPE());
        bsfnParams.setValue("KUNNR", internalVO.getKUNNR());
        bsfnParams.setValue("NAME1", internalVO.getNAME1());
        bsfnParams.setValue("EXT_STNBR", internalVO.getEXT_STNBR());
        bsfnParams.setValue("STRAS", internalVO.getSTRAS());
        bsfnParams.setValue("ORT01", internalVO.getORT01());
        bsfnParams.setValue("REGIO", internalVO.getREGIO());
        bsfnParams.setValue("PSLTZ", internalVO.getPSLTZ());
        bsfnParams.setValue("ORT02", internalVO.getORT02());
        bsfnParams.setValue("LAND1", internalVO.getLAND1());
        bsfnParams.setValue("TXJCD", internalVO.getTXJCD());
        bsfnParams.setValue("CUST_REC_T", internalVO.getCUST_REC_T());
        bsfnParams.setValue("CUST_ACN", internalVO.getCUST_ACN());
        bsfnParams.setValue("LGY_NAME2", internalVO.getLGY_NAME2());
        bsfnParams.setValue("TYPE_CUST", internalVO.getTYP_ACC());
        bsfnParams.setValue("TRUE_ACN", internalVO.getTRUE_ACN());
        bsfnParams.setValue("TERM_DATE", internalVO.getTERM_DATE());
        bsfnParams.setValue("ST_TWN_NBR", internalVO.getST_TWN_NBR());
        bsfnParams.setValue("WHL_SVN_ID", internalVO.getWHL_SVN_ID());
        bsfnParams.setValue("WHL_MKT_ID", internalVO.getWHL_MKT_ID());
        bsfnParams.setValue("TYP_WHL", internalVO.getTYP_WHL());
        bsfnParams.setValue("FTN_SVN_ID", internalVO.getFTN_SVN_ID());
        bsfnParams.setValue("FTN_WHL_ID", internalVO.getFTN_WHL_ID());
        bsfnParams.setValue("HDQTRS", internalVO.getHDQTRS());
        bsfnParams.setValue("EXP_DEPT", internalVO.getEXP_DEPT());
        bsfnParams.setValue("CONCESS_NO", internalVO.getCONCESS_NO());
        bsfnParams.setValue("CHAIN", internalVO.getCHAIN());
        bsfnParams.setValue("FTN_GEO_ID", internalVO.getFTN_GEO_ID());
        bsfnParams.setValue("TYP_ACC", internalVO.getTYP_ACC());
        bsfnParams.setValue("FTN_FRAN", internalVO.getFTN_FRAN());
        bsfnParams.setValue("PH_AREA_CD", internalVO.getPH_AREA_CD());
        bsfnParams.setValue("PH_LIN_NBR", internalVO.getPH_LIN_NBR());
        bsfnParams.setValue("PH_XTN_NBR", internalVO.getPH_XTN_NBR());
        bsfnParams.setValue("URCD", internalVO.getURCD());
        bsfnParams.setValue("URRF", internalVO.getURRF());
        bsfnParams.setValue("URAT", internalVO.getURAT());
        bsfnParams.setValue("URDT", internalVO.getURDT());
        bsfnParams.setValue("URAB", internalVO.getURAB());

        try {
            //get bsfnService from context
            IBSFNService bsfnService = context.getBSFNService();

            //execute business function
            bsfnService.execute(context, connection, "ACNInterface", bsfnParams);
        } catch (BSFNServiceInvalidArgException invalidArgEx) {
            //Create error message for Invalid Argument exception and return it in ErrorList
           
            returnMessages.addMessage(new E1Message(context, "018FIS", invalidArgEx.getMessage()));
            return returnMessages;
        }
        catch (BSFNServiceSystemException systemEx) {
            //Create error message for System exception and return it in ErrorList
           // E1MessageList returnMessages = new E1MessageList();
            returnMessages.addMessage(new E1Message(context, "019FIS", systemEx.getMessage()));
            return returnMessages;
        }


        //map output parameters to output value object
        internalVO.setRECTYPE(bsfnParams.getValue("RECTYPE").toString());
        internalVO.setKUNNR((String) bsfnParams.getValue("KUNNR"));
        internalVO.setNAME1((String) bsfnParams.getValue("NAME1"));
        internalVO.setEXT_STNBR((String) bsfnParams.getValue("EXT_STNBR"));
        internalVO.setSTRAS((String) bsfnParams.getValue("STRAS"));
        internalVO.setORT01((String) bsfnParams.getValue("ORT01"));
        internalVO.setREGIO((String) bsfnParams.getValue("REGIO"));
        internalVO.setPSLTZ((String) bsfnParams.getValue("PSLTZ"));
        internalVO.setORT02((String) bsfnParams.getValue("ORT02"));
        internalVO.setLAND1((String) bsfnParams.getValue("LAND1"));
        internalVO.setTXJCD((String) bsfnParams.getValue("TXJCD"));
        internalVO.setCUST_REC_T((String) bsfnParams.getValue("CUST_REC_T"));
        internalVO.setCUST_ACN((MathNumeric) bsfnParams.getValue("CUST_ACN"));
        internalVO.setLGY_NAME2((String) bsfnParams.getValue("LGY_NAME2"));
        internalVO.setTYPE_CUST((String) bsfnParams.getValue("TYPE_CUST"));
        internalVO.setTRUE_ACN((MathNumeric) bsfnParams.getValue("TRUE_ACN"));
        internalVO.setTERM_DATE((Date) bsfnParams.getValue("TERM_DATE"));
        internalVO.setST_TWN_NBR((MathNumeric) bsfnParams.getValue("ST_TWN_NBR"));
        internalVO.setWHL_SVN_ID((MathNumeric) bsfnParams.getValue("WHL_SVN_ID"));
        internalVO.setWHL_MKT_ID((MathNumeric) bsfnParams.getValue("WHL_MKT_ID"));
        internalVO.setTYP_WHL((String) bsfnParams.getValue("TYP_WHL"));
        internalVO.setFTN_SVN_ID((MathNumeric) bsfnParams.getValue("FTN_SVN_ID"));
        internalVO.setFTN_WHL_ID((MathNumeric) bsfnParams.getValue("FTN_WHL_ID"));
        internalVO.setHDQTRS((MathNumeric) bsfnParams.getValue("HDQTRS"));
        internalVO.setEXP_DEPT((String) bsfnParams.getValue("EXP_DEPT"));
        internalVO.setCONCESS_NO((String) bsfnParams.getValue("CONCESS_NO"));
        internalVO.setCHAIN((MathNumeric) bsfnParams.getValue("CHAIN"));
        internalVO.setFTN_GEO_ID((MathNumeric) bsfnParams.getValue("FTN_GEO_ID"));
        internalVO.setTYP_ACC((String) bsfnParams.getValue("TYP_ACC"));
        internalVO.setFTN_FRAN((String) bsfnParams.getValue("FTN_FRAN"));
        internalVO.setPH_AREA_CD((String) bsfnParams.getValue("PH_AREA_CD"));
        internalVO.setPH_LIN_NBR((String) bsfnParams.getValue("PH_LIN_NBR"));
        internalVO.setPH_XTN_NBR((String) bsfnParams.getValue("PH_XTN_NBR"));
        internalVO.setURCD((String) bsfnParams.getValue("URCD"));
        internalVO.setURRF((String) bsfnParams.getValue("URRF"));
        internalVO.setURAT((MathNumeric) bsfnParams.getValue("URAT"));
        internalVO.setURDT((Date) bsfnParams.getValue("URDT"));
        internalVO.setURAB((MathNumeric) bsfnParams.getValue("URAB"));

        //return any errors, warnings, or informational messages to the caller
        return bsfnParams.getE1MessageList();
    }
}
