package be.e1.bssv.JP563002.valueobject;

import be.e1.bssv.J563002.valueobject.InternalBOMChild;
import be.e1.bssv.J563002.valueobject.InternalBOMParent;

import java.io.Serializable;

import java.util.ArrayList;

import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BSSVDataFormatterException;
import oracle.e1.bssvfoundation.util.E1Message;
import oracle.e1.bssvfoundation.util.E1MessageList;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class LoadBOMParent extends ValueObject implements Serializable {
    /**
     * Type Code
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: TP <br>
     * EnterpriseOne field length:  3 <br>
     */
    private String reportWriterType = null;
    
    /**
     * Branch
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: MMCU <br>
     * EnterpriseOne field length:  12 <br>
     */
    private String costCenterAlt = null;
    
    /**
     * Kit - 2nd Item Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: KITL <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String itemNumber2ndKit = null;

    /**
     * Bill Revision Level
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: BREV <br>
     * EnterpriseOne field length:  3 <br>
     */
    private String billRevisionLevel = null;
    
    /**
     * Array for BOM Children.<br>
     */
    private LoadBOMChild child[];      

    /**
     * Data Item
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DTAI <br>
     * EnterpriseOne field length:  10 <br>
     */
    private String szDataItem_DTAI = null;

    /**
     * Alpha Description
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DSCA <br>
     * EnterpriseOne field length:  40 <br>
     * EnterpriseOne Edit Rule:NE <br>
     */
    private String szDataItemAlphaDesc_DSCA = null;

    /**
     * TODO: Default public constructor for instantiating: LoadBOMParent
     */
    public LoadBOMParent() {
    }

    public void setReportWriterType(String reportWriterType) {
        this.reportWriterType = reportWriterType;
    }

    public String getReportWriterType() {
        return reportWriterType;
    }

    public void setCostCenterAlt(String costCenterAlt) {
        this.costCenterAlt = costCenterAlt;
    }

    public String getCostCenterAlt() {
        return costCenterAlt;
    }

    public void setItemNumber2ndKit(String itemNumber2ndKit) {
        this.itemNumber2ndKit = itemNumber2ndKit;
    }

    public String getItemNumber2ndKit() {
        return itemNumber2ndKit;
    }

    public void setBillRevisionLevel(String billRevisionLevel) {
        this.billRevisionLevel = billRevisionLevel;
    }

    public String getBillRevisionLevel() {
        return billRevisionLevel;
    }

    public void setChild(LoadBOMChild[] child) {
        this.child = child;
    }
    
    public void setChild(LoadBOMChild child, int i)
    {
      this.child[i] = child;    
    }

    public LoadBOMChild[] getChild() {
        return child;
    }
    
    public LoadBOMChild getChild(int i)
    {
      return child[i];
    }
    
    //Method mapFromPublished with ProcessSalesOrder argument             
    public E1MessageList mapFromPublished(IContext context, IConnection connection, 
                                          InternalBOMParent vo)
    {   
      E1MessageList messages = new E1MessageList();    
      
      
      /* PARENT MAPPINGS */
      messages.addMessages(mapFromPublishedParent(context, connection, vo));       
      
      if (!messages.hasErrors())
      {
        /* CHILD MAPPINGS */
        messages.addMessages(mapFromPublishedChild(context, connection, vo));    
      }
      
      return messages;
    }   
    
    public E1MessageList mapFromPublishedParent(IContext context, IConnection connection,
                                                InternalBOMParent vo)
    {
      E1MessageList messages = new E1MessageList();
     
      vo.setF30UI004_TP(this.getReportWriterType());  
      vo.setF3002_KITL(this.getItemNumber2ndKit());
      vo.setF3002_MMCU(FormatterUtility(context, this.getCostCenterAlt(), "MMCU", messages, "BusinessUnit"));    
      vo.setF3002_BREV(this.getBillRevisionLevel());
      
      return messages;
    }
    
    public E1MessageList mapFromPublishedChild(IContext context, IConnection connection,
                                                InternalBOMParent vo)
    {
      E1MessageList messages = new E1MessageList();     
      ArrayList internalBOMChild = new ArrayList();      
      
      if (this.getChild() != null)
      {
        for (int childRecords = 0; childRecords < this.getChild().length; childRecords++)            
        {
          InternalBOMChild internalChild = new InternalBOMChild();
 
          internalChild.setF3002_LITM(this.getChild(childRecords).getIdentifier2ndItem());
          internalChild.setF3002_QNTY(this.getChild(childRecords).getQtyRequiredStandard()); 
          internalChild.setF3002_UM(this.getChild(childRecords).getUnitOfMeasure());
          internalChild.setF3002_FORQ(this.getChild(childRecords).getFixedOrVariableQty()); 
          internalChild.setF3002_BSEQ(this.getChild(childRecords).getBubbleSequence());  
          internalChild.setF3002_SCRP(this.getChild(childRecords).getPercentOfScrap()); 
          internalChild.setF3002_LOVD(this.getChild(childRecords).getLeadtimeOffsetDays());               
          /* Add to arraylist */
          internalBOMChild.add(internalChild);      
        }            
        vo.setInternalBOMChild(internalBOMChild);
      }    
      return messages;    
    }

    public String FormatterUtility(IContext context, String fieldToFormat, String aliasName, 
                                   E1MessageList messages, String fieldName)
    {
      String formattedMCU = null;
      
      if (fieldToFormat != null && (fieldToFormat.length() > 0))
      {
        try 
        {        
          formattedMCU = context.getBSSVDataFormatter().format(fieldToFormat, aliasName);
        }  
        catch (BSSVDataFormatterException e) 
        {
          context.getBSSVLogger().app(context,"Error when formatting " + fieldName, null, null, e);
          //Create new E1 Message with error from exception
          messages.addMessage(new E1Message(context, "002FIS", fieldToFormat));
        }
      }     
      
      return (formattedMCU);    
    }

    public void setSzDataItem_DTAI(String szDataItem_DTAI) {
        this.szDataItem_DTAI = szDataItem_DTAI;
    }

    public String getSzDataItem_DTAI() {
        return szDataItem_DTAI;
    }

    public void setSzDataItemAlphaDesc_DSCA(String szDataItemAlphaDesc_DSCA) {
        this.szDataItemAlphaDesc_DSCA = szDataItemAlphaDesc_DSCA;
    }

    public String getSzDataItemAlphaDesc_DSCA() {
        return szDataItemAlphaDesc_DSCA;
    }
}
