/**
 * Generated from schema type t|e=FileListingRequest|d=FileListingRequest@http://www.beav.com/fmw/filelisting
 */
package be.e1.bssv.util.J569806.com.beav.fmw.filelisting;

public class FileListingRequest implements java.io.Serializable {

  private java.lang.String hostJNDI;

  public java.lang.String getHostJNDI() {
    return this.hostJNDI;
  }

  public void setHostJNDI(java.lang.String hostJNDI) {
    this.hostJNDI = hostJNDI;
  }

  private java.lang.String directory;

  public java.lang.String getDirectory() {
    return this.directory;
  }

  public void setDirectory(java.lang.String directory) {
    this.directory = directory;
  }

  private java.lang.String searchPattern;

  public java.lang.String getSearchPattern() {
    return this.searchPattern;
  }

  public void setSearchPattern(java.lang.String searchPattern) {
    this.searchPattern = searchPattern;
  }

  private java.lang.Boolean recursive;

  public java.lang.Boolean getRecursive() {
    return this.recursive;
  }

  public void setRecursive(java.lang.Boolean recursive) {
    this.recursive = recursive;
  }

}
