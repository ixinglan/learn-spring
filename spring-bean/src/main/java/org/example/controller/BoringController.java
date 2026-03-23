package org.example.controller;

import org.example.service.IBoringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhaojianqiang
 */
@RestController
@RequestMapping("/boring")
public class BoringController {
    @Autowired
    private IBoringService boringService;

    @GetMapping("/get")
    public ResponseEntity<String> getExample() {
        return ResponseEntity.ok(boringService.getExample());
    }

    @PostMapping("/post")
    public ResponseEntity<String> postExample(@RequestBody String requestBody) {
        // 处理请求数据
        HttpHeaders headers = new HttpHeaders();
        headers.add("Custom-Header", "Value");
        return new ResponseEntity<>(boringService.postExample(), headers, HttpStatus.CREATED);
    }

    @GetMapping("/exception")
    public ResponseEntity<String> exception() {
        throw new RuntimeException("test exception");
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> handleException(RuntimeException ex) {
        String errorMessage = "An error occurred: " + ex.getMessage();
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorMessage);
    }
}
