package com.cognizant.account.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/accounts")
public class AccountsController {

    @GetMapping("/{number}")
    public ResponseEntity<Map<String, Object>> getAccount(@PathVariable String number) {
        Map<String, Object> resp = new HashMap<>();

        resp.put("number", number);
        resp.put("type", "savings");
        resp.put("balance", 234343);

        return ResponseEntity.ok(resp);
    }
}
