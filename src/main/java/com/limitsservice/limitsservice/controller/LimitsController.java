package com.limitsservice.limitsservice.controller;

import com.limitsservice.limitsservice.configuration.Configuration;
import com.limitsservice.limitsservice.model.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public Limits getLimits() {
        return new Limits(configuration.getMinimum(),
                configuration.getMaximum());
    }
}
