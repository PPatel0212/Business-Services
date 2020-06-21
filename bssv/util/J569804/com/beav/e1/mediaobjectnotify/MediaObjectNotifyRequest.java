/**
 * Generated from schema type t|e=MediaObjectNotifyRequest|d=MediaObjectNotifyRequest@http://www.beav.com/e1/mediaobjectnotify
 */
package be.e1.bssv.util.J569804.com.beav.e1.mediaobjectnotify;

public class MediaObjectNotifyRequest implements java.io.Serializable {

  private be.e1.bssv.util.J569804.com.beav.e1.mediaobjectnotify.MediaObject mediaObject;

  public be.e1.bssv.util.J569804.com.beav.e1.mediaobjectnotify.MediaObject getMediaObject() {
    return this.mediaObject;
  }

  public void setMediaObject(be.e1.bssv.util.J569804.com.beav.e1.mediaobjectnotify.MediaObject mediaObject) {
    this.mediaObject = mediaObject;
  }

  private java.lang.String actionCode;

  public java.lang.String getActionCode() {
    return this.actionCode;
  }

  public void setActionCode(java.lang.String actionCode) {
    this.actionCode = actionCode;
  }

}
