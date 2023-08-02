package com.midia.loginSecurity.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/demo-controller")
@RequiredArgsConstructor
public class DemoController {
    @GetMapping
    public ResponseEntity <String> sayHello() {
        return ResponseEntity.ok(("Nosso endPoint está seguro!"));
    }
}
