package be.e1.bssv.JP560101.valueobject;

import be.e1.bssv.J560101.valueobject.WorkdayCalculation_D5601006;
import be.e1.bssv.J560202.valueobject.WorkflowAck_D5602000G;
import be.e1.bssv.JP560202.valueobject.WorkflowAckReply;

import com.jdedwards.runtime.base.MathNumeric;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.E1MessageList;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class WorkDayReply extends ValueObject implements Serializable {
    
    public WorkDayReply() {
        
    }
    
    public WorkDayReply(WorkdayCalculation_D5601006 internalVO)
    {
      this.calculatedBranchPlantOffset=0;
      if(internalVO.getMnCalculatedBranchPlantOffset()!=null) {
          this.calculatedBranchPlantOffset=internalVO.getMnCalculatedBranchPlantOffset().intValue();
      }
        setErrorID(internalVO.getSzErrorId());
        setErrorDescription(internalVO.getSzErrorDescription());
      
      
    /*  if(internalVO.getSzErrorDescription()!=null) {
          this.errorDescription=internalVO.getSzErrorDescription();
      }*/
      
    }
     
     private Integer calculatedBranchPlantOffset=null;
     private String errorID=null;

    public void setErrorID(String errorID) {
        this.errorID = errorID;
    }

    public String getErrorID() {
        return errorID;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    public String getErrorDescription() {
        return errorDescription;
    }
    private String errorDescription=null;

    public void setCalculatedBranchPlantOffset(Integer calculatedBranchPlantOffset) {
        this.calculatedBranchPlantOffset = calculatedBranchPlantOffset;
    }

    public Integer getCalculatedBranchPlantOffset() {
        return calculatedBranchPlantOffset;
    }

    public void setE1MessageList(E1MessageList messages) {
    }
}
