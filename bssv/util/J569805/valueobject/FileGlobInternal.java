package be.e1.bssv.util.J569805.valueobject;

import be.e1.bssv.util.JP569805.valueobject.FileGlobReply;

import java.io.Serializable;

import java.util.ArrayList;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class FileGlobInternal extends ValueObject implements Serializable
{
  private Integer idPointer = null;
  private String szSearchPattern = null;
  private String szSearchPath = null;
  private String szFileName = null;
  private ArrayList fileList = null;

  public void copyToFileGlobReply(FileGlobReply inData)
  {
    int count = this.fileList.size();
    if(count > 0)
    {
      String [] results = new String[count];
      for(int x=0; x<count; x++)
      {
        results[x] = (String)fileList.get(x);
      }
      inData.setFileCount(new Integer(count));
      inData.setFileList(results);
    }
  }
  
  public FileGlobInternal()
  {
    fileList = new ArrayList();
  }
  
  public void setIdPointer(Integer idPointer)
  {
    this.idPointer = idPointer;
  }

  public Integer getIdPointer()
  {
    return idPointer;
  }

  public void setSzSearchPattern(String szSearchPattern)
  {
    this.szSearchPattern = szSearchPattern;
  }

  public String getSzSearchPattern()
  {
    return szSearchPattern;
  }

  public void setSzSearchPath(String szSearchPath)
  {
    this.szSearchPath = szSearchPath;
  }

  public String getSzSearchPath()
  {
    return szSearchPath;
  }

  public void setSzFileName(String szFileName)
  {
    this.szFileName = szFileName;
  }

  public String getSzFileName()
  {
    return szFileName;
  }

  public void setFileList(ArrayList fileList)
  {
    this.fileList = fileList;
  }

  public ArrayList getFileList()
  {
    return fileList;
  }

  public void addFileToList(String file)
  {
    fileList.add(file);
  }
}
