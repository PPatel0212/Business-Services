package be.e1.bssv.util.JP569805.valueobject;

import java.io.Serializable;
import oracle.e1.bssvfoundation.base.MessageValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class FileGlobReply extends MessageValueObject implements Serializable
{
  private String[] fileList = null;
  private Integer fileCount = null;
 
  public FileGlobReply()
  {
    this.fileCount = new Integer(0);
  }
 
  public void setFileList(String[] fileList)
  {
    this.fileList = fileList;
  }

  public String[] getFileList()
  {
    return fileList;
  }

  public void setFileCount(Integer fileCount)
  {
    this.fileCount = fileCount;
  }

  public Integer getFileCount()
  {
    return fileCount;
  }
}
