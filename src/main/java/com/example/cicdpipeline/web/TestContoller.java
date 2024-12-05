package com.example.cicdpipeline.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/test")
public class TestContoller {
    @GetMapping
    public ResponseEntity<Map<String,String>> test(){
        return ResponseEntity.ok().body(Map.of("Testing","Up and running"));
    }
}
