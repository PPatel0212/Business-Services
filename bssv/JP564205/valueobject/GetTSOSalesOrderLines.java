package be.e1.bssv.JP564205.valueobject;

import be.e1.bssv.J564205.valueobject.InternalVOTSOSalesLines;

import java.io.Serializable;

import java.math.BigDecimal;

import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BSSVDataFormatterException;
import oracle.e1.bssvfoundation.util.E1Message;
import oracle.e1.bssvfoundation.util.E1MessageList;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class GetTSOSalesOrderLines extends ValueObject implements Serializable {
    /**
     * Line Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: LNID <br>
     * EnterpriseOne field length:  6 <br>
     * EnterpriseOne decimal places: 3 <br>
     */
    private BigDecimal So_Line_No = null;

    /**
     * Document (Order No, Invoice, etc.)
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: DOCO <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer So_No = null;

    /**
     * Order Type
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: DCTO <br>
     * EnterpriseOne field length:  2 <br>
     */
    private String So_Type = null;

    /**
     * Business Unit
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: MCU <br>
     * EnterpriseOne field length:  12 <br>
     */
    private String Branch_Plant = null;                                           

    /**
     * TODO: Default public constructor for instantiating: GetTSOSalesOrderLines
     */
    public GetTSOSalesOrderLines() {
    }

    public void setSo_Line_No(BigDecimal So_Line_No) {
        this.So_Line_No = So_Line_No;
    }

    public BigDecimal getSo_Line_No() {
        return So_Line_No;
    }

    public void setSo_No(Integer So_No) {
        this.So_No = So_No;
    }

    public Integer getSo_No() {
        return So_No;
    }

    public void setSo_Type(String So_Type) {
        this.So_Type = So_Type;
    }

    public String getSo_Type() {
        return So_Type;
    }

    public void setBranch_Plant(String Branch_Plant) {
        this.Branch_Plant = Branch_Plant;
    }

    public String getBranch_Plant() {
        return Branch_Plant;
    }
    
    public E1MessageList mapFromPublished(IContext context, IConnection connection, InternalVOTSOSalesLines internalVO){
        E1MessageList messages = new E1MessageList();
        int counter = 0;
        try{
            if(this.getSo_No() > 0){
                internalVO.setF4211_DOCO(new MathNumeric(this.getSo_No()));
                counter++;
            }
            
            if(this.getSo_Type() != null && (!this.getSo_Type().equals(""))){
                internalVO.setF4211_DCTO(this.getSo_Type().trim());
                counter++;
            }
            
            if(this.getBranch_Plant() != null && (!this.getBranch_Plant().equals(""))){
                E1MessageList FormatMsg = new E1MessageList();
                String FormattedBranchPlant = FormatterUtility(context,connection,FormatMsg,this.getBranch_Plant());
                messages.addMessages(FormatMsg);
                internalVO.setF4211_MCU(FormattedBranchPlant);
                counter++;
            }
            
            if(this.getSo_Line_No().floatValue() > 0){
                internalVO.setF4211_LNID(new MathNumeric(this.getSo_Line_No()));
                counter++;
            }
            
            internalVO.setNoOfWhereFields(counter);
        }catch(Exception e){
            E1Message errorMessage = new E1Message();
            errorMessage.setMessage(e.getMessage());
            messages.addMessage(errorMessage);
        }
        
        return messages;
    }
    
    public String FormatterUtility(IContext context, IConnection connection,E1MessageList messages,String UnformattedBranchPlant){
        
        String FormattedBranchPlant = null;
        try{
            FormattedBranchPlant = context.getBSSVDataFormatter().format(UnformattedBranchPlant, "MCU");
        }catch(BSSVDataFormatterException e){
            messages.addMessage(new E1Message(context,"002FIS",e.getMessage()));
        }catch(Exception e){
            messages.addMessage(new E1Message(context,"002FIS",e.getMessage()));   
        }
        
        return FormattedBranchPlant;
    }
}
