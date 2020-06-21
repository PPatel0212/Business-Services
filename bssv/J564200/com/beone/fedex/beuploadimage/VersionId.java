/**
 * Generated from schema type t=VersionId@http://www.beone.com/fedex/beuploadimage
 */
package be.e1.bssv.J564200.com.beone.fedex.beuploadimage;

public class VersionId implements java.io.Serializable {

  private java.lang.String serviceId;

  public java.lang.String getServiceId() {
    if (serviceId == null) return new java.lang.String("cdus");
    else return serviceId;
  }

  public void setServiceId(java.lang.String serviceId) {
    this.serviceId = serviceId;
  }

  private int major;

  public int getMajor() {
    return this.major;
  }

  public void setMajor(int major) {
    this.major = major;
  }

  private int intermediate;

  public int getIntermediate() {
    return this.intermediate;
  }

  public void setIntermediate(int intermediate) {
    this.intermediate = intermediate;
  }

  private int minor;

  public int getMinor() {
    return this.minor;
  }

  public void setMinor(int minor) {
    this.minor = minor;
  }

}
