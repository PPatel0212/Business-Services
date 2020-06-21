package be.e1.bssv.JP564101.valueobject;

import be.e1.bssv.J564101.valueobject.InternalGetCCBTrackerInfo;
import be.e1.bssv.J564101.valueobject.InternalGetCCBTrackerInfoWhereFields;
import be.e1.bssv.J564207.valueobject.InternalGetSalesOrderHeader;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.E1MessageList;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class GetCCBTrackerInformation extends ValueObject implements Serializable {
  /**
   * Reference
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: VR01 <br>
   * EnterpriseOne field length:  25 <br>
   */
  private String cNNumber = null;

  /**
   * 2nd Item Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: LITM <br>
   * EnterpriseOne field length:  25 <br>
   */
  private String itemNumber = null;

    /**
     *Item Revision
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: MERL <br>
     * EnterpriseOne field length:  3 <br>
     */
    private String itemRevision = null;


  /**
   * TODO: Default public constructor for instantiating: GetCCBTrackerInformation
   */
  public GetCCBTrackerInformation() {
  }

  public E1MessageList mapFromPublished(IContext context,
                                        InternalGetCCBTrackerInfo vo) {

InternalGetCCBTrackerInfoWhereFields queryWhereFields = vo.getQueryWhereFields();

if(this.itemNumber!=null)
queryWhereFields.setF4101_LITM(this.itemNumber);
                        
if(this.cNNumber!=null)
  queryWhereFields.setCNNumber(this.cNNumber);

if(this.itemRevision!=null)
    queryWhereFields.setF4101_MERL(this.itemRevision);
  
   return null;                                        

                                         }
  public void setCNNumber(String cNNumber) {
    this.cNNumber = cNNumber;
  }

  public String getCNNumber() {
    return cNNumber;
  }

  public void setItemNumber(String itemNumber) {
    this.itemNumber = itemNumber;
  }

  public String getItemNumber() {
    return itemNumber;
  }

    public void setItemRevision(String itemRevision) {
        this.itemRevision = itemRevision;
    }

    public String getItemRevision() {
        return itemRevision;
    }
}
