package com.world.dp.apim.controllers;

import com.world.dp.apim.enums.ROLE;
import com.world.dp.apim.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
public class TestController {


    private final AuthService authService;

    @Autowired
    public TestController(AuthService authService) {
        this.authService = authService;
    }

    @GetMapping("/validate")
    public ResponseEntity<Object> authorize(@RequestHeader String name) {
        List<ROLE> roles = authService.getRoles(name);
//        if (null == roles)
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        return ResponseEntity.ok().body(roles);
    }

    @GetMapping("/get-token")
    public ResponseEntity<Object> getToken() {
        return ResponseEntity.ok().body("Get Successfully accessed !");
    }
}
