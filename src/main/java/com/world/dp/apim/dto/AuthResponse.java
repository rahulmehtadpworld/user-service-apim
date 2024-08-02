package com.world.dp.apim.dto;

import com.world.dp.apim.enums.ROLE;

import java.util.List;


public class AuthResponse {
    private List<ROLE> roles;

    public List<ROLE> getRoles() {
        return roles;
    }

    public void setRoles(List<ROLE> roles) {
        this.roles = roles;
    }
}
