package be.e1.bssv.util.J569806.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

public class FileInfo extends ValueObject implements Serializable {
    private String szFileName = null;
    private String szDirectoryName = null;

    public void setSzFileName(String szFileName) {
        this.szFileName = szFileName;
    }

    public String getSzFileName() {
        return szFileName;
    }

    public void setSzDirectoryName(String szDirectoryName) {
        this.szDirectoryName = szDirectoryName;
    }

    public String getSzDirectoryName() {
        return szDirectoryName;
    }
}
