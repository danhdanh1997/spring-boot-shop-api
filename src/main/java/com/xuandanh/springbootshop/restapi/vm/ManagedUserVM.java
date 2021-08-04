package com.xuandanh.springbootshop.restapi.vm;

import com.xuandanh.springbootshop.dto.JhiUserDTO;

import javax.validation.constraints.Size;

public class ManagedUserVM extends JhiUserDTO {
    public static final int PASSWORD_MIN_LENGTH = 4;

    public static final int PASSWORD_MAX_LENGTH = 100;

    @Size(min = PASSWORD_MIN_LENGTH, max = PASSWORD_MAX_LENGTH)
    private String password;

    public ManagedUserVM() {
        // Empty constructor needed for Jackson.
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "ManagedUserVM{" +
                "} " + super.toString();
    }
}
