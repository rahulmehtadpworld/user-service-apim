package com.world.dp.apim.service;

import com.world.dp.apim.enums.ROLE;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class AuthService {

    @PostConstruct
    public void updateRoles() {
        map.put("admin-user", List.of(ROLE.ADMIN));
        map.put("user", List.of(ROLE.USER));
    }

    private final HashMap<String, List<ROLE>> map = new HashMap<>();

    public List<ROLE> getRoles(String name) {
        return map.get(name);
    }
}
