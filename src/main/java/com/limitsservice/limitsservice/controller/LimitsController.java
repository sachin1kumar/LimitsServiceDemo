package com.limitsservice.limitsservice.controller;

import com.limitsservice.limitsservice.model.Limit;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {

    @GetMapping("/limits")
    public Limit getLimit() {
        return new Limit(100, 200);
    }
}
