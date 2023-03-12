package com.rbc.cm.risk;

import com.rbc.cm.risk.dto.AccountDetails;
import com.rbc.cm.risk.dto.Address;
import com.rbc.cm.risk.dto.Person;

public class Utility {

    public static Person load(){
        Person person = new Person();

        Address address = new Address();
        address.setAddress1("42 Regal DR");
        address.setAddress2(null);
        address.setCity("South Brunswick");
        address.setState("NJ");
        address.setZipcode("08852");

        AccountDetails accountDetails = new AccountDetails();
        accountDetails.setAccountType("DDA");
        accountDetails.setAccountCode("NIB");

        person.setFirstName("KV");
        person.setLastName("Perumal");
        person.setSsn("666-74-0201");
        person.setAccountDetails(accountDetails);
        person.setHomeAddress(address);
        return person;
    }
}
