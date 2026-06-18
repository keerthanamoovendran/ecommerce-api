package com.ecommerce.ecommerce_api.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api/test/profile")
    public String profile(Authentication authentication) {
        return "Hello, " + authentication.getName() + "! This is a protected route.";
    }
}
