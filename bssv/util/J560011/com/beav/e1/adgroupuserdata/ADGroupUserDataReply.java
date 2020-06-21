/**
 * Generated from schema type t|e=ADGroupUserDataReply|d=ADGroupUserDataReply@http://www.beav.com/e1/adgroupuserdata
 */
package be.e1.bssv.util.J560011.com.beav.e1.adgroupuserdata;

public class ADGroupUserDataReply implements java.io.Serializable {

  private be.e1.bssv.util.J560011.com.beav.e1.adgroupuserdata.UserData[] userData;

  public be.e1.bssv.util.J560011.com.beav.e1.adgroupuserdata.UserData[] getUserData() {
    return this.userData;
  }

  public void setUserData(be.e1.bssv.util.J560011.com.beav.e1.adgroupuserdata.UserData[] userData) {
    this.userData = userData;
  }

  private java.math.BigInteger statusCode;

  public java.math.BigInteger getStatusCode() {
    return this.statusCode;
  }

  public void setStatusCode(java.math.BigInteger statusCode) {
    this.statusCode = statusCode;
  }

  private java.lang.String statusMessage;

  public java.lang.String getStatusMessage() {
    return this.statusMessage;
  }

  public void setStatusMessage(java.lang.String statusMessage) {
    this.statusMessage = statusMessage;
  }

}
