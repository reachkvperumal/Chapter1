package com.rbc.cm.risk.dto;

import com.rbc.cm.risk.annotations.Sensitive;

import java.io.Serial;
import java.io.Serializable;

public class AccountDetails implements Serializable {
    @Serial
    private static final long serialVersionUID = 628516453719834889L;

    private String accountType;
    private String accountCode;

    @Sensitive(roles = {"DUMMY_ROLE_5"})
    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @Sensitive(roles = {"DUMMY_ROLE_5"})
    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }
}
