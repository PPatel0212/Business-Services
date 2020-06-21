package be.e1.bssv.JP564803.valueobject;

import be.e1.bssv.J564803.valueobject.InternalGetWorkOrderSerialNo;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.MessageValueObject;
import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class ShowWorkOrderSerialNo extends MessageValueObject implements Serializable {
  
  /**
       * Array of WorkOrder Serial No arrays returned from query.
       */
      private WorkOrderSerialNo workOrderSerialNo[];

  /**
   * TODO: Default public constructor for instantiating: ShowWorkOrderSerialNo
   */
  public ShowWorkOrderSerialNo() {
  }
  public ShowWorkOrderSerialNo(InternalGetWorkOrderSerialNo internalVO){
          if(internalVO.getQueryResults()!=null){
            
             this.workOrderSerialNo = new WorkOrderSerialNo[internalVO.getQueryResults().size()];
             for(int i = 0;i<internalVO.getQueryResults().size();i++){
               
                WorkOrderSerialNo ws = new WorkOrderSerialNo(internalVO.getQueryResults(i));
               
                this.setworkOrderSerialNo(i,ws);
             }
          }
      }




      public void setworkOrderSerialNo(WorkOrderSerialNo[] workOrderSerialNo) {
          this.workOrderSerialNo = workOrderSerialNo;
      }
      public void setworkOrderSerialNo(int i, WorkOrderSerialNo workOrderSerialNo){
          this.workOrderSerialNo[i] = workOrderSerialNo;
      }
      public WorkOrderSerialNo getworkOrderSerialNo(int i){
          return workOrderSerialNo[i];
      }

      public WorkOrderSerialNo[] getworkOrderSerialNo() {
          return workOrderSerialNo;
      }

  
}
