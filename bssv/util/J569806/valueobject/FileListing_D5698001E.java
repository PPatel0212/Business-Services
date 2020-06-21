package be.e1.bssv.util.J569806.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

public class FileListing_D5698001E extends ValueObject implements Serializable {
    private String szSourceHost = null;
    private String szSourceDirectory = null;
    private String szSearchPattern = null;
    private String szRecursiveSearch = null;
    private String szStatusCode = null;
    private String szStatusMessage = null;
    private FileInfo[] fileList = null;

    public void setSzSourceHost(String szSourceHost) {
        this.szSourceHost = szSourceHost;
    }

    public String getSzSourceHost() {
        return szSourceHost;
    }

    public void setSzSourceDirectory(String szSourceDirectory) {
        this.szSourceDirectory = szSourceDirectory;
    }

    public String getSzSourceDirectory() {
        return szSourceDirectory;
    }

    public void setSzSearchPattern(String szSearchPattern) {
        this.szSearchPattern = szSearchPattern;
    }

    public String getSzSearchPattern() {
        return szSearchPattern;
    }

    public void setSzRecursiveSearch(String szRecursiveSearch) {
        this.szRecursiveSearch = szRecursiveSearch;
    }

    public String getSzRecursiveSearch() {
        return szRecursiveSearch;
    }

    public void setSzStatusCode(String szStatusCode) {
        this.szStatusCode = szStatusCode;
    }

    public String getSzStatusCode() {
        return szStatusCode;
    }

    public void setSzStatusMessage(String szStatusMessage) {
        this.szStatusMessage = szStatusMessage;
    }

    public String getSzStatusMessage() {
        return szStatusMessage;
    }

    public void setFileList(FileInfo[] fileList) {
        this.fileList = fileList;
    }

    public FileInfo[] getFileList() {
        return fileList;
    }
}
