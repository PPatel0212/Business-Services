package be.e1.bssv.util.J560011.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class UserInfo extends ValueObject implements Serializable {
  private java.lang.String szUserId;
  private java.lang.String szFullName;
  private java.lang.String szFirstName;
  private java.lang.String szLastName;
  private java.lang.String szEmail;

    public void setSzUserId(String szUserId) {
        this.szUserId = szUserId;
    }

    public String getSzUserId() {
        return szUserId;
    }

    public void setSzFullName(String szFullName) {
        this.szFullName = szFullName;
    }

    public String getSzFullName() {
        return szFullName;
    }

    public void setSzFirstName(String szFirstName) {
        this.szFirstName = szFirstName;
    }

    public String getSzFirstName() {
        return szFirstName;
    }

    public void setSzLastName(String szLastName) {
        this.szLastName = szLastName;
    }

    public String getSzLastName() {
        return szLastName;
    }

    public void setSzEmail(String szEmail) {
        this.szEmail = szEmail;
    }

    public String getSzEmail() {
        return szEmail;
    }
}
