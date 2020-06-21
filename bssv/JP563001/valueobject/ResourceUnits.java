package be.e1.bssv.JP563001.valueobject;

import be.e1.bssv.J563001.valueobject.InternalResourceUnits;
import be.e1.bssv.J563001.valueobject.InternalResourceUnitsData;

import java.io.Serializable;
import java.util.ArrayList;

import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.exception.BSSVDataFormatterException;
import oracle.e1.bssvfoundation.util.E1Message;
import oracle.e1.bssvfoundation.util.E1MessageList;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class ResourceUnits extends ValueObject implements Serializable {
    private ResourceUnitsData resourceUnitsData[];

    /**
     * TODO: Default public constructor for instantiating: ResourceUnits
     */
    public ResourceUnits() {
    }

    public void setResourceUnitsData(ResourceUnitsData[] resourceUnitsData) {
        this.resourceUnitsData = resourceUnitsData;
    }

    public ResourceUnitsData[] getResourceUnitsData() {
        return resourceUnitsData;
    }

    public void setResourceUnitsData(ResourceUnitsData resourceUnitsData,
                                     int i) {
        this.resourceUnitsData[i] = resourceUnitsData;
    }

    public ResourceUnitsData getResourceUnitsData(int i) {
        return resourceUnitsData[i];
    }

    public E1MessageList mapFromPublished(IContext context,
                                          InternalResourceUnits vo) {
        E1MessageList messages = new E1MessageList();
        ArrayList internalResourceUnits = new ArrayList();
        if (this.getResourceUnitsData() != null) {
            for (int i = 0; i < this.getResourceUnitsData().length; i++) {
                InternalResourceUnitsData internalResourceUnitsData =
                    new InternalResourceUnitsData();
                internalResourceUnitsData.setCErrorCode_ERRC(" ");
                internalResourceUnitsData.setSzBranchPlant_MMCU(FormatterUtility(context,
                                                                                 this.getResourceUnitsData(i).getBranch(),
                                                                                 "MMCU",
                                                                                 messages,
                                                                                 "BranchPlant"));
                internalResourceUnitsData.setSzWorkCenter_MCU(FormatterUtility(context,
                                                                               this.getResourceUnitsData(i).getBusinessUnit(),
                                                                               "MCU",
                                                                               messages,
                                                                               "WorkCenter"));
                internalResourceUnitsData.setJdDate_UPMJ(this.getResourceUnitsData(i).getDateUpdated());
                internalResourceUnitsData.setCShiftCode_SHFT(this.getResourceUnitsData(i).getShiftCode());
                internalResourceUnitsData.setMnHours_RU01(new MathNumeric(this.getResourceUnitsData(i).getUnitResource01()));
                internalResourceUnits.add(internalResourceUnitsData);
            }
            vo.setInternalResourceUnitsData(internalResourceUnits);
        }
        return messages;
    }

    public String FormatterUtility(IContext context, String fieldToFormat,
                                   String aliasName, E1MessageList messages,
                                   String fieldName) {
        String formattedMCU = null;

        if (fieldToFormat != null && (fieldToFormat.length() > 0)) {
            try {
                formattedMCU =
                        context.getBSSVDataFormatter().format(fieldToFormat,
                                                              aliasName);
            } catch (BSSVDataFormatterException e) {
                context.getBSSVLogger().app(context,
                                            "Error when formatting " + fieldName,
                                            null, null, e);
                //Create new E1 Message with error from exception
                messages.addMessage(new E1Message(context, "002FIS",
                                                  fieldToFormat));
            }
        }

        return (formattedMCU);
    }
}
