/**
 * Generated from schema type t=BrokerDetail@http://www.beone.com/fedex/beshipments
 */
package be.e1.bssv.J564200.com.beone.fedex.beshipments;

public class BrokerDetail implements java.io.Serializable {

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.BrokerType type;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.BrokerType getType() {
    return this.type;
  }

  public void setType(be.e1.bssv.J564200.com.beone.fedex.beshipments.BrokerType type) {
    this.type = type;
  }

  private be.e1.bssv.J564200.com.beone.fedex.beshipments.Party broker;

  public be.e1.bssv.J564200.com.beone.fedex.beshipments.Party getBroker() {
    return this.broker;
  }

  public void setBroker(be.e1.bssv.J564200.com.beone.fedex.beshipments.Party broker) {
    this.broker = broker;
  }

}
