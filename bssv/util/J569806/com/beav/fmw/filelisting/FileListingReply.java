/**
 * Generated from schema type t|e=FileListingReply|d=FileListingReply@http://www.beav.com/fmw/filelisting
 */
package be.e1.bssv.util.J569806.com.beav.fmw.filelisting;

public class FileListingReply implements java.io.Serializable {

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

  private be.e1.bssv.util.J569806.com.beav.fmw.filelisting.FileList[] fileList;

  public be.e1.bssv.util.J569806.com.beav.fmw.filelisting.FileList[] getFileList() {
    return this.fileList;
  }

  public void setFileList(be.e1.bssv.util.J569806.com.beav.fmw.filelisting.FileList[] fileList) {
    this.fileList = fileList;
  }

}
