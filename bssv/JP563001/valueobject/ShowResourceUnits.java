package be.e1.bssv.JP563001.valueobject;

import be.e1.bssv.J563001.valueobject.InternalResourceUnits;
import java.io.Serializable;
import oracle.e1.bssvfoundation.base.MessageValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class ShowResourceUnits extends MessageValueObject implements Serializable {
    /**
     * Array of Resource Units returned after processing
     */
    private ResourceUnitsData resourceUnitsData[];

    /**
     * TODO: Default public constructor for instantiating: ShowResourceUnits
     */

    public ShowResourceUnits() {
    }
    
    public ShowResourceUnits(InternalResourceUnits internalVO) {
        if(internalVO.getInternalResourceUnitsData()!=null){        
           this.resourceUnitsData = new ResourceUnitsData[internalVO.getInternalResourceUnitsData().size()];
           for(int i = 0;i<internalVO.getInternalResourceUnitsData().size();i++){
              ResourceUnitsData resourceUnitsDataConv = new ResourceUnitsData(internalVO.getInternalResourceUnitsData(i));
              this.setResourceUnitsData(i,resourceUnitsDataConv);
           }
        }
    }

    public void setResourceUnitsData(ResourceUnitsData[] resourceUnitsData) {
        this.resourceUnitsData = resourceUnitsData;
    }

    public void setResourceUnitsData(int i, ResourceUnitsData resourceUnitsData){
        this.resourceUnitsData[i] = resourceUnitsData;
    }
    
    public ResourceUnitsData[] getResourceUnitsData() {
        return resourceUnitsData;
    }
}
