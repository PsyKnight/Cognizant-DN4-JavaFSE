package com.cognizant.loans.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/loans")
public class LoansController {

    @GetMapping("/{number}")
    public ResponseEntity<Map<String, Object>> getLoan(@PathVariable String number) {
        Map<String, Object> resp = new HashMap<>();

        resp.put("number", number);
        resp.put("type", "car");
        resp.put("loan", 400000);
        resp.put("emi", 3258);
        resp.put("tenure", 18);

        return ResponseEntity.ok(resp);
    }
}
