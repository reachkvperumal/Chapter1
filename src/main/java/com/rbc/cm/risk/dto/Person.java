package com.rbc.cm.risk.dto;

import com.rbc.cm.risk.annotations.Sensitive;

import java.io.Serial;
import java.io.Serializable;

public class Person implements Serializable {
    @Serial
    private static final long serialVersionUID = 1563201802479576160L;

    private String firstName;
    private String lastName;
    private String ssn;
    private Address homeAddress;
    private AccountDetails accountDetails;


    @Sensitive(roles = {"DUMMY_ROLE_1","DUMMY_ROLE_2"},hash = "*")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Sensitive(roles = {"DUMMY_ROLE_1","DUMMY_ROLE_2"},hash = "*")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Sensitive(roles = {"DUMMY_ROLE_1","DUMMY_ROLE_2"},hash = "*")
    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public AccountDetails getAccountDetails() {
        return accountDetails;
    }

    public void setAccountDetails(AccountDetails accountDetails) {
        this.accountDetails = accountDetails;
    }
}
