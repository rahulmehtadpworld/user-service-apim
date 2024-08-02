package com.world.dp.user_service_apim.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class TestController {
    @GetMapping("/get-token")
    public ResponseEntity<Object> getToken() {
        return ResponseEntity.ok().body("133");
    }
}
