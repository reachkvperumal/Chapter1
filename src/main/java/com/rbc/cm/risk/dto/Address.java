package com.rbc.cm.risk.dto;

import com.rbc.cm.risk.annotations.Sensitive;

import java.io.Serial;
import java.io.Serializable;

public class Address implements Serializable {

    @Serial
    private static final long serialVersionUID = -8216308301129590181L;

    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zipcode;

    @Sensitive(roles = {"DUMMY_ROLE_3"})
    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    @Sensitive(roles = {"DUMMY_ROLE_3"})
    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    @Sensitive(roles = {"DUMMY_ROLE_3"})
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Sensitive(roles = {"DUMMY_ROLE_3"})
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Sensitive(roles = {"DUMMY_ROLE_3"})
    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
