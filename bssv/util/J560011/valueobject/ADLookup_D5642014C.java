package be.e1.bssv.util.J560011.valueobject;

import be.e1.bssv.util.J560011.com.beav.e1.adgroupuserdata.ADGroupUserDataReply;

import be.e1.bssv.util.J560011.com.beav.e1.adgroupuserdata.UserData;

import java.io.Serializable;

import java.math.BigInteger;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class ADLookup_D5642014C extends ValueObject implements Serializable {
    private String szGroupName = null;
    private String szStatusCode = null;
    private String szStatusMessage = null;
    private UserInfo[] userData = null;

    public void setSzGroupName(String szGroupName) {
        this.szGroupName = szGroupName;
    }

    public String getSzGroupName() {
        return szGroupName;
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

    public void setUserData(UserInfo[] userData) {
        this.userData = userData;
    }

    public UserInfo[] getUserData() {
        return userData;
    }
    
    public void loadResponseData(ADGroupUserDataReply inData) {
        BigInteger num = inData.getStatusCode();
        if(num != null)
        {
            this.szStatusCode = num.toString(10);
        }
        this.szStatusMessage = inData.getStatusMessage();
        
        UserData[] usrArr = inData.getUserData();
        if(usrArr != null)
        {
            UserInfo[] usrInfoArr = new UserInfo[usrArr.length];
            for(int x=0; x<usrArr.length; x++) {
                usrInfoArr[x].setSzUserId(usrArr[x].getUserId());
                usrInfoArr[x].setSzFullName(usrArr[x].getFullName());
                usrInfoArr[x].setSzFirstName(usrArr[x].getFirstName());
                usrInfoArr[x].setSzLastName(usrArr[x].getLastName());
                usrInfoArr[x].setSzEmail(usrArr[x].getEmail());
            }
            this.userData = usrInfoArr;
        }
    }
}
